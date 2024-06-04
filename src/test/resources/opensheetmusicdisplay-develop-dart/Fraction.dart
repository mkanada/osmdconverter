import 'dart:math';
// TODO: Check the operators' names
// TODO: This class should probably be immutable?

/**
 * A class representing mathematical fractions, which have a numerator and a denominator.
 */
class Fraction  {
  double maximumAllowedNumber = 46340; // sqrt(int.Max) --> signed int with 4 bytes (2^31)
  double numerator = 0;
  double denominator = 1;
  double wholeValue = 0;
  double realValue;

  /**
   * Returns the maximum of two fractions (does not clone)
   * @param f1
   * @param f2
   * @returns {Fraction}
   */
  static Fraction max(Fraction f1, Fraction f2) {
    if (f1.RealValue > f2.RealValue) {
      return f1;
    } else {
      return f2;
    }
  }
  

  static bool Equal(Fraction f1, Fraction f2) {
    return f1.wholeValue == f2.wholeValue && f1.Denominator == f2.Denominator && f1.Numerator == f2.Numerator;
  }
  

  /**
   * The same as Fraction.clone
   * @param fraction
   * @returns {Fraction}
   */
  static Fraction createFromFraction(Fraction fraction) {
    return new Fraction(fraction.numerator, fraction.denominator, fraction.wholeValue, false);
  }
  

  static Fraction plus(Fraction f1, Fraction f2) {
          Fraction sum =   f1.clone();
    sum.Add(f2);
    return sum;
  }
  

  static Fraction minus(Fraction f1, Fraction f2) {
          Fraction sum =   f1.clone();
    sum.Sub(f2);
    return sum;
  }
  

    static Fraction multiply(Fraction f1, Fraction f2) {
        return new Fraction ( (f1.wholeValue * f1.denominator + f1.numerator) * (f2.wholeValue * f2.denominator + f2.numerator),
                              f1.denominator * f2.denominator);
    }
    

  static double greatestCommonDenominator(double a, double b) {
    if (a == 0) {
      return b;
    }

    if (b == 1) {
      return 1;
    }

    while (Math.abs(b) >= 1 && Math.abs(a) >= 1) { // accounts for floating point inaccuracies. smallest GCD is 1.
      // if we don't check a > 1e-8, we infinite loop for e.g. a = 2.666666666666667, b = 4. See #1478 (rare)
      if (a > b) {
        a -= b;
      } else {
        b -= a;
      }
    }

          double result =   Math.round(a); // prevent returning 4.000001 or something, though it doesn't happen for our samples
    return max(result, 1);
  }
    // return 1 instead of 0, which causes NaNs e.g. in GraphicalMusicSheet.GetInterpolatedIndexInVerticalContainers()
    //   (though this case is rare anyways -> complex rhythms, see osmd #1511)
  

  /**
   *
   * @param numerator
   * @param denominator
   * @param wholeValue - the integer number, needed for values greater than 1
   * @param simplify - If simplify is true, then the fraction is simplified
   * to make both the numerator and denominator coprime, and less than maximumAllowedNumber.
   */
  constructor(numerator: double = 0, denominator: double = 1, wholeValue: double = 0, simplify: bool = true) {
    this.numerator = numerator;
    this.denominator = denominator;
    this.wholeValue = wholeValue;

    if (simplify) {
      this.simplify();
    }
    this.setRealValue();
  }

  String toString() {
          String result =   this.numerator + "/" + this.denominator;
    if (this.wholeValue != 0) {
      result =   this.wholeValue + " " + result;
    }

    return result;
  }
  

  Fraction clone() {
    return new Fraction(this.numerator, this.denominator, this.wholeValue, false);
  }
  

   double get Numerator { 
    return this.numerator;
    }
  

  set Numerator(double value) {    
    if (this.numerator != value) {
      this.numerator = value;
      this.simplify();
      this.setRealValue();
    }
  }
  

   double get Denominator { 
    return this.denominator;
    }
  

  set Denominator(double value) {    
    if (this.denominator != value) {
      this.denominator = value;
      // don't simplify in case of a GraceNote (need it in order to set the right symbol)
      if (this.numerator != 0) {
        this.simplify();
      }
      this.setRealValue();
    }
  }
  

   double get WholeValue { 
    return this.wholeValue;
    }
  

  set WholeValue(double value) {    
    if (this.wholeValue != value) {
      this.wholeValue = value;
      this.setRealValue();
    }
  }
  

  /**
   * Returns the unified numerator where the whole value will be expanded
   * with the denominator and added to the existing numerator.
   */
  double GetExpandedNumerator() {
    return this.wholeValue * this.denominator + this.numerator;
  }
  

  double calculateNumberOfNeededDots() {
          double num =   1;
          double product =   2;
          double expandedNumerator =   this.GetExpandedNumerator();
    while (product < expandedNumerator) {
      num++;
      product =   pow(2, num);
    }
    return min(3, num - 1);
  }
  

  bool IsNegative() {
    return this.realValue < 0;
  }
  

   double get RealValue { 
    return this.realValue;
    }
  

  void expand(double expansionValue) {
    this.numerator *= expansionValue;
    this.denominator *= expansionValue;
    if (this.wholeValue != 0) {
      this.numerator += this.wholeValue * this.denominator;
      this.wholeValue = 0;
    }
  }
  

  // public multiplyDenominatorWithFactor(factor: number): void {
  //   this.denominator *= factor;
  //   this.setRealValue();
  // }

  /**
   * Adds a Fraction to this Fraction.
   * Attention: This changes the already existing Fraction, which might be referenced elsewhere!
   * Use Fraction.plus() for creating a new Fraction object being the sum of two Fractions.
   * @param fraction the Fraction to add.
   */
  Fraction Add(Fraction fraction) {
    // normally should check if denominator or fraction.denominator is 0 but in our case
    // a zero denominator doesn't make sense
    this.numerator = (this.wholeValue * this.denominator + this.numerator) * fraction.denominator +
      (fraction.wholeValue * fraction.denominator + fraction.numerator) * this.denominator;
    this.denominator = this.denominator * fraction.denominator;
    this.wholeValue = 0;
    this.simplify();
    this.setRealValue();
    return this;
  }
  

  /**
   * Subtracts a Fraction from this Fraction.
   * Attention: This changes the already existing Fraction, which might be referenced elsewhere!
   * Use Fraction.minus() for creating a new Fraction object being the difference of two Fractions.
   * @param fraction the Fraction to subtract.
   */
  Fraction Sub(Fraction fraction) {
    // normally should check if denominator or fraction.denominator is 0 but in our case
    // a zero denominator doesn't make sense
    this.numerator = (this.wholeValue * this.denominator + this.numerator) * fraction.denominator -
      (fraction.wholeValue * fraction.denominator + fraction.numerator) * this.denominator;
    this.denominator = this.denominator * fraction.denominator;
    this.wholeValue = 0;
    this.simplify();
    this.setRealValue();
    return this;
  }
  
  /**
   * Brute Force quanization by searching incremental with the numerator until the denominator is
   * smaller/equal than the desired one.
   * @param maxAllowedDenominator
   */
  Fraction Quantize(double maxAllowedDenominator) {
    if (this.denominator <= maxAllowedDenominator) {
      return this;
    }

          Fraction upTestFraction =   new Fraction(this.numerator + 1, this.denominator, this.wholeValue);

    while (upTestFraction.Denominator > maxAllowedDenominator) {
      upTestFraction.Numerator++;
    }

    if (this.numerator > this.denominator) {
              Fraction downTestFraction =   new Fraction(this.numerator - 1, this.denominator, this.wholeValue);

      while (downTestFraction.Denominator > maxAllowedDenominator) {
        downTestFraction.Numerator--;
      }

      if (downTestFraction.Denominator < upTestFraction.Denominator) {
        return downTestFraction;
      }
    }
    return upTestFraction;
  }
  

  bool Equals(Fraction obj) {
    return this.realValue == obj?.realValue;
  }
  

  double CompareTo(Fraction obj) {
          double diff =   this.realValue - obj.realValue;
    // Return the sign of diff
    return diff ? diff < 0 ? -1 : 1 : 0;
  }
  

  bool lt(Fraction frac) {
    return this.realValue < frac.realValue;
  }
  

  bool lte(Fraction frac) {
    return this.realValue <= frac.realValue;
  }
  

  bool gt(Fraction frac) {
    return !this.lte(frac);
  }
  

  bool gte(Fraction frac) {
    return !this.lt(frac);
  }
  

  //public Equals(f: Fraction): boolean {
  //    if (ReferenceEquals(this, f))
  //        return true;
  //    if (ReferenceEquals(f, undefined))
  //        return false;
  //    return this.numerator * f.denominator === f.numerator * this.denominator;
  //}

  void setRealValue() {
    this.realValue = this.wholeValue + this.numerator / this.denominator;
  }
  

  void simplify() {
    // don't simplify in case of a GraceNote (need it in order to set the right symbol)
    if (this.numerator == 0) {
      this.denominator = 1;
      return;
    }

    // normally should check if denominator or fraction.denominator is 0 but in our case a zero denominator
    // doesn't make sense. Could probably be optimized
          double i =   Fraction.greatestCommonDenominator(Math.abs(this.numerator), Math.abs(this.denominator));

    this.numerator /= i;
    this.denominator /= i;

          double whole =   Math.floor(this.numerator / this.denominator);
    if (whole != 0) {
      this.wholeValue += whole;
      this.numerator -= whole * this.denominator;
      if (this.numerator == 0) {
        this.denominator = 1;
      }
    }
    if (this.denominator > Fraction.maximumAllowedNumber) {
              double factor =   this.denominator / Fraction.maximumAllowedNumber;
      this.numerator = Math.round(this.numerator / factor);
      this.denominator = Math.round(this.denominator / factor);
    }
    if (this.numerator > Fraction.maximumAllowedNumber) {
              double factor =   this.numerator / Fraction.maximumAllowedNumber;
      this.numerator = Math.round(this.numerator / factor);
      this.denominator = Math.round(this.denominator / factor);
    }
  }
  

  double FloatInaccuracyTolerance = 0.0001; // inaccuracy allowed when comparing Fraction.RealValues, because of floating point inaccuracy

  bool isOnBeat(Fraction timeSignature) { // use sourceMeasure.ActiveTimeSignature as timeSignature
              double beatDistance =   this.distanceFromBeat(timeSignature);
      return Math.abs(beatDistance) < Fraction.FloatInaccuracyTolerance;
  }
  

  double distanceFromBeat(Fraction timeSignature) {
              Fraction beatStep =   new Fraction(1, timeSignature.Denominator);
              double distanceFromBeat =   this.RealValue % beatStep.RealValue; // take modulo the beat value, e.g. 1/8 in a 3/8 time signature
      return distanceFromBeat;
  }
  


  //private static equals(f1: Fraction, f2: Fraction): boolean {
  //    return f1.numerator * f2.denominator === f2.numerator * f1.denominator;
  //}
  //
  //public static ApproximateFractionFromValue(value: number, epsilonForPrecision: number): Fraction {
  //    let n: number = 1;
  //    let d: number = 1;
  //    let fraction: number = n / d;
  //    while (Math.abs(fraction - value) > epsilonForPrecision) {
  //        if (fraction < value) {
  //            n++;
  //        }
  //        else {
  //            d++;
  //            n = Math.round(value * d);
  //        }
  //        fraction = n / d;
  //    }
  //    return new Fraction(n, d);
  //}
  //public static GetEarlierTimestamp(m1: Fraction, m2: Fraction): Fraction {
  //    if (m1 < m2)
  //        return m1;
  //    else return m2;
  //}

  //public static getFraction(value: number, denominatorPrecision: number): Fraction {
  //    let numerator: number = Math.round(value / (1.0 / denominatorPrecision));
  //    return new Fraction(numerator, denominatorPrecision);
  //}
  //public static fractionMin(f1: Fraction, f2: Fraction): Fraction {
  //    if (f1 < f2)
  //        return f1;
  //    else return f2;
  //}

  //public static GetMaxValue(): Fraction {
  //    return new Fraction(Fraction.maximumAllowedNumber, 1);
  //}
  //public static get MaxAllowedNumerator(): number {
  //    return Fraction.maximumAllowedNumber;
  //}
  //public static get MaxAllowedDenominator(): number {
  //    return Fraction.maximumAllowedNumber;
  //}
  //public ToFloatingString(): string {
  //    return this.RealValue.ToString();
  //}
  //public Compare(x: Fraction, y: Fraction): number {
  //    if (x > y)
  //        return 1;
  //    if (x < y)
  //        return -1;
  //    return 0;
  //}

  //#region operators
  //
  //    // operator overloads must always come in pairs
  //    // operator overload +
  //    public static Fraction operator + (Fraction f1, Fraction f2)
  //{
  //    Fraction sum = new Fraction(f1);
  //    sum.Add(f2);
  //    return sum;
  //}
  //
  //// operator overload -
  //public static Fraction operator - (Fraction f1, Fraction f2)
  //{
  //    Fraction diff = new Fraction(f1);
  //    diff.Sub(f2);
  //    return diff;
  //}
  //
  //// operator overloads must always come in pairs
  //// operator overload >
  //public static bool operator > (Fraction f1, Fraction f2)
  //{
  //    //return (long) f1.Numerator*f2._denominator > (long) f2._numerator*f1._denominator;
  //    return f1.RealValue > f2.RealValue;
  //}
  //
  //// operator overload <
  //public static bool operator < (Fraction f1, Fraction f2)
  //{
  //    //return (long) f1._numerator*f2._denominator < (long) f2._numerator*f1._denominator;
  //    return f1.RealValue < f2.RealValue;
  //}
  //
  //// operator overload ==
  //public static bool operator === (Fraction f1, Fraction f2)
  //{
  //    // code enhanced for performance
  //    // System.Object.ReferenceEquals(f1, undefined) is better than if (f1)
  //    // and comparisons between booleans are quick
  //    bool f1IsNull = System.Object.ReferenceEquals(f1, undefined);
  //    bool f2IsNull = System.Object.ReferenceEquals(f2, undefined);
  //
  //    // method returns true when both are undefined, false when only the first is undefined, otherwise the result of equals
  //    if (f1IsNull !== f2IsNull)
  //        return false;
  //
  //    if (f1IsNull /*&& f2IsNull*/)
  //        return true;
  //
  //    return equals(f1, f2);
  //}
  //
  //// operator overload !=
  //public static bool operator !== (Fraction f1, Fraction f2)
  //{
  //    return (!(f1 === f2));
  //}
  //
  //// operator overload >=
  //public static bool operator >= (Fraction f1, Fraction f2)
  //{
  //    return (!(f1 < f2));
  //}
  //
  //// operator overload <=
  //public static bool operator <= (Fraction f1,Fraction f2)
  //{
  //    return (!(f1 > f2));
  //}
  //
  //public static Fraction operator / (Fraction f, int i)
  //{
  //    return new Fraction(f._numerator, f._denominator *= i);
  //}
  //
  //public static Fraction operator / (Fraction f1, Fraction f2)
  //{
  //    let res = new Fraction(f1.Numerator*f2.Denominator, f1.Denominator*f2.Numerator);
  //    return res.Denominator === 0 ? new Fraction(0, 1) : res;
  //}
  //
  //public static Fraction operator * (Fraction f1, Fraction f2)
  //{
  //    return new Fraction(f1.Numerator*f2.Numerator, f1.Denominator*f2.Denominator);
  //}
  //
  //public static Fraction operator % (Fraction f1, Fraction f2)
  //{
  //    let a = f1/f2;
  //    return new Fraction(a.Numerator%a.Denominator, a.Denominator)*f2;
  //}
  //
  //#endregion operators
}
