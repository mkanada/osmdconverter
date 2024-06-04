import 'dart:math';
/**
 * Some useful Maths methods.
 */
class PSMath  {

    static double log(double base, double x) {
        return log(x) / log(base);
    }
    

    static double log10(double x) {
        return PSlog(10, x);
    }
    

    static double meanSimple(List<double> values) {
                  double sum =   0;
        for (          double i =   0; i < values.length; i++) {
            sum += values[i];
        }
        return sum / values.length;
    }
    

    static double meanWeighted(List<double> values, List<double> weights) {
        if (values.length != weights.length || values.length == 0) {
            return 0;
        }
                  double sumWeigtedValues =   0;
                  double sumWeights =   0;
        for (          double i =   0; i < values.length; i++) {
                          double weight =   weights[i];
            sumWeigtedValues += values[i] * weight;
            sumWeights += weight;
        }
        return sumWeigtedValues / sumWeights;
    }
    

}



