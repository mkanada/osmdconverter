// Generated from /home/mauricio/IdeaProjects/OsmdConverter/src/main/resources/TypeScriptParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TypeScriptParser extends TypeScriptParserBase {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MultiLineComment=1, SingleLineComment=2, RegularExpressionLiteral=3, OpenBracket=4, 
		CloseBracket=5, OpenParen=6, CloseParen=7, OpenBrace=8, TemplateCloseBrace=9, 
		CloseBrace=10, SemiColon=11, Comma=12, Assign=13, QuestionMark=14, QuestionMarkDot=15, 
		Colon=16, Ellipsis=17, Dot=18, PlusPlus=19, MinusMinus=20, Plus=21, Minus=22, 
		BitNot=23, Not=24, Multiply=25, Divide=26, Modulus=27, Power=28, NullCoalesce=29, 
		Hashtag=30, LeftShiftArithmetic=31, LessThan=32, MoreThan=33, LessThanEquals=34, 
		GreaterThanEquals=35, Equals_=36, NotEquals=37, IdentityEquals=38, IdentityNotEquals=39, 
		BitAnd=40, BitXOr=41, BitOr=42, And=43, Or=44, MultiplyAssign=45, DivideAssign=46, 
		ModulusAssign=47, PlusAssign=48, MinusAssign=49, LeftShiftArithmeticAssign=50, 
		RightShiftArithmeticAssign=51, RightShiftLogicalAssign=52, BitAndAssign=53, 
		AndAssign=54, BitXorAssign=55, BitOrAssign=56, PowerAssign=57, NullishCoalescingAssign=58, 
		ARROW=59, NullLiteral=60, BooleanLiteral=61, DecimalLiteral=62, HexIntegerLiteral=63, 
		OctalIntegerLiteral=64, OctalIntegerLiteral2=65, BinaryIntegerLiteral=66, 
		BigHexIntegerLiteral=67, BigOctalIntegerLiteral=68, BigBinaryIntegerLiteral=69, 
		BigDecimalIntegerLiteral=70, Break=71, Do=72, Instanceof=73, Typeof=74, 
		Case=75, Else=76, New=77, Var=78, Catch=79, Finally=80, Return=81, Void=82, 
		Continue=83, For=84, Switch=85, While=86, Debugger=87, Function_=88, This=89, 
		With=90, Default=91, If=92, Throw=93, Delete=94, In=95, Try=96, As=97, 
		From=98, ReadOnly=99, Async=100, Await=101, Yield=102, YieldStar=103, 
		Class=104, Enum=105, Extends=106, Super=107, Const=108, Export=109, Import=110, 
		Implements=111, Let=112, Private=113, Public=114, Interface=115, Package=116, 
		Protected=117, Static=118, Any=119, Number=120, Never=121, Boolean=122, 
		String=123, Unique=124, Symbol=125, Undefined=126, Object=127, Of=128, 
		KeyOf=129, TypeAlias=130, Constructor=131, Namespace=132, Require=133, 
		Module=134, Declare=135, Abstract=136, Is=137, At=138, Identifier=139, 
		StringLiteral=140, BackTick=141, WhiteSpaces=142, LineTerminator=143, 
		HtmlComment=144, CDataComment=145, UnexpectedCharacter=146, TemplateStringEscapeAtom=147, 
		TemplateStringStartExpression=148, TemplateStringAtom=149, ExportFrom=150;
	public static final int
		RULE_program = 0, RULE_initializer = 1, RULE_bindingPattern = 2, RULE_typeParameters = 3, 
		RULE_typeParameterList = 4, RULE_typeParameter = 5, RULE_constraint = 6, 
		RULE_typeArguments = 7, RULE_typeArgumentList = 8, RULE_typeArgument = 9, 
		RULE_type_ = 10, RULE_unionOrIntersectionOrPrimaryType = 11, RULE_primaryType = 12, 
		RULE_predefinedType = 13, RULE_typeReference = 14, RULE_typeGeneric = 15, 
		RULE_typeName = 16, RULE_objectType = 17, RULE_typeBody = 18, RULE_typeMemberList = 19, 
		RULE_typeMember = 20, RULE_arrayType = 21, RULE_tupleType = 22, RULE_tupleElementTypes = 23, 
		RULE_functionType = 24, RULE_constructorType = 25, RULE_typeQuery = 26, 
		RULE_typeQueryExpression = 27, RULE_propertySignatur = 28, RULE_typeAnnotation = 29, 
		RULE_callSignature = 30, RULE_parameterList = 31, RULE_requiredParameterList = 32, 
		RULE_parameter = 33, RULE_optionalParameter = 34, RULE_restParameter = 35, 
		RULE_requiredParameter = 36, RULE_accessibilityModifier = 37, RULE_identifierOrPattern = 38, 
		RULE_constructSignature = 39, RULE_indexSignature = 40, RULE_methodSignature = 41, 
		RULE_typeAliasDeclaration = 42, RULE_constructorDeclaration = 43, RULE_interfaceDeclaration = 44, 
		RULE_interfaceExtendsClause = 45, RULE_classOrInterfaceTypeList = 46, 
		RULE_enumDeclaration = 47, RULE_enumBody = 48, RULE_enumMemberList = 49, 
		RULE_enumMember = 50, RULE_namespaceDeclaration = 51, RULE_namespaceName = 52, 
		RULE_importAliasDeclaration = 53, RULE_decoratorList = 54, RULE_decorator = 55, 
		RULE_decoratorMemberExpression = 56, RULE_decoratorCallExpression = 57, 
		RULE_statement = 58, RULE_block = 59, RULE_statementList = 60, RULE_abstractDeclaration = 61, 
		RULE_importStatement = 62, RULE_importFromBlock = 63, RULE_importModuleItems = 64, 
		RULE_importAliasName = 65, RULE_moduleExportName = 66, RULE_importedBinding = 67, 
		RULE_importDefault = 68, RULE_importNamespace = 69, RULE_importFrom = 70, 
		RULE_aliasName = 71, RULE_exportStatement = 72, RULE_exportFromBlock = 73, 
		RULE_exportModuleItems = 74, RULE_exportAliasName = 75, RULE_declaration = 76, 
		RULE_declareModule = 77, RULE_namespaceElementList = 78, RULE_namespaceElement = 79, 
		RULE_variableStatement = 80, RULE_variableDeclarationList = 81, RULE_variableDeclaration = 82, 
		RULE_emptyStatement_ = 83, RULE_expressionStatement = 84, RULE_ifStatement = 85, 
		RULE_iterationStatement = 86, RULE_varModifier = 87, RULE_continueStatement = 88, 
		RULE_breakStatement = 89, RULE_returnStatement = 90, RULE_yieldStatement = 91, 
		RULE_withStatement = 92, RULE_switchStatement = 93, RULE_caseBlock = 94, 
		RULE_caseClauses = 95, RULE_caseClause = 96, RULE_defaultClause = 97, 
		RULE_labelledStatement = 98, RULE_throwStatement = 99, RULE_tryStatement = 100, 
		RULE_catchProduction = 101, RULE_finallyProduction = 102, RULE_debuggerStatement = 103, 
		RULE_functionDeclaration = 104, RULE_classDeclaration = 105, RULE_classHeritage = 106, 
		RULE_classTail = 107, RULE_classExtendsClause = 108, RULE_implementsClause = 109, 
		RULE_classElement = 110, RULE_propertyMemberDeclaration = 111, RULE_propertyMemberBase = 112, 
		RULE_indexMemberDeclaration = 113, RULE_generatorMethod = 114, RULE_generatorFunctionDeclaration = 115, 
		RULE_generatorBlock = 116, RULE_generatorDefinition = 117, RULE_iteratorBlock = 118, 
		RULE_iteratorDefinition = 119, RULE_classElementName = 120, RULE_privateIdentifier = 121, 
		RULE_formalParameterList = 122, RULE_formalParameterArg = 123, RULE_lastFormalParameterArg = 124, 
		RULE_functionBody = 125, RULE_sourceElements = 126, RULE_arrayLiteral = 127, 
		RULE_elementList = 128, RULE_arrayElement = 129, RULE_objectLiteral = 130, 
		RULE_propertyAssignment = 131, RULE_getAccessor = 132, RULE_setAccessor = 133, 
		RULE_propertyName = 134, RULE_arguments = 135, RULE_argumentList = 136, 
		RULE_argument = 137, RULE_expressionSequence = 138, RULE_singleExpression = 139, 
		RULE_asExpression = 140, RULE_assignable = 141, RULE_anonymousFunction = 142, 
		RULE_arrowFunctionDeclaration = 143, RULE_arrowFunctionParameters = 144, 
		RULE_arrowFunctionBody = 145, RULE_assignmentOperator = 146, RULE_literal = 147, 
		RULE_templateStringLiteral = 148, RULE_templateStringAtom = 149, RULE_numericLiteral = 150, 
		RULE_bigintLiteral = 151, RULE_getter = 152, RULE_setter = 153, RULE_identifierName = 154, 
		RULE_identifier = 155, RULE_identifierOrKeyWord = 156, RULE_reservedWord = 157, 
		RULE_keyword = 158, RULE_eos = 159;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "initializer", "bindingPattern", "typeParameters", "typeParameterList", 
			"typeParameter", "constraint", "typeArguments", "typeArgumentList", "typeArgument", 
			"type_", "unionOrIntersectionOrPrimaryType", "primaryType", "predefinedType", 
			"typeReference", "typeGeneric", "typeName", "objectType", "typeBody", 
			"typeMemberList", "typeMember", "arrayType", "tupleType", "tupleElementTypes", 
			"functionType", "constructorType", "typeQuery", "typeQueryExpression", 
			"propertySignatur", "typeAnnotation", "callSignature", "parameterList", 
			"requiredParameterList", "parameter", "optionalParameter", "restParameter", 
			"requiredParameter", "accessibilityModifier", "identifierOrPattern", 
			"constructSignature", "indexSignature", "methodSignature", "typeAliasDeclaration", 
			"constructorDeclaration", "interfaceDeclaration", "interfaceExtendsClause", 
			"classOrInterfaceTypeList", "enumDeclaration", "enumBody", "enumMemberList", 
			"enumMember", "namespaceDeclaration", "namespaceName", "importAliasDeclaration", 
			"decoratorList", "decorator", "decoratorMemberExpression", "decoratorCallExpression", 
			"statement", "block", "statementList", "abstractDeclaration", "importStatement", 
			"importFromBlock", "importModuleItems", "importAliasName", "moduleExportName", 
			"importedBinding", "importDefault", "importNamespace", "importFrom", 
			"aliasName", "exportStatement", "exportFromBlock", "exportModuleItems", 
			"exportAliasName", "declaration", "declareModule", "namespaceElementList", 
			"namespaceElement", "variableStatement", "variableDeclarationList", "variableDeclaration", 
			"emptyStatement_", "expressionStatement", "ifStatement", "iterationStatement", 
			"varModifier", "continueStatement", "breakStatement", "returnStatement", 
			"yieldStatement", "withStatement", "switchStatement", "caseBlock", "caseClauses", 
			"caseClause", "defaultClause", "labelledStatement", "throwStatement", 
			"tryStatement", "catchProduction", "finallyProduction", "debuggerStatement", 
			"functionDeclaration", "classDeclaration", "classHeritage", "classTail", 
			"classExtendsClause", "implementsClause", "classElement", "propertyMemberDeclaration", 
			"propertyMemberBase", "indexMemberDeclaration", "generatorMethod", "generatorFunctionDeclaration", 
			"generatorBlock", "generatorDefinition", "iteratorBlock", "iteratorDefinition", 
			"classElementName", "privateIdentifier", "formalParameterList", "formalParameterArg", 
			"lastFormalParameterArg", "functionBody", "sourceElements", "arrayLiteral", 
			"elementList", "arrayElement", "objectLiteral", "propertyAssignment", 
			"getAccessor", "setAccessor", "propertyName", "arguments", "argumentList", 
			"argument", "expressionSequence", "singleExpression", "asExpression", 
			"assignable", "anonymousFunction", "arrowFunctionDeclaration", "arrowFunctionParameters", 
			"arrowFunctionBody", "assignmentOperator", "literal", "templateStringLiteral", 
			"templateStringAtom", "numericLiteral", "bigintLiteral", "getter", "setter", 
			"identifierName", "identifier", "identifierOrKeyWord", "reservedWord", 
			"keyword", "eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'['", "']'", "'('", "')'", "'{'", null, "'}'", 
			"';'", "','", "'='", "'?'", "'?.'", "':'", "'...'", "'.'", "'++'", "'--'", 
			"'+'", "'-'", "'~'", "'!'", "'*'", "'/'", "'%'", "'**'", "'??'", "'#'", 
			"'<<'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'==='", "'!=='", 
			"'&'", "'^'", "'|'", "'&&'", "'||'", "'*='", "'/='", "'%='", "'+='", 
			"'-='", "'<<='", "'>>='", "'>>>='", "'&='", "'&&='", "'^='", "'|='", 
			"'**='", "'??='", "'=>'", "'null'", null, null, null, null, null, null, 
			null, null, null, null, "'break'", "'do'", "'instanceof'", "'typeof'", 
			"'case'", "'else'", "'new'", "'var'", "'catch'", "'finally'", "'return'", 
			"'void'", "'continue'", "'for'", "'switch'", "'while'", "'debugger'", 
			"'function'", "'this'", "'with'", "'default'", "'if'", "'throw'", "'delete'", 
			"'in'", "'try'", "'as'", "'from'", "'readonly'", "'async'", "'await'", 
			"'yield'", "'yield*'", "'class'", "'enum'", "'extends'", "'super'", "'const'", 
			"'export'", "'import'", "'implements'", "'let'", "'private'", "'public'", 
			"'interface'", "'package'", "'protected'", "'static'", "'any'", "'number'", 
			"'never'", "'boolean'", "'string'", "'unique'", "'symbol'", "'undefined'", 
			"'object'", "'of'", "'keyof'", "'type'", "'constructor'", "'namespace'", 
			"'require'", "'module'", "'declare'", "'abstract'", "'is'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MultiLineComment", "SingleLineComment", "RegularExpressionLiteral", 
			"OpenBracket", "CloseBracket", "OpenParen", "CloseParen", "OpenBrace", 
			"TemplateCloseBrace", "CloseBrace", "SemiColon", "Comma", "Assign", "QuestionMark", 
			"QuestionMarkDot", "Colon", "Ellipsis", "Dot", "PlusPlus", "MinusMinus", 
			"Plus", "Minus", "BitNot", "Not", "Multiply", "Divide", "Modulus", "Power", 
			"NullCoalesce", "Hashtag", "LeftShiftArithmetic", "LessThan", "MoreThan", 
			"LessThanEquals", "GreaterThanEquals", "Equals_", "NotEquals", "IdentityEquals", 
			"IdentityNotEquals", "BitAnd", "BitXOr", "BitOr", "And", "Or", "MultiplyAssign", 
			"DivideAssign", "ModulusAssign", "PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", 
			"RightShiftArithmeticAssign", "RightShiftLogicalAssign", "BitAndAssign", 
			"AndAssign", "BitXorAssign", "BitOrAssign", "PowerAssign", "NullishCoalescingAssign", 
			"ARROW", "NullLiteral", "BooleanLiteral", "DecimalLiteral", "HexIntegerLiteral", 
			"OctalIntegerLiteral", "OctalIntegerLiteral2", "BinaryIntegerLiteral", 
			"BigHexIntegerLiteral", "BigOctalIntegerLiteral", "BigBinaryIntegerLiteral", 
			"BigDecimalIntegerLiteral", "Break", "Do", "Instanceof", "Typeof", "Case", 
			"Else", "New", "Var", "Catch", "Finally", "Return", "Void", "Continue", 
			"For", "Switch", "While", "Debugger", "Function_", "This", "With", "Default", 
			"If", "Throw", "Delete", "In", "Try", "As", "From", "ReadOnly", "Async", 
			"Await", "Yield", "YieldStar", "Class", "Enum", "Extends", "Super", "Const", 
			"Export", "Import", "Implements", "Let", "Private", "Public", "Interface", 
			"Package", "Protected", "Static", "Any", "Number", "Never", "Boolean", 
			"String", "Unique", "Symbol", "Undefined", "Object", "Of", "KeyOf", "TypeAlias", 
			"Constructor", "Namespace", "Require", "Module", "Declare", "Abstract", 
			"Is", "At", "Identifier", "StringLiteral", "BackTick", "WhiteSpaces", 
			"LineTerminator", "HtmlComment", "CDataComment", "UnexpectedCharacter", 
			"TemplateStringEscapeAtom", "TemplateStringStartExpression", "TemplateStringAtom", 
			"ExportFrom"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TypeScriptParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TypeScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TypeScriptParser.EOF, 0); }
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(320);
				sourceElements();
				}
				break;
			}
			setState(323);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(TypeScriptParser.Assign, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(Assign);
			setState(326);
			singleExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindingPatternContext extends ParserRuleContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public BindingPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingPattern; }
	}

	public final BindingPatternContext bindingPattern() throws RecognitionException {
		BindingPatternContext _localctx = new BindingPatternContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bindingPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
				{
				setState(328);
				arrayLiteral();
				}
				break;
			case OpenBrace:
				{
				setState(329);
				objectLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LessThan() { return getToken(TypeScriptParser.LessThan, 0); }
		public TerminalNode MoreThan() { return getToken(TypeScriptParser.MoreThan, 0); }
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(LessThan);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (As - 97)) | (1L << (From - 97)) | (1L << (Async - 97)) | (1L << (Yield - 97)) | (1L << (Any - 97)) | (1L << (Number - 97)) | (1L << (Never - 97)) | (1L << (Boolean - 97)) | (1L << (String - 97)) | (1L << (Unique - 97)) | (1L << (Symbol - 97)) | (1L << (Undefined - 97)) | (1L << (Object - 97)) | (1L << (Of - 97)) | (1L << (KeyOf - 97)) | (1L << (TypeAlias - 97)) | (1L << (Constructor - 97)) | (1L << (Namespace - 97)) | (1L << (Abstract - 97)) | (1L << (Identifier - 97)))) != 0)) {
				{
				setState(333);
				typeParameterList();
				}
			}

			setState(336);
			match(MoreThan);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TypeScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TypeScriptParser.Comma, i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			typeParameter();
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(339);
				match(Comma);
				setState(340);
				typeParameter();
				}
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public TerminalNode Assign() { return getToken(TypeScriptParser.Assign, 0); }
		public TypeArgumentContext typeArgument() {
			return getRuleContext(TypeArgumentContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeParameter);
		int _la;
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				identifier();
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(347);
					constraint();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				identifier();
				setState(351);
				match(Assign);
				setState(352);
				typeArgument();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
				typeParameters();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintContext extends ParserRuleContext {
		public TerminalNode Extends() { return getToken(TypeScriptParser.Extends, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(Extends);
			setState(358);
			type_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LessThan() { return getToken(TypeScriptParser.LessThan, 0); }
		public TerminalNode MoreThan() { return getToken(TypeScriptParser.MoreThan, 0); }
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(LessThan);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << LessThan) | (1L << BitAnd) | (1L << BitOr) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Typeof - 74)) | (1L << (New - 74)) | (1L << (Void - 74)) | (1L << (This - 74)) | (1L << (As - 74)) | (1L << (From - 74)) | (1L << (Async - 74)) | (1L << (Yield - 74)) | (1L << (Any - 74)) | (1L << (Number - 74)) | (1L << (Never - 74)) | (1L << (Boolean - 74)) | (1L << (String - 74)) | (1L << (Unique - 74)) | (1L << (Symbol - 74)) | (1L << (Undefined - 74)) | (1L << (Object - 74)) | (1L << (Of - 74)) | (1L << (KeyOf - 74)) | (1L << (TypeAlias - 74)) | (1L << (Constructor - 74)) | (1L << (Namespace - 74)) | (1L << (Abstract - 74)))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(361);
				typeArgumentList();
				}
			}

			setState(364);
			match(MoreThan);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TypeScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TypeScriptParser.Comma, i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			typeArgument();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(367);
				match(Comma);
				setState(368);
				typeArgument();
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			type_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_Context extends ParserRuleContext {
		public UnionOrIntersectionOrPrimaryTypeContext unionOrIntersectionOrPrimaryType() {
			return getRuleContext(UnionOrIntersectionOrPrimaryTypeContext.class,0);
		}
		public TerminalNode BitOr() { return getToken(TypeScriptParser.BitOr, 0); }
		public TerminalNode BitAnd() { return getToken(TypeScriptParser.BitAnd, 0); }
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public ConstructorTypeContext constructorType() {
			return getRuleContext(ConstructorTypeContext.class,0);
		}
		public TypeGenericContext typeGeneric() {
			return getRuleContext(TypeGenericContext.class,0);
		}
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_type_);
		int _la;
		try {
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BitAnd || _la==BitOr) {
					{
					setState(376);
					_la = _input.LA(1);
					if ( !(_la==BitAnd || _la==BitOr) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(379);
				unionOrIntersectionOrPrimaryType(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				functionType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				constructorType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(382);
				typeGeneric();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionOrIntersectionOrPrimaryTypeContext extends ParserRuleContext {
		public UnionOrIntersectionOrPrimaryTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionOrIntersectionOrPrimaryType; }
	 
		public UnionOrIntersectionOrPrimaryTypeContext() { }
		public void copyFrom(UnionOrIntersectionOrPrimaryTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntersectionContext extends UnionOrIntersectionOrPrimaryTypeContext {
		public List<UnionOrIntersectionOrPrimaryTypeContext> unionOrIntersectionOrPrimaryType() {
			return getRuleContexts(UnionOrIntersectionOrPrimaryTypeContext.class);
		}
		public UnionOrIntersectionOrPrimaryTypeContext unionOrIntersectionOrPrimaryType(int i) {
			return getRuleContext(UnionOrIntersectionOrPrimaryTypeContext.class,i);
		}
		public TerminalNode BitAnd() { return getToken(TypeScriptParser.BitAnd, 0); }
		public IntersectionContext(UnionOrIntersectionOrPrimaryTypeContext ctx) { copyFrom(ctx); }
	}
	public static class PrimaryContext extends UnionOrIntersectionOrPrimaryTypeContext {
		public PrimaryTypeContext primaryType() {
			return getRuleContext(PrimaryTypeContext.class,0);
		}
		public PrimaryContext(UnionOrIntersectionOrPrimaryTypeContext ctx) { copyFrom(ctx); }
	}
	public static class UnionContext extends UnionOrIntersectionOrPrimaryTypeContext {
		public List<UnionOrIntersectionOrPrimaryTypeContext> unionOrIntersectionOrPrimaryType() {
			return getRuleContexts(UnionOrIntersectionOrPrimaryTypeContext.class);
		}
		public UnionOrIntersectionOrPrimaryTypeContext unionOrIntersectionOrPrimaryType(int i) {
			return getRuleContext(UnionOrIntersectionOrPrimaryTypeContext.class,i);
		}
		public TerminalNode BitOr() { return getToken(TypeScriptParser.BitOr, 0); }
		public UnionContext(UnionOrIntersectionOrPrimaryTypeContext ctx) { copyFrom(ctx); }
	}

	public final UnionOrIntersectionOrPrimaryTypeContext unionOrIntersectionOrPrimaryType() throws RecognitionException {
		return unionOrIntersectionOrPrimaryType(0);
	}

	private UnionOrIntersectionOrPrimaryTypeContext unionOrIntersectionOrPrimaryType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		UnionOrIntersectionOrPrimaryTypeContext _localctx = new UnionOrIntersectionOrPrimaryTypeContext(_ctx, _parentState);
		UnionOrIntersectionOrPrimaryTypeContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_unionOrIntersectionOrPrimaryType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(386);
			primaryType(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(396);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(394);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new UnionContext(new UnionOrIntersectionOrPrimaryTypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_unionOrIntersectionOrPrimaryType);
						setState(388);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(389);
						match(BitOr);
						setState(390);
						unionOrIntersectionOrPrimaryType(4);
						}
						break;
					case 2:
						{
						_localctx = new IntersectionContext(new UnionOrIntersectionOrPrimaryTypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_unionOrIntersectionOrPrimaryType);
						setState(391);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(392);
						match(BitAnd);
						setState(393);
						unionOrIntersectionOrPrimaryType(3);
						}
						break;
					}
					} 
				}
				setState(398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryTypeContext extends ParserRuleContext {
		public PrimaryTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryType; }
	 
		public PrimaryTypeContext() { }
		public void copyFrom(PrimaryTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RedefinitionOfTypeContext extends PrimaryTypeContext {
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public TerminalNode Is() { return getToken(TypeScriptParser.Is, 0); }
		public PrimaryTypeContext primaryType() {
			return getRuleContext(PrimaryTypeContext.class,0);
		}
		public RedefinitionOfTypeContext(PrimaryTypeContext ctx) { copyFrom(ctx); }
	}
	public static class PredefinedPrimTypeContext extends PrimaryTypeContext {
		public PredefinedTypeContext predefinedType() {
			return getRuleContext(PredefinedTypeContext.class,0);
		}
		public PredefinedPrimTypeContext(PrimaryTypeContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayPrimTypeContext extends PrimaryTypeContext {
		public List<PrimaryTypeContext> primaryType() {
			return getRuleContexts(PrimaryTypeContext.class);
		}
		public PrimaryTypeContext primaryType(int i) {
			return getRuleContext(PrimaryTypeContext.class,i);
		}
		public TerminalNode OpenBracket() { return getToken(TypeScriptParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(TypeScriptParser.CloseBracket, 0); }
		public ArrayPrimTypeContext(PrimaryTypeContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesizedPrimTypeContext extends PrimaryTypeContext {
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public ParenthesizedPrimTypeContext(PrimaryTypeContext ctx) { copyFrom(ctx); }
	}
	public static class ThisPrimTypeContext extends PrimaryTypeContext {
		public TerminalNode This() { return getToken(TypeScriptParser.This, 0); }
		public ThisPrimTypeContext(PrimaryTypeContext ctx) { copyFrom(ctx); }
	}
	public static class TuplePrimTypeContext extends PrimaryTypeContext {
		public TerminalNode OpenBracket() { return getToken(TypeScriptParser.OpenBracket, 0); }
		public TupleElementTypesContext tupleElementTypes() {
			return getRuleContext(TupleElementTypesContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(TypeScriptParser.CloseBracket, 0); }
		public TuplePrimTypeContext(PrimaryTypeContext ctx) { copyFrom(ctx); }
	}
	public static class KeyOfTypeContext extends PrimaryTypeContext {
		public TerminalNode KeyOf() { return getToken(TypeScriptParser.KeyOf, 0); }
		public PrimaryTypeContext primaryType() {
			return getRuleContext(PrimaryTypeContext.class,0);
		}
		public KeyOfTypeContext(PrimaryTypeContext ctx) { copyFrom(ctx); }
	}
	public static class ObjectPrimTypeContext extends PrimaryTypeContext {
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public ObjectPrimTypeContext(PrimaryTypeContext ctx) { copyFrom(ctx); }
	}
	public static class ReferencePrimTypeContext extends PrimaryTypeContext {
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public ReferencePrimTypeContext(PrimaryTypeContext ctx) { copyFrom(ctx); }
	}
	public static class QueryPrimTypeContext extends PrimaryTypeContext {
		public TypeQueryContext typeQuery() {
			return getRuleContext(TypeQueryContext.class,0);
		}
		public QueryPrimTypeContext(PrimaryTypeContext ctx) { copyFrom(ctx); }
	}

	public final PrimaryTypeContext primaryType() throws RecognitionException {
		return primaryType(0);
	}

	private PrimaryTypeContext primaryType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryTypeContext _localctx = new PrimaryTypeContext(_ctx, _parentState);
		PrimaryTypeContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_primaryType, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesizedPrimTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(400);
				match(OpenParen);
				setState(401);
				type_();
				setState(402);
				match(CloseParen);
				}
				break;
			case 2:
				{
				_localctx = new PredefinedPrimTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(404);
				predefinedType();
				}
				break;
			case 3:
				{
				_localctx = new ReferencePrimTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(405);
				typeReference();
				}
				break;
			case 4:
				{
				_localctx = new ObjectPrimTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(406);
				objectType();
				}
				break;
			case 5:
				{
				_localctx = new TuplePrimTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(407);
				match(OpenBracket);
				setState(408);
				tupleElementTypes();
				setState(409);
				match(CloseBracket);
				}
				break;
			case 6:
				{
				_localctx = new QueryPrimTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(411);
				typeQuery();
				}
				break;
			case 7:
				{
				_localctx = new ThisPrimTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(412);
				match(This);
				}
				break;
			case 8:
				{
				_localctx = new RedefinitionOfTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(413);
				typeReference();
				setState(414);
				match(Is);
				setState(415);
				primaryType(2);
				}
				break;
			case 9:
				{
				_localctx = new KeyOfTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(417);
				match(KeyOf);
				setState(418);
				primaryType(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(430);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayPrimTypeContext(new PrimaryTypeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_primaryType);
					setState(421);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(422);
					if (!(notLineTerminator())) throw new FailedPredicateException(this, "notLineTerminator()");
					setState(423);
					match(OpenBracket);
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Typeof - 74)) | (1L << (Void - 74)) | (1L << (This - 74)) | (1L << (As - 74)) | (1L << (From - 74)) | (1L << (Async - 74)) | (1L << (Yield - 74)) | (1L << (Any - 74)) | (1L << (Number - 74)) | (1L << (Never - 74)) | (1L << (Boolean - 74)) | (1L << (String - 74)) | (1L << (Unique - 74)) | (1L << (Symbol - 74)) | (1L << (Undefined - 74)) | (1L << (Object - 74)) | (1L << (Of - 74)) | (1L << (KeyOf - 74)) | (1L << (TypeAlias - 74)) | (1L << (Constructor - 74)) | (1L << (Namespace - 74)) | (1L << (Abstract - 74)))) != 0) || _la==Identifier || _la==StringLiteral) {
						{
						setState(424);
						primaryType(0);
						}
					}

					setState(427);
					match(CloseBracket);
					}
					} 
				}
				setState(432);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredefinedTypeContext extends ParserRuleContext {
		public TerminalNode Any() { return getToken(TypeScriptParser.Any, 0); }
		public TerminalNode NullLiteral() { return getToken(TypeScriptParser.NullLiteral, 0); }
		public TerminalNode Number() { return getToken(TypeScriptParser.Number, 0); }
		public TerminalNode DecimalLiteral() { return getToken(TypeScriptParser.DecimalLiteral, 0); }
		public TerminalNode Boolean() { return getToken(TypeScriptParser.Boolean, 0); }
		public TerminalNode BooleanLiteral() { return getToken(TypeScriptParser.BooleanLiteral, 0); }
		public TerminalNode String() { return getToken(TypeScriptParser.String, 0); }
		public TerminalNode StringLiteral() { return getToken(TypeScriptParser.StringLiteral, 0); }
		public TerminalNode Symbol() { return getToken(TypeScriptParser.Symbol, 0); }
		public TerminalNode Unique() { return getToken(TypeScriptParser.Unique, 0); }
		public TerminalNode Never() { return getToken(TypeScriptParser.Never, 0); }
		public TerminalNode Undefined() { return getToken(TypeScriptParser.Undefined, 0); }
		public TerminalNode Object() { return getToken(TypeScriptParser.Object, 0); }
		public TerminalNode Void() { return getToken(TypeScriptParser.Void, 0); }
		public PredefinedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predefinedType; }
	}

	public final PredefinedTypeContext predefinedType() throws RecognitionException {
		PredefinedTypeContext _localctx = new PredefinedTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_predefinedType);
		int _la;
		try {
			setState(449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Any:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				match(Any);
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				match(NullLiteral);
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 3);
				{
				setState(435);
				match(Number);
				}
				break;
			case DecimalLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(436);
				match(DecimalLiteral);
				}
				break;
			case Boolean:
				enterOuterAlt(_localctx, 5);
				{
				setState(437);
				match(Boolean);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(438);
				match(BooleanLiteral);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 7);
				{
				setState(439);
				match(String);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 8);
				{
				setState(440);
				match(StringLiteral);
				}
				break;
			case Unique:
			case Symbol:
				enterOuterAlt(_localctx, 9);
				{
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Unique) {
					{
					setState(441);
					match(Unique);
					}
				}

				setState(444);
				match(Symbol);
				}
				break;
			case Never:
				enterOuterAlt(_localctx, 10);
				{
				setState(445);
				match(Never);
				}
				break;
			case Undefined:
				enterOuterAlt(_localctx, 11);
				{
				setState(446);
				match(Undefined);
				}
				break;
			case Object:
				enterOuterAlt(_localctx, 12);
				{
				setState(447);
				match(Object);
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 13);
				{
				setState(448);
				match(Void);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeReferenceContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeGenericContext typeGeneric() {
			return getRuleContext(TypeGenericContext.class,0);
		}
		public TypeReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeReference; }
	}

	public final TypeReferenceContext typeReference() throws RecognitionException {
		TypeReferenceContext _localctx = new TypeReferenceContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			typeName();
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(452);
				typeGeneric();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeGenericContext extends ParserRuleContext {
		public TerminalNode LessThan() { return getToken(TypeScriptParser.LessThan, 0); }
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TerminalNode MoreThan() { return getToken(TypeScriptParser.MoreThan, 0); }
		public TypeGenericContext typeGeneric() {
			return getRuleContext(TypeGenericContext.class,0);
		}
		public TypeGenericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeGeneric; }
	}

	public final TypeGenericContext typeGeneric() throws RecognitionException {
		TypeGenericContext _localctx = new TypeGenericContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeGeneric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(LessThan);
			setState(456);
			typeArgumentList();
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(457);
				typeGeneric();
				}
			}

			setState(460);
			match(MoreThan);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NamespaceNameContext namespaceName() {
			return getRuleContext(NamespaceNameContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeName);
		try {
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				namespaceName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectTypeContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(TypeScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(TypeScriptParser.CloseBrace, 0); }
		public TypeBodyContext typeBody() {
			return getRuleContext(TypeBodyContext.class,0);
		}
		public ObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectType; }
	}

	public final ObjectTypeContext objectType() throws RecognitionException {
		ObjectTypeContext _localctx = new ObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_objectType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(OpenBrace);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenParen) | (1L << LessThan) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OctalIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral2 - 64)) | (1L << (BinaryIntegerLiteral - 64)) | (1L << (Break - 64)) | (1L << (Do - 64)) | (1L << (Instanceof - 64)) | (1L << (Typeof - 64)) | (1L << (Case - 64)) | (1L << (Else - 64)) | (1L << (New - 64)) | (1L << (Var - 64)) | (1L << (Catch - 64)) | (1L << (Finally - 64)) | (1L << (Return - 64)) | (1L << (Void - 64)) | (1L << (Continue - 64)) | (1L << (For - 64)) | (1L << (Switch - 64)) | (1L << (While - 64)) | (1L << (Debugger - 64)) | (1L << (Function_ - 64)) | (1L << (This - 64)) | (1L << (With - 64)) | (1L << (Default - 64)) | (1L << (If - 64)) | (1L << (Throw - 64)) | (1L << (Delete - 64)) | (1L << (In - 64)) | (1L << (Try - 64)) | (1L << (As - 64)) | (1L << (From - 64)) | (1L << (ReadOnly - 64)) | (1L << (Async - 64)) | (1L << (Await - 64)) | (1L << (Yield - 64)) | (1L << (Class - 64)) | (1L << (Enum - 64)) | (1L << (Extends - 64)) | (1L << (Super - 64)) | (1L << (Const - 64)) | (1L << (Export - 64)) | (1L << (Import - 64)) | (1L << (Implements - 64)) | (1L << (Let - 64)) | (1L << (Private - 64)) | (1L << (Public - 64)) | (1L << (Interface - 64)) | (1L << (Package - 64)) | (1L << (Protected - 64)) | (1L << (Static - 64)) | (1L << (Any - 64)) | (1L << (Number - 64)) | (1L << (Never - 64)) | (1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Unique - 64)) | (1L << (Symbol - 64)) | (1L << (Undefined - 64)) | (1L << (Object - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Of - 128)) | (1L << (KeyOf - 128)) | (1L << (TypeAlias - 128)) | (1L << (Constructor - 128)) | (1L << (Namespace - 128)) | (1L << (Require - 128)) | (1L << (Module - 128)) | (1L << (Abstract - 128)) | (1L << (Identifier - 128)) | (1L << (StringLiteral - 128)))) != 0)) {
				{
				setState(467);
				typeBody();
				}
			}

			setState(470);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBodyContext extends ParserRuleContext {
		public TypeMemberListContext typeMemberList() {
			return getRuleContext(TypeMemberListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(TypeScriptParser.SemiColon, 0); }
		public TerminalNode Comma() { return getToken(TypeScriptParser.Comma, 0); }
		public TypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBody; }
	}

	public final TypeBodyContext typeBody() throws RecognitionException {
		TypeBodyContext _localctx = new TypeBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			typeMemberList();
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon || _la==Comma) {
				{
				setState(473);
				_la = _input.LA(1);
				if ( !(_la==SemiColon || _la==Comma) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeMemberListContext extends ParserRuleContext {
		public List<TypeMemberContext> typeMember() {
			return getRuleContexts(TypeMemberContext.class);
		}
		public TypeMemberContext typeMember(int i) {
			return getRuleContext(TypeMemberContext.class,i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(TypeScriptParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(TypeScriptParser.SemiColon, i);
		}
		public List<TerminalNode> Comma() { return getTokens(TypeScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TypeScriptParser.Comma, i);
		}
		public TypeMemberListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeMemberList; }
	}

	public final TypeMemberListContext typeMemberList() throws RecognitionException {
		TypeMemberListContext _localctx = new TypeMemberListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeMemberList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			typeMember();
			setState(481);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(477);
					_la = _input.LA(1);
					if ( !(_la==SemiColon || _la==Comma) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(478);
					typeMember();
					}
					} 
				}
				setState(483);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeMemberContext extends ParserRuleContext {
		public PropertySignaturContext propertySignatur() {
			return getRuleContext(PropertySignaturContext.class,0);
		}
		public CallSignatureContext callSignature() {
			return getRuleContext(CallSignatureContext.class,0);
		}
		public ConstructSignatureContext constructSignature() {
			return getRuleContext(ConstructSignatureContext.class,0);
		}
		public IndexSignatureContext indexSignature() {
			return getRuleContext(IndexSignatureContext.class,0);
		}
		public MethodSignatureContext methodSignature() {
			return getRuleContext(MethodSignatureContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(TypeScriptParser.ARROW, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TypeMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeMember; }
	}

	public final TypeMemberContext typeMember() throws RecognitionException {
		TypeMemberContext _localctx = new TypeMemberContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeMember);
		int _la;
		try {
			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				propertySignatur();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				callSignature();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				constructSignature();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(487);
				indexSignature();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(488);
				methodSignature();
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARROW) {
					{
					setState(489);
					match(ARROW);
					setState(490);
					type_();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public PrimaryTypeContext primaryType() {
			return getRuleContext(PrimaryTypeContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(TypeScriptParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(TypeScriptParser.CloseBracket, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			primaryType(0);
			setState(496);
			if (!(notLineTerminator())) throw new FailedPredicateException(this, "notLineTerminator()");
			setState(497);
			match(OpenBracket);
			setState(498);
			match(CloseBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleTypeContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(TypeScriptParser.OpenBracket, 0); }
		public TupleElementTypesContext tupleElementTypes() {
			return getRuleContext(TupleElementTypesContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(TypeScriptParser.CloseBracket, 0); }
		public TupleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleType; }
	}

	public final TupleTypeContext tupleType() throws RecognitionException {
		TupleTypeContext _localctx = new TupleTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tupleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(OpenBracket);
			setState(501);
			tupleElementTypes();
			setState(502);
			match(CloseBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleElementTypesContext extends ParserRuleContext {
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TypeScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TypeScriptParser.Comma, i);
		}
		public TupleElementTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleElementTypes; }
	}

	public final TupleElementTypesContext tupleElementTypes() throws RecognitionException {
		TupleElementTypesContext _localctx = new TupleElementTypesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tupleElementTypes);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			type_();
			setState(509);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(505);
					match(Comma);
					setState(506);
					type_();
					}
					} 
				}
				setState(511);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(512);
				match(Comma);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public TerminalNode ARROW() { return getToken(TypeScriptParser.ARROW, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(515);
				typeParameters();
				}
			}

			setState(518);
			match(OpenParen);
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Ellipsis) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Break - 71)) | (1L << (Do - 71)) | (1L << (Instanceof - 71)) | (1L << (Typeof - 71)) | (1L << (Case - 71)) | (1L << (Else - 71)) | (1L << (New - 71)) | (1L << (Var - 71)) | (1L << (Catch - 71)) | (1L << (Finally - 71)) | (1L << (Return - 71)) | (1L << (Void - 71)) | (1L << (Continue - 71)) | (1L << (For - 71)) | (1L << (Switch - 71)) | (1L << (While - 71)) | (1L << (Debugger - 71)) | (1L << (Function_ - 71)) | (1L << (This - 71)) | (1L << (With - 71)) | (1L << (Default - 71)) | (1L << (If - 71)) | (1L << (Throw - 71)) | (1L << (Delete - 71)) | (1L << (In - 71)) | (1L << (Try - 71)) | (1L << (As - 71)) | (1L << (From - 71)) | (1L << (ReadOnly - 71)) | (1L << (Async - 71)) | (1L << (Await - 71)) | (1L << (Yield - 71)) | (1L << (Class - 71)) | (1L << (Enum - 71)) | (1L << (Extends - 71)) | (1L << (Super - 71)) | (1L << (Const - 71)) | (1L << (Export - 71)) | (1L << (Import - 71)) | (1L << (Implements - 71)) | (1L << (Let - 71)) | (1L << (Private - 71)) | (1L << (Public - 71)) | (1L << (Interface - 71)) | (1L << (Package - 71)) | (1L << (Protected - 71)) | (1L << (Static - 71)) | (1L << (Any - 71)) | (1L << (Number - 71)) | (1L << (Never - 71)) | (1L << (Boolean - 71)) | (1L << (String - 71)) | (1L << (Unique - 71)) | (1L << (Symbol - 71)) | (1L << (Undefined - 71)) | (1L << (Object - 71)) | (1L << (Of - 71)) | (1L << (KeyOf - 71)) | (1L << (TypeAlias - 71)) | (1L << (Constructor - 71)) | (1L << (Namespace - 71)) | (1L << (Require - 71)) | (1L << (Module - 71)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (Abstract - 136)) | (1L << (At - 136)) | (1L << (Identifier - 136)))) != 0)) {
				{
				setState(519);
				parameterList();
				}
			}

			setState(522);
			match(CloseParen);
			setState(523);
			match(ARROW);
			setState(524);
			type_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorTypeContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(TypeScriptParser.New, 0); }
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public TerminalNode ARROW() { return getToken(TypeScriptParser.ARROW, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ConstructorTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorType; }
	}

	public final ConstructorTypeContext constructorType() throws RecognitionException {
		ConstructorTypeContext _localctx = new ConstructorTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constructorType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(New);
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(527);
				typeParameters();
				}
			}

			setState(530);
			match(OpenParen);
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Ellipsis) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Break - 71)) | (1L << (Do - 71)) | (1L << (Instanceof - 71)) | (1L << (Typeof - 71)) | (1L << (Case - 71)) | (1L << (Else - 71)) | (1L << (New - 71)) | (1L << (Var - 71)) | (1L << (Catch - 71)) | (1L << (Finally - 71)) | (1L << (Return - 71)) | (1L << (Void - 71)) | (1L << (Continue - 71)) | (1L << (For - 71)) | (1L << (Switch - 71)) | (1L << (While - 71)) | (1L << (Debugger - 71)) | (1L << (Function_ - 71)) | (1L << (This - 71)) | (1L << (With - 71)) | (1L << (Default - 71)) | (1L << (If - 71)) | (1L << (Throw - 71)) | (1L << (Delete - 71)) | (1L << (In - 71)) | (1L << (Try - 71)) | (1L << (As - 71)) | (1L << (From - 71)) | (1L << (ReadOnly - 71)) | (1L << (Async - 71)) | (1L << (Await - 71)) | (1L << (Yield - 71)) | (1L << (Class - 71)) | (1L << (Enum - 71)) | (1L << (Extends - 71)) | (1L << (Super - 71)) | (1L << (Const - 71)) | (1L << (Export - 71)) | (1L << (Import - 71)) | (1L << (Implements - 71)) | (1L << (Let - 71)) | (1L << (Private - 71)) | (1L << (Public - 71)) | (1L << (Interface - 71)) | (1L << (Package - 71)) | (1L << (Protected - 71)) | (1L << (Static - 71)) | (1L << (Any - 71)) | (1L << (Number - 71)) | (1L << (Never - 71)) | (1L << (Boolean - 71)) | (1L << (String - 71)) | (1L << (Unique - 71)) | (1L << (Symbol - 71)) | (1L << (Undefined - 71)) | (1L << (Object - 71)) | (1L << (Of - 71)) | (1L << (KeyOf - 71)) | (1L << (TypeAlias - 71)) | (1L << (Constructor - 71)) | (1L << (Namespace - 71)) | (1L << (Require - 71)) | (1L << (Module - 71)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (Abstract - 136)) | (1L << (At - 136)) | (1L << (Identifier - 136)))) != 0)) {
				{
				setState(531);
				parameterList();
				}
			}

			setState(534);
			match(CloseParen);
			setState(535);
			match(ARROW);
			setState(536);
			type_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeQueryContext extends ParserRuleContext {
		public TerminalNode Typeof() { return getToken(TypeScriptParser.Typeof, 0); }
		public TypeQueryExpressionContext typeQueryExpression() {
			return getRuleContext(TypeQueryExpressionContext.class,0);
		}
		public TypeQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQuery; }
	}

	public final TypeQueryContext typeQuery() throws RecognitionException {
		TypeQueryContext _localctx = new TypeQueryContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_typeQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(Typeof);
			setState(539);
			typeQueryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeQueryExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<IdentifierNameContext> identifierName() {
			return getRuleContexts(IdentifierNameContext.class);
		}
		public IdentifierNameContext identifierName(int i) {
			return getRuleContext(IdentifierNameContext.class,i);
		}
		public List<TerminalNode> Dot() { return getTokens(TypeScriptParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(TypeScriptParser.Dot, i);
		}
		public TypeQueryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQueryExpression; }
	}

	public final TypeQueryExpressionContext typeQueryExpression() throws RecognitionException {
		TypeQueryExpressionContext _localctx = new TypeQueryExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeQueryExpression);
		try {
			int _alt;
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(545); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(542);
						identifierName();
						setState(543);
						match(Dot);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(547); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(549);
				identifierName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertySignaturContext extends ParserRuleContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode ReadOnly() { return getToken(TypeScriptParser.ReadOnly, 0); }
		public TerminalNode QuestionMark() { return getToken(TypeScriptParser.QuestionMark, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(TypeScriptParser.ARROW, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public PropertySignaturContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertySignatur; }
	}

	public final PropertySignaturContext propertySignatur() throws RecognitionException {
		PropertySignaturContext _localctx = new PropertySignaturContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_propertySignatur);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(553);
				match(ReadOnly);
				}
				break;
			}
			setState(556);
			propertyName();
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark) {
				{
				setState(557);
				match(QuestionMark);
				}
			}

			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(560);
				typeAnnotation();
				}
			}

			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(563);
				match(ARROW);
				setState(564);
				type_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeAnnotationContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(TypeScriptParser.Colon, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TypeAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAnnotation; }
	}

	public final TypeAnnotationContext typeAnnotation() throws RecognitionException {
		TypeAnnotationContext _localctx = new TypeAnnotationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typeAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(Colon);
			setState(568);
			type_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallSignatureContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public CallSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callSignature; }
	}

	public final CallSignatureContext callSignature() throws RecognitionException {
		CallSignatureContext _localctx = new CallSignatureContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_callSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(570);
				typeParameters();
				}
			}

			setState(573);
			match(OpenParen);
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Ellipsis) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Break - 71)) | (1L << (Do - 71)) | (1L << (Instanceof - 71)) | (1L << (Typeof - 71)) | (1L << (Case - 71)) | (1L << (Else - 71)) | (1L << (New - 71)) | (1L << (Var - 71)) | (1L << (Catch - 71)) | (1L << (Finally - 71)) | (1L << (Return - 71)) | (1L << (Void - 71)) | (1L << (Continue - 71)) | (1L << (For - 71)) | (1L << (Switch - 71)) | (1L << (While - 71)) | (1L << (Debugger - 71)) | (1L << (Function_ - 71)) | (1L << (This - 71)) | (1L << (With - 71)) | (1L << (Default - 71)) | (1L << (If - 71)) | (1L << (Throw - 71)) | (1L << (Delete - 71)) | (1L << (In - 71)) | (1L << (Try - 71)) | (1L << (As - 71)) | (1L << (From - 71)) | (1L << (ReadOnly - 71)) | (1L << (Async - 71)) | (1L << (Await - 71)) | (1L << (Yield - 71)) | (1L << (Class - 71)) | (1L << (Enum - 71)) | (1L << (Extends - 71)) | (1L << (Super - 71)) | (1L << (Const - 71)) | (1L << (Export - 71)) | (1L << (Import - 71)) | (1L << (Implements - 71)) | (1L << (Let - 71)) | (1L << (Private - 71)) | (1L << (Public - 71)) | (1L << (Interface - 71)) | (1L << (Package - 71)) | (1L << (Protected - 71)) | (1L << (Static - 71)) | (1L << (Any - 71)) | (1L << (Number - 71)) | (1L << (Never - 71)) | (1L << (Boolean - 71)) | (1L << (String - 71)) | (1L << (Unique - 71)) | (1L << (Symbol - 71)) | (1L << (Undefined - 71)) | (1L << (Object - 71)) | (1L << (Of - 71)) | (1L << (KeyOf - 71)) | (1L << (TypeAlias - 71)) | (1L << (Constructor - 71)) | (1L << (Namespace - 71)) | (1L << (Require - 71)) | (1L << (Module - 71)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (Abstract - 136)) | (1L << (At - 136)) | (1L << (Identifier - 136)))) != 0)) {
				{
				setState(574);
				parameterList();
				}
			}

			setState(577);
			match(CloseParen);
			setState(579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(578);
				typeAnnotation();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public RestParameterContext restParameter() {
			return getRuleContext(RestParameterContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TypeScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TypeScriptParser.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_parameterList);
		int _la;
		try {
			int _alt;
			setState(597);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ellipsis:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				restParameter();
				}
				break;
			case OpenBracket:
			case OpenBrace:
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case ReadOnly:
			case Async:
			case Await:
			case Yield:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Any:
			case Number:
			case Never:
			case Boolean:
			case String:
			case Unique:
			case Symbol:
			case Undefined:
			case Object:
			case Of:
			case KeyOf:
			case TypeAlias:
			case Constructor:
			case Namespace:
			case Require:
			case Module:
			case Abstract:
			case At:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				parameter();
				setState(587);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(583);
						match(Comma);
						setState(584);
						parameter();
						}
						} 
					}
					setState(589);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				setState(592);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(590);
					match(Comma);
					setState(591);
					restParameter();
					}
					break;
				}
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(594);
					match(Comma);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequiredParameterListContext extends ParserRuleContext {
		public List<RequiredParameterContext> requiredParameter() {
			return getRuleContexts(RequiredParameterContext.class);
		}
		public RequiredParameterContext requiredParameter(int i) {
			return getRuleContext(RequiredParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TypeScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TypeScriptParser.Comma, i);
		}
		public RequiredParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requiredParameterList; }
	}

	public final RequiredParameterListContext requiredParameterList() throws RecognitionException {
		RequiredParameterListContext _localctx = new RequiredParameterListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_requiredParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			requiredParameter();
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(600);
				match(Comma);
				setState(601);
				requiredParameter();
				}
				}
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public RequiredParameterContext requiredParameter() {
			return getRuleContext(RequiredParameterContext.class,0);
		}
		public OptionalParameterContext optionalParameter() {
			return getRuleContext(OptionalParameterContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_parameter);
		try {
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				requiredParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				optionalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalParameterContext extends ParserRuleContext {
		public IdentifierOrPatternContext identifierOrPattern() {
			return getRuleContext(IdentifierOrPatternContext.class,0);
		}
		public DecoratorListContext decoratorList() {
			return getRuleContext(DecoratorListContext.class,0);
		}
		public TerminalNode QuestionMark() { return getToken(TypeScriptParser.QuestionMark, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public AccessibilityModifierContext accessibilityModifier() {
			return getRuleContext(AccessibilityModifierContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public OptionalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalParameter; }
	}

	public final OptionalParameterContext optionalParameter() throws RecognitionException {
		OptionalParameterContext _localctx = new OptionalParameterContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_optionalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(611);
				decoratorList();
				}
			}

			{
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(614);
				accessibilityModifier();
				}
				break;
			}
			setState(617);
			identifierOrPattern();
			setState(626);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QuestionMark:
				{
				setState(618);
				match(QuestionMark);
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(619);
					typeAnnotation();
					}
				}

				}
				break;
			case Assign:
			case Colon:
				{
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(622);
					typeAnnotation();
					}
				}

				setState(625);
				initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestParameterContext extends ParserRuleContext {
		public TerminalNode Ellipsis() { return getToken(TypeScriptParser.Ellipsis, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public RestParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restParameter; }
	}

	public final RestParameterContext restParameter() throws RecognitionException {
		RestParameterContext _localctx = new RestParameterContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_restParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(Ellipsis);
			setState(629);
			singleExpression(0);
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(630);
				typeAnnotation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequiredParameterContext extends ParserRuleContext {
		public IdentifierOrPatternContext identifierOrPattern() {
			return getRuleContext(IdentifierOrPatternContext.class,0);
		}
		public DecoratorListContext decoratorList() {
			return getRuleContext(DecoratorListContext.class,0);
		}
		public AccessibilityModifierContext accessibilityModifier() {
			return getRuleContext(AccessibilityModifierContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public RequiredParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requiredParameter; }
	}

	public final RequiredParameterContext requiredParameter() throws RecognitionException {
		RequiredParameterContext _localctx = new RequiredParameterContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_requiredParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(633);
				decoratorList();
				}
			}

			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(636);
				accessibilityModifier();
				}
				break;
			}
			setState(639);
			identifierOrPattern();
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(640);
				typeAnnotation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessibilityModifierContext extends ParserRuleContext {
		public TerminalNode Public() { return getToken(TypeScriptParser.Public, 0); }
		public TerminalNode Private() { return getToken(TypeScriptParser.Private, 0); }
		public TerminalNode Protected() { return getToken(TypeScriptParser.Protected, 0); }
		public AccessibilityModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessibilityModifier; }
	}

	public final AccessibilityModifierContext accessibilityModifier() throws RecognitionException {
		AccessibilityModifierContext _localctx = new AccessibilityModifierContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_accessibilityModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			_la = _input.LA(1);
			if ( !(((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (Private - 113)) | (1L << (Public - 113)) | (1L << (Protected - 113)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierOrPatternContext extends ParserRuleContext {
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public BindingPatternContext bindingPattern() {
			return getRuleContext(BindingPatternContext.class,0);
		}
		public IdentifierOrPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierOrPattern; }
	}

	public final IdentifierOrPatternContext identifierOrPattern() throws RecognitionException {
		IdentifierOrPatternContext _localctx = new IdentifierOrPatternContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_identifierOrPattern);
		try {
			setState(647);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case ReadOnly:
			case Async:
			case Await:
			case Yield:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Any:
			case Number:
			case Never:
			case Boolean:
			case String:
			case Unique:
			case Symbol:
			case Undefined:
			case Object:
			case Of:
			case KeyOf:
			case TypeAlias:
			case Constructor:
			case Namespace:
			case Require:
			case Module:
			case Abstract:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				identifierName();
				}
				break;
			case OpenBracket:
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				bindingPattern();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructSignatureContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(TypeScriptParser.New, 0); }
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public ConstructSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructSignature; }
	}

	public final ConstructSignatureContext constructSignature() throws RecognitionException {
		ConstructSignatureContext _localctx = new ConstructSignatureContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_constructSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(New);
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(650);
				typeParameters();
				}
			}

			setState(653);
			match(OpenParen);
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Ellipsis) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Break - 71)) | (1L << (Do - 71)) | (1L << (Instanceof - 71)) | (1L << (Typeof - 71)) | (1L << (Case - 71)) | (1L << (Else - 71)) | (1L << (New - 71)) | (1L << (Var - 71)) | (1L << (Catch - 71)) | (1L << (Finally - 71)) | (1L << (Return - 71)) | (1L << (Void - 71)) | (1L << (Continue - 71)) | (1L << (For - 71)) | (1L << (Switch - 71)) | (1L << (While - 71)) | (1L << (Debugger - 71)) | (1L << (Function_ - 71)) | (1L << (This - 71)) | (1L << (With - 71)) | (1L << (Default - 71)) | (1L << (If - 71)) | (1L << (Throw - 71)) | (1L << (Delete - 71)) | (1L << (In - 71)) | (1L << (Try - 71)) | (1L << (As - 71)) | (1L << (From - 71)) | (1L << (ReadOnly - 71)) | (1L << (Async - 71)) | (1L << (Await - 71)) | (1L << (Yield - 71)) | (1L << (Class - 71)) | (1L << (Enum - 71)) | (1L << (Extends - 71)) | (1L << (Super - 71)) | (1L << (Const - 71)) | (1L << (Export - 71)) | (1L << (Import - 71)) | (1L << (Implements - 71)) | (1L << (Let - 71)) | (1L << (Private - 71)) | (1L << (Public - 71)) | (1L << (Interface - 71)) | (1L << (Package - 71)) | (1L << (Protected - 71)) | (1L << (Static - 71)) | (1L << (Any - 71)) | (1L << (Number - 71)) | (1L << (Never - 71)) | (1L << (Boolean - 71)) | (1L << (String - 71)) | (1L << (Unique - 71)) | (1L << (Symbol - 71)) | (1L << (Undefined - 71)) | (1L << (Object - 71)) | (1L << (Of - 71)) | (1L << (KeyOf - 71)) | (1L << (TypeAlias - 71)) | (1L << (Constructor - 71)) | (1L << (Namespace - 71)) | (1L << (Require - 71)) | (1L << (Module - 71)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (Abstract - 136)) | (1L << (At - 136)) | (1L << (Identifier - 136)))) != 0)) {
				{
				setState(654);
				parameterList();
				}
			}

			setState(657);
			match(CloseParen);
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(658);
				typeAnnotation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexSignatureContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(TypeScriptParser.OpenBracket, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TypeScriptParser.Colon, 0); }
		public TerminalNode CloseBracket() { return getToken(TypeScriptParser.CloseBracket, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode Number() { return getToken(TypeScriptParser.Number, 0); }
		public TerminalNode String() { return getToken(TypeScriptParser.String, 0); }
		public IndexSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexSignature; }
	}

	public final IndexSignatureContext indexSignature() throws RecognitionException {
		IndexSignatureContext _localctx = new IndexSignatureContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_indexSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(OpenBracket);
			setState(662);
			identifier();
			setState(663);
			match(Colon);
			setState(664);
			_la = _input.LA(1);
			if ( !(_la==Number || _la==String) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(665);
			match(CloseBracket);
			setState(666);
			typeAnnotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodSignatureContext extends ParserRuleContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public CallSignatureContext callSignature() {
			return getRuleContext(CallSignatureContext.class,0);
		}
		public TerminalNode QuestionMark() { return getToken(TypeScriptParser.QuestionMark, 0); }
		public MethodSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodSignature; }
	}

	public final MethodSignatureContext methodSignature() throws RecognitionException {
		MethodSignatureContext _localctx = new MethodSignatureContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_methodSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			propertyName();
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark) {
				{
				setState(669);
				match(QuestionMark);
				}
			}

			setState(672);
			callSignature();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeAliasDeclarationContext extends ParserRuleContext {
		public TerminalNode TypeAlias() { return getToken(TypeScriptParser.TypeAlias, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Assign() { return getToken(TypeScriptParser.Assign, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Export() { return getToken(TypeScriptParser.Export, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeAliasDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAliasDeclaration; }
	}

	public final TypeAliasDeclarationContext typeAliasDeclaration() throws RecognitionException {
		TypeAliasDeclarationContext _localctx = new TypeAliasDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeAliasDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Export) {
				{
				setState(674);
				match(Export);
				}
			}

			setState(677);
			match(TypeAlias);
			setState(678);
			identifier();
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(679);
				typeParameters();
				}
			}

			setState(682);
			match(Assign);
			setState(683);
			type_();
			setState(684);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode Constructor() { return getToken(TypeScriptParser.Constructor, 0); }
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public AccessibilityModifierContext accessibilityModifier() {
			return getRuleContext(AccessibilityModifierContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(TypeScriptParser.SemiColon, 0); }
		public TerminalNode OpenBrace() { return getToken(TypeScriptParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(TypeScriptParser.CloseBrace, 0); }
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (Private - 113)) | (1L << (Public - 113)) | (1L << (Protected - 113)))) != 0)) {
				{
				setState(686);
				accessibilityModifier();
				}
			}

			setState(689);
			match(Constructor);
			setState(690);
			match(OpenParen);
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Ellipsis))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Break - 71)) | (1L << (Do - 71)) | (1L << (Instanceof - 71)) | (1L << (Typeof - 71)) | (1L << (Case - 71)) | (1L << (Else - 71)) | (1L << (New - 71)) | (1L << (Var - 71)) | (1L << (Catch - 71)) | (1L << (Finally - 71)) | (1L << (Return - 71)) | (1L << (Void - 71)) | (1L << (Continue - 71)) | (1L << (For - 71)) | (1L << (Switch - 71)) | (1L << (While - 71)) | (1L << (Debugger - 71)) | (1L << (Function_ - 71)) | (1L << (This - 71)) | (1L << (With - 71)) | (1L << (Default - 71)) | (1L << (If - 71)) | (1L << (Throw - 71)) | (1L << (Delete - 71)) | (1L << (In - 71)) | (1L << (Try - 71)) | (1L << (As - 71)) | (1L << (From - 71)) | (1L << (ReadOnly - 71)) | (1L << (Async - 71)) | (1L << (Await - 71)) | (1L << (Yield - 71)) | (1L << (Class - 71)) | (1L << (Enum - 71)) | (1L << (Extends - 71)) | (1L << (Super - 71)) | (1L << (Const - 71)) | (1L << (Export - 71)) | (1L << (Import - 71)) | (1L << (Implements - 71)) | (1L << (Let - 71)) | (1L << (Private - 71)) | (1L << (Public - 71)) | (1L << (Interface - 71)) | (1L << (Package - 71)) | (1L << (Protected - 71)) | (1L << (Static - 71)) | (1L << (Any - 71)) | (1L << (Number - 71)) | (1L << (Never - 71)) | (1L << (Boolean - 71)) | (1L << (String - 71)) | (1L << (Unique - 71)) | (1L << (Symbol - 71)) | (1L << (Undefined - 71)) | (1L << (Object - 71)) | (1L << (Of - 71)) | (1L << (KeyOf - 71)) | (1L << (TypeAlias - 71)) | (1L << (Constructor - 71)) | (1L << (Namespace - 71)) | (1L << (Require - 71)) | (1L << (Module - 71)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (Abstract - 136)) | (1L << (At - 136)) | (1L << (Identifier - 136)))) != 0)) {
				{
				setState(691);
				formalParameterList();
				}
			}

			setState(694);
			match(CloseParen);
			setState(700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				{
				setState(695);
				match(OpenBrace);
				setState(696);
				functionBody();
				setState(697);
				match(CloseBrace);
				}
				}
				break;
			case 2:
				{
				setState(699);
				match(SemiColon);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Interface() { return getToken(TypeScriptParser.Interface, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public TerminalNode Export() { return getToken(TypeScriptParser.Export, 0); }
		public TerminalNode Declare() { return getToken(TypeScriptParser.Declare, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceExtendsClauseContext interfaceExtendsClause() {
			return getRuleContext(InterfaceExtendsClauseContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(TypeScriptParser.SemiColon, 0); }
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Export) {
				{
				setState(702);
				match(Export);
				}
			}

			setState(706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Declare) {
				{
				setState(705);
				match(Declare);
				}
			}

			setState(708);
			match(Interface);
			setState(709);
			identifier();
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(710);
				typeParameters();
				}
			}

			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(713);
				interfaceExtendsClause();
				}
			}

			setState(716);
			objectType();
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(717);
				match(SemiColon);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceExtendsClauseContext extends ParserRuleContext {
		public TerminalNode Extends() { return getToken(TypeScriptParser.Extends, 0); }
		public ClassOrInterfaceTypeListContext classOrInterfaceTypeList() {
			return getRuleContext(ClassOrInterfaceTypeListContext.class,0);
		}
		public InterfaceExtendsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceExtendsClause; }
	}

	public final InterfaceExtendsClauseContext interfaceExtendsClause() throws RecognitionException {
		InterfaceExtendsClauseContext _localctx = new InterfaceExtendsClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_interfaceExtendsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(Extends);
			setState(721);
			classOrInterfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeListContext extends ParserRuleContext {
		public List<TypeReferenceContext> typeReference() {
			return getRuleContexts(TypeReferenceContext.class);
		}
		public TypeReferenceContext typeReference(int i) {
			return getRuleContext(TypeReferenceContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TypeScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TypeScriptParser.Comma, i);
		}
		public ClassOrInterfaceTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceTypeList; }
	}

	public final ClassOrInterfaceTypeListContext classOrInterfaceTypeList() throws RecognitionException {
		ClassOrInterfaceTypeListContext _localctx = new ClassOrInterfaceTypeListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_classOrInterfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			typeReference();
			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(724);
				match(Comma);
				setState(725);
				typeReference();
				}
				}
				setState(730);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(TypeScriptParser.Enum, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(TypeScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(TypeScriptParser.CloseBrace, 0); }
		public TerminalNode Const() { return getToken(TypeScriptParser.Const, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Const) {
				{
				setState(731);
				match(Const);
				}
			}

			setState(734);
			match(Enum);
			setState(735);
			identifier();
			setState(736);
			match(OpenBrace);
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OctalIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral2 - 64)) | (1L << (BinaryIntegerLiteral - 64)) | (1L << (Break - 64)) | (1L << (Do - 64)) | (1L << (Instanceof - 64)) | (1L << (Typeof - 64)) | (1L << (Case - 64)) | (1L << (Else - 64)) | (1L << (New - 64)) | (1L << (Var - 64)) | (1L << (Catch - 64)) | (1L << (Finally - 64)) | (1L << (Return - 64)) | (1L << (Void - 64)) | (1L << (Continue - 64)) | (1L << (For - 64)) | (1L << (Switch - 64)) | (1L << (While - 64)) | (1L << (Debugger - 64)) | (1L << (Function_ - 64)) | (1L << (This - 64)) | (1L << (With - 64)) | (1L << (Default - 64)) | (1L << (If - 64)) | (1L << (Throw - 64)) | (1L << (Delete - 64)) | (1L << (In - 64)) | (1L << (Try - 64)) | (1L << (As - 64)) | (1L << (From - 64)) | (1L << (ReadOnly - 64)) | (1L << (Async - 64)) | (1L << (Await - 64)) | (1L << (Yield - 64)) | (1L << (Class - 64)) | (1L << (Enum - 64)) | (1L << (Extends - 64)) | (1L << (Super - 64)) | (1L << (Const - 64)) | (1L << (Export - 64)) | (1L << (Import - 64)) | (1L << (Implements - 64)) | (1L << (Let - 64)) | (1L << (Private - 64)) | (1L << (Public - 64)) | (1L << (Interface - 64)) | (1L << (Package - 64)) | (1L << (Protected - 64)) | (1L << (Static - 64)) | (1L << (Any - 64)) | (1L << (Number - 64)) | (1L << (Never - 64)) | (1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Unique - 64)) | (1L << (Symbol - 64)) | (1L << (Undefined - 64)) | (1L << (Object - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Of - 128)) | (1L << (KeyOf - 128)) | (1L << (TypeAlias - 128)) | (1L << (Constructor - 128)) | (1L << (Namespace - 128)) | (1L << (Require - 128)) | (1L << (Module - 128)) | (1L << (Abstract - 128)) | (1L << (Identifier - 128)) | (1L << (StringLiteral - 128)))) != 0)) {
				{
				setState(737);
				enumBody();
				}
			}

			setState(740);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyContext extends ParserRuleContext {
		public EnumMemberListContext enumMemberList() {
			return getRuleContext(EnumMemberListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TypeScriptParser.Comma, 0); }
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			enumMemberList();
			setState(744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(743);
				match(Comma);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumMemberListContext extends ParserRuleContext {
		public List<EnumMemberContext> enumMember() {
			return getRuleContexts(EnumMemberContext.class);
		}
		public EnumMemberContext enumMember(int i) {
			return getRuleContext(EnumMemberContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TypeScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TypeScriptParser.Comma, i);
		}
		public EnumMemberListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumMemberList; }
	}

	public final EnumMemberListContext enumMemberList() throws RecognitionException {
		EnumMemberListContext _localctx = new EnumMemberListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_enumMemberList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			enumMember();
			setState(751);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(747);
					match(Comma);
					setState(748);
					enumMember();
					}
					} 
				}
				setState(753);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumMemberContext extends ParserRuleContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode Assign() { return getToken(TypeScriptParser.Assign, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public EnumMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumMember; }
	}

	public final EnumMemberContext enumMember() throws RecognitionException {
		EnumMemberContext _localctx = new EnumMemberContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_enumMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			propertyName();
			setState(757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(755);
				match(Assign);
				setState(756);
				singleExpression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(TypeScriptParser.Namespace, 0); }
		public NamespaceNameContext namespaceName() {
			return getRuleContext(NamespaceNameContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(TypeScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(TypeScriptParser.CloseBrace, 0); }
		public TerminalNode Declare() { return getToken(TypeScriptParser.Declare, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public NamespaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceDeclaration; }
	}

	public final NamespaceDeclarationContext namespaceDeclaration() throws RecognitionException {
		NamespaceDeclarationContext _localctx = new NamespaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_namespaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Declare) {
				{
				setState(759);
				match(Declare);
				}
			}

			setState(762);
			match(Namespace);
			setState(763);
			namespaceName();
			setState(764);
			match(OpenBrace);
			setState(766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(765);
				statementList();
				}
				break;
			}
			setState(768);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> Dot() { return getTokens(TypeScriptParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(TypeScriptParser.Dot, i);
		}
		public NamespaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceName; }
	}

	public final NamespaceNameContext namespaceName() throws RecognitionException {
		NamespaceNameContext _localctx = new NamespaceNameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_namespaceName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			identifier();
			setState(779);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(772); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(771);
						match(Dot);
						}
						}
						setState(774); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Dot );
					setState(776);
					identifier();
					}
					} 
				}
				setState(781);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportAliasDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Assign() { return getToken(TypeScriptParser.Assign, 0); }
		public NamespaceNameContext namespaceName() {
			return getRuleContext(NamespaceNameContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(TypeScriptParser.SemiColon, 0); }
		public ImportAliasDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importAliasDeclaration; }
	}

	public final ImportAliasDeclarationContext importAliasDeclaration() throws RecognitionException {
		ImportAliasDeclarationContext _localctx = new ImportAliasDeclarationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_importAliasDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			identifier();
			setState(783);
			match(Assign);
			setState(784);
			namespaceName();
			setState(785);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecoratorListContext extends ParserRuleContext {
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public DecoratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorList; }
	}

	public final DecoratorListContext decoratorList() throws RecognitionException {
		DecoratorListContext _localctx = new DecoratorListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_decoratorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(788); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(787);
					decorator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(790); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecoratorContext extends ParserRuleContext {
		public TerminalNode At() { return getToken(TypeScriptParser.At, 0); }
		public DecoratorMemberExpressionContext decoratorMemberExpression() {
			return getRuleContext(DecoratorMemberExpressionContext.class,0);
		}
		public DecoratorCallExpressionContext decoratorCallExpression() {
			return getRuleContext(DecoratorCallExpressionContext.class,0);
		}
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_decorator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			match(At);
			setState(795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(793);
				decoratorMemberExpression(0);
				}
				break;
			case 2:
				{
				setState(794);
				decoratorCallExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecoratorMemberExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public DecoratorMemberExpressionContext decoratorMemberExpression() {
			return getRuleContext(DecoratorMemberExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(TypeScriptParser.Dot, 0); }
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public DecoratorMemberExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorMemberExpression; }
	}

	public final DecoratorMemberExpressionContext decoratorMemberExpression() throws RecognitionException {
		return decoratorMemberExpression(0);
	}

	private DecoratorMemberExpressionContext decoratorMemberExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DecoratorMemberExpressionContext _localctx = new DecoratorMemberExpressionContext(_ctx, _parentState);
		DecoratorMemberExpressionContext _prevctx = _localctx;
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_decoratorMemberExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case As:
			case From:
			case Async:
			case Yield:
			case Any:
			case Number:
			case Never:
			case Boolean:
			case String:
			case Unique:
			case Symbol:
			case Undefined:
			case Object:
			case Of:
			case KeyOf:
			case TypeAlias:
			case Constructor:
			case Namespace:
			case Abstract:
			case Identifier:
				{
				setState(798);
				identifier();
				}
				break;
			case OpenParen:
				{
				setState(799);
				match(OpenParen);
				setState(800);
				singleExpression(0);
				setState(801);
				match(CloseParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(810);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DecoratorMemberExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_decoratorMemberExpression);
					setState(805);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(806);
					match(Dot);
					setState(807);
					identifierName();
					}
					} 
				}
				setState(812);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DecoratorCallExpressionContext extends ParserRuleContext {
		public DecoratorMemberExpressionContext decoratorMemberExpression() {
			return getRuleContext(DecoratorMemberExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public DecoratorCallExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorCallExpression; }
	}

	public final DecoratorCallExpressionContext decoratorCallExpression() throws RecognitionException {
		DecoratorCallExpressionContext _localctx = new DecoratorCallExpressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_decoratorCallExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			decoratorMemberExpression(0);
			setState(814);
			arguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public EmptyStatement_Context emptyStatement_() {
			return getRuleContext(EmptyStatement_Context.class,0);
		}
		public AbstractDeclarationContext abstractDeclaration() {
			return getRuleContext(AbstractDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public NamespaceDeclarationContext namespaceDeclaration() {
			return getRuleContext(NamespaceDeclarationContext.class,0);
		}
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public YieldStatementContext yieldStatement() {
			return getRuleContext(YieldStatementContext.class,0);
		}
		public WithStatementContext withStatement() {
			return getRuleContext(WithStatementContext.class,0);
		}
		public LabelledStatementContext labelledStatement() {
			return getRuleContext(LabelledStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public DebuggerStatementContext debuggerStatement() {
			return getRuleContext(DebuggerStatementContext.class,0);
		}
		public ArrowFunctionDeclarationContext arrowFunctionDeclaration() {
			return getRuleContext(ArrowFunctionDeclarationContext.class,0);
		}
		public GeneratorFunctionDeclarationContext generatorFunctionDeclaration() {
			return getRuleContext(GeneratorFunctionDeclarationContext.class,0);
		}
		public TypeAliasDeclarationContext typeAliasDeclaration() {
			return getRuleContext(TypeAliasDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public DeclareModuleContext declareModule() {
			return getRuleContext(DeclareModuleContext.class,0);
		}
		public TerminalNode Export() { return getToken(TypeScriptParser.Export, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_statement);
		try {
			setState(846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(816);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(817);
				variableStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(818);
				importStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(819);
				emptyStatement_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(820);
				abstractDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(821);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(822);
				functionDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(823);
				expressionStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(824);
				interfaceDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(825);
				namespaceDeclaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(826);
				exportStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(827);
				ifStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(828);
				iterationStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(829);
				continueStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(830);
				breakStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(831);
				returnStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(832);
				yieldStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(833);
				withStatement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(834);
				labelledStatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(835);
				switchStatement();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(836);
				throwStatement();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(837);
				tryStatement();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(838);
				debuggerStatement();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(839);
				arrowFunctionDeclaration();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(840);
				generatorFunctionDeclaration();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(841);
				typeAliasDeclaration();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(842);
				enumDeclaration();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(843);
				declareModule();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(844);
				match(Export);
				setState(845);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(TypeScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(TypeScriptParser.CloseBrace, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			match(OpenBrace);
			setState(850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(849);
				statementList();
				}
				break;
			}
			setState(852);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_statementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(855); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(854);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(857); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractDeclarationContext extends ParserRuleContext {
		public TerminalNode Abstract() { return getToken(TypeScriptParser.Abstract, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CallSignatureContext callSignature() {
			return getRuleContext(CallSignatureContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public AbstractDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclaration; }
	}

	public final AbstractDeclarationContext abstractDeclaration() throws RecognitionException {
		AbstractDeclarationContext _localctx = new AbstractDeclarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_abstractDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			match(Abstract);
			setState(864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(860);
				identifier();
				setState(861);
				callSignature();
				}
				break;
			case 2:
				{
				setState(863);
				variableStatement();
				}
				break;
			}
			setState(866);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(TypeScriptParser.Import, 0); }
		public ImportFromBlockContext importFromBlock() {
			return getRuleContext(ImportFromBlockContext.class,0);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			match(Import);
			setState(869);
			importFromBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportFromBlockContext extends ParserRuleContext {
		public ImportFromContext importFrom() {
			return getRuleContext(ImportFromContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ImportNamespaceContext importNamespace() {
			return getRuleContext(ImportNamespaceContext.class,0);
		}
		public ImportModuleItemsContext importModuleItems() {
			return getRuleContext(ImportModuleItemsContext.class,0);
		}
		public ImportDefaultContext importDefault() {
			return getRuleContext(ImportDefaultContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(TypeScriptParser.StringLiteral, 0); }
		public ImportFromBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFromBlock; }
	}

	public final ImportFromBlockContext importFromBlock() throws RecognitionException {
		ImportFromBlockContext _localctx = new ImportFromBlockContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_importFromBlock);
		try {
			setState(883);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBrace:
			case Multiply:
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case ReadOnly:
			case Async:
			case Await:
			case Yield:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Any:
			case Number:
			case Never:
			case Boolean:
			case String:
			case Unique:
			case Symbol:
			case Undefined:
			case Object:
			case Of:
			case KeyOf:
			case TypeAlias:
			case Constructor:
			case Namespace:
			case Require:
			case Module:
			case Abstract:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(872);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(871);
					importDefault();
					}
					break;
				}
				setState(876);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Multiply:
				case NullLiteral:
				case BooleanLiteral:
				case Break:
				case Do:
				case Instanceof:
				case Typeof:
				case Case:
				case Else:
				case New:
				case Var:
				case Catch:
				case Finally:
				case Return:
				case Void:
				case Continue:
				case For:
				case Switch:
				case While:
				case Debugger:
				case Function_:
				case This:
				case With:
				case Default:
				case If:
				case Throw:
				case Delete:
				case In:
				case Try:
				case As:
				case From:
				case ReadOnly:
				case Async:
				case Await:
				case Yield:
				case Class:
				case Enum:
				case Extends:
				case Super:
				case Const:
				case Export:
				case Import:
				case Implements:
				case Let:
				case Private:
				case Public:
				case Interface:
				case Package:
				case Protected:
				case Static:
				case Any:
				case Number:
				case Never:
				case Boolean:
				case String:
				case Unique:
				case Symbol:
				case Undefined:
				case Object:
				case Of:
				case KeyOf:
				case TypeAlias:
				case Constructor:
				case Namespace:
				case Require:
				case Module:
				case Abstract:
				case Identifier:
					{
					setState(874);
					importNamespace();
					}
					break;
				case OpenBrace:
					{
					setState(875);
					importModuleItems();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(878);
				importFrom();
				setState(879);
				eos();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(881);
				match(StringLiteral);
				setState(882);
				eos();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportModuleItemsContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(TypeScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(TypeScriptParser.CloseBrace, 0); }
		public List<ImportAliasNameContext> importAliasName() {
			return getRuleContexts(ImportAliasNameContext.class);
		}
		public ImportAliasNameContext importAliasName(int i) {
			return getRuleContext(ImportAliasNameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TypeScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TypeScriptParser.Comma, i);
		}
		public ImportModuleItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importModuleItems; }
	}

	public final ImportModuleItemsContext importModuleItems() throws RecognitionException {
		ImportModuleItemsContext _localctx = new ImportModuleItemsContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_importModuleItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			match(OpenBrace);
			setState(891);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(886);
					importAliasName();
					setState(887);
					match(Comma);
					}
					} 
				}
				setState(893);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (NullLiteral - 60)) | (1L << (BooleanLiteral - 60)) | (1L << (Break - 60)) | (1L << (Do - 60)) | (1L << (Instanceof - 60)) | (1L << (Typeof - 60)) | (1L << (Case - 60)) | (1L << (Else - 60)) | (1L << (New - 60)) | (1L << (Var - 60)) | (1L << (Catch - 60)) | (1L << (Finally - 60)) | (1L << (Return - 60)) | (1L << (Void - 60)) | (1L << (Continue - 60)) | (1L << (For - 60)) | (1L << (Switch - 60)) | (1L << (While - 60)) | (1L << (Debugger - 60)) | (1L << (Function_ - 60)) | (1L << (This - 60)) | (1L << (With - 60)) | (1L << (Default - 60)) | (1L << (If - 60)) | (1L << (Throw - 60)) | (1L << (Delete - 60)) | (1L << (In - 60)) | (1L << (Try - 60)) | (1L << (As - 60)) | (1L << (From - 60)) | (1L << (ReadOnly - 60)) | (1L << (Async - 60)) | (1L << (Await - 60)) | (1L << (Yield - 60)) | (1L << (Class - 60)) | (1L << (Enum - 60)) | (1L << (Extends - 60)) | (1L << (Super - 60)) | (1L << (Const - 60)) | (1L << (Export - 60)) | (1L << (Import - 60)) | (1L << (Implements - 60)) | (1L << (Let - 60)) | (1L << (Private - 60)) | (1L << (Public - 60)) | (1L << (Interface - 60)) | (1L << (Package - 60)) | (1L << (Protected - 60)) | (1L << (Static - 60)) | (1L << (Any - 60)) | (1L << (Number - 60)) | (1L << (Never - 60)) | (1L << (Boolean - 60)) | (1L << (String - 60)))) != 0) || ((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & ((1L << (Unique - 124)) | (1L << (Symbol - 124)) | (1L << (Undefined - 124)) | (1L << (Object - 124)) | (1L << (Of - 124)) | (1L << (KeyOf - 124)) | (1L << (TypeAlias - 124)) | (1L << (Constructor - 124)) | (1L << (Namespace - 124)) | (1L << (Require - 124)) | (1L << (Module - 124)) | (1L << (Abstract - 124)) | (1L << (Identifier - 124)) | (1L << (StringLiteral - 124)))) != 0)) {
				{
				setState(894);
				importAliasName();
				setState(896);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(895);
					match(Comma);
					}
				}

				}
			}

			setState(900);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportAliasNameContext extends ParserRuleContext {
		public ModuleExportNameContext moduleExportName() {
			return getRuleContext(ModuleExportNameContext.class,0);
		}
		public TerminalNode As() { return getToken(TypeScriptParser.As, 0); }
		public ImportedBindingContext importedBinding() {
			return getRuleContext(ImportedBindingContext.class,0);
		}
		public ImportAliasNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importAliasName; }
	}

	public final ImportAliasNameContext importAliasName() throws RecognitionException {
		ImportAliasNameContext _localctx = new ImportAliasNameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_importAliasName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			moduleExportName();
			setState(905);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(903);
				match(As);
				setState(904);
				importedBinding();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleExportNameContext extends ParserRuleContext {
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(TypeScriptParser.StringLiteral, 0); }
		public ModuleExportNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleExportName; }
	}

	public final ModuleExportNameContext moduleExportName() throws RecognitionException {
		ModuleExportNameContext _localctx = new ModuleExportNameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_moduleExportName);
		try {
			setState(909);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case ReadOnly:
			case Async:
			case Await:
			case Yield:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Any:
			case Number:
			case Never:
			case Boolean:
			case String:
			case Unique:
			case Symbol:
			case Undefined:
			case Object:
			case Of:
			case KeyOf:
			case TypeAlias:
			case Constructor:
			case Namespace:
			case Require:
			case Module:
			case Abstract:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(907);
				identifierName();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(908);
				match(StringLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportedBindingContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TypeScriptParser.Identifier, 0); }
		public TerminalNode Yield() { return getToken(TypeScriptParser.Yield, 0); }
		public TerminalNode Await() { return getToken(TypeScriptParser.Await, 0); }
		public ImportedBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importedBinding; }
	}

	public final ImportedBindingContext importedBinding() throws RecognitionException {
		ImportedBindingContext _localctx = new ImportedBindingContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_importedBinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			_la = _input.LA(1);
			if ( !(((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Await - 101)) | (1L << (Yield - 101)) | (1L << (Identifier - 101)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDefaultContext extends ParserRuleContext {
		public AliasNameContext aliasName() {
			return getRuleContext(AliasNameContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TypeScriptParser.Comma, 0); }
		public ImportDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDefault; }
	}

	public final ImportDefaultContext importDefault() throws RecognitionException {
		ImportDefaultContext _localctx = new ImportDefaultContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_importDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			aliasName();
			setState(914);
			match(Comma);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportNamespaceContext extends ParserRuleContext {
		public TerminalNode Multiply() { return getToken(TypeScriptParser.Multiply, 0); }
		public List<IdentifierNameContext> identifierName() {
			return getRuleContexts(IdentifierNameContext.class);
		}
		public IdentifierNameContext identifierName(int i) {
			return getRuleContext(IdentifierNameContext.class,i);
		}
		public TerminalNode As() { return getToken(TypeScriptParser.As, 0); }
		public ImportNamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importNamespace; }
	}

	public final ImportNamespaceContext importNamespace() throws RecognitionException {
		ImportNamespaceContext _localctx = new ImportNamespaceContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_importNamespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Multiply:
				{
				setState(916);
				match(Multiply);
				}
				break;
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case ReadOnly:
			case Async:
			case Await:
			case Yield:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Any:
			case Number:
			case Never:
			case Boolean:
			case String:
			case Unique:
			case Symbol:
			case Undefined:
			case Object:
			case Of:
			case KeyOf:
			case TypeAlias:
			case Constructor:
			case Namespace:
			case Require:
			case Module:
			case Abstract:
			case Identifier:
				{
				setState(917);
				identifierName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(922);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(920);
				match(As);
				setState(921);
				identifierName();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportFromContext extends ParserRuleContext {
		public TerminalNode From() { return getToken(TypeScriptParser.From, 0); }
		public TerminalNode StringLiteral() { return getToken(TypeScriptParser.StringLiteral, 0); }
		public ImportFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFrom; }
	}

	public final ImportFromContext importFrom() throws RecognitionException {
		ImportFromContext _localctx = new ImportFromContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_importFrom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			match(From);
			setState(925);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasNameContext extends ParserRuleContext {
		public List<IdentifierNameContext> identifierName() {
			return getRuleContexts(IdentifierNameContext.class);
		}
		public IdentifierNameContext identifierName(int i) {
			return getRuleContext(IdentifierNameContext.class,i);
		}
		public TerminalNode As() { return getToken(TypeScriptParser.As, 0); }
		public AliasNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasName; }
	}

	public final AliasNameContext aliasName() throws RecognitionException {
		AliasNameContext _localctx = new AliasNameContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_aliasName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			identifierName();
			setState(930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(928);
				match(As);
				setState(929);
				identifierName();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExportStatementContext extends ParserRuleContext {
		public TerminalNode Export() { return getToken(TypeScriptParser.Export, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExportFromBlockContext exportFromBlock() {
			return getRuleContext(ExportFromBlockContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Default() { return getToken(TypeScriptParser.Default, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_exportStatement);
		try {
			setState(947);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(932);
				match(Export);
				setState(934);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(933);
					match(Default);
					}
					break;
				}
				setState(938);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(936);
					exportFromBlock();
					}
					break;
				case 2:
					{
					setState(937);
					declaration();
					}
					break;
				}
				setState(940);
				eos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(942);
				match(Export);
				setState(943);
				match(Default);
				setState(944);
				singleExpression(0);
				setState(945);
				eos();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExportFromBlockContext extends ParserRuleContext {
		public ImportNamespaceContext importNamespace() {
			return getRuleContext(ImportNamespaceContext.class,0);
		}
		public ImportFromContext importFrom() {
			return getRuleContext(ImportFromContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExportModuleItemsContext exportModuleItems() {
			return getRuleContext(ExportModuleItemsContext.class,0);
		}
		public ExportFromBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportFromBlock; }
	}

	public final ExportFromBlockContext exportFromBlock() throws RecognitionException {
		ExportFromBlockContext _localctx = new ExportFromBlockContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_exportFromBlock);
		try {
			setState(959);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Multiply:
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case ReadOnly:
			case Async:
			case Await:
			case Yield:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Any:
			case Number:
			case Never:
			case Boolean:
			case String:
			case Unique:
			case Symbol:
			case Undefined:
			case Object:
			case Of:
			case KeyOf:
			case TypeAlias:
			case Constructor:
			case Namespace:
			case Require:
			case Module:
			case Abstract:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(949);
				importNamespace();
				setState(950);
				importFrom();
				setState(951);
				eos();
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(953);
				exportModuleItems();
				setState(955);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(954);
					importFrom();
					}
					break;
				}
				setState(957);
				eos();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExportModuleItemsContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(TypeScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(TypeScriptParser.CloseBrace, 0); }
		public List<ExportAliasNameContext> exportAliasName() {
			return getRuleContexts(ExportAliasNameContext.class);
		}
		public ExportAliasNameContext exportAliasName(int i) {
			return getRuleContext(ExportAliasNameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TypeScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TypeScriptParser.Comma, i);
		}
		public ExportModuleItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportModuleItems; }
	}

	public final ExportModuleItemsContext exportModuleItems() throws RecognitionException {
		ExportModuleItemsContext _localctx = new ExportModuleItemsContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_exportModuleItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			match(OpenBrace);
			setState(967);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(962);
					exportAliasName();
					setState(963);
					match(Comma);
					}
					} 
				}
				setState(969);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			}
			setState(974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (NullLiteral - 60)) | (1L << (BooleanLiteral - 60)) | (1L << (Break - 60)) | (1L << (Do - 60)) | (1L << (Instanceof - 60)) | (1L << (Typeof - 60)) | (1L << (Case - 60)) | (1L << (Else - 60)) | (1L << (New - 60)) | (1L << (Var - 60)) | (1L << (Catch - 60)) | (1L << (Finally - 60)) | (1L << (Return - 60)) | (1L << (Void - 60)) | (1L << (Continue - 60)) | (1L << (For - 60)) | (1L << (Switch - 60)) | (1L << (While - 60)) | (1L << (Debugger - 60)) | (1L << (Function_ - 60)) | (1L << (This - 60)) | (1L << (With - 60)) | (1L << (Default - 60)) | (1L << (If - 60)) | (1L << (Throw - 60)) | (1L << (Delete - 60)) | (1L << (In - 60)) | (1L << (Try - 60)) | (1L << (As - 60)) | (1L << (From - 60)) | (1L << (ReadOnly - 60)) | (1L << (Async - 60)) | (1L << (Await - 60)) | (1L << (Yield - 60)) | (1L << (Class - 60)) | (1L << (Enum - 60)) | (1L << (Extends - 60)) | (1L << (Super - 60)) | (1L << (Const - 60)) | (1L << (Export - 60)) | (1L << (Import - 60)) | (1L << (Implements - 60)) | (1L << (Let - 60)) | (1L << (Private - 60)) | (1L << (Public - 60)) | (1L << (Interface - 60)) | (1L << (Package - 60)) | (1L << (Protected - 60)) | (1L << (Static - 60)) | (1L << (Any - 60)) | (1L << (Number - 60)) | (1L << (Never - 60)) | (1L << (Boolean - 60)) | (1L << (String - 60)))) != 0) || ((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & ((1L << (Unique - 124)) | (1L << (Symbol - 124)) | (1L << (Undefined - 124)) | (1L << (Object - 124)) | (1L << (Of - 124)) | (1L << (KeyOf - 124)) | (1L << (TypeAlias - 124)) | (1L << (Constructor - 124)) | (1L << (Namespace - 124)) | (1L << (Require - 124)) | (1L << (Module - 124)) | (1L << (Abstract - 124)) | (1L << (Identifier - 124)) | (1L << (StringLiteral - 124)))) != 0)) {
				{
				setState(970);
				exportAliasName();
				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(971);
					match(Comma);
					}
				}

				}
			}

			setState(976);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExportAliasNameContext extends ParserRuleContext {
		public List<ModuleExportNameContext> moduleExportName() {
			return getRuleContexts(ModuleExportNameContext.class);
		}
		public ModuleExportNameContext moduleExportName(int i) {
			return getRuleContext(ModuleExportNameContext.class,i);
		}
		public TerminalNode As() { return getToken(TypeScriptParser.As, 0); }
		public ExportAliasNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportAliasName; }
	}

	public final ExportAliasNameContext exportAliasName() throws RecognitionException {
		ExportAliasNameContext _localctx = new ExportAliasNameContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_exportAliasName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			moduleExportName();
			setState(981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(979);
				match(As);
				setState(980);
				moduleExportName();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_declaration);
		try {
			setState(986);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(983);
				variableStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(984);
				classDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(985);
				functionDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareModuleContext extends ParserRuleContext {
		public TerminalNode Declare() { return getToken(TypeScriptParser.Declare, 0); }
		public TerminalNode Module() { return getToken(TypeScriptParser.Module, 0); }
		public TerminalNode StringLiteral() { return getToken(TypeScriptParser.StringLiteral, 0); }
		public TerminalNode OpenBrace() { return getToken(TypeScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(TypeScriptParser.CloseBrace, 0); }
		public NamespaceElementListContext namespaceElementList() {
			return getRuleContext(NamespaceElementListContext.class,0);
		}
		public DeclareModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareModule; }
	}

	public final DeclareModuleContext declareModule() throws RecognitionException {
		DeclareModuleContext _localctx = new DeclareModuleContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_declareModule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			match(Declare);
			setState(989);
			match(Module);
			setState(990);
			match(StringLiteral);
			setState(991);
			match(OpenBrace);
			setState(993);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(992);
				namespaceElementList();
				}
				break;
			}
			setState(995);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceElementListContext extends ParserRuleContext {
		public List<NamespaceElementContext> namespaceElement() {
			return getRuleContexts(NamespaceElementContext.class);
		}
		public NamespaceElementContext namespaceElement(int i) {
			return getRuleContext(NamespaceElementContext.class,i);
		}
		public NamespaceElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceElementList; }
	}

	public final NamespaceElementListContext namespaceElementList() throws RecognitionException {
		NamespaceElementListContext _localctx = new NamespaceElementListContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_namespaceElementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(998); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(997);
					namespaceElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1000); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceElementContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(TypeScriptParser.Import, 0); }
		public ImportFromBlockContext importFromBlock() {
			return getRuleContext(ImportFromBlockContext.class,0);
		}
		public TerminalNode Export() { return getToken(TypeScriptParser.Export, 0); }
		public TerminalNode ExportFrom() { return getToken(TypeScriptParser.ExportFrom, 0); }
		public ExportFromBlockContext exportFromBlock() {
			return getRuleContext(ExportFromBlockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public NamespaceElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceElement; }
	}

	public final NamespaceElementContext namespaceElement() throws RecognitionException {
		NamespaceElementContext _localctx = new NamespaceElementContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_namespaceElement);
		int _la;
		try {
			setState(1016);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1003);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Export) {
					{
					setState(1002);
					match(Export);
					}
				}

				setState(1005);
				match(Import);
				setState(1006);
				importFromBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1008);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Export) {
					{
					setState(1007);
					match(Export);
					}
				}

				setState(1010);
				match(ExportFrom);
				setState(1011);
				exportFromBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1013);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1012);
					match(Export);
					}
					break;
				}
				setState(1015);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableStatementContext extends ParserRuleContext {
		public BindingPatternContext bindingPattern() {
			return getRuleContext(BindingPatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(TypeScriptParser.SemiColon, 0); }
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public AccessibilityModifierContext accessibilityModifier() {
			return getRuleContext(AccessibilityModifierContext.class,0);
		}
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public TerminalNode ReadOnly() { return getToken(TypeScriptParser.ReadOnly, 0); }
		public TerminalNode Declare() { return getToken(TypeScriptParser.Declare, 0); }
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_variableStatement);
		int _la;
		try {
			setState(1047);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1018);
				bindingPattern();
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1019);
					typeAnnotation();
					}
				}

				setState(1022);
				initializer();
				setState(1024);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(1023);
					match(SemiColon);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1027);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (Private - 113)) | (1L << (Public - 113)) | (1L << (Protected - 113)))) != 0)) {
					{
					setState(1026);
					accessibilityModifier();
					}
				}

				setState(1030);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(1029);
					varModifier();
					}
					break;
				}
				setState(1033);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ReadOnly) {
					{
					setState(1032);
					match(ReadOnly);
					}
				}

				setState(1035);
				variableDeclarationList();
				setState(1037);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(1036);
					match(SemiColon);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1039);
				match(Declare);
				setState(1041);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(1040);
					varModifier();
					}
					break;
				}
				setState(1043);
				variableDeclarationList();
				setState(1045);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(1044);
					match(SemiColon);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TypeScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TypeScriptParser.Comma, i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_variableDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			variableDeclaration();
			setState(1054);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1050);
					match(Comma);
					setState(1051);
					variableDeclaration();
					}
					} 
				}
				setState(1056);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public IdentifierOrKeyWordContext identifierOrKeyWord() {
			return getRuleContext(IdentifierOrKeyWordContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public TerminalNode Const() { return getToken(TypeScriptParser.Const, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Assign() { return getToken(TypeScriptParser.Assign, 0); }
		public TerminalNode Not() { return getToken(TypeScriptParser.Not, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Const) {
				{
				setState(1057);
				match(Const);
				}
			}

			setState(1066);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case As:
			case From:
			case Async:
			case Yield:
			case Any:
			case Number:
			case Never:
			case Boolean:
			case String:
			case Unique:
			case Symbol:
			case Undefined:
			case Object:
			case Of:
			case KeyOf:
			case TypeAlias:
			case Constructor:
			case Namespace:
			case Require:
			case Abstract:
			case Identifier:
				{
				setState(1060);
				identifierOrKeyWord();
				setState(1062);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(1061);
					match(Not);
					}
					break;
				}
				}
				break;
			case OpenBracket:
				{
				setState(1064);
				arrayLiteral();
				}
				break;
			case OpenBrace:
				{
				setState(1065);
				objectLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1069);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1068);
				typeAnnotation();
				}
				break;
			}
			setState(1072);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1071);
				singleExpression(0);
				}
				break;
			}
			setState(1079);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1074);
				match(Assign);
				setState(1076);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1075);
					typeParameters();
					}
					break;
				}
				setState(1078);
				singleExpression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatement_Context extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(TypeScriptParser.SemiColon, 0); }
		public EmptyStatement_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement_; }
	}

	public final EmptyStatement_Context emptyStatement_() throws RecognitionException {
		EmptyStatement_Context _localctx = new EmptyStatement_Context(_ctx, getState());
		enterRule(_localctx, 166, RULE_emptyStatement_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(TypeScriptParser.SemiColon, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			if (!(this.notOpenBraceAndNotFunction())) throw new FailedPredicateException(this, "this.notOpenBraceAndNotFunction()");
			setState(1084);
			expressionSequence();
			setState(1086);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1085);
				match(SemiColon);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(TypeScriptParser.If, 0); }
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(TypeScriptParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088);
			match(If);
			setState(1089);
			match(OpenParen);
			setState(1090);
			expressionSequence();
			setState(1091);
			match(CloseParen);
			setState(1092);
			statement();
			setState(1095);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1093);
				match(Else);
				setState(1094);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	 
		public IterationStatementContext() { }
		public void copyFrom(IterationStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForVarOfStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(TypeScriptParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Await() { return getToken(TypeScriptParser.Await, 0); }
		public TerminalNode As() { return getToken(TypeScriptParser.As, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ForVarOfStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class DoStatementContext extends IterationStatementContext {
		public TerminalNode Do() { return getToken(TypeScriptParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(TypeScriptParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public DoStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class ForVarStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(TypeScriptParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public List<TerminalNode> SemiColon() { return getTokens(TypeScriptParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(TypeScriptParser.SemiColon, i);
		}
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public ForVarStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class ForVarInStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(TypeScriptParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode In() { return getToken(TypeScriptParser.In, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForVarInStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class WhileStatementContext extends IterationStatementContext {
		public TerminalNode While() { return getToken(TypeScriptParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class ForStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(TypeScriptParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(TypeScriptParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(TypeScriptParser.SemiColon, i);
		}
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public ForStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class ForInStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(TypeScriptParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode In() { return getToken(TypeScriptParser.In, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class ForOfStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(TypeScriptParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Await() { return getToken(TypeScriptParser.Await, 0); }
		public TerminalNode As() { return getToken(TypeScriptParser.As, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ForOfStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_iterationStatement);
		int _la;
		try {
			setState(1191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				_localctx = new DoStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1097);
				match(Do);
				setState(1098);
				statement();
				setState(1099);
				match(While);
				setState(1100);
				match(OpenParen);
				setState(1101);
				expressionSequence();
				setState(1102);
				match(CloseParen);
				setState(1103);
				eos();
				}
				break;
			case 2:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1105);
				match(While);
				setState(1106);
				match(OpenParen);
				setState(1107);
				expressionSequence();
				setState(1108);
				match(CloseParen);
				setState(1109);
				statement();
				}
				break;
			case 3:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1111);
				match(For);
				setState(1112);
				match(OpenParen);
				setState(1114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << LessThan) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OctalIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral2 - 64)) | (1L << (BinaryIntegerLiteral - 64)) | (1L << (BigHexIntegerLiteral - 64)) | (1L << (BigOctalIntegerLiteral - 64)) | (1L << (BigBinaryIntegerLiteral - 64)) | (1L << (BigDecimalIntegerLiteral - 64)) | (1L << (Break - 64)) | (1L << (Do - 64)) | (1L << (Instanceof - 64)) | (1L << (Typeof - 64)) | (1L << (Case - 64)) | (1L << (Else - 64)) | (1L << (New - 64)) | (1L << (Var - 64)) | (1L << (Catch - 64)) | (1L << (Finally - 64)) | (1L << (Return - 64)) | (1L << (Void - 64)) | (1L << (Continue - 64)) | (1L << (For - 64)) | (1L << (Switch - 64)) | (1L << (While - 64)) | (1L << (Debugger - 64)) | (1L << (Function_ - 64)) | (1L << (This - 64)) | (1L << (With - 64)) | (1L << (Default - 64)) | (1L << (If - 64)) | (1L << (Throw - 64)) | (1L << (Delete - 64)) | (1L << (In - 64)) | (1L << (Try - 64)) | (1L << (As - 64)) | (1L << (From - 64)) | (1L << (ReadOnly - 64)) | (1L << (Async - 64)) | (1L << (Await - 64)) | (1L << (Yield - 64)) | (1L << (YieldStar - 64)) | (1L << (Class - 64)) | (1L << (Enum - 64)) | (1L << (Extends - 64)) | (1L << (Super - 64)) | (1L << (Const - 64)) | (1L << (Export - 64)) | (1L << (Import - 64)) | (1L << (Implements - 64)) | (1L << (Let - 64)) | (1L << (Private - 64)) | (1L << (Public - 64)) | (1L << (Interface - 64)) | (1L << (Package - 64)) | (1L << (Protected - 64)) | (1L << (Static - 64)) | (1L << (Any - 64)) | (1L << (Number - 64)) | (1L << (Never - 64)) | (1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Unique - 64)) | (1L << (Symbol - 64)) | (1L << (Undefined - 64)) | (1L << (Object - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Of - 128)) | (1L << (KeyOf - 128)) | (1L << (TypeAlias - 128)) | (1L << (Constructor - 128)) | (1L << (Namespace - 128)) | (1L << (Require - 128)) | (1L << (Module - 128)) | (1L << (Abstract - 128)) | (1L << (Identifier - 128)) | (1L << (StringLiteral - 128)) | (1L << (BackTick - 128)))) != 0)) {
					{
					setState(1113);
					expressionSequence();
					}
				}

				setState(1116);
				match(SemiColon);
				setState(1118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << LessThan) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OctalIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral2 - 64)) | (1L << (BinaryIntegerLiteral - 64)) | (1L << (BigHexIntegerLiteral - 64)) | (1L << (BigOctalIntegerLiteral - 64)) | (1L << (BigBinaryIntegerLiteral - 64)) | (1L << (BigDecimalIntegerLiteral - 64)) | (1L << (Break - 64)) | (1L << (Do - 64)) | (1L << (Instanceof - 64)) | (1L << (Typeof - 64)) | (1L << (Case - 64)) | (1L << (Else - 64)) | (1L << (New - 64)) | (1L << (Var - 64)) | (1L << (Catch - 64)) | (1L << (Finally - 64)) | (1L << (Return - 64)) | (1L << (Void - 64)) | (1L << (Continue - 64)) | (1L << (For - 64)) | (1L << (Switch - 64)) | (1L << (While - 64)) | (1L << (Debugger - 64)) | (1L << (Function_ - 64)) | (1L << (This - 64)) | (1L << (With - 64)) | (1L << (Default - 64)) | (1L << (If - 64)) | (1L << (Throw - 64)) | (1L << (Delete - 64)) | (1L << (In - 64)) | (1L << (Try - 64)) | (1L << (As - 64)) | (1L << (From - 64)) | (1L << (ReadOnly - 64)) | (1L << (Async - 64)) | (1L << (Await - 64)) | (1L << (Yield - 64)) | (1L << (YieldStar - 64)) | (1L << (Class - 64)) | (1L << (Enum - 64)) | (1L << (Extends - 64)) | (1L << (Super - 64)) | (1L << (Const - 64)) | (1L << (Export - 64)) | (1L << (Import - 64)) | (1L << (Implements - 64)) | (1L << (Let - 64)) | (1L << (Private - 64)) | (1L << (Public - 64)) | (1L << (Interface - 64)) | (1L << (Package - 64)) | (1L << (Protected - 64)) | (1L << (Static - 64)) | (1L << (Any - 64)) | (1L << (Number - 64)) | (1L << (Never - 64)) | (1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Unique - 64)) | (1L << (Symbol - 64)) | (1L << (Undefined - 64)) | (1L << (Object - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Of - 128)) | (1L << (KeyOf - 128)) | (1L << (TypeAlias - 128)) | (1L << (Constructor - 128)) | (1L << (Namespace - 128)) | (1L << (Require - 128)) | (1L << (Module - 128)) | (1L << (Abstract - 128)) | (1L << (Identifier - 128)) | (1L << (StringLiteral - 128)) | (1L << (BackTick - 128)))) != 0)) {
					{
					setState(1117);
					expressionSequence();
					}
				}

				setState(1120);
				match(SemiColon);
				setState(1122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << LessThan) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OctalIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral2 - 64)) | (1L << (BinaryIntegerLiteral - 64)) | (1L << (BigHexIntegerLiteral - 64)) | (1L << (BigOctalIntegerLiteral - 64)) | (1L << (BigBinaryIntegerLiteral - 64)) | (1L << (BigDecimalIntegerLiteral - 64)) | (1L << (Break - 64)) | (1L << (Do - 64)) | (1L << (Instanceof - 64)) | (1L << (Typeof - 64)) | (1L << (Case - 64)) | (1L << (Else - 64)) | (1L << (New - 64)) | (1L << (Var - 64)) | (1L << (Catch - 64)) | (1L << (Finally - 64)) | (1L << (Return - 64)) | (1L << (Void - 64)) | (1L << (Continue - 64)) | (1L << (For - 64)) | (1L << (Switch - 64)) | (1L << (While - 64)) | (1L << (Debugger - 64)) | (1L << (Function_ - 64)) | (1L << (This - 64)) | (1L << (With - 64)) | (1L << (Default - 64)) | (1L << (If - 64)) | (1L << (Throw - 64)) | (1L << (Delete - 64)) | (1L << (In - 64)) | (1L << (Try - 64)) | (1L << (As - 64)) | (1L << (From - 64)) | (1L << (ReadOnly - 64)) | (1L << (Async - 64)) | (1L << (Await - 64)) | (1L << (Yield - 64)) | (1L << (YieldStar - 64)) | (1L << (Class - 64)) | (1L << (Enum - 64)) | (1L << (Extends - 64)) | (1L << (Super - 64)) | (1L << (Const - 64)) | (1L << (Export - 64)) | (1L << (Import - 64)) | (1L << (Implements - 64)) | (1L << (Let - 64)) | (1L << (Private - 64)) | (1L << (Public - 64)) | (1L << (Interface - 64)) | (1L << (Package - 64)) | (1L << (Protected - 64)) | (1L << (Static - 64)) | (1L << (Any - 64)) | (1L << (Number - 64)) | (1L << (Never - 64)) | (1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Unique - 64)) | (1L << (Symbol - 64)) | (1L << (Undefined - 64)) | (1L << (Object - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Of - 128)) | (1L << (KeyOf - 128)) | (1L << (TypeAlias - 128)) | (1L << (Constructor - 128)) | (1L << (Namespace - 128)) | (1L << (Require - 128)) | (1L << (Module - 128)) | (1L << (Abstract - 128)) | (1L << (Identifier - 128)) | (1L << (StringLiteral - 128)) | (1L << (BackTick - 128)))) != 0)) {
					{
					setState(1121);
					expressionSequence();
					}
				}

				setState(1124);
				match(CloseParen);
				setState(1125);
				statement();
				}
				break;
			case 4:
				_localctx = new ForVarStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1126);
				match(For);
				setState(1127);
				match(OpenParen);
				setState(1128);
				varModifier();
				setState(1129);
				variableDeclarationList();
				setState(1130);
				match(SemiColon);
				setState(1132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << LessThan) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OctalIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral2 - 64)) | (1L << (BinaryIntegerLiteral - 64)) | (1L << (BigHexIntegerLiteral - 64)) | (1L << (BigOctalIntegerLiteral - 64)) | (1L << (BigBinaryIntegerLiteral - 64)) | (1L << (BigDecimalIntegerLiteral - 64)) | (1L << (Break - 64)) | (1L << (Do - 64)) | (1L << (Instanceof - 64)) | (1L << (Typeof - 64)) | (1L << (Case - 64)) | (1L << (Else - 64)) | (1L << (New - 64)) | (1L << (Var - 64)) | (1L << (Catch - 64)) | (1L << (Finally - 64)) | (1L << (Return - 64)) | (1L << (Void - 64)) | (1L << (Continue - 64)) | (1L << (For - 64)) | (1L << (Switch - 64)) | (1L << (While - 64)) | (1L << (Debugger - 64)) | (1L << (Function_ - 64)) | (1L << (This - 64)) | (1L << (With - 64)) | (1L << (Default - 64)) | (1L << (If - 64)) | (1L << (Throw - 64)) | (1L << (Delete - 64)) | (1L << (In - 64)) | (1L << (Try - 64)) | (1L << (As - 64)) | (1L << (From - 64)) | (1L << (ReadOnly - 64)) | (1L << (Async - 64)) | (1L << (Await - 64)) | (1L << (Yield - 64)) | (1L << (YieldStar - 64)) | (1L << (Class - 64)) | (1L << (Enum - 64)) | (1L << (Extends - 64)) | (1L << (Super - 64)) | (1L << (Const - 64)) | (1L << (Export - 64)) | (1L << (Import - 64)) | (1L << (Implements - 64)) | (1L << (Let - 64)) | (1L << (Private - 64)) | (1L << (Public - 64)) | (1L << (Interface - 64)) | (1L << (Package - 64)) | (1L << (Protected - 64)) | (1L << (Static - 64)) | (1L << (Any - 64)) | (1L << (Number - 64)) | (1L << (Never - 64)) | (1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Unique - 64)) | (1L << (Symbol - 64)) | (1L << (Undefined - 64)) | (1L << (Object - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Of - 128)) | (1L << (KeyOf - 128)) | (1L << (TypeAlias - 128)) | (1L << (Constructor - 128)) | (1L << (Namespace - 128)) | (1L << (Require - 128)) | (1L << (Module - 128)) | (1L << (Abstract - 128)) | (1L << (Identifier - 128)) | (1L << (StringLiteral - 128)) | (1L << (BackTick - 128)))) != 0)) {
					{
					setState(1131);
					expressionSequence();
					}
				}

				setState(1134);
				match(SemiColon);
				setState(1136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << LessThan) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OctalIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral2 - 64)) | (1L << (BinaryIntegerLiteral - 64)) | (1L << (BigHexIntegerLiteral - 64)) | (1L << (BigOctalIntegerLiteral - 64)) | (1L << (BigBinaryIntegerLiteral - 64)) | (1L << (BigDecimalIntegerLiteral - 64)) | (1L << (Break - 64)) | (1L << (Do - 64)) | (1L << (Instanceof - 64)) | (1L << (Typeof - 64)) | (1L << (Case - 64)) | (1L << (Else - 64)) | (1L << (New - 64)) | (1L << (Var - 64)) | (1L << (Catch - 64)) | (1L << (Finally - 64)) | (1L << (Return - 64)) | (1L << (Void - 64)) | (1L << (Continue - 64)) | (1L << (For - 64)) | (1L << (Switch - 64)) | (1L << (While - 64)) | (1L << (Debugger - 64)) | (1L << (Function_ - 64)) | (1L << (This - 64)) | (1L << (With - 64)) | (1L << (Default - 64)) | (1L << (If - 64)) | (1L << (Throw - 64)) | (1L << (Delete - 64)) | (1L << (In - 64)) | (1L << (Try - 64)) | (1L << (As - 64)) | (1L << (From - 64)) | (1L << (ReadOnly - 64)) | (1L << (Async - 64)) | (1L << (Await - 64)) | (1L << (Yield - 64)) | (1L << (YieldStar - 64)) | (1L << (Class - 64)) | (1L << (Enum - 64)) | (1L << (Extends - 64)) | (1L << (Super - 64)) | (1L << (Const - 64)) | (1L << (Export - 64)) | (1L << (Import - 64)) | (1L << (Implements - 64)) | (1L << (Let - 64)) | (1L << (Private - 64)) | (1L << (Public - 64)) | (1L << (Interface - 64)) | (1L << (Package - 64)) | (1L << (Protected - 64)) | (1L << (Static - 64)) | (1L << (Any - 64)) | (1L << (Number - 64)) | (1L << (Never - 64)) | (1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Unique - 64)) | (1L << (Symbol - 64)) | (1L << (Undefined - 64)) | (1L << (Object - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Of - 128)) | (1L << (KeyOf - 128)) | (1L << (TypeAlias - 128)) | (1L << (Constructor - 128)) | (1L << (Namespace - 128)) | (1L << (Require - 128)) | (1L << (Module - 128)) | (1L << (Abstract - 128)) | (1L << (Identifier - 128)) | (1L << (StringLiteral - 128)) | (1L << (BackTick - 128)))) != 0)) {
					{
					setState(1135);
					expressionSequence();
					}
				}

				setState(1138);
				match(CloseParen);
				setState(1139);
				statement();
				}
				break;
			case 5:
				_localctx = new ForInStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1141);
				match(For);
				setState(1142);
				match(OpenParen);
				setState(1143);
				singleExpression(0);
				setState(1144);
				match(In);
				setState(1145);
				expressionSequence();
				setState(1146);
				match(CloseParen);
				setState(1147);
				statement();
				}
				break;
			case 6:
				_localctx = new ForVarInStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1149);
				match(For);
				setState(1150);
				match(OpenParen);
				setState(1151);
				varModifier();
				setState(1152);
				variableDeclaration();
				setState(1153);
				match(In);
				setState(1154);
				expressionSequence();
				setState(1155);
				match(CloseParen);
				setState(1156);
				statement();
				}
				break;
			case 7:
				_localctx = new ForOfStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1158);
				match(For);
				setState(1160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Await) {
					{
					setState(1159);
					match(Await);
					}
				}

				setState(1162);
				match(OpenParen);
				setState(1163);
				singleExpression(0);
				setState(1164);
				identifier();
				setState(1165);
				if (!(this.p("of"))) throw new FailedPredicateException(this, "this.p(\"of\")");
				setState(1166);
				expressionSequence();
				setState(1169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==As) {
					{
					setState(1167);
					match(As);
					setState(1168);
					type_();
					}
				}

				setState(1171);
				match(CloseParen);
				setState(1172);
				statement();
				}
				break;
			case 8:
				_localctx = new ForVarOfStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1174);
				match(For);
				setState(1176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Await) {
					{
					setState(1175);
					match(Await);
					}
				}

				setState(1178);
				match(OpenParen);
				setState(1179);
				varModifier();
				setState(1180);
				variableDeclaration();
				setState(1181);
				identifier();
				setState(1182);
				if (!(this.p("of"))) throw new FailedPredicateException(this, "this.p(\"of\")");
				setState(1183);
				expressionSequence();
				setState(1186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==As) {
					{
					setState(1184);
					match(As);
					setState(1185);
					type_();
					}
				}

				setState(1188);
				match(CloseParen);
				setState(1189);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarModifierContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(TypeScriptParser.Var, 0); }
		public TerminalNode Let() { return getToken(TypeScriptParser.Let, 0); }
		public TerminalNode Const() { return getToken(TypeScriptParser.Const, 0); }
		public VarModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varModifier; }
	}

	public final VarModifierContext varModifier() throws RecognitionException {
		VarModifierContext _localctx = new VarModifierContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_varModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			_la = _input.LA(1);
			if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (Var - 78)) | (1L << (Const - 78)) | (1L << (Let - 78)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(TypeScriptParser.Continue, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			match(Continue);
			setState(1198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1196);
				if (!(this.notLineTerminator())) throw new FailedPredicateException(this, "this.notLineTerminator()");
				setState(1197);
				identifier();
				}
				break;
			}
			setState(1200);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(TypeScriptParser.Break, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202);
			match(Break);
			setState(1205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1203);
				if (!(this.notLineTerminator())) throw new FailedPredicateException(this, "this.notLineTerminator()");
				setState(1204);
				identifier();
				}
				break;
			}
			setState(1207);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(TypeScriptParser.Return, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1209);
			match(Return);
			setState(1212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1210);
				if (!(this.notLineTerminator())) throw new FailedPredicateException(this, "this.notLineTerminator()");
				setState(1211);
				expressionSequence();
				}
				break;
			}
			setState(1214);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YieldStatementContext extends ParserRuleContext {
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Yield() { return getToken(TypeScriptParser.Yield, 0); }
		public TerminalNode YieldStar() { return getToken(TypeScriptParser.YieldStar, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public YieldStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldStatement; }
	}

	public final YieldStatementContext yieldStatement() throws RecognitionException {
		YieldStatementContext _localctx = new YieldStatementContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_yieldStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			_la = _input.LA(1);
			if ( !(_la==Yield || _la==YieldStar) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1217);
				if (!(this.notLineTerminator())) throw new FailedPredicateException(this, "this.notLineTerminator()");
				setState(1218);
				expressionSequence();
				}
				break;
			}
			setState(1221);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithStatementContext extends ParserRuleContext {
		public TerminalNode With() { return getToken(TypeScriptParser.With, 0); }
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WithStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withStatement; }
	}

	public final WithStatementContext withStatement() throws RecognitionException {
		WithStatementContext _localctx = new WithStatementContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_withStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			match(With);
			setState(1224);
			match(OpenParen);
			setState(1225);
			expressionSequence();
			setState(1226);
			match(CloseParen);
			setState(1227);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(TypeScriptParser.Switch, 0); }
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public CaseBlockContext caseBlock() {
			return getRuleContext(CaseBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
			match(Switch);
			setState(1230);
			match(OpenParen);
			setState(1231);
			expressionSequence();
			setState(1232);
			match(CloseParen);
			setState(1233);
			caseBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseBlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(TypeScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(TypeScriptParser.CloseBrace, 0); }
		public List<CaseClausesContext> caseClauses() {
			return getRuleContexts(CaseClausesContext.class);
		}
		public CaseClausesContext caseClauses(int i) {
			return getRuleContext(CaseClausesContext.class,i);
		}
		public DefaultClauseContext defaultClause() {
			return getRuleContext(DefaultClauseContext.class,0);
		}
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_caseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			match(OpenBrace);
			setState(1237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Case) {
				{
				setState(1236);
				caseClauses();
				}
			}

			setState(1243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Default) {
				{
				setState(1239);
				defaultClause();
				setState(1241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Case) {
					{
					setState(1240);
					caseClauses();
					}
				}

				}
			}

			setState(1245);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseClausesContext extends ParserRuleContext {
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public CaseClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClauses; }
	}

	public final CaseClausesContext caseClauses() throws RecognitionException {
		CaseClausesContext _localctx = new CaseClausesContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_caseClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1248); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1247);
				caseClause();
				}
				}
				setState(1250); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Case );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseClauseContext extends ParserRuleContext {
		public TerminalNode Case() { return getToken(TypeScriptParser.Case, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TypeScriptParser.Colon, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_caseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252);
			match(Case);
			setState(1253);
			expressionSequence();
			setState(1254);
			match(Colon);
			setState(1256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				setState(1255);
				statementList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultClauseContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(TypeScriptParser.Default, 0); }
		public TerminalNode Colon() { return getToken(TypeScriptParser.Colon, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public DefaultClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultClause; }
	}

	public final DefaultClauseContext defaultClause() throws RecognitionException {
		DefaultClauseContext _localctx = new DefaultClauseContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_defaultClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			match(Default);
			setState(1259);
			match(Colon);
			setState(1261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1260);
				statementList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelledStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TypeScriptParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabelledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelledStatement; }
	}

	public final LabelledStatementContext labelledStatement() throws RecognitionException {
		LabelledStatementContext _localctx = new LabelledStatementContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_labelledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			identifier();
			setState(1264);
			match(Colon);
			setState(1265);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(TypeScriptParser.Throw, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1267);
			match(Throw);
			setState(1268);
			if (!(this.notLineTerminator())) throw new FailedPredicateException(this, "this.notLineTerminator()");
			setState(1269);
			expressionSequence();
			setState(1270);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(TypeScriptParser.Try, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchProductionContext catchProduction() {
			return getRuleContext(CatchProductionContext.class,0);
		}
		public FinallyProductionContext finallyProduction() {
			return getRuleContext(FinallyProductionContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_tryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
			match(Try);
			setState(1273);
			block();
			setState(1279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Catch:
				{
				setState(1274);
				catchProduction();
				setState(1276);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1275);
					finallyProduction();
					}
					break;
				}
				}
				break;
			case Finally:
				{
				setState(1278);
				finallyProduction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchProductionContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(TypeScriptParser.Catch, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public CatchProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchProduction; }
	}

	public final CatchProductionContext catchProduction() throws RecognitionException {
		CatchProductionContext _localctx = new CatchProductionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_catchProduction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
			match(Catch);
			setState(1289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenParen) {
				{
				setState(1282);
				match(OpenParen);
				setState(1283);
				identifier();
				setState(1285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1284);
					typeAnnotation();
					}
				}

				setState(1287);
				match(CloseParen);
				}
			}

			setState(1291);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyProductionContext extends ParserRuleContext {
		public TerminalNode Finally() { return getToken(TypeScriptParser.Finally, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyProduction; }
	}

	public final FinallyProductionContext finallyProduction() throws RecognitionException {
		FinallyProductionContext _localctx = new FinallyProductionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_finallyProduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
			match(Finally);
			setState(1294);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DebuggerStatementContext extends ParserRuleContext {
		public TerminalNode Debugger() { return getToken(TypeScriptParser.Debugger, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public DebuggerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debuggerStatement; }
	}

	public final DebuggerStatementContext debuggerStatement() throws RecognitionException {
		DebuggerStatementContext _localctx = new DebuggerStatementContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_debuggerStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			match(Debugger);
			setState(1297);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Function_() { return getToken(TypeScriptParser.Function_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CallSignatureContext callSignature() {
			return getRuleContext(CallSignatureContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(TypeScriptParser.SemiColon, 0); }
		public TerminalNode Async() { return getToken(TypeScriptParser.Async, 0); }
		public TerminalNode Multiply() { return getToken(TypeScriptParser.Multiply, 0); }
		public TerminalNode OpenBrace() { return getToken(TypeScriptParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(TypeScriptParser.CloseBrace, 0); }
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Async) {
				{
				setState(1299);
				match(Async);
				}
			}

			setState(1302);
			match(Function_);
			setState(1304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Multiply) {
				{
				setState(1303);
				match(Multiply);
				}
			}

			setState(1306);
			identifier();
			setState(1307);
			callSignature();
			setState(1313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBrace:
				{
				{
				setState(1308);
				match(OpenBrace);
				setState(1309);
				functionBody();
				setState(1310);
				match(CloseBrace);
				}
				}
				break;
			case SemiColon:
				{
				setState(1312);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(TypeScriptParser.Class, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassHeritageContext classHeritage() {
			return getRuleContext(ClassHeritageContext.class,0);
		}
		public ClassTailContext classTail() {
			return getRuleContext(ClassTailContext.class,0);
		}
		public DecoratorListContext decoratorList() {
			return getRuleContext(DecoratorListContext.class,0);
		}
		public TerminalNode Export() { return getToken(TypeScriptParser.Export, 0); }
		public TerminalNode Abstract() { return getToken(TypeScriptParser.Abstract, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode Default() { return getToken(TypeScriptParser.Default, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(1315);
				decoratorList();
				}
			}

			setState(1322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Export) {
				{
				setState(1318);
				match(Export);
				setState(1320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Default) {
					{
					setState(1319);
					match(Default);
					}
				}

				}
			}

			setState(1325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract) {
				{
				setState(1324);
				match(Abstract);
				}
			}

			setState(1327);
			match(Class);
			setState(1328);
			identifier();
			setState(1330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(1329);
				typeParameters();
				}
			}

			setState(1332);
			classHeritage();
			setState(1333);
			classTail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassHeritageContext extends ParserRuleContext {
		public ClassExtendsClauseContext classExtendsClause() {
			return getRuleContext(ClassExtendsClauseContext.class,0);
		}
		public ImplementsClauseContext implementsClause() {
			return getRuleContext(ImplementsClauseContext.class,0);
		}
		public ClassHeritageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classHeritage; }
	}

	public final ClassHeritageContext classHeritage() throws RecognitionException {
		ClassHeritageContext _localctx = new ClassHeritageContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_classHeritage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(1335);
				classExtendsClause();
				}
			}

			setState(1339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Implements) {
				{
				setState(1338);
				implementsClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTailContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(TypeScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(TypeScriptParser.CloseBrace, 0); }
		public List<ClassElementContext> classElement() {
			return getRuleContexts(ClassElementContext.class);
		}
		public ClassElementContext classElement(int i) {
			return getRuleContext(ClassElementContext.class,i);
		}
		public ClassTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTail; }
	}

	public final ClassTailContext classTail() throws RecognitionException {
		ClassTailContext _localctx = new ClassTailContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_classTail);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1341);
			match(OpenBrace);
			setState(1345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1342);
					classElement();
					}
					} 
				}
				setState(1347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			}
			setState(1348);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassExtendsClauseContext extends ParserRuleContext {
		public TerminalNode Extends() { return getToken(TypeScriptParser.Extends, 0); }
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public ClassExtendsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classExtendsClause; }
	}

	public final ClassExtendsClauseContext classExtendsClause() throws RecognitionException {
		ClassExtendsClauseContext _localctx = new ClassExtendsClauseContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_classExtendsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			match(Extends);
			setState(1351);
			typeReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplementsClauseContext extends ParserRuleContext {
		public TerminalNode Implements() { return getToken(TypeScriptParser.Implements, 0); }
		public ClassOrInterfaceTypeListContext classOrInterfaceTypeList() {
			return getRuleContext(ClassOrInterfaceTypeListContext.class,0);
		}
		public ImplementsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementsClause; }
	}

	public final ImplementsClauseContext implementsClause() throws RecognitionException {
		ImplementsClauseContext _localctx = new ImplementsClauseContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_implementsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1353);
			match(Implements);
			setState(1354);
			classOrInterfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassElementContext extends ParserRuleContext {
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public PropertyMemberDeclarationContext propertyMemberDeclaration() {
			return getRuleContext(PropertyMemberDeclarationContext.class,0);
		}
		public DecoratorListContext decoratorList() {
			return getRuleContext(DecoratorListContext.class,0);
		}
		public IndexMemberDeclarationContext indexMemberDeclaration() {
			return getRuleContext(IndexMemberDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ClassElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classElement; }
	}

	public final ClassElementContext classElement() throws RecognitionException {
		ClassElementContext _localctx = new ClassElementContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_classElement);
		try {
			setState(1363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1356);
				constructorDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1358);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(1357);
					decoratorList();
					}
					break;
				}
				setState(1360);
				propertyMemberDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1361);
				indexMemberDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1362);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyMemberDeclarationContext extends ParserRuleContext {
		public PropertyMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyMemberDeclaration; }
	 
		public PropertyMemberDeclarationContext() { }
		public void copyFrom(PropertyMemberDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PropertyDeclarationExpressionContext extends PropertyMemberDeclarationContext {
		public PropertyMemberBaseContext propertyMemberBase() {
			return getRuleContext(PropertyMemberBaseContext.class,0);
		}
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(TypeScriptParser.SemiColon, 0); }
		public TerminalNode QuestionMark() { return getToken(TypeScriptParser.QuestionMark, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public PropertyDeclarationExpressionContext(PropertyMemberDeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class MethodDeclarationExpressionContext extends PropertyMemberDeclarationContext {
		public PropertyMemberBaseContext propertyMemberBase() {
			return getRuleContext(PropertyMemberBaseContext.class,0);
		}
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public CallSignatureContext callSignature() {
			return getRuleContext(CallSignatureContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(TypeScriptParser.SemiColon, 0); }
		public TerminalNode OpenBrace() { return getToken(TypeScriptParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(TypeScriptParser.CloseBrace, 0); }
		public MethodDeclarationExpressionContext(PropertyMemberDeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class GetterSetterDeclarationExpressionContext extends PropertyMemberDeclarationContext {
		public PropertyMemberBaseContext propertyMemberBase() {
			return getRuleContext(PropertyMemberBaseContext.class,0);
		}
		public GetAccessorContext getAccessor() {
			return getRuleContext(GetAccessorContext.class,0);
		}
		public SetAccessorContext setAccessor() {
			return getRuleContext(SetAccessorContext.class,0);
		}
		public GetterSetterDeclarationExpressionContext(PropertyMemberDeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class AbstractMemberDeclarationContext extends PropertyMemberDeclarationContext {
		public AbstractDeclarationContext abstractDeclaration() {
			return getRuleContext(AbstractDeclarationContext.class,0);
		}
		public AbstractMemberDeclarationContext(PropertyMemberDeclarationContext ctx) { copyFrom(ctx); }
	}

	public final PropertyMemberDeclarationContext propertyMemberDeclaration() throws RecognitionException {
		PropertyMemberDeclarationContext _localctx = new PropertyMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_propertyMemberDeclaration);
		int _la;
		try {
			setState(1394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				_localctx = new PropertyDeclarationExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1365);
				propertyMemberBase();
				setState(1366);
				propertyName();
				setState(1368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QuestionMark) {
					{
					setState(1367);
					match(QuestionMark);
					}
				}

				setState(1371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1370);
					typeAnnotation();
					}
				}

				setState(1374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(1373);
					initializer();
					}
				}

				setState(1376);
				match(SemiColon);
				}
				break;
			case 2:
				_localctx = new MethodDeclarationExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1378);
				propertyMemberBase();
				setState(1379);
				propertyName();
				setState(1380);
				callSignature();
				setState(1386);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBrace:
					{
					{
					setState(1381);
					match(OpenBrace);
					setState(1382);
					functionBody();
					setState(1383);
					match(CloseBrace);
					}
					}
					break;
				case SemiColon:
					{
					setState(1385);
					match(SemiColon);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				_localctx = new GetterSetterDeclarationExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1388);
				propertyMemberBase();
				setState(1391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1389);
					getAccessor();
					}
					break;
				case 2:
					{
					setState(1390);
					setAccessor();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new AbstractMemberDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1393);
				abstractDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyMemberBaseContext extends ParserRuleContext {
		public AccessibilityModifierContext accessibilityModifier() {
			return getRuleContext(AccessibilityModifierContext.class,0);
		}
		public TerminalNode Async() { return getToken(TypeScriptParser.Async, 0); }
		public TerminalNode Static() { return getToken(TypeScriptParser.Static, 0); }
		public TerminalNode ReadOnly() { return getToken(TypeScriptParser.ReadOnly, 0); }
		public PropertyMemberBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyMemberBase; }
	}

	public final PropertyMemberBaseContext propertyMemberBase() throws RecognitionException {
		PropertyMemberBaseContext _localctx = new PropertyMemberBaseContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_propertyMemberBase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1396);
				accessibilityModifier();
				}
				break;
			}
			setState(1400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				setState(1399);
				match(Async);
				}
				break;
			}
			setState(1403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1402);
				match(Static);
				}
				break;
			}
			setState(1406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1405);
				match(ReadOnly);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexMemberDeclarationContext extends ParserRuleContext {
		public IndexSignatureContext indexSignature() {
			return getRuleContext(IndexSignatureContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(TypeScriptParser.SemiColon, 0); }
		public IndexMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexMemberDeclaration; }
	}

	public final IndexMemberDeclarationContext indexMemberDeclaration() throws RecognitionException {
		IndexMemberDeclarationContext _localctx = new IndexMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_indexMemberDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			indexSignature();
			setState(1409);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneratorMethodContext extends ParserRuleContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(TypeScriptParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(TypeScriptParser.CloseBrace, 0); }
		public TerminalNode Async() { return getToken(TypeScriptParser.Async, 0); }
		public TerminalNode Multiply() { return getToken(TypeScriptParser.Multiply, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public GeneratorMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatorMethod; }
	}

	public final GeneratorMethodContext generatorMethod() throws RecognitionException {
		GeneratorMethodContext _localctx = new GeneratorMethodContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_generatorMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1411);
				match(Async);
				setState(1412);
				if (!(this.notLineTerminator())) throw new FailedPredicateException(this, "this.notLineTerminator()");
				}
				break;
			}
			setState(1416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Multiply) {
				{
				setState(1415);
				match(Multiply);
				}
			}

			setState(1418);
			propertyName();
			setState(1419);
			match(OpenParen);
			setState(1421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Ellipsis))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Break - 71)) | (1L << (Do - 71)) | (1L << (Instanceof - 71)) | (1L << (Typeof - 71)) | (1L << (Case - 71)) | (1L << (Else - 71)) | (1L << (New - 71)) | (1L << (Var - 71)) | (1L << (Catch - 71)) | (1L << (Finally - 71)) | (1L << (Return - 71)) | (1L << (Void - 71)) | (1L << (Continue - 71)) | (1L << (For - 71)) | (1L << (Switch - 71)) | (1L << (While - 71)) | (1L << (Debugger - 71)) | (1L << (Function_ - 71)) | (1L << (This - 71)) | (1L << (With - 71)) | (1L << (Default - 71)) | (1L << (If - 71)) | (1L << (Throw - 71)) | (1L << (Delete - 71)) | (1L << (In - 71)) | (1L << (Try - 71)) | (1L << (As - 71)) | (1L << (From - 71)) | (1L << (ReadOnly - 71)) | (1L << (Async - 71)) | (1L << (Await - 71)) | (1L << (Yield - 71)) | (1L << (Class - 71)) | (1L << (Enum - 71)) | (1L << (Extends - 71)) | (1L << (Super - 71)) | (1L << (Const - 71)) | (1L << (Export - 71)) | (1L << (Import - 71)) | (1L << (Implements - 71)) | (1L << (Let - 71)) | (1L << (Private - 71)) | (1L << (Public - 71)) | (1L << (Interface - 71)) | (1L << (Package - 71)) | (1L << (Protected - 71)) | (1L << (Static - 71)) | (1L << (Any - 71)) | (1L << (Number - 71)) | (1L << (Never - 71)) | (1L << (Boolean - 71)) | (1L << (String - 71)) | (1L << (Unique - 71)) | (1L << (Symbol - 71)) | (1L << (Undefined - 71)) | (1L << (Object - 71)) | (1L << (Of - 71)) | (1L << (KeyOf - 71)) | (1L << (TypeAlias - 71)) | (1L << (Constructor - 71)) | (1L << (Namespace - 71)) | (1L << (Require - 71)) | (1L << (Module - 71)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (Abstract - 136)) | (1L << (At - 136)) | (1L << (Identifier - 136)))) != 0)) {
				{
				setState(1420);
				formalParameterList();
				}
			}

			setState(1423);
			match(CloseParen);
			setState(1424);
			match(OpenBrace);
			setState(1425);
			functionBody();
			setState(1426);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneratorFunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Function_() { return getToken(TypeScriptParser.Function_, 0); }
		public TerminalNode Multiply() { return getToken(TypeScriptParser.Multiply, 0); }
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(TypeScriptParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(TypeScriptParser.CloseBrace, 0); }
		public TerminalNode Async() { return getToken(TypeScriptParser.Async, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public GeneratorFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatorFunctionDeclaration; }
	}

	public final GeneratorFunctionDeclarationContext generatorFunctionDeclaration() throws RecognitionException {
		GeneratorFunctionDeclarationContext _localctx = new GeneratorFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_generatorFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Async) {
				{
				setState(1428);
				match(Async);
				}
			}

			setState(1431);
			match(Function_);
			setState(1432);
			match(Multiply);
			setState(1434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (As - 97)) | (1L << (From - 97)) | (1L << (Async - 97)) | (1L << (Yield - 97)) | (1L << (Any - 97)) | (1L << (Number - 97)) | (1L << (Never - 97)) | (1L << (Boolean - 97)) | (1L << (String - 97)) | (1L << (Unique - 97)) | (1L << (Symbol - 97)) | (1L << (Undefined - 97)) | (1L << (Object - 97)) | (1L << (Of - 97)) | (1L << (KeyOf - 97)) | (1L << (TypeAlias - 97)) | (1L << (Constructor - 97)) | (1L << (Namespace - 97)) | (1L << (Abstract - 97)) | (1L << (Identifier - 97)))) != 0)) {
				{
				setState(1433);
				identifier();
				}
			}

			setState(1436);
			match(OpenParen);
			setState(1438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Ellipsis))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Break - 71)) | (1L << (Do - 71)) | (1L << (Instanceof - 71)) | (1L << (Typeof - 71)) | (1L << (Case - 71)) | (1L << (Else - 71)) | (1L << (New - 71)) | (1L << (Var - 71)) | (1L << (Catch - 71)) | (1L << (Finally - 71)) | (1L << (Return - 71)) | (1L << (Void - 71)) | (1L << (Continue - 71)) | (1L << (For - 71)) | (1L << (Switch - 71)) | (1L << (While - 71)) | (1L << (Debugger - 71)) | (1L << (Function_ - 71)) | (1L << (This - 71)) | (1L << (With - 71)) | (1L << (Default - 71)) | (1L << (If - 71)) | (1L << (Throw - 71)) | (1L << (Delete - 71)) | (1L << (In - 71)) | (1L << (Try - 71)) | (1L << (As - 71)) | (1L << (From - 71)) | (1L << (ReadOnly - 71)) | (1L << (Async - 71)) | (1L << (Await - 71)) | (1L << (Yield - 71)) | (1L << (Class - 71)) | (1L << (Enum - 71)) | (1L << (Extends - 71)) | (1L << (Super - 71)) | (1L << (Const - 71)) | (1L << (Export - 71)) | (1L << (Import - 71)) | (1L << (Implements - 71)) | (1L << (Let - 71)) | (1L << (Private - 71)) | (1L << (Public - 71)) | (1L << (Interface - 71)) | (1L << (Package - 71)) | (1L << (Protected - 71)) | (1L << (Static - 71)) | (1L << (Any - 71)) | (1L << (Number - 71)) | (1L << (Never - 71)) | (1L << (Boolean - 71)) | (1L << (String - 71)) | (1L << (Unique - 71)) | (1L << (Symbol - 71)) | (1L << (Undefined - 71)) | (1L << (Object - 71)) | (1L << (Of - 71)) | (1L << (KeyOf - 71)) | (1L << (TypeAlias - 71)) | (1L << (Constructor - 71)) | (1L << (Namespace - 71)) | (1L << (Require - 71)) | (1L << (Module - 71)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (Abstract - 136)) | (1L << (At - 136)) | (1L << (Identifier - 136)))) != 0)) {
				{
				setState(1437);
				formalParameterList();
				}
			}

			setState(1440);
			match(CloseParen);
			setState(1441);
			match(OpenBrace);
			setState(1442);
			functionBody();
			setState(1443);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneratorBlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(TypeScriptParser.OpenBrace, 0); }
		public List<GeneratorDefinitionContext> generatorDefinition() {
			return getRuleContexts(GeneratorDefinitionContext.class);
		}
		public GeneratorDefinitionContext generatorDefinition(int i) {
			return getRuleContext(GeneratorDefinitionContext.class,i);
		}
		public TerminalNode CloseBrace() { return getToken(TypeScriptParser.CloseBrace, 0); }
		public List<TerminalNode> Comma() { return getTokens(TypeScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TypeScriptParser.Comma, i);
		}
		public GeneratorBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatorBlock; }
	}

	public final GeneratorBlockContext generatorBlock() throws RecognitionException {
		GeneratorBlockContext _localctx = new GeneratorBlockContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_generatorBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1445);
			match(OpenBrace);
			setState(1446);
			generatorDefinition();
			setState(1451);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1447);
					match(Comma);
					setState(1448);
					generatorDefinition();
					}
					} 
				}
				setState(1453);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			}
			setState(1455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1454);
				match(Comma);
				}
			}

			setState(1457);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneratorDefinitionContext extends ParserRuleContext {
		public TerminalNode Multiply() { return getToken(TypeScriptParser.Multiply, 0); }
		public IteratorDefinitionContext iteratorDefinition() {
			return getRuleContext(IteratorDefinitionContext.class,0);
		}
		public GeneratorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatorDefinition; }
	}

	public final GeneratorDefinitionContext generatorDefinition() throws RecognitionException {
		GeneratorDefinitionContext _localctx = new GeneratorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_generatorDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1459);
			match(Multiply);
			setState(1460);
			iteratorDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IteratorBlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(TypeScriptParser.OpenBrace, 0); }
		public List<IteratorDefinitionContext> iteratorDefinition() {
			return getRuleContexts(IteratorDefinitionContext.class);
		}
		public IteratorDefinitionContext iteratorDefinition(int i) {
			return getRuleContext(IteratorDefinitionContext.class,i);
		}
		public TerminalNode CloseBrace() { return getToken(TypeScriptParser.CloseBrace, 0); }
		public List<TerminalNode> Comma() { return getTokens(TypeScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TypeScriptParser.Comma, i);
		}
		public IteratorBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteratorBlock; }
	}

	public final IteratorBlockContext iteratorBlock() throws RecognitionException {
		IteratorBlockContext _localctx = new IteratorBlockContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_iteratorBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
			match(OpenBrace);
			setState(1463);
			iteratorDefinition();
			setState(1468);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1464);
					match(Comma);
					setState(1465);
					iteratorDefinition();
					}
					} 
				}
				setState(1470);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			}
			setState(1472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1471);
				match(Comma);
				}
			}

			setState(1474);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IteratorDefinitionContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(TypeScriptParser.OpenBracket, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(TypeScriptParser.CloseBracket, 0); }
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(TypeScriptParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(TypeScriptParser.CloseBrace, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public IteratorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteratorDefinition; }
	}

	public final IteratorDefinitionContext iteratorDefinition() throws RecognitionException {
		IteratorDefinitionContext _localctx = new IteratorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_iteratorDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			match(OpenBracket);
			setState(1477);
			singleExpression(0);
			setState(1478);
			match(CloseBracket);
			setState(1479);
			match(OpenParen);
			setState(1481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Ellipsis))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Break - 71)) | (1L << (Do - 71)) | (1L << (Instanceof - 71)) | (1L << (Typeof - 71)) | (1L << (Case - 71)) | (1L << (Else - 71)) | (1L << (New - 71)) | (1L << (Var - 71)) | (1L << (Catch - 71)) | (1L << (Finally - 71)) | (1L << (Return - 71)) | (1L << (Void - 71)) | (1L << (Continue - 71)) | (1L << (For - 71)) | (1L << (Switch - 71)) | (1L << (While - 71)) | (1L << (Debugger - 71)) | (1L << (Function_ - 71)) | (1L << (This - 71)) | (1L << (With - 71)) | (1L << (Default - 71)) | (1L << (If - 71)) | (1L << (Throw - 71)) | (1L << (Delete - 71)) | (1L << (In - 71)) | (1L << (Try - 71)) | (1L << (As - 71)) | (1L << (From - 71)) | (1L << (ReadOnly - 71)) | (1L << (Async - 71)) | (1L << (Await - 71)) | (1L << (Yield - 71)) | (1L << (Class - 71)) | (1L << (Enum - 71)) | (1L << (Extends - 71)) | (1L << (Super - 71)) | (1L << (Const - 71)) | (1L << (Export - 71)) | (1L << (Import - 71)) | (1L << (Implements - 71)) | (1L << (Let - 71)) | (1L << (Private - 71)) | (1L << (Public - 71)) | (1L << (Interface - 71)) | (1L << (Package - 71)) | (1L << (Protected - 71)) | (1L << (Static - 71)) | (1L << (Any - 71)) | (1L << (Number - 71)) | (1L << (Never - 71)) | (1L << (Boolean - 71)) | (1L << (String - 71)) | (1L << (Unique - 71)) | (1L << (Symbol - 71)) | (1L << (Undefined - 71)) | (1L << (Object - 71)) | (1L << (Of - 71)) | (1L << (KeyOf - 71)) | (1L << (TypeAlias - 71)) | (1L << (Constructor - 71)) | (1L << (Namespace - 71)) | (1L << (Require - 71)) | (1L << (Module - 71)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (Abstract - 136)) | (1L << (At - 136)) | (1L << (Identifier - 136)))) != 0)) {
				{
				setState(1480);
				formalParameterList();
				}
			}

			setState(1483);
			match(CloseParen);
			setState(1484);
			match(OpenBrace);
			setState(1485);
			functionBody();
			setState(1486);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassElementNameContext extends ParserRuleContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public PrivateIdentifierContext privateIdentifier() {
			return getRuleContext(PrivateIdentifierContext.class,0);
		}
		public ClassElementNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classElementName; }
	}

	public final ClassElementNameContext classElementName() throws RecognitionException {
		ClassElementNameContext _localctx = new ClassElementNameContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_classElementName);
		try {
			setState(1490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
			case NullLiteral:
			case BooleanLiteral:
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case OctalIntegerLiteral2:
			case BinaryIntegerLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case ReadOnly:
			case Async:
			case Await:
			case Yield:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Any:
			case Number:
			case Never:
			case Boolean:
			case String:
			case Unique:
			case Symbol:
			case Undefined:
			case Object:
			case Of:
			case KeyOf:
			case TypeAlias:
			case Constructor:
			case Namespace:
			case Require:
			case Module:
			case Abstract:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1488);
				propertyName();
				}
				break;
			case Hashtag:
				enterOuterAlt(_localctx, 2);
				{
				setState(1489);
				privateIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivateIdentifierContext extends ParserRuleContext {
		public TerminalNode Hashtag() { return getToken(TypeScriptParser.Hashtag, 0); }
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public PrivateIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privateIdentifier; }
	}

	public final PrivateIdentifierContext privateIdentifier() throws RecognitionException {
		PrivateIdentifierContext _localctx = new PrivateIdentifierContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_privateIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1492);
			match(Hashtag);
			setState(1493);
			identifierName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterArgContext> formalParameterArg() {
			return getRuleContexts(FormalParameterArgContext.class);
		}
		public FormalParameterArgContext formalParameterArg(int i) {
			return getRuleContext(FormalParameterArgContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TypeScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TypeScriptParser.Comma, i);
		}
		public LastFormalParameterArgContext lastFormalParameterArg() {
			return getRuleContext(LastFormalParameterArgContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TypeScriptParser.Colon, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(1517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1495);
				formalParameterArg();
				setState(1500);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1496);
						match(Comma);
						setState(1497);
						formalParameterArg();
						}
						} 
					}
					setState(1502);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
				}
				setState(1505);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1503);
					match(Comma);
					setState(1504);
					lastFormalParameterArg();
					}
					break;
				}
				setState(1508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1507);
					match(Comma);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1510);
				lastFormalParameterArg();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1511);
				arrayLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1512);
				objectLiteral();
				setState(1515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1513);
					match(Colon);
					setState(1514);
					formalParameterList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterArgContext extends ParserRuleContext {
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public DecoratorContext decorator() {
			return getRuleContext(DecoratorContext.class,0);
		}
		public AccessibilityModifierContext accessibilityModifier() {
			return getRuleContext(AccessibilityModifierContext.class,0);
		}
		public TerminalNode QuestionMark() { return getToken(TypeScriptParser.QuestionMark, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode Assign() { return getToken(TypeScriptParser.Assign, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public FormalParameterArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterArg; }
	}

	public final FormalParameterArgContext formalParameterArg() throws RecognitionException {
		FormalParameterArgContext _localctx = new FormalParameterArgContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_formalParameterArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(1519);
				decorator();
				}
			}

			setState(1523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1522);
				accessibilityModifier();
				}
				break;
			}
			setState(1525);
			assignable();
			setState(1527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark) {
				{
				setState(1526);
				match(QuestionMark);
				}
			}

			setState(1530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1529);
				typeAnnotation();
				}
			}

			setState(1534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(1532);
				match(Assign);
				setState(1533);
				singleExpression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterArgContext extends ParserRuleContext {
		public TerminalNode Ellipsis() { return getToken(TypeScriptParser.Ellipsis, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public LastFormalParameterArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameterArg; }
	}

	public final LastFormalParameterArgContext lastFormalParameterArg() throws RecognitionException {
		LastFormalParameterArgContext _localctx = new LastFormalParameterArgContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_lastFormalParameterArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1536);
			match(Ellipsis);
			setState(1537);
			identifier();
			setState(1539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1538);
				typeAnnotation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1541);
				sourceElements();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceElementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SourceElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElements; }
	}

	public final SourceElementsContext sourceElements() throws RecognitionException {
		SourceElementsContext _localctx = new SourceElementsContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_sourceElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1545); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1544);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1547); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(TypeScriptParser.OpenBracket, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(TypeScriptParser.CloseBracket, 0); }
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_arrayLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1549);
			match(OpenBracket);
			setState(1550);
			elementList();
			setState(1551);
			match(CloseBracket);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementListContext extends ParserRuleContext {
		public List<TerminalNode> Comma() { return getTokens(TypeScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TypeScriptParser.Comma, i);
		}
		public List<ArrayElementContext> arrayElement() {
			return getRuleContexts(ArrayElementContext.class);
		}
		public ArrayElementContext arrayElement(int i) {
			return getRuleContext(ArrayElementContext.class,i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_elementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1556);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1553);
					match(Comma);
					}
					} 
				}
				setState(1558);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			}
			setState(1560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << Ellipsis) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << LessThan) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OctalIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral2 - 64)) | (1L << (BinaryIntegerLiteral - 64)) | (1L << (BigHexIntegerLiteral - 64)) | (1L << (BigOctalIntegerLiteral - 64)) | (1L << (BigBinaryIntegerLiteral - 64)) | (1L << (BigDecimalIntegerLiteral - 64)) | (1L << (Break - 64)) | (1L << (Do - 64)) | (1L << (Instanceof - 64)) | (1L << (Typeof - 64)) | (1L << (Case - 64)) | (1L << (Else - 64)) | (1L << (New - 64)) | (1L << (Var - 64)) | (1L << (Catch - 64)) | (1L << (Finally - 64)) | (1L << (Return - 64)) | (1L << (Void - 64)) | (1L << (Continue - 64)) | (1L << (For - 64)) | (1L << (Switch - 64)) | (1L << (While - 64)) | (1L << (Debugger - 64)) | (1L << (Function_ - 64)) | (1L << (This - 64)) | (1L << (With - 64)) | (1L << (Default - 64)) | (1L << (If - 64)) | (1L << (Throw - 64)) | (1L << (Delete - 64)) | (1L << (In - 64)) | (1L << (Try - 64)) | (1L << (As - 64)) | (1L << (From - 64)) | (1L << (ReadOnly - 64)) | (1L << (Async - 64)) | (1L << (Await - 64)) | (1L << (Yield - 64)) | (1L << (YieldStar - 64)) | (1L << (Class - 64)) | (1L << (Enum - 64)) | (1L << (Extends - 64)) | (1L << (Super - 64)) | (1L << (Const - 64)) | (1L << (Export - 64)) | (1L << (Import - 64)) | (1L << (Implements - 64)) | (1L << (Let - 64)) | (1L << (Private - 64)) | (1L << (Public - 64)) | (1L << (Interface - 64)) | (1L << (Package - 64)) | (1L << (Protected - 64)) | (1L << (Static - 64)) | (1L << (Any - 64)) | (1L << (Number - 64)) | (1L << (Never - 64)) | (1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Unique - 64)) | (1L << (Symbol - 64)) | (1L << (Undefined - 64)) | (1L << (Object - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Of - 128)) | (1L << (KeyOf - 128)) | (1L << (TypeAlias - 128)) | (1L << (Constructor - 128)) | (1L << (Namespace - 128)) | (1L << (Require - 128)) | (1L << (Module - 128)) | (1L << (Abstract - 128)) | (1L << (Identifier - 128)) | (1L << (StringLiteral - 128)) | (1L << (BackTick - 128)))) != 0)) {
				{
				setState(1559);
				arrayElement();
				}
			}

			setState(1570);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1563); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1562);
						match(Comma);
						}
						}
						setState(1565); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Comma );
					setState(1567);
					arrayElement();
					}
					} 
				}
				setState(1572);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			}
			setState(1576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1573);
				match(Comma);
				}
				}
				setState(1578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayElementContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(TypeScriptParser.Ellipsis, 0); }
		public TerminalNode Comma() { return getToken(TypeScriptParser.Comma, 0); }
		public ArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElement; }
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_arrayElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1579);
				match(Ellipsis);
				}
			}

			setState(1584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1582);
				singleExpression(0);
				}
				break;
			case 2:
				{
				setState(1583);
				identifier();
				}
				break;
			}
			setState(1587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				setState(1586);
				match(Comma);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(TypeScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(TypeScriptParser.CloseBrace, 0); }
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TypeScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TypeScriptParser.Comma, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_objectLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1589);
			match(OpenBrace);
			setState(1601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				{
				setState(1590);
				propertyAssignment();
				setState(1595);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1591);
						match(Comma);
						setState(1592);
						propertyAssignment();
						}
						} 
					}
					setState(1597);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
				}
				setState(1599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1598);
					match(Comma);
					}
				}

				}
				break;
			}
			setState(1603);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyAssignmentContext extends ParserRuleContext {
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
	 
		public PropertyAssignmentContext() { }
		public void copyFrom(PropertyAssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PropertyExpressionAssignmentContext extends PropertyAssignmentContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TypeScriptParser.Colon, 0); }
		public TerminalNode Assign() { return getToken(TypeScriptParser.Assign, 0); }
		public PropertyExpressionAssignmentContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class ComputedPropertyExpressionAssignmentContext extends PropertyAssignmentContext {
		public TerminalNode OpenBracket() { return getToken(TypeScriptParser.OpenBracket, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode CloseBracket() { return getToken(TypeScriptParser.CloseBracket, 0); }
		public TerminalNode Colon() { return getToken(TypeScriptParser.Colon, 0); }
		public ComputedPropertyExpressionAssignmentContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class SpreadOperatorContext extends PropertyAssignmentContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(TypeScriptParser.Ellipsis, 0); }
		public SpreadOperatorContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class PropertyShorthandContext extends PropertyAssignmentContext {
		public IdentifierOrKeyWordContext identifierOrKeyWord() {
			return getRuleContext(IdentifierOrKeyWordContext.class,0);
		}
		public PropertyShorthandContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class PropertySetterContext extends PropertyAssignmentContext {
		public SetAccessorContext setAccessor() {
			return getRuleContext(SetAccessorContext.class,0);
		}
		public PropertySetterContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class PropertyGetterContext extends PropertyAssignmentContext {
		public GetAccessorContext getAccessor() {
			return getRuleContext(GetAccessorContext.class,0);
		}
		public PropertyGetterContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class RestParameterInObjectContext extends PropertyAssignmentContext {
		public RestParameterContext restParameter() {
			return getRuleContext(RestParameterContext.class,0);
		}
		public RestParameterInObjectContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class MethodPropertyContext extends PropertyAssignmentContext {
		public GeneratorMethodContext generatorMethod() {
			return getRuleContext(GeneratorMethodContext.class,0);
		}
		public MethodPropertyContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_propertyAssignment);
		int _la;
		try {
			setState(1624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				_localctx = new PropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1605);
				propertyName();
				setState(1606);
				_la = _input.LA(1);
				if ( !(_la==Assign || _la==Colon) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1607);
				singleExpression(0);
				}
				break;
			case 2:
				_localctx = new ComputedPropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1609);
				match(OpenBracket);
				setState(1610);
				singleExpression(0);
				setState(1611);
				match(CloseBracket);
				setState(1612);
				match(Colon);
				setState(1613);
				singleExpression(0);
				}
				break;
			case 3:
				_localctx = new PropertyGetterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1615);
				getAccessor();
				}
				break;
			case 4:
				_localctx = new PropertySetterContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1616);
				setAccessor();
				}
				break;
			case 5:
				_localctx = new MethodPropertyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1617);
				generatorMethod();
				}
				break;
			case 6:
				_localctx = new PropertyShorthandContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1618);
				identifierOrKeyWord();
				}
				break;
			case 7:
				_localctx = new SpreadOperatorContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1619);
					match(Ellipsis);
					}
				}

				setState(1622);
				singleExpression(0);
				}
				break;
			case 8:
				_localctx = new RestParameterInObjectContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1623);
				restParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetAccessorContext extends ParserRuleContext {
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(TypeScriptParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(TypeScriptParser.CloseBrace, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public GetAccessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getAccessor; }
	}

	public final GetAccessorContext getAccessor() throws RecognitionException {
		GetAccessorContext _localctx = new GetAccessorContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_getAccessor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1626);
			getter();
			setState(1627);
			match(OpenParen);
			setState(1628);
			match(CloseParen);
			setState(1630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1629);
				typeAnnotation();
				}
			}

			setState(1632);
			match(OpenBrace);
			setState(1633);
			functionBody();
			setState(1634);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetAccessorContext extends ParserRuleContext {
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(TypeScriptParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(TypeScriptParser.CloseBrace, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public SetAccessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setAccessor; }
	}

	public final SetAccessorContext setAccessor() throws RecognitionException {
		SetAccessorContext _localctx = new SetAccessorContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_setAccessor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1636);
			setter();
			setState(1637);
			match(OpenParen);
			setState(1639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Ellipsis))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Break - 71)) | (1L << (Do - 71)) | (1L << (Instanceof - 71)) | (1L << (Typeof - 71)) | (1L << (Case - 71)) | (1L << (Else - 71)) | (1L << (New - 71)) | (1L << (Var - 71)) | (1L << (Catch - 71)) | (1L << (Finally - 71)) | (1L << (Return - 71)) | (1L << (Void - 71)) | (1L << (Continue - 71)) | (1L << (For - 71)) | (1L << (Switch - 71)) | (1L << (While - 71)) | (1L << (Debugger - 71)) | (1L << (Function_ - 71)) | (1L << (This - 71)) | (1L << (With - 71)) | (1L << (Default - 71)) | (1L << (If - 71)) | (1L << (Throw - 71)) | (1L << (Delete - 71)) | (1L << (In - 71)) | (1L << (Try - 71)) | (1L << (As - 71)) | (1L << (From - 71)) | (1L << (ReadOnly - 71)) | (1L << (Async - 71)) | (1L << (Await - 71)) | (1L << (Yield - 71)) | (1L << (Class - 71)) | (1L << (Enum - 71)) | (1L << (Extends - 71)) | (1L << (Super - 71)) | (1L << (Const - 71)) | (1L << (Export - 71)) | (1L << (Import - 71)) | (1L << (Implements - 71)) | (1L << (Let - 71)) | (1L << (Private - 71)) | (1L << (Public - 71)) | (1L << (Interface - 71)) | (1L << (Package - 71)) | (1L << (Protected - 71)) | (1L << (Static - 71)) | (1L << (Any - 71)) | (1L << (Number - 71)) | (1L << (Never - 71)) | (1L << (Boolean - 71)) | (1L << (String - 71)) | (1L << (Unique - 71)) | (1L << (Symbol - 71)) | (1L << (Undefined - 71)) | (1L << (Object - 71)) | (1L << (Of - 71)) | (1L << (KeyOf - 71)) | (1L << (TypeAlias - 71)) | (1L << (Constructor - 71)) | (1L << (Namespace - 71)) | (1L << (Require - 71)) | (1L << (Module - 71)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (Abstract - 136)) | (1L << (At - 136)) | (1L << (Identifier - 136)))) != 0)) {
				{
				setState(1638);
				formalParameterList();
				}
			}

			setState(1641);
			match(CloseParen);
			setState(1642);
			match(OpenBrace);
			setState(1643);
			functionBody();
			setState(1644);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyNameContext extends ParserRuleContext {
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(TypeScriptParser.StringLiteral, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(TypeScriptParser.OpenBracket, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(TypeScriptParser.CloseBracket, 0); }
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_propertyName);
		try {
			setState(1653);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case ReadOnly:
			case Async:
			case Await:
			case Yield:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Any:
			case Number:
			case Never:
			case Boolean:
			case String:
			case Unique:
			case Symbol:
			case Undefined:
			case Object:
			case Of:
			case KeyOf:
			case TypeAlias:
			case Constructor:
			case Namespace:
			case Require:
			case Module:
			case Abstract:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1646);
				identifierName();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1647);
				match(StringLiteral);
				}
				break;
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case OctalIntegerLiteral2:
			case BinaryIntegerLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(1648);
				numericLiteral();
				}
				break;
			case OpenBracket:
				enterOuterAlt(_localctx, 4);
				{
				setState(1649);
				match(OpenBracket);
				setState(1650);
				singleExpression(0);
				setState(1651);
				match(CloseBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TypeScriptParser.Comma, 0); }
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			match(OpenParen);
			setState(1660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << Ellipsis) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << LessThan) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OctalIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral2 - 64)) | (1L << (BinaryIntegerLiteral - 64)) | (1L << (BigHexIntegerLiteral - 64)) | (1L << (BigOctalIntegerLiteral - 64)) | (1L << (BigBinaryIntegerLiteral - 64)) | (1L << (BigDecimalIntegerLiteral - 64)) | (1L << (Break - 64)) | (1L << (Do - 64)) | (1L << (Instanceof - 64)) | (1L << (Typeof - 64)) | (1L << (Case - 64)) | (1L << (Else - 64)) | (1L << (New - 64)) | (1L << (Var - 64)) | (1L << (Catch - 64)) | (1L << (Finally - 64)) | (1L << (Return - 64)) | (1L << (Void - 64)) | (1L << (Continue - 64)) | (1L << (For - 64)) | (1L << (Switch - 64)) | (1L << (While - 64)) | (1L << (Debugger - 64)) | (1L << (Function_ - 64)) | (1L << (This - 64)) | (1L << (With - 64)) | (1L << (Default - 64)) | (1L << (If - 64)) | (1L << (Throw - 64)) | (1L << (Delete - 64)) | (1L << (In - 64)) | (1L << (Try - 64)) | (1L << (As - 64)) | (1L << (From - 64)) | (1L << (ReadOnly - 64)) | (1L << (Async - 64)) | (1L << (Await - 64)) | (1L << (Yield - 64)) | (1L << (YieldStar - 64)) | (1L << (Class - 64)) | (1L << (Enum - 64)) | (1L << (Extends - 64)) | (1L << (Super - 64)) | (1L << (Const - 64)) | (1L << (Export - 64)) | (1L << (Import - 64)) | (1L << (Implements - 64)) | (1L << (Let - 64)) | (1L << (Private - 64)) | (1L << (Public - 64)) | (1L << (Interface - 64)) | (1L << (Package - 64)) | (1L << (Protected - 64)) | (1L << (Static - 64)) | (1L << (Any - 64)) | (1L << (Number - 64)) | (1L << (Never - 64)) | (1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Unique - 64)) | (1L << (Symbol - 64)) | (1L << (Undefined - 64)) | (1L << (Object - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Of - 128)) | (1L << (KeyOf - 128)) | (1L << (TypeAlias - 128)) | (1L << (Constructor - 128)) | (1L << (Namespace - 128)) | (1L << (Require - 128)) | (1L << (Module - 128)) | (1L << (Abstract - 128)) | (1L << (Identifier - 128)) | (1L << (StringLiteral - 128)) | (1L << (BackTick - 128)))) != 0)) {
				{
				setState(1656);
				argumentList();
				setState(1658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1657);
					match(Comma);
					}
				}

				}
			}

			setState(1662);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TypeScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TypeScriptParser.Comma, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_argumentList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1664);
			argument();
			setState(1669);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1665);
					match(Comma);
					setState(1666);
					argument();
					}
					} 
				}
				setState(1671);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(TypeScriptParser.Ellipsis, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1672);
				match(Ellipsis);
				}
			}

			setState(1677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				setState(1675);
				singleExpression(0);
				}
				break;
			case 2:
				{
				setState(1676);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionSequenceContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TypeScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TypeScriptParser.Comma, i);
		}
		public ExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSequence; }
	}

	public final ExpressionSequenceContext expressionSequence() throws RecognitionException {
		ExpressionSequenceContext _localctx = new ExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_expressionSequence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1679);
			singleExpression(0);
			setState(1684);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1680);
					match(Comma);
					setState(1681);
					singleExpression(0);
					}
					} 
				}
				setState(1686);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleExpressionContext extends ParserRuleContext {
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
	 
		public SingleExpressionContext() { }
		public void copyFrom(SingleExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TemplateStringExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TemplateStringLiteralContext templateStringLiteral() {
			return getRuleContext(TemplateStringLiteralContext.class,0);
		}
		public TemplateStringExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class GeneratorsExpressionContext extends SingleExpressionContext {
		public GeneratorBlockContext generatorBlock() {
			return getRuleContext(GeneratorBlockContext.class,0);
		}
		public GeneratorsExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PowerExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Power() { return getToken(TypeScriptParser.Power, 0); }
		public PowerExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class InExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode In() { return getToken(TypeScriptParser.In, 0); }
		public InExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class GenericTypesContext extends SingleExpressionContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public GenericTypesContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class OptionalChainExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode QuestionMarkDot() { return getToken(TypeScriptParser.QuestionMarkDot, 0); }
		public OptionalChainExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArgumentsExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentsExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ThisExpressionContext extends SingleExpressionContext {
		public TerminalNode This() { return getToken(TypeScriptParser.This, 0); }
		public ThisExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class TypeofExpressionContext extends SingleExpressionContext {
		public TerminalNode Typeof() { return getToken(TypeScriptParser.Typeof, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TypeofExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class GeneratorsFunctionExpressionContext extends SingleExpressionContext {
		public GeneratorFunctionDeclarationContext generatorFunctionDeclaration() {
			return getRuleContext(GeneratorFunctionDeclarationContext.class,0);
		}
		public GeneratorsFunctionExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EqualityExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Equals_() { return getToken(TypeScriptParser.Equals_, 0); }
		public TerminalNode NotEquals() { return getToken(TypeScriptParser.NotEquals, 0); }
		public TerminalNode IdentityEquals() { return getToken(TypeScriptParser.IdentityEquals, 0); }
		public TerminalNode IdentityNotEquals() { return getToken(TypeScriptParser.IdentityNotEquals, 0); }
		public EqualityExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BitXOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode BitXOr() { return getToken(TypeScriptParser.BitXOr, 0); }
		public BitXOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class CastAsExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode As() { return getToken(TypeScriptParser.As, 0); }
		public AsExpressionContext asExpression() {
			return getRuleContext(AsExpressionContext.class,0);
		}
		public CastAsExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MultiplicativeExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Multiply() { return getToken(TypeScriptParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(TypeScriptParser.Divide, 0); }
		public TerminalNode Modulus() { return getToken(TypeScriptParser.Modulus, 0); }
		public MultiplicativeExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BitShiftExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode LeftShiftArithmetic() { return getToken(TypeScriptParser.LeftShiftArithmetic, 0); }
		public List<TerminalNode> MoreThan() { return getTokens(TypeScriptParser.MoreThan); }
		public TerminalNode MoreThan(int i) {
			return getToken(TypeScriptParser.MoreThan, i);
		}
		public BitShiftExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AdditiveExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Plus() { return getToken(TypeScriptParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(TypeScriptParser.Minus, 0); }
		public AdditiveExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class RelationalExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode LessThan() { return getToken(TypeScriptParser.LessThan, 0); }
		public TerminalNode MoreThan() { return getToken(TypeScriptParser.MoreThan, 0); }
		public TerminalNode LessThanEquals() { return getToken(TypeScriptParser.LessThanEquals, 0); }
		public TerminalNode GreaterThanEquals() { return getToken(TypeScriptParser.GreaterThanEquals, 0); }
		public RelationalExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BitNotExpressionContext extends SingleExpressionContext {
		public TerminalNode BitNot() { return getToken(TypeScriptParser.BitNot, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public BitNotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NewExpressionContext extends SingleExpressionContext {
		public TerminalNode New() { return getToken(TypeScriptParser.New, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public NewExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LiteralExpressionContext extends SingleExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayLiteralExpressionContext extends SingleExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MemberDotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(TypeScriptParser.Dot, 0); }
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public TerminalNode Not() { return getToken(TypeScriptParser.Not, 0); }
		public TerminalNode Hashtag() { return getToken(TypeScriptParser.Hashtag, 0); }
		public TypeGenericContext typeGeneric() {
			return getRuleContext(TypeGenericContext.class,0);
		}
		public TerminalNode QuestionMark() { return getToken(TypeScriptParser.QuestionMark, 0); }
		public MemberDotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MemberIndexExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(TypeScriptParser.OpenBracket, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(TypeScriptParser.CloseBracket, 0); }
		public TerminalNode QuestionMarkDot() { return getToken(TypeScriptParser.QuestionMarkDot, 0); }
		public MemberIndexExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BitAndExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode BitAnd() { return getToken(TypeScriptParser.BitAnd, 0); }
		public BitAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BitOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode BitOr() { return getToken(TypeScriptParser.BitOr, 0); }
		public BitOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AssignmentOperatorExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentOperatorExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class VoidExpressionContext extends SingleExpressionContext {
		public TerminalNode Void() { return getToken(TypeScriptParser.Void, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VoidExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class TernaryExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode QuestionMark() { return getToken(TypeScriptParser.QuestionMark, 0); }
		public TerminalNode Colon() { return getToken(TypeScriptParser.Colon, 0); }
		public TernaryExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogicalAndExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode And() { return getToken(TypeScriptParser.And, 0); }
		public LogicalAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PreIncrementExpressionContext extends SingleExpressionContext {
		public TerminalNode PlusPlus() { return getToken(TypeScriptParser.PlusPlus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ObjectLiteralExpressionContext extends SingleExpressionContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogicalOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Or() { return getToken(TypeScriptParser.Or, 0); }
		public LogicalOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NonNullAssertionExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Not() { return getToken(TypeScriptParser.Not, 0); }
		public NonNullAssertionExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NotExpressionContext extends SingleExpressionContext {
		public TerminalNode Not() { return getToken(TypeScriptParser.Not, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public NotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PreDecreaseExpressionContext extends SingleExpressionContext {
		public TerminalNode MinusMinus() { return getToken(TypeScriptParser.MinusMinus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PreDecreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AwaitExpressionContext extends SingleExpressionContext {
		public TerminalNode Await() { return getToken(TypeScriptParser.Await, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public AwaitExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionExpressionContext extends SingleExpressionContext {
		public AnonymousFunctionContext anonymousFunction() {
			return getRuleContext(AnonymousFunctionContext.class,0);
		}
		public FunctionExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryMinusExpressionContext extends SingleExpressionContext {
		public TerminalNode Minus() { return getToken(TypeScriptParser.Minus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UnaryMinusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AssignmentExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Assign() { return getToken(TypeScriptParser.Assign, 0); }
		public AssignmentExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PostDecreaseExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode MinusMinus() { return getToken(TypeScriptParser.MinusMinus, 0); }
		public PostDecreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class InstanceofExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Instanceof() { return getToken(TypeScriptParser.Instanceof, 0); }
		public InstanceofExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryPlusExpressionContext extends SingleExpressionContext {
		public TerminalNode Plus() { return getToken(TypeScriptParser.Plus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UnaryPlusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class DeleteExpressionContext extends SingleExpressionContext {
		public TerminalNode Delete() { return getToken(TypeScriptParser.Delete, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public DeleteExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IteratorsExpressionContext extends SingleExpressionContext {
		public IteratorBlockContext iteratorBlock() {
			return getRuleContext(IteratorBlockContext.class,0);
		}
		public IteratorsExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SuperExpressionContext extends SingleExpressionContext {
		public TerminalNode Super() { return getToken(TypeScriptParser.Super, 0); }
		public SuperExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesizedExpressionContext extends SingleExpressionContext {
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public ParenthesizedExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PostIncrementExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(TypeScriptParser.PlusPlus, 0); }
		public PostIncrementExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class YieldExpressionContext extends SingleExpressionContext {
		public YieldStatementContext yieldStatement() {
			return getRuleContext(YieldStatementContext.class,0);
		}
		public YieldExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ClassExpressionContext extends SingleExpressionContext {
		public TerminalNode Class() { return getToken(TypeScriptParser.Class, 0); }
		public ClassHeritageContext classHeritage() {
			return getRuleContext(ClassHeritageContext.class,0);
		}
		public ClassTailContext classTail() {
			return getRuleContext(ClassTailContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ClassExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IdentifierExpressionContext extends SingleExpressionContext {
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public IdentifierExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class CoalesceExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode NullCoalesce() { return getToken(TypeScriptParser.NullCoalesce, 0); }
		public CoalesceExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		return singleExpression(0);
	}

	private SingleExpressionContext singleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, _parentState);
		SingleExpressionContext _prevctx = _localctx;
		int _startState = 278;
		enterRecursionRule(_localctx, 278, RULE_singleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1688);
				anonymousFunction();
				}
				break;
			case 2:
				{
				_localctx = new ClassExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1689);
				match(Class);
				setState(1691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (As - 97)) | (1L << (From - 97)) | (1L << (Async - 97)) | (1L << (Yield - 97)) | (1L << (Any - 97)) | (1L << (Number - 97)) | (1L << (Never - 97)) | (1L << (Boolean - 97)) | (1L << (String - 97)) | (1L << (Unique - 97)) | (1L << (Symbol - 97)) | (1L << (Undefined - 97)) | (1L << (Object - 97)) | (1L << (Of - 97)) | (1L << (KeyOf - 97)) | (1L << (TypeAlias - 97)) | (1L << (Constructor - 97)) | (1L << (Namespace - 97)) | (1L << (Abstract - 97)) | (1L << (Identifier - 97)))) != 0)) {
					{
					setState(1690);
					identifier();
					}
				}

				setState(1694);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LessThan) {
					{
					setState(1693);
					typeParameters();
					}
				}

				setState(1696);
				classHeritage();
				setState(1697);
				classTail();
				}
				break;
			case 3:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1699);
				match(New);
				setState(1700);
				singleExpression(0);
				setState(1702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LessThan) {
					{
					setState(1701);
					typeArguments();
					}
				}

				setState(1704);
				arguments();
				}
				break;
			case 4:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1706);
				match(New);
				setState(1707);
				singleExpression(0);
				setState(1709);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1708);
					typeArguments();
					}
					break;
				}
				}
				break;
			case 5:
				{
				_localctx = new DeleteExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1711);
				match(Delete);
				setState(1712);
				singleExpression(42);
				}
				break;
			case 6:
				{
				_localctx = new VoidExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1713);
				match(Void);
				setState(1714);
				singleExpression(41);
				}
				break;
			case 7:
				{
				_localctx = new TypeofExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1715);
				match(Typeof);
				setState(1716);
				singleExpression(40);
				}
				break;
			case 8:
				{
				_localctx = new PreIncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1717);
				match(PlusPlus);
				setState(1718);
				singleExpression(39);
				}
				break;
			case 9:
				{
				_localctx = new PreDecreaseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1719);
				match(MinusMinus);
				setState(1720);
				singleExpression(38);
				}
				break;
			case 10:
				{
				_localctx = new UnaryPlusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1721);
				match(Plus);
				setState(1722);
				singleExpression(37);
				}
				break;
			case 11:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1723);
				match(Minus);
				setState(1724);
				singleExpression(36);
				}
				break;
			case 12:
				{
				_localctx = new BitNotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1725);
				match(BitNot);
				setState(1726);
				singleExpression(35);
				}
				break;
			case 13:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1727);
				match(Not);
				setState(1728);
				singleExpression(34);
				}
				break;
			case 14:
				{
				_localctx = new AwaitExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1729);
				match(Await);
				setState(1730);
				singleExpression(33);
				}
				break;
			case 15:
				{
				_localctx = new IteratorsExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1731);
				iteratorBlock();
				}
				break;
			case 16:
				{
				_localctx = new GeneratorsExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1732);
				generatorBlock();
				}
				break;
			case 17:
				{
				_localctx = new GeneratorsFunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1733);
				generatorFunctionDeclaration();
				}
				break;
			case 18:
				{
				_localctx = new YieldExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1734);
				yieldStatement();
				}
				break;
			case 19:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1735);
				match(This);
				}
				break;
			case 20:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1736);
				identifierName();
				setState(1738);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1737);
					singleExpression(0);
					}
					break;
				}
				}
				break;
			case 21:
				{
				_localctx = new SuperExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1740);
				match(Super);
				}
				break;
			case 22:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1741);
				literal();
				}
				break;
			case 23:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1742);
				arrayLiteral();
				}
				break;
			case 24:
				{
				_localctx = new ObjectLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1743);
				objectLiteral();
				}
				break;
			case 25:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1744);
				match(OpenParen);
				setState(1745);
				expressionSequence();
				setState(1746);
				match(CloseParen);
				}
				break;
			case 26:
				{
				_localctx = new GenericTypesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1748);
				typeArguments();
				setState(1750);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(1749);
					expressionSequence();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1868);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1866);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
					case 1:
						{
						_localctx = new OptionalChainExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1754);
						if (!(precpred(_ctx, 50))) throw new FailedPredicateException(this, "precpred(_ctx, 50)");
						setState(1755);
						match(QuestionMarkDot);
						setState(1756);
						singleExpression(51);
						}
						break;
					case 2:
						{
						_localctx = new PowerExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1757);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(1758);
						match(Power);
						setState(1759);
						singleExpression(32);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1760);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(1761);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1762);
						singleExpression(32);
						}
						break;
					case 4:
						{
						_localctx = new AdditiveExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1763);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(1764);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1765);
						singleExpression(31);
						}
						break;
					case 5:
						{
						_localctx = new CoalesceExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1766);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(1767);
						match(NullCoalesce);
						setState(1768);
						singleExpression(30);
						}
						break;
					case 6:
						{
						_localctx = new BitShiftExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1769);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(1776);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
						case 1:
							{
							setState(1770);
							match(LeftShiftArithmetic);
							}
							break;
						case 2:
							{
							setState(1771);
							match(MoreThan);
							setState(1772);
							match(MoreThan);
							}
							break;
						case 3:
							{
							setState(1773);
							match(MoreThan);
							setState(1774);
							match(MoreThan);
							setState(1775);
							match(MoreThan);
							}
							break;
						}
						setState(1778);
						singleExpression(29);
						}
						break;
					case 7:
						{
						_localctx = new RelationalExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1779);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1780);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1781);
						singleExpression(28);
						}
						break;
					case 8:
						{
						_localctx = new InstanceofExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1782);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1783);
						match(Instanceof);
						setState(1784);
						singleExpression(27);
						}
						break;
					case 9:
						{
						_localctx = new InExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1785);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1786);
						match(In);
						setState(1787);
						singleExpression(26);
						}
						break;
					case 10:
						{
						_localctx = new EqualityExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1788);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1789);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equals_) | (1L << NotEquals) | (1L << IdentityEquals) | (1L << IdentityNotEquals))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1790);
						singleExpression(25);
						}
						break;
					case 11:
						{
						_localctx = new BitAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1791);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1792);
						match(BitAnd);
						setState(1793);
						singleExpression(24);
						}
						break;
					case 12:
						{
						_localctx = new BitXOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1794);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1795);
						match(BitXOr);
						setState(1796);
						singleExpression(23);
						}
						break;
					case 13:
						{
						_localctx = new BitOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1797);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1798);
						match(BitOr);
						setState(1799);
						singleExpression(22);
						}
						break;
					case 14:
						{
						_localctx = new LogicalAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1800);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1801);
						match(And);
						setState(1802);
						singleExpression(21);
						}
						break;
					case 15:
						{
						_localctx = new LogicalOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1803);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1804);
						match(Or);
						setState(1805);
						singleExpression(20);
						}
						break;
					case 16:
						{
						_localctx = new TernaryExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1806);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1807);
						match(QuestionMark);
						setState(1808);
						singleExpression(0);
						setState(1809);
						match(Colon);
						setState(1810);
						singleExpression(19);
						}
						break;
					case 17:
						{
						_localctx = new AssignmentExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1812);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1813);
						match(Assign);
						setState(1814);
						singleExpression(18);
						}
						break;
					case 18:
						{
						_localctx = new AssignmentOperatorExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1815);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1816);
						assignmentOperator();
						setState(1817);
						singleExpression(17);
						}
						break;
					case 19:
						{
						_localctx = new MemberIndexExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1819);
						if (!(precpred(_ctx, 51))) throw new FailedPredicateException(this, "precpred(_ctx, 51)");
						setState(1821);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QuestionMarkDot) {
							{
							setState(1820);
							match(QuestionMarkDot);
							}
						}

						setState(1823);
						match(OpenBracket);
						setState(1824);
						expressionSequence();
						setState(1825);
						match(CloseBracket);
						}
						break;
					case 20:
						{
						_localctx = new MemberDotExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1827);
						if (!(precpred(_ctx, 49))) throw new FailedPredicateException(this, "precpred(_ctx, 49)");
						setState(1829);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Not) {
							{
							setState(1828);
							match(Not);
							}
						}

						setState(1831);
						match(Dot);
						setState(1833);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Hashtag) {
							{
							setState(1832);
							match(Hashtag);
							}
						}

						setState(1835);
						identifierName();
						setState(1837);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
						case 1:
							{
							setState(1836);
							typeGeneric();
							}
							break;
						}
						}
						break;
					case 21:
						{
						_localctx = new MemberDotExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1839);
						if (!(precpred(_ctx, 48))) throw new FailedPredicateException(this, "precpred(_ctx, 48)");
						setState(1841);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QuestionMark) {
							{
							setState(1840);
							match(QuestionMark);
							}
						}

						setState(1843);
						match(Dot);
						setState(1845);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Hashtag) {
							{
							setState(1844);
							match(Hashtag);
							}
						}

						setState(1847);
						identifierName();
						setState(1849);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
						case 1:
							{
							setState(1848);
							typeGeneric();
							}
							break;
						}
						}
						break;
					case 22:
						{
						_localctx = new ArgumentsExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1851);
						if (!(precpred(_ctx, 45))) throw new FailedPredicateException(this, "precpred(_ctx, 45)");
						setState(1852);
						arguments();
						}
						break;
					case 23:
						{
						_localctx = new PostIncrementExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1853);
						if (!(precpred(_ctx, 44))) throw new FailedPredicateException(this, "precpred(_ctx, 44)");
						setState(1854);
						if (!(this.notLineTerminator())) throw new FailedPredicateException(this, "this.notLineTerminator()");
						setState(1855);
						match(PlusPlus);
						}
						break;
					case 24:
						{
						_localctx = new PostDecreaseExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1856);
						if (!(precpred(_ctx, 43))) throw new FailedPredicateException(this, "precpred(_ctx, 43)");
						setState(1857);
						if (!(this.notLineTerminator())) throw new FailedPredicateException(this, "this.notLineTerminator()");
						setState(1858);
						match(MinusMinus);
						}
						break;
					case 25:
						{
						_localctx = new TemplateStringExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1859);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1860);
						templateStringLiteral();
						}
						break;
					case 26:
						{
						_localctx = new CastAsExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1861);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1862);
						match(As);
						setState(1863);
						asExpression();
						}
						break;
					case 27:
						{
						_localctx = new NonNullAssertionExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1864);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1865);
						match(Not);
						}
						break;
					}
					} 
				}
				setState(1870);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AsExpressionContext extends ParserRuleContext {
		public PredefinedTypeContext predefinedType() {
			return getRuleContext(PredefinedTypeContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(TypeScriptParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(TypeScriptParser.CloseBracket, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public AsExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asExpression; }
	}

	public final AsExpressionContext asExpression() throws RecognitionException {
		AsExpressionContext _localctx = new AsExpressionContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_asExpression);
		try {
			setState(1877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1871);
				predefinedType();
				setState(1874);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(1872);
					match(OpenBracket);
					setState(1873);
					match(CloseBracket);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1876);
				singleExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public AssignableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignable; }
	}

	public final AssignableContext assignable() throws RecognitionException {
		AssignableContext _localctx = new AssignableContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_assignable);
		try {
			setState(1883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1879);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1880);
				keyword();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1881);
				arrayLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1882);
				objectLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnonymousFunctionContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public TerminalNode Function_() { return getToken(TypeScriptParser.Function_, 0); }
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(TypeScriptParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(TypeScriptParser.CloseBrace, 0); }
		public TerminalNode Async() { return getToken(TypeScriptParser.Async, 0); }
		public TerminalNode Multiply() { return getToken(TypeScriptParser.Multiply, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public ArrowFunctionDeclarationContext arrowFunctionDeclaration() {
			return getRuleContext(ArrowFunctionDeclarationContext.class,0);
		}
		public AnonymousFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousFunction; }
	}

	public final AnonymousFunctionContext anonymousFunction() throws RecognitionException {
		AnonymousFunctionContext _localctx = new AnonymousFunctionContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_anonymousFunction);
		int _la;
		try {
			setState(1906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1885);
				functionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Async) {
					{
					setState(1886);
					match(Async);
					}
				}

				setState(1889);
				match(Function_);
				setState(1891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Multiply) {
					{
					setState(1890);
					match(Multiply);
					}
				}

				setState(1893);
				match(OpenParen);
				setState(1895);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Ellipsis))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Break - 71)) | (1L << (Do - 71)) | (1L << (Instanceof - 71)) | (1L << (Typeof - 71)) | (1L << (Case - 71)) | (1L << (Else - 71)) | (1L << (New - 71)) | (1L << (Var - 71)) | (1L << (Catch - 71)) | (1L << (Finally - 71)) | (1L << (Return - 71)) | (1L << (Void - 71)) | (1L << (Continue - 71)) | (1L << (For - 71)) | (1L << (Switch - 71)) | (1L << (While - 71)) | (1L << (Debugger - 71)) | (1L << (Function_ - 71)) | (1L << (This - 71)) | (1L << (With - 71)) | (1L << (Default - 71)) | (1L << (If - 71)) | (1L << (Throw - 71)) | (1L << (Delete - 71)) | (1L << (In - 71)) | (1L << (Try - 71)) | (1L << (As - 71)) | (1L << (From - 71)) | (1L << (ReadOnly - 71)) | (1L << (Async - 71)) | (1L << (Await - 71)) | (1L << (Yield - 71)) | (1L << (Class - 71)) | (1L << (Enum - 71)) | (1L << (Extends - 71)) | (1L << (Super - 71)) | (1L << (Const - 71)) | (1L << (Export - 71)) | (1L << (Import - 71)) | (1L << (Implements - 71)) | (1L << (Let - 71)) | (1L << (Private - 71)) | (1L << (Public - 71)) | (1L << (Interface - 71)) | (1L << (Package - 71)) | (1L << (Protected - 71)) | (1L << (Static - 71)) | (1L << (Any - 71)) | (1L << (Number - 71)) | (1L << (Never - 71)) | (1L << (Boolean - 71)) | (1L << (String - 71)) | (1L << (Unique - 71)) | (1L << (Symbol - 71)) | (1L << (Undefined - 71)) | (1L << (Object - 71)) | (1L << (Of - 71)) | (1L << (KeyOf - 71)) | (1L << (TypeAlias - 71)) | (1L << (Constructor - 71)) | (1L << (Namespace - 71)) | (1L << (Require - 71)) | (1L << (Module - 71)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (Abstract - 136)) | (1L << (At - 136)) | (1L << (Identifier - 136)))) != 0)) {
					{
					setState(1894);
					formalParameterList();
					}
				}

				setState(1897);
				match(CloseParen);
				setState(1899);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1898);
					typeAnnotation();
					}
				}

				setState(1901);
				match(OpenBrace);
				setState(1902);
				functionBody();
				setState(1903);
				match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1905);
				arrowFunctionDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrowFunctionDeclarationContext extends ParserRuleContext {
		public ArrowFunctionParametersContext arrowFunctionParameters() {
			return getRuleContext(ArrowFunctionParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(TypeScriptParser.ARROW, 0); }
		public ArrowFunctionBodyContext arrowFunctionBody() {
			return getRuleContext(ArrowFunctionBodyContext.class,0);
		}
		public TerminalNode Async() { return getToken(TypeScriptParser.Async, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public ArrowFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunctionDeclaration; }
	}

	public final ArrowFunctionDeclarationContext arrowFunctionDeclaration() throws RecognitionException {
		ArrowFunctionDeclarationContext _localctx = new ArrowFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_arrowFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1909);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				setState(1908);
				match(Async);
				}
				break;
			}
			setState(1911);
			arrowFunctionParameters();
			setState(1913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1912);
				typeAnnotation();
				}
			}

			setState(1915);
			match(ARROW);
			setState(1916);
			arrowFunctionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrowFunctionParametersContext extends ParserRuleContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(TypeScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(TypeScriptParser.CloseParen, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ArrowFunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunctionParameters; }
	}

	public final ArrowFunctionParametersContext arrowFunctionParameters() throws RecognitionException {
		ArrowFunctionParametersContext _localctx = new ArrowFunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_arrowFunctionParameters);
		int _la;
		try {
			setState(1924);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
			case NullLiteral:
			case BooleanLiteral:
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case OctalIntegerLiteral2:
			case BinaryIntegerLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case ReadOnly:
			case Async:
			case Await:
			case Yield:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Any:
			case Number:
			case Never:
			case Boolean:
			case String:
			case Unique:
			case Symbol:
			case Undefined:
			case Object:
			case Of:
			case KeyOf:
			case TypeAlias:
			case Constructor:
			case Namespace:
			case Require:
			case Module:
			case Abstract:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1918);
				propertyName();
				}
				break;
			case OpenParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(1919);
				match(OpenParen);
				setState(1921);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Ellipsis))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Break - 71)) | (1L << (Do - 71)) | (1L << (Instanceof - 71)) | (1L << (Typeof - 71)) | (1L << (Case - 71)) | (1L << (Else - 71)) | (1L << (New - 71)) | (1L << (Var - 71)) | (1L << (Catch - 71)) | (1L << (Finally - 71)) | (1L << (Return - 71)) | (1L << (Void - 71)) | (1L << (Continue - 71)) | (1L << (For - 71)) | (1L << (Switch - 71)) | (1L << (While - 71)) | (1L << (Debugger - 71)) | (1L << (Function_ - 71)) | (1L << (This - 71)) | (1L << (With - 71)) | (1L << (Default - 71)) | (1L << (If - 71)) | (1L << (Throw - 71)) | (1L << (Delete - 71)) | (1L << (In - 71)) | (1L << (Try - 71)) | (1L << (As - 71)) | (1L << (From - 71)) | (1L << (ReadOnly - 71)) | (1L << (Async - 71)) | (1L << (Await - 71)) | (1L << (Yield - 71)) | (1L << (Class - 71)) | (1L << (Enum - 71)) | (1L << (Extends - 71)) | (1L << (Super - 71)) | (1L << (Const - 71)) | (1L << (Export - 71)) | (1L << (Import - 71)) | (1L << (Implements - 71)) | (1L << (Let - 71)) | (1L << (Private - 71)) | (1L << (Public - 71)) | (1L << (Interface - 71)) | (1L << (Package - 71)) | (1L << (Protected - 71)) | (1L << (Static - 71)) | (1L << (Any - 71)) | (1L << (Number - 71)) | (1L << (Never - 71)) | (1L << (Boolean - 71)) | (1L << (String - 71)) | (1L << (Unique - 71)) | (1L << (Symbol - 71)) | (1L << (Undefined - 71)) | (1L << (Object - 71)) | (1L << (Of - 71)) | (1L << (KeyOf - 71)) | (1L << (TypeAlias - 71)) | (1L << (Constructor - 71)) | (1L << (Namespace - 71)) | (1L << (Require - 71)) | (1L << (Module - 71)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (Abstract - 136)) | (1L << (At - 136)) | (1L << (Identifier - 136)))) != 0)) {
					{
					setState(1920);
					formalParameterList();
					}
				}

				setState(1923);
				match(CloseParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrowFunctionBodyContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(TypeScriptParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(TypeScriptParser.CloseBrace, 0); }
		public ArrowFunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunctionBody; }
	}

	public final ArrowFunctionBodyContext arrowFunctionBody() throws RecognitionException {
		ArrowFunctionBodyContext _localctx = new ArrowFunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_arrowFunctionBody);
		try {
			setState(1931);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1926);
				singleExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1927);
				match(OpenBrace);
				setState(1928);
				functionBody();
				setState(1929);
				match(CloseBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode MultiplyAssign() { return getToken(TypeScriptParser.MultiplyAssign, 0); }
		public TerminalNode DivideAssign() { return getToken(TypeScriptParser.DivideAssign, 0); }
		public TerminalNode ModulusAssign() { return getToken(TypeScriptParser.ModulusAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(TypeScriptParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(TypeScriptParser.MinusAssign, 0); }
		public TerminalNode LeftShiftArithmeticAssign() { return getToken(TypeScriptParser.LeftShiftArithmeticAssign, 0); }
		public TerminalNode RightShiftArithmeticAssign() { return getToken(TypeScriptParser.RightShiftArithmeticAssign, 0); }
		public TerminalNode RightShiftLogicalAssign() { return getToken(TypeScriptParser.RightShiftLogicalAssign, 0); }
		public TerminalNode BitAndAssign() { return getToken(TypeScriptParser.BitAndAssign, 0); }
		public TerminalNode AndAssign() { return getToken(TypeScriptParser.AndAssign, 0); }
		public TerminalNode BitXorAssign() { return getToken(TypeScriptParser.BitXorAssign, 0); }
		public TerminalNode BitOrAssign() { return getToken(TypeScriptParser.BitOrAssign, 0); }
		public TerminalNode PowerAssign() { return getToken(TypeScriptParser.PowerAssign, 0); }
		public TerminalNode NullishCoalescingAssign() { return getToken(TypeScriptParser.NullishCoalescingAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1933);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MultiplyAssign) | (1L << DivideAssign) | (1L << ModulusAssign) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << LeftShiftArithmeticAssign) | (1L << RightShiftArithmeticAssign) | (1L << RightShiftLogicalAssign) | (1L << BitAndAssign) | (1L << AndAssign) | (1L << BitXorAssign) | (1L << BitOrAssign) | (1L << PowerAssign) | (1L << NullishCoalescingAssign))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NullLiteral() { return getToken(TypeScriptParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(TypeScriptParser.BooleanLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(TypeScriptParser.StringLiteral, 0); }
		public TemplateStringLiteralContext templateStringLiteral() {
			return getRuleContext(TemplateStringLiteralContext.class,0);
		}
		public TerminalNode RegularExpressionLiteral() { return getToken(TypeScriptParser.RegularExpressionLiteral, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public BigintLiteralContext bigintLiteral() {
			return getRuleContext(BigintLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_literal);
		try {
			setState(1942);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1935);
				match(NullLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1936);
				match(BooleanLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(1937);
				match(StringLiteral);
				}
				break;
			case BackTick:
				enterOuterAlt(_localctx, 4);
				{
				setState(1938);
				templateStringLiteral();
				}
				break;
			case RegularExpressionLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(1939);
				match(RegularExpressionLiteral);
				}
				break;
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case OctalIntegerLiteral2:
			case BinaryIntegerLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(1940);
				numericLiteral();
				}
				break;
			case BigHexIntegerLiteral:
			case BigOctalIntegerLiteral:
			case BigBinaryIntegerLiteral:
			case BigDecimalIntegerLiteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(1941);
				bigintLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateStringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> BackTick() { return getTokens(TypeScriptParser.BackTick); }
		public TerminalNode BackTick(int i) {
			return getToken(TypeScriptParser.BackTick, i);
		}
		public List<TemplateStringAtomContext> templateStringAtom() {
			return getRuleContexts(TemplateStringAtomContext.class);
		}
		public TemplateStringAtomContext templateStringAtom(int i) {
			return getRuleContext(TemplateStringAtomContext.class,i);
		}
		public TemplateStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateStringLiteral; }
	}

	public final TemplateStringLiteralContext templateStringLiteral() throws RecognitionException {
		TemplateStringLiteralContext _localctx = new TemplateStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_templateStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1944);
			match(BackTick);
			setState(1948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 147)) & ~0x3f) == 0 && ((1L << (_la - 147)) & ((1L << (TemplateStringEscapeAtom - 147)) | (1L << (TemplateStringStartExpression - 147)) | (1L << (TemplateStringAtom - 147)))) != 0)) {
				{
				{
				setState(1945);
				templateStringAtom();
				}
				}
				setState(1950);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1951);
			match(BackTick);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateStringAtomContext extends ParserRuleContext {
		public TerminalNode TemplateStringAtom() { return getToken(TypeScriptParser.TemplateStringAtom, 0); }
		public TerminalNode TemplateStringStartExpression() { return getToken(TypeScriptParser.TemplateStringStartExpression, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode TemplateCloseBrace() { return getToken(TypeScriptParser.TemplateCloseBrace, 0); }
		public TerminalNode TemplateStringEscapeAtom() { return getToken(TypeScriptParser.TemplateStringEscapeAtom, 0); }
		public TemplateStringAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateStringAtom; }
	}

	public final TemplateStringAtomContext templateStringAtom() throws RecognitionException {
		TemplateStringAtomContext _localctx = new TemplateStringAtomContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_templateStringAtom);
		try {
			setState(1959);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TemplateStringAtom:
				enterOuterAlt(_localctx, 1);
				{
				setState(1953);
				match(TemplateStringAtom);
				}
				break;
			case TemplateStringStartExpression:
				enterOuterAlt(_localctx, 2);
				{
				setState(1954);
				match(TemplateStringStartExpression);
				setState(1955);
				singleExpression(0);
				setState(1956);
				match(TemplateCloseBrace);
				}
				break;
			case TemplateStringEscapeAtom:
				enterOuterAlt(_localctx, 3);
				{
				setState(1958);
				match(TemplateStringEscapeAtom);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(TypeScriptParser.DecimalLiteral, 0); }
		public TerminalNode HexIntegerLiteral() { return getToken(TypeScriptParser.HexIntegerLiteral, 0); }
		public TerminalNode OctalIntegerLiteral() { return getToken(TypeScriptParser.OctalIntegerLiteral, 0); }
		public TerminalNode OctalIntegerLiteral2() { return getToken(TypeScriptParser.OctalIntegerLiteral2, 0); }
		public TerminalNode BinaryIntegerLiteral() { return getToken(TypeScriptParser.BinaryIntegerLiteral, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_numericLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1961);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (DecimalLiteral - 62)) | (1L << (HexIntegerLiteral - 62)) | (1L << (OctalIntegerLiteral - 62)) | (1L << (OctalIntegerLiteral2 - 62)) | (1L << (BinaryIntegerLiteral - 62)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BigintLiteralContext extends ParserRuleContext {
		public TerminalNode BigDecimalIntegerLiteral() { return getToken(TypeScriptParser.BigDecimalIntegerLiteral, 0); }
		public TerminalNode BigHexIntegerLiteral() { return getToken(TypeScriptParser.BigHexIntegerLiteral, 0); }
		public TerminalNode BigOctalIntegerLiteral() { return getToken(TypeScriptParser.BigOctalIntegerLiteral, 0); }
		public TerminalNode BigBinaryIntegerLiteral() { return getToken(TypeScriptParser.BigBinaryIntegerLiteral, 0); }
		public BigintLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bigintLiteral; }
	}

	public final BigintLiteralContext bigintLiteral() throws RecognitionException {
		BigintLiteralContext _localctx = new BigintLiteralContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_bigintLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1963);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (BigHexIntegerLiteral - 67)) | (1L << (BigOctalIntegerLiteral - 67)) | (1L << (BigBinaryIntegerLiteral - 67)) | (1L << (BigDecimalIntegerLiteral - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassElementNameContext classElementName() {
			return getRuleContext(ClassElementNameContext.class,0);
		}
		public GetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter; }
	}

	public final GetterContext getter() throws RecognitionException {
		GetterContext _localctx = new GetterContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_getter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1965);
			if (!(this.n("get"))) throw new FailedPredicateException(this, "this.n(\"get\")");
			setState(1966);
			identifier();
			setState(1967);
			classElementName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassElementNameContext classElementName() {
			return getRuleContext(ClassElementNameContext.class,0);
		}
		public SetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter; }
	}

	public final SetterContext setter() throws RecognitionException {
		SetterContext _localctx = new SetterContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_setter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1969);
			if (!(this.n("set"))) throw new FailedPredicateException(this, "this.n(\"set\")");
			setState(1970);
			identifier();
			setState(1971);
			classElementName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public IdentifierNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierName; }
	}

	public final IdentifierNameContext identifierName() throws RecognitionException {
		IdentifierNameContext _localctx = new IdentifierNameContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_identifierName);
		try {
			setState(1975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1973);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1974);
				reservedWord();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TypeScriptParser.Identifier, 0); }
		public TerminalNode Async() { return getToken(TypeScriptParser.Async, 0); }
		public TerminalNode As() { return getToken(TypeScriptParser.As, 0); }
		public TerminalNode From() { return getToken(TypeScriptParser.From, 0); }
		public TerminalNode Yield() { return getToken(TypeScriptParser.Yield, 0); }
		public TerminalNode Of() { return getToken(TypeScriptParser.Of, 0); }
		public TerminalNode Any() { return getToken(TypeScriptParser.Any, 0); }
		public TerminalNode Number() { return getToken(TypeScriptParser.Number, 0); }
		public TerminalNode Boolean() { return getToken(TypeScriptParser.Boolean, 0); }
		public TerminalNode String() { return getToken(TypeScriptParser.String, 0); }
		public TerminalNode Unique() { return getToken(TypeScriptParser.Unique, 0); }
		public TerminalNode Symbol() { return getToken(TypeScriptParser.Symbol, 0); }
		public TerminalNode Never() { return getToken(TypeScriptParser.Never, 0); }
		public TerminalNode Undefined() { return getToken(TypeScriptParser.Undefined, 0); }
		public TerminalNode Object() { return getToken(TypeScriptParser.Object, 0); }
		public TerminalNode KeyOf() { return getToken(TypeScriptParser.KeyOf, 0); }
		public TerminalNode TypeAlias() { return getToken(TypeScriptParser.TypeAlias, 0); }
		public TerminalNode Constructor() { return getToken(TypeScriptParser.Constructor, 0); }
		public TerminalNode Namespace() { return getToken(TypeScriptParser.Namespace, 0); }
		public TerminalNode Abstract() { return getToken(TypeScriptParser.Abstract, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1977);
			_la = _input.LA(1);
			if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (As - 97)) | (1L << (From - 97)) | (1L << (Async - 97)) | (1L << (Yield - 97)) | (1L << (Any - 97)) | (1L << (Number - 97)) | (1L << (Never - 97)) | (1L << (Boolean - 97)) | (1L << (String - 97)) | (1L << (Unique - 97)) | (1L << (Symbol - 97)) | (1L << (Undefined - 97)) | (1L << (Object - 97)) | (1L << (Of - 97)) | (1L << (KeyOf - 97)) | (1L << (TypeAlias - 97)) | (1L << (Constructor - 97)) | (1L << (Namespace - 97)) | (1L << (Abstract - 97)) | (1L << (Identifier - 97)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierOrKeyWordContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TypeAlias() { return getToken(TypeScriptParser.TypeAlias, 0); }
		public TerminalNode Require() { return getToken(TypeScriptParser.Require, 0); }
		public IdentifierOrKeyWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierOrKeyWord; }
	}

	public final IdentifierOrKeyWordContext identifierOrKeyWord() throws RecognitionException {
		IdentifierOrKeyWordContext _localctx = new IdentifierOrKeyWordContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_identifierOrKeyWord);
		try {
			setState(1982);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1979);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1980);
				match(TypeAlias);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1981);
				match(Require);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReservedWordContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode NullLiteral() { return getToken(TypeScriptParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(TypeScriptParser.BooleanLiteral, 0); }
		public ReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedWord; }
	}

	public final ReservedWordContext reservedWord() throws RecognitionException {
		ReservedWordContext _localctx = new ReservedWordContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_reservedWord);
		try {
			setState(1987);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case ReadOnly:
			case Async:
			case Await:
			case Yield:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Number:
			case Boolean:
			case String:
			case TypeAlias:
			case Require:
			case Module:
				enterOuterAlt(_localctx, 1);
				{
				setState(1984);
				keyword();
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1985);
				match(NullLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(1986);
				match(BooleanLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(TypeScriptParser.Break, 0); }
		public TerminalNode Do() { return getToken(TypeScriptParser.Do, 0); }
		public TerminalNode Instanceof() { return getToken(TypeScriptParser.Instanceof, 0); }
		public TerminalNode Typeof() { return getToken(TypeScriptParser.Typeof, 0); }
		public TerminalNode Case() { return getToken(TypeScriptParser.Case, 0); }
		public TerminalNode Else() { return getToken(TypeScriptParser.Else, 0); }
		public TerminalNode New() { return getToken(TypeScriptParser.New, 0); }
		public TerminalNode Var() { return getToken(TypeScriptParser.Var, 0); }
		public TerminalNode Catch() { return getToken(TypeScriptParser.Catch, 0); }
		public TerminalNode Finally() { return getToken(TypeScriptParser.Finally, 0); }
		public TerminalNode Return() { return getToken(TypeScriptParser.Return, 0); }
		public TerminalNode Void() { return getToken(TypeScriptParser.Void, 0); }
		public TerminalNode Continue() { return getToken(TypeScriptParser.Continue, 0); }
		public TerminalNode For() { return getToken(TypeScriptParser.For, 0); }
		public TerminalNode Switch() { return getToken(TypeScriptParser.Switch, 0); }
		public TerminalNode While() { return getToken(TypeScriptParser.While, 0); }
		public TerminalNode Debugger() { return getToken(TypeScriptParser.Debugger, 0); }
		public TerminalNode Function_() { return getToken(TypeScriptParser.Function_, 0); }
		public TerminalNode This() { return getToken(TypeScriptParser.This, 0); }
		public TerminalNode With() { return getToken(TypeScriptParser.With, 0); }
		public TerminalNode Default() { return getToken(TypeScriptParser.Default, 0); }
		public TerminalNode If() { return getToken(TypeScriptParser.If, 0); }
		public TerminalNode Throw() { return getToken(TypeScriptParser.Throw, 0); }
		public TerminalNode Delete() { return getToken(TypeScriptParser.Delete, 0); }
		public TerminalNode In() { return getToken(TypeScriptParser.In, 0); }
		public TerminalNode Try() { return getToken(TypeScriptParser.Try, 0); }
		public TerminalNode Class() { return getToken(TypeScriptParser.Class, 0); }
		public TerminalNode Enum() { return getToken(TypeScriptParser.Enum, 0); }
		public TerminalNode Extends() { return getToken(TypeScriptParser.Extends, 0); }
		public TerminalNode Super() { return getToken(TypeScriptParser.Super, 0); }
		public TerminalNode Const() { return getToken(TypeScriptParser.Const, 0); }
		public TerminalNode Export() { return getToken(TypeScriptParser.Export, 0); }
		public TerminalNode Import() { return getToken(TypeScriptParser.Import, 0); }
		public TerminalNode Implements() { return getToken(TypeScriptParser.Implements, 0); }
		public TerminalNode Let() { return getToken(TypeScriptParser.Let, 0); }
		public TerminalNode Private() { return getToken(TypeScriptParser.Private, 0); }
		public TerminalNode Public() { return getToken(TypeScriptParser.Public, 0); }
		public TerminalNode Interface() { return getToken(TypeScriptParser.Interface, 0); }
		public TerminalNode Package() { return getToken(TypeScriptParser.Package, 0); }
		public TerminalNode Protected() { return getToken(TypeScriptParser.Protected, 0); }
		public TerminalNode Static() { return getToken(TypeScriptParser.Static, 0); }
		public TerminalNode Yield() { return getToken(TypeScriptParser.Yield, 0); }
		public TerminalNode Async() { return getToken(TypeScriptParser.Async, 0); }
		public TerminalNode Await() { return getToken(TypeScriptParser.Await, 0); }
		public TerminalNode ReadOnly() { return getToken(TypeScriptParser.ReadOnly, 0); }
		public TerminalNode From() { return getToken(TypeScriptParser.From, 0); }
		public TerminalNode As() { return getToken(TypeScriptParser.As, 0); }
		public TerminalNode Require() { return getToken(TypeScriptParser.Require, 0); }
		public TerminalNode TypeAlias() { return getToken(TypeScriptParser.TypeAlias, 0); }
		public TerminalNode String() { return getToken(TypeScriptParser.String, 0); }
		public TerminalNode Boolean() { return getToken(TypeScriptParser.Boolean, 0); }
		public TerminalNode Number() { return getToken(TypeScriptParser.Number, 0); }
		public TerminalNode Module() { return getToken(TypeScriptParser.Module, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1989);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Break - 71)) | (1L << (Do - 71)) | (1L << (Instanceof - 71)) | (1L << (Typeof - 71)) | (1L << (Case - 71)) | (1L << (Else - 71)) | (1L << (New - 71)) | (1L << (Var - 71)) | (1L << (Catch - 71)) | (1L << (Finally - 71)) | (1L << (Return - 71)) | (1L << (Void - 71)) | (1L << (Continue - 71)) | (1L << (For - 71)) | (1L << (Switch - 71)) | (1L << (While - 71)) | (1L << (Debugger - 71)) | (1L << (Function_ - 71)) | (1L << (This - 71)) | (1L << (With - 71)) | (1L << (Default - 71)) | (1L << (If - 71)) | (1L << (Throw - 71)) | (1L << (Delete - 71)) | (1L << (In - 71)) | (1L << (Try - 71)) | (1L << (As - 71)) | (1L << (From - 71)) | (1L << (ReadOnly - 71)) | (1L << (Async - 71)) | (1L << (Await - 71)) | (1L << (Yield - 71)) | (1L << (Class - 71)) | (1L << (Enum - 71)) | (1L << (Extends - 71)) | (1L << (Super - 71)) | (1L << (Const - 71)) | (1L << (Export - 71)) | (1L << (Import - 71)) | (1L << (Implements - 71)) | (1L << (Let - 71)) | (1L << (Private - 71)) | (1L << (Public - 71)) | (1L << (Interface - 71)) | (1L << (Package - 71)) | (1L << (Protected - 71)) | (1L << (Static - 71)) | (1L << (Number - 71)) | (1L << (Boolean - 71)) | (1L << (String - 71)) | (1L << (TypeAlias - 71)) | (1L << (Require - 71)) | (1L << (Module - 71)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EosContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(TypeScriptParser.SemiColon, 0); }
		public TerminalNode EOF() { return getToken(TypeScriptParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_eos);
		try {
			setState(1995);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1991);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1992);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1993);
				if (!(this.lineTerminatorAhead())) throw new FailedPredicateException(this, "this.lineTerminatorAhead()");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1994);
				if (!(this.closeBrace())) throw new FailedPredicateException(this, "this.closeBrace()");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return unionOrIntersectionOrPrimaryType_sempred((UnionOrIntersectionOrPrimaryTypeContext)_localctx, predIndex);
		case 12:
			return primaryType_sempred((PrimaryTypeContext)_localctx, predIndex);
		case 21:
			return arrayType_sempred((ArrayTypeContext)_localctx, predIndex);
		case 56:
			return decoratorMemberExpression_sempred((DecoratorMemberExpressionContext)_localctx, predIndex);
		case 84:
			return expressionStatement_sempred((ExpressionStatementContext)_localctx, predIndex);
		case 86:
			return iterationStatement_sempred((IterationStatementContext)_localctx, predIndex);
		case 88:
			return continueStatement_sempred((ContinueStatementContext)_localctx, predIndex);
		case 89:
			return breakStatement_sempred((BreakStatementContext)_localctx, predIndex);
		case 90:
			return returnStatement_sempred((ReturnStatementContext)_localctx, predIndex);
		case 91:
			return yieldStatement_sempred((YieldStatementContext)_localctx, predIndex);
		case 99:
			return throwStatement_sempred((ThrowStatementContext)_localctx, predIndex);
		case 114:
			return generatorMethod_sempred((GeneratorMethodContext)_localctx, predIndex);
		case 139:
			return singleExpression_sempred((SingleExpressionContext)_localctx, predIndex);
		case 152:
			return getter_sempred((GetterContext)_localctx, predIndex);
		case 153:
			return setter_sempred((SetterContext)_localctx, predIndex);
		case 159:
			return eos_sempred((EosContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean unionOrIntersectionOrPrimaryType_sempred(UnionOrIntersectionOrPrimaryTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean primaryType_sempred(PrimaryTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return notLineTerminator();
		}
		return true;
	}
	private boolean arrayType_sempred(ArrayTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return notLineTerminator();
		}
		return true;
	}
	private boolean decoratorMemberExpression_sempred(DecoratorMemberExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressionStatement_sempred(ExpressionStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return this.notOpenBraceAndNotFunction();
		}
		return true;
	}
	private boolean iterationStatement_sempred(IterationStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return this.p("of");
		case 8:
			return this.p("of");
		}
		return true;
	}
	private boolean continueStatement_sempred(ContinueStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return this.notLineTerminator();
		}
		return true;
	}
	private boolean breakStatement_sempred(BreakStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return this.notLineTerminator();
		}
		return true;
	}
	private boolean returnStatement_sempred(ReturnStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return this.notLineTerminator();
		}
		return true;
	}
	private boolean yieldStatement_sempred(YieldStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return this.notLineTerminator();
		}
		return true;
	}
	private boolean throwStatement_sempred(ThrowStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return this.notLineTerminator();
		}
		return true;
	}
	private boolean generatorMethod_sempred(GeneratorMethodContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return this.notLineTerminator();
		}
		return true;
	}
	private boolean singleExpression_sempred(SingleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 50);
		case 16:
			return precpred(_ctx, 32);
		case 17:
			return precpred(_ctx, 31);
		case 18:
			return precpred(_ctx, 30);
		case 19:
			return precpred(_ctx, 29);
		case 20:
			return precpred(_ctx, 28);
		case 21:
			return precpred(_ctx, 27);
		case 22:
			return precpred(_ctx, 26);
		case 23:
			return precpred(_ctx, 25);
		case 24:
			return precpred(_ctx, 24);
		case 25:
			return precpred(_ctx, 23);
		case 26:
			return precpred(_ctx, 22);
		case 27:
			return precpred(_ctx, 21);
		case 28:
			return precpred(_ctx, 20);
		case 29:
			return precpred(_ctx, 19);
		case 30:
			return precpred(_ctx, 18);
		case 31:
			return precpred(_ctx, 17);
		case 32:
			return precpred(_ctx, 16);
		case 33:
			return precpred(_ctx, 51);
		case 34:
			return precpred(_ctx, 49);
		case 35:
			return precpred(_ctx, 48);
		case 36:
			return precpred(_ctx, 45);
		case 37:
			return precpred(_ctx, 44);
		case 38:
			return this.notLineTerminator();
		case 39:
			return precpred(_ctx, 43);
		case 40:
			return this.notLineTerminator();
		case 41:
			return precpred(_ctx, 15);
		case 42:
			return precpred(_ctx, 2);
		case 43:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean getter_sempred(GetterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 44:
			return this.n("get");
		}
		return true;
	}
	private boolean setter_sempred(SetterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 45:
			return this.n("set");
		}
		return true;
	}
	private boolean eos_sempred(EosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46:
			return this.lineTerminatorAhead();
		case 47:
			return this.closeBrace();
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0098\u07d0\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\3\2\5\2\u0144\n\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4"+
		"\5\4\u014d\n\4\3\5\3\5\5\5\u0151\n\5\3\5\3\5\3\6\3\6\3\6\7\6\u0158\n\6"+
		"\f\6\16\6\u015b\13\6\3\7\3\7\5\7\u015f\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u0166"+
		"\n\7\3\b\3\b\3\b\3\t\3\t\5\t\u016d\n\t\3\t\3\t\3\n\3\n\3\n\7\n\u0174\n"+
		"\n\f\n\16\n\u0177\13\n\3\13\3\13\3\f\5\f\u017c\n\f\3\f\3\f\3\f\3\f\5\f"+
		"\u0182\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u018d\n\r\f\r\16\r"+
		"\u0190\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u01a6\n\16\3\16\3\16\3\16"+
		"\3\16\5\16\u01ac\n\16\3\16\7\16\u01af\n\16\f\16\16\16\u01b2\13\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u01bd\n\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u01c4\n\17\3\20\3\20\5\20\u01c8\n\20\3\21\3\21\3\21\5"+
		"\21\u01cd\n\21\3\21\3\21\3\22\3\22\5\22\u01d3\n\22\3\23\3\23\5\23\u01d7"+
		"\n\23\3\23\3\23\3\24\3\24\5\24\u01dd\n\24\3\25\3\25\3\25\7\25\u01e2\n"+
		"\25\f\25\16\25\u01e5\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01ee"+
		"\n\26\5\26\u01f0\n\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\7\31\u01fe\n\31\f\31\16\31\u0201\13\31\3\31\5\31\u0204\n\31"+
		"\3\32\5\32\u0207\n\32\3\32\3\32\5\32\u020b\n\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\5\33\u0213\n\33\3\33\3\33\5\33\u0217\n\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\6\35\u0224\n\35\r\35\16\35\u0225\3"+
		"\35\3\35\5\35\u022a\n\35\3\36\5\36\u022d\n\36\3\36\3\36\5\36\u0231\n\36"+
		"\3\36\5\36\u0234\n\36\3\36\3\36\5\36\u0238\n\36\3\37\3\37\3\37\3 \5 \u023e"+
		"\n \3 \3 \5 \u0242\n \3 \3 \5 \u0246\n \3!\3!\3!\3!\7!\u024c\n!\f!\16"+
		"!\u024f\13!\3!\3!\5!\u0253\n!\3!\5!\u0256\n!\5!\u0258\n!\3\"\3\"\3\"\7"+
		"\"\u025d\n\"\f\"\16\"\u0260\13\"\3#\3#\5#\u0264\n#\3$\5$\u0267\n$\3$\5"+
		"$\u026a\n$\3$\3$\3$\5$\u026f\n$\3$\5$\u0272\n$\3$\5$\u0275\n$\3%\3%\3"+
		"%\5%\u027a\n%\3&\5&\u027d\n&\3&\5&\u0280\n&\3&\3&\5&\u0284\n&\3\'\3\'"+
		"\3(\3(\5(\u028a\n(\3)\3)\5)\u028e\n)\3)\3)\5)\u0292\n)\3)\3)\5)\u0296"+
		"\n)\3*\3*\3*\3*\3*\3*\3*\3+\3+\5+\u02a1\n+\3+\3+\3,\5,\u02a6\n,\3,\3,"+
		"\3,\5,\u02ab\n,\3,\3,\3,\3,\3-\5-\u02b2\n-\3-\3-\3-\5-\u02b7\n-\3-\3-"+
		"\3-\3-\3-\3-\5-\u02bf\n-\3.\5.\u02c2\n.\3.\5.\u02c5\n.\3.\3.\3.\5.\u02ca"+
		"\n.\3.\5.\u02cd\n.\3.\3.\5.\u02d1\n.\3/\3/\3/\3\60\3\60\3\60\7\60\u02d9"+
		"\n\60\f\60\16\60\u02dc\13\60\3\61\5\61\u02df\n\61\3\61\3\61\3\61\3\61"+
		"\5\61\u02e5\n\61\3\61\3\61\3\62\3\62\5\62\u02eb\n\62\3\63\3\63\3\63\7"+
		"\63\u02f0\n\63\f\63\16\63\u02f3\13\63\3\64\3\64\3\64\5\64\u02f8\n\64\3"+
		"\65\5\65\u02fb\n\65\3\65\3\65\3\65\3\65\5\65\u0301\n\65\3\65\3\65\3\66"+
		"\3\66\6\66\u0307\n\66\r\66\16\66\u0308\3\66\7\66\u030c\n\66\f\66\16\66"+
		"\u030f\13\66\3\67\3\67\3\67\3\67\3\67\38\68\u0317\n8\r8\168\u0318\39\3"+
		"9\39\59\u031e\n9\3:\3:\3:\3:\3:\3:\5:\u0326\n:\3:\3:\3:\7:\u032b\n:\f"+
		":\16:\u032e\13:\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<"+
		"\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u0351\n<\3=\3=\5=\u0355"+
		"\n=\3=\3=\3>\6>\u035a\n>\r>\16>\u035b\3?\3?\3?\3?\3?\5?\u0363\n?\3?\3"+
		"?\3@\3@\3@\3A\5A\u036b\nA\3A\3A\5A\u036f\nA\3A\3A\3A\3A\3A\5A\u0376\n"+
		"A\3B\3B\3B\3B\7B\u037c\nB\fB\16B\u037f\13B\3B\3B\5B\u0383\nB\5B\u0385"+
		"\nB\3B\3B\3C\3C\3C\5C\u038c\nC\3D\3D\5D\u0390\nD\3E\3E\3F\3F\3F\3G\3G"+
		"\5G\u0399\nG\3G\3G\5G\u039d\nG\3H\3H\3H\3I\3I\3I\5I\u03a5\nI\3J\3J\5J"+
		"\u03a9\nJ\3J\3J\5J\u03ad\nJ\3J\3J\3J\3J\3J\3J\3J\5J\u03b6\nJ\3K\3K\3K"+
		"\3K\3K\3K\5K\u03be\nK\3K\3K\5K\u03c2\nK\3L\3L\3L\3L\7L\u03c8\nL\fL\16"+
		"L\u03cb\13L\3L\3L\5L\u03cf\nL\5L\u03d1\nL\3L\3L\3M\3M\3M\5M\u03d8\nM\3"+
		"N\3N\3N\5N\u03dd\nN\3O\3O\3O\3O\3O\5O\u03e4\nO\3O\3O\3P\6P\u03e9\nP\r"+
		"P\16P\u03ea\3Q\5Q\u03ee\nQ\3Q\3Q\3Q\5Q\u03f3\nQ\3Q\3Q\3Q\5Q\u03f8\nQ\3"+
		"Q\5Q\u03fb\nQ\3R\3R\5R\u03ff\nR\3R\3R\5R\u0403\nR\3R\5R\u0406\nR\3R\5"+
		"R\u0409\nR\3R\5R\u040c\nR\3R\3R\5R\u0410\nR\3R\3R\5R\u0414\nR\3R\3R\5"+
		"R\u0418\nR\5R\u041a\nR\3S\3S\3S\7S\u041f\nS\fS\16S\u0422\13S\3T\5T\u0425"+
		"\nT\3T\3T\5T\u0429\nT\3T\3T\5T\u042d\nT\3T\5T\u0430\nT\3T\5T\u0433\nT"+
		"\3T\3T\5T\u0437\nT\3T\5T\u043a\nT\3U\3U\3V\3V\3V\5V\u0441\nV\3W\3W\3W"+
		"\3W\3W\3W\3W\5W\u044a\nW\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X"+
		"\3X\3X\5X\u045d\nX\3X\3X\5X\u0461\nX\3X\3X\5X\u0465\nX\3X\3X\3X\3X\3X"+
		"\3X\3X\3X\5X\u046f\nX\3X\3X\5X\u0473\nX\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X"+
		"\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u048b\nX\3X\3X\3X\3X\3X\3X\3X"+
		"\5X\u0494\nX\3X\3X\3X\3X\3X\5X\u049b\nX\3X\3X\3X\3X\3X\3X\3X\3X\5X\u04a5"+
		"\nX\3X\3X\3X\5X\u04aa\nX\3Y\3Y\3Z\3Z\3Z\5Z\u04b1\nZ\3Z\3Z\3[\3[\3[\5["+
		"\u04b8\n[\3[\3[\3\\\3\\\3\\\5\\\u04bf\n\\\3\\\3\\\3]\3]\3]\5]\u04c6\n"+
		"]\3]\3]\3^\3^\3^\3^\3^\3^\3_\3_\3_\3_\3_\3_\3`\3`\5`\u04d8\n`\3`\3`\5"+
		"`\u04dc\n`\5`\u04de\n`\3`\3`\3a\6a\u04e3\na\ra\16a\u04e4\3b\3b\3b\3b\5"+
		"b\u04eb\nb\3c\3c\3c\5c\u04f0\nc\3d\3d\3d\3d\3e\3e\3e\3e\3e\3f\3f\3f\3"+
		"f\5f\u04ff\nf\3f\5f\u0502\nf\3g\3g\3g\3g\5g\u0508\ng\3g\3g\5g\u050c\n"+
		"g\3g\3g\3h\3h\3h\3i\3i\3i\3j\5j\u0517\nj\3j\3j\5j\u051b\nj\3j\3j\3j\3"+
		"j\3j\3j\3j\5j\u0524\nj\3k\5k\u0527\nk\3k\3k\5k\u052b\nk\5k\u052d\nk\3"+
		"k\5k\u0530\nk\3k\3k\3k\5k\u0535\nk\3k\3k\3k\3l\5l\u053b\nl\3l\5l\u053e"+
		"\nl\3m\3m\7m\u0542\nm\fm\16m\u0545\13m\3m\3m\3n\3n\3n\3o\3o\3o\3p\3p\5"+
		"p\u0551\np\3p\3p\3p\5p\u0556\np\3q\3q\3q\5q\u055b\nq\3q\5q\u055e\nq\3"+
		"q\5q\u0561\nq\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\5q\u056d\nq\3q\3q\3q\5q\u0572"+
		"\nq\3q\5q\u0575\nq\3r\5r\u0578\nr\3r\5r\u057b\nr\3r\5r\u057e\nr\3r\5r"+
		"\u0581\nr\3s\3s\3s\3t\3t\5t\u0588\nt\3t\5t\u058b\nt\3t\3t\3t\5t\u0590"+
		"\nt\3t\3t\3t\3t\3t\3u\5u\u0598\nu\3u\3u\3u\5u\u059d\nu\3u\3u\5u\u05a1"+
		"\nu\3u\3u\3u\3u\3u\3v\3v\3v\3v\7v\u05ac\nv\fv\16v\u05af\13v\3v\5v\u05b2"+
		"\nv\3v\3v\3w\3w\3w\3x\3x\3x\3x\7x\u05bd\nx\fx\16x\u05c0\13x\3x\5x\u05c3"+
		"\nx\3x\3x\3y\3y\3y\3y\3y\5y\u05cc\ny\3y\3y\3y\3y\3y\3z\3z\5z\u05d5\nz"+
		"\3{\3{\3{\3|\3|\3|\7|\u05dd\n|\f|\16|\u05e0\13|\3|\3|\5|\u05e4\n|\3|\5"+
		"|\u05e7\n|\3|\3|\3|\3|\3|\5|\u05ee\n|\5|\u05f0\n|\3}\5}\u05f3\n}\3}\5"+
		"}\u05f6\n}\3}\3}\5}\u05fa\n}\3}\5}\u05fd\n}\3}\3}\5}\u0601\n}\3~\3~\3"+
		"~\5~\u0606\n~\3\177\5\177\u0609\n\177\3\u0080\6\u0080\u060c\n\u0080\r"+
		"\u0080\16\u0080\u060d\3\u0081\3\u0081\3\u0081\3\u0081\3\u0082\7\u0082"+
		"\u0615\n\u0082\f\u0082\16\u0082\u0618\13\u0082\3\u0082\5\u0082\u061b\n"+
		"\u0082\3\u0082\6\u0082\u061e\n\u0082\r\u0082\16\u0082\u061f\3\u0082\7"+
		"\u0082\u0623\n\u0082\f\u0082\16\u0082\u0626\13\u0082\3\u0082\7\u0082\u0629"+
		"\n\u0082\f\u0082\16\u0082\u062c\13\u0082\3\u0083\5\u0083\u062f\n\u0083"+
		"\3\u0083\3\u0083\5\u0083\u0633\n\u0083\3\u0083\5\u0083\u0636\n\u0083\3"+
		"\u0084\3\u0084\3\u0084\3\u0084\7\u0084\u063c\n\u0084\f\u0084\16\u0084"+
		"\u063f\13\u0084\3\u0084\5\u0084\u0642\n\u0084\5\u0084\u0644\n\u0084\3"+
		"\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085"+
		"\u0657\n\u0085\3\u0085\3\u0085\5\u0085\u065b\n\u0085\3\u0086\3\u0086\3"+
		"\u0086\3\u0086\5\u0086\u0661\n\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3"+
		"\u0087\3\u0087\3\u0087\5\u0087\u066a\n\u0087\3\u0087\3\u0087\3\u0087\3"+
		"\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\5\u0088\u0678\n\u0088\3\u0089\3\u0089\3\u0089\5\u0089\u067d\n\u0089\5"+
		"\u0089\u067f\n\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\7\u008a\u0686"+
		"\n\u008a\f\u008a\16\u008a\u0689\13\u008a\3\u008b\5\u008b\u068c\n\u008b"+
		"\3\u008b\3\u008b\5\u008b\u0690\n\u008b\3\u008c\3\u008c\3\u008c\7\u008c"+
		"\u0695\n\u008c\f\u008c\16\u008c\u0698\13\u008c\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\5\u008d\u069e\n\u008d\3\u008d\5\u008d\u06a1\n\u008d\3\u008d\3"+
		"\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u06a9\n\u008d\3\u008d\3"+
		"\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u06b0\n\u008d\3\u008d\3\u008d\3"+
		"\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u06cd"+
		"\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\5\u008d\u06d9\n\u008d\5\u008d\u06db\n\u008d\3\u008d\3"+
		"\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\5\u008d\u06f3\n\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0720\n\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0728\n\u008d\3\u008d\3\u008d"+
		"\5\u008d\u072c\n\u008d\3\u008d\3\u008d\5\u008d\u0730\n\u008d\3\u008d\3"+
		"\u008d\5\u008d\u0734\n\u008d\3\u008d\3\u008d\5\u008d\u0738\n\u008d\3\u008d"+
		"\3\u008d\5\u008d\u073c\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\7\u008d\u074d\n\u008d\f\u008d\16\u008d\u0750\13\u008d\3\u008e"+
		"\3\u008e\3\u008e\5\u008e\u0755\n\u008e\3\u008e\5\u008e\u0758\n\u008e\3"+
		"\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u075e\n\u008f\3\u0090\3\u0090\5"+
		"\u0090\u0762\n\u0090\3\u0090\3\u0090\5\u0090\u0766\n\u0090\3\u0090\3\u0090"+
		"\5\u0090\u076a\n\u0090\3\u0090\3\u0090\5\u0090\u076e\n\u0090\3\u0090\3"+
		"\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u0775\n\u0090\3\u0091\5\u0091\u0778"+
		"\n\u0091\3\u0091\3\u0091\5\u0091\u077c\n\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0092\3\u0092\3\u0092\5\u0092\u0784\n\u0092\3\u0092\5\u0092\u0787\n"+
		"\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\5\u0093\u078e\n\u0093\3"+
		"\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\5\u0095\u0799\n\u0095\3\u0096\3\u0096\7\u0096\u079d\n\u0096\f\u0096\16"+
		"\u0096\u07a0\13\u0096\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\5\u0097\u07aa\n\u0097\3\u0098\3\u0098\3\u0099\3\u0099"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c"+
		"\3\u009c\5\u009c\u07ba\n\u009c\3\u009d\3\u009d\3\u009e\3\u009e\3\u009e"+
		"\5\u009e\u07c1\n\u009e\3\u009f\3\u009f\3\u009f\5\u009f\u07c6\n\u009f\3"+
		"\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u07ce\n\u00a1\3"+
		"\u00a1\2\6\30\32r\u0118\u00a2\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112"+
		"\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a"+
		"\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\2\23"+
		"\4\2**,,\3\2\r\16\4\2stww\4\2zz}}\4\2gh\u008d\u008d\5\2PPnnrr\3\2hi\4"+
		"\2\17\17\22\22\3\2\33\35\3\2\27\30\3\2\"%\3\2&)\3\2/<\3\2@D\3\2EH\b\2"+
		"cdffhhy\u0086\u008a\u008a\u008d\u008d\b\2Ihjxzz|}\u0084\u0084\u0087\u0088"+
		"\2\u08c3\2\u0143\3\2\2\2\4\u0147\3\2\2\2\6\u014c\3\2\2\2\b\u014e\3\2\2"+
		"\2\n\u0154\3\2\2\2\f\u0165\3\2\2\2\16\u0167\3\2\2\2\20\u016a\3\2\2\2\22"+
		"\u0170\3\2\2\2\24\u0178\3\2\2\2\26\u0181\3\2\2\2\30\u0183\3\2\2\2\32\u01a5"+
		"\3\2\2\2\34\u01c3\3\2\2\2\36\u01c5\3\2\2\2 \u01c9\3\2\2\2\"\u01d2\3\2"+
		"\2\2$\u01d4\3\2\2\2&\u01da\3\2\2\2(\u01de\3\2\2\2*\u01ef\3\2\2\2,\u01f1"+
		"\3\2\2\2.\u01f6\3\2\2\2\60\u01fa\3\2\2\2\62\u0206\3\2\2\2\64\u0210\3\2"+
		"\2\2\66\u021c\3\2\2\28\u0229\3\2\2\2:\u022c\3\2\2\2<\u0239\3\2\2\2>\u023d"+
		"\3\2\2\2@\u0257\3\2\2\2B\u0259\3\2\2\2D\u0263\3\2\2\2F\u0266\3\2\2\2H"+
		"\u0276\3\2\2\2J\u027c\3\2\2\2L\u0285\3\2\2\2N\u0289\3\2\2\2P\u028b\3\2"+
		"\2\2R\u0297\3\2\2\2T\u029e\3\2\2\2V\u02a5\3\2\2\2X\u02b1\3\2\2\2Z\u02c1"+
		"\3\2\2\2\\\u02d2\3\2\2\2^\u02d5\3\2\2\2`\u02de\3\2\2\2b\u02e8\3\2\2\2"+
		"d\u02ec\3\2\2\2f\u02f4\3\2\2\2h\u02fa\3\2\2\2j\u0304\3\2\2\2l\u0310\3"+
		"\2\2\2n\u0316\3\2\2\2p\u031a\3\2\2\2r\u0325\3\2\2\2t\u032f\3\2\2\2v\u0350"+
		"\3\2\2\2x\u0352\3\2\2\2z\u0359\3\2\2\2|\u035d\3\2\2\2~\u0366\3\2\2\2\u0080"+
		"\u0375\3\2\2\2\u0082\u0377\3\2\2\2\u0084\u0388\3\2\2\2\u0086\u038f\3\2"+
		"\2\2\u0088\u0391\3\2\2\2\u008a\u0393\3\2\2\2\u008c\u0398\3\2\2\2\u008e"+
		"\u039e\3\2\2\2\u0090\u03a1\3\2\2\2\u0092\u03b5\3\2\2\2\u0094\u03c1\3\2"+
		"\2\2\u0096\u03c3\3\2\2\2\u0098\u03d4\3\2\2\2\u009a\u03dc\3\2\2\2\u009c"+
		"\u03de\3\2\2\2\u009e\u03e8\3\2\2\2\u00a0\u03fa\3\2\2\2\u00a2\u0419\3\2"+
		"\2\2\u00a4\u041b\3\2\2\2\u00a6\u0424\3\2\2\2\u00a8\u043b\3\2\2\2\u00aa"+
		"\u043d\3\2\2\2\u00ac\u0442\3\2\2\2\u00ae\u04a9\3\2\2\2\u00b0\u04ab\3\2"+
		"\2\2\u00b2\u04ad\3\2\2\2\u00b4\u04b4\3\2\2\2\u00b6\u04bb\3\2\2\2\u00b8"+
		"\u04c2\3\2\2\2\u00ba\u04c9\3\2\2\2\u00bc\u04cf\3\2\2\2\u00be\u04d5\3\2"+
		"\2\2\u00c0\u04e2\3\2\2\2\u00c2\u04e6\3\2\2\2\u00c4\u04ec\3\2\2\2\u00c6"+
		"\u04f1\3\2\2\2\u00c8\u04f5\3\2\2\2\u00ca\u04fa\3\2\2\2\u00cc\u0503\3\2"+
		"\2\2\u00ce\u050f\3\2\2\2\u00d0\u0512\3\2\2\2\u00d2\u0516\3\2\2\2\u00d4"+
		"\u0526\3\2\2\2\u00d6\u053a\3\2\2\2\u00d8\u053f\3\2\2\2\u00da\u0548\3\2"+
		"\2\2\u00dc\u054b\3\2\2\2\u00de\u0555\3\2\2\2\u00e0\u0574\3\2\2\2\u00e2"+
		"\u0577\3\2\2\2\u00e4\u0582\3\2\2\2\u00e6\u0587\3\2\2\2\u00e8\u0597\3\2"+
		"\2\2\u00ea\u05a7\3\2\2\2\u00ec\u05b5\3\2\2\2\u00ee\u05b8\3\2\2\2\u00f0"+
		"\u05c6\3\2\2\2\u00f2\u05d4\3\2\2\2\u00f4\u05d6\3\2\2\2\u00f6\u05ef\3\2"+
		"\2\2\u00f8\u05f2\3\2\2\2\u00fa\u0602\3\2\2\2\u00fc\u0608\3\2\2\2\u00fe"+
		"\u060b\3\2\2\2\u0100\u060f\3\2\2\2\u0102\u0616\3\2\2\2\u0104\u062e\3\2"+
		"\2\2\u0106\u0637\3\2\2\2\u0108\u065a\3\2\2\2\u010a\u065c\3\2\2\2\u010c"+
		"\u0666\3\2\2\2\u010e\u0677\3\2\2\2\u0110\u0679\3\2\2\2\u0112\u0682\3\2"+
		"\2\2\u0114\u068b\3\2\2\2\u0116\u0691\3\2\2\2\u0118\u06da\3\2\2\2\u011a"+
		"\u0757\3\2\2\2\u011c\u075d\3\2\2\2\u011e\u0774\3\2\2\2\u0120\u0777\3\2"+
		"\2\2\u0122\u0786\3\2\2\2\u0124\u078d\3\2\2\2\u0126\u078f\3\2\2\2\u0128"+
		"\u0798\3\2\2\2\u012a\u079a\3\2\2\2\u012c\u07a9\3\2\2\2\u012e\u07ab\3\2"+
		"\2\2\u0130\u07ad\3\2\2\2\u0132\u07af\3\2\2\2\u0134\u07b3\3\2\2\2\u0136"+
		"\u07b9\3\2\2\2\u0138\u07bb\3\2\2\2\u013a\u07c0\3\2\2\2\u013c\u07c5\3\2"+
		"\2\2\u013e\u07c7\3\2\2\2\u0140\u07cd\3\2\2\2\u0142\u0144\5\u00fe\u0080"+
		"\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146"+
		"\7\2\2\3\u0146\3\3\2\2\2\u0147\u0148\7\17\2\2\u0148\u0149\5\u0118\u008d"+
		"\2\u0149\5\3\2\2\2\u014a\u014d\5\u0100\u0081\2\u014b\u014d\5\u0106\u0084"+
		"\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d\7\3\2\2\2\u014e\u0150"+
		"\7\"\2\2\u014f\u0151\5\n\6\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0153\7#\2\2\u0153\t\3\2\2\2\u0154\u0159\5\f\7\2"+
		"\u0155\u0156\7\16\2\2\u0156\u0158\5\f\7\2\u0157\u0155\3\2\2\2\u0158\u015b"+
		"\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\13\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015c\u015e\5\u0138\u009d\2\u015d\u015f\5\16\b\2\u015e"+
		"\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0166\3\2\2\2\u0160\u0161\5\u0138"+
		"\u009d\2\u0161\u0162\7\17\2\2\u0162\u0163\5\24\13\2\u0163\u0166\3\2\2"+
		"\2\u0164\u0166\5\b\5\2\u0165\u015c\3\2\2\2\u0165\u0160\3\2\2\2\u0165\u0164"+
		"\3\2\2\2\u0166\r\3\2\2\2\u0167\u0168\7l\2\2\u0168\u0169\5\26\f\2\u0169"+
		"\17\3\2\2\2\u016a\u016c\7\"\2\2\u016b\u016d\5\22\n\2\u016c\u016b\3\2\2"+
		"\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\7#\2\2\u016f\21"+
		"\3\2\2\2\u0170\u0175\5\24\13\2\u0171\u0172\7\16\2\2\u0172\u0174\5\24\13"+
		"\2\u0173\u0171\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176"+
		"\3\2\2\2\u0176\23\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179\5\26\f\2\u0179"+
		"\25\3\2\2\2\u017a\u017c\t\2\2\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2"+
		"\2\u017c\u017d\3\2\2\2\u017d\u0182\5\30\r\2\u017e\u0182\5\62\32\2\u017f"+
		"\u0182\5\64\33\2\u0180\u0182\5 \21\2\u0181\u017b\3\2\2\2\u0181\u017e\3"+
		"\2\2\2\u0181\u017f\3\2\2\2\u0181\u0180\3\2\2\2\u0182\27\3\2\2\2\u0183"+
		"\u0184\b\r\1\2\u0184\u0185\5\32\16\2\u0185\u018e\3\2\2\2\u0186\u0187\f"+
		"\5\2\2\u0187\u0188\7,\2\2\u0188\u018d\5\30\r\6\u0189\u018a\f\4\2\2\u018a"+
		"\u018b\7*\2\2\u018b\u018d\5\30\r\5\u018c\u0186\3\2\2\2\u018c\u0189\3\2"+
		"\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\31\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0192\b\16\1\2\u0192\u0193\7\b\2"+
		"\2\u0193\u0194\5\26\f\2\u0194\u0195\7\t\2\2\u0195\u01a6\3\2\2\2\u0196"+
		"\u01a6\5\34\17\2\u0197\u01a6\5\36\20\2\u0198\u01a6\5$\23\2\u0199\u019a"+
		"\7\6\2\2\u019a\u019b\5\60\31\2\u019b\u019c\7\7\2\2\u019c\u01a6\3\2\2\2"+
		"\u019d\u01a6\5\66\34\2\u019e\u01a6\7[\2\2\u019f\u01a0\5\36\20\2\u01a0"+
		"\u01a1\7\u008b\2\2\u01a1\u01a2\5\32\16\4\u01a2\u01a6\3\2\2\2\u01a3\u01a4"+
		"\7\u0083\2\2\u01a4\u01a6\5\32\16\3\u01a5\u0191\3\2\2\2\u01a5\u0196\3\2"+
		"\2\2\u01a5\u0197\3\2\2\2\u01a5\u0198\3\2\2\2\u01a5\u0199\3\2\2\2\u01a5"+
		"\u019d\3\2\2\2\u01a5\u019e\3\2\2\2\u01a5\u019f\3\2\2\2\u01a5\u01a3\3\2"+
		"\2\2\u01a6\u01b0\3\2\2\2\u01a7\u01a8\f\b\2\2\u01a8\u01a9\6\16\5\2\u01a9"+
		"\u01ab\7\6\2\2\u01aa\u01ac\5\32\16\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3"+
		"\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\7\7\2\2\u01ae\u01a7\3\2\2\2\u01af"+
		"\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\33\3\2\2"+
		"\2\u01b2\u01b0\3\2\2\2\u01b3\u01c4\7y\2\2\u01b4\u01c4\7>\2\2\u01b5\u01c4"+
		"\7z\2\2\u01b6\u01c4\7@\2\2\u01b7\u01c4\7|\2\2\u01b8\u01c4\7?\2\2\u01b9"+
		"\u01c4\7}\2\2\u01ba\u01c4\7\u008e\2\2\u01bb\u01bd\7~\2\2\u01bc\u01bb\3"+
		"\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c4\7\177\2\2\u01bf"+
		"\u01c4\7{\2\2\u01c0\u01c4\7\u0080\2\2\u01c1\u01c4\7\u0081\2\2\u01c2\u01c4"+
		"\7T\2\2\u01c3\u01b3\3\2\2\2\u01c3\u01b4\3\2\2\2\u01c3\u01b5\3\2\2\2\u01c3"+
		"\u01b6\3\2\2\2\u01c3\u01b7\3\2\2\2\u01c3\u01b8\3\2\2\2\u01c3\u01b9\3\2"+
		"\2\2\u01c3\u01ba\3\2\2\2\u01c3\u01bc\3\2\2\2\u01c3\u01bf\3\2\2\2\u01c3"+
		"\u01c0\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4\35\3\2\2"+
		"\2\u01c5\u01c7\5\"\22\2\u01c6\u01c8\5 \21\2\u01c7\u01c6\3\2\2\2\u01c7"+
		"\u01c8\3\2\2\2\u01c8\37\3\2\2\2\u01c9\u01ca\7\"\2\2\u01ca\u01cc\5\22\n"+
		"\2\u01cb\u01cd\5 \21\2\u01cc\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce"+
		"\3\2\2\2\u01ce\u01cf\7#\2\2\u01cf!\3\2\2\2\u01d0\u01d3\5\u0138\u009d\2"+
		"\u01d1\u01d3\5j\66\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3#\3"+
		"\2\2\2\u01d4\u01d6\7\n\2\2\u01d5\u01d7\5&\24\2\u01d6\u01d5\3\2\2\2\u01d6"+
		"\u01d7\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\7\f\2\2\u01d9%\3\2\2\2"+
		"\u01da\u01dc\5(\25\2\u01db\u01dd\t\3\2\2\u01dc\u01db\3\2\2\2\u01dc\u01dd"+
		"\3\2\2\2\u01dd\'\3\2\2\2\u01de\u01e3\5*\26\2\u01df\u01e0\t\3\2\2\u01e0"+
		"\u01e2\5*\26\2\u01e1\u01df\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2"+
		"\2\2\u01e3\u01e4\3\2\2\2\u01e4)\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01f0"+
		"\5:\36\2\u01e7\u01f0\5> \2\u01e8\u01f0\5P)\2\u01e9\u01f0\5R*\2\u01ea\u01ed"+
		"\5T+\2\u01eb\u01ec\7=\2\2\u01ec\u01ee\5\26\f\2\u01ed\u01eb\3\2\2\2\u01ed"+
		"\u01ee\3\2\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01e6\3\2\2\2\u01ef\u01e7\3\2"+
		"\2\2\u01ef\u01e8\3\2\2\2\u01ef\u01e9\3\2\2\2\u01ef\u01ea\3\2\2\2\u01f0"+
		"+\3\2\2\2\u01f1\u01f2\5\32\16\2\u01f2\u01f3\6\27\6\2\u01f3\u01f4\7\6\2"+
		"\2\u01f4\u01f5\7\7\2\2\u01f5-\3\2\2\2\u01f6\u01f7\7\6\2\2\u01f7\u01f8"+
		"\5\60\31\2\u01f8\u01f9\7\7\2\2\u01f9/\3\2\2\2\u01fa\u01ff\5\26\f\2\u01fb"+
		"\u01fc\7\16\2\2\u01fc\u01fe\5\26\f\2\u01fd\u01fb\3\2\2\2\u01fe\u0201\3"+
		"\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0203\3\2\2\2\u0201"+
		"\u01ff\3\2\2\2\u0202\u0204\7\16\2\2\u0203\u0202\3\2\2\2\u0203\u0204\3"+
		"\2\2\2\u0204\61\3\2\2\2\u0205\u0207\5\b\5\2\u0206\u0205\3\2\2\2\u0206"+
		"\u0207\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a\7\b\2\2\u0209\u020b\5@"+
		"!\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u020d\7\t\2\2\u020d\u020e\7=\2\2\u020e\u020f\5\26\f\2\u020f\63\3\2\2"+
		"\2\u0210\u0212\7O\2\2\u0211\u0213\5\b\5\2\u0212\u0211\3\2\2\2\u0212\u0213"+
		"\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0216\7\b\2\2\u0215\u0217\5@!\2\u0216"+
		"\u0215\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\7\t"+
		"\2\2\u0219\u021a\7=\2\2\u021a\u021b\5\26\f\2\u021b\65\3\2\2\2\u021c\u021d"+
		"\7L\2\2\u021d\u021e\58\35\2\u021e\67\3\2\2\2\u021f\u022a\5\u0138\u009d"+
		"\2\u0220\u0221\5\u0136\u009c\2\u0221\u0222\7\24\2\2\u0222\u0224\3\2\2"+
		"\2\u0223\u0220\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226"+
		"\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\5\u0136\u009c\2\u0228\u022a\3"+
		"\2\2\2\u0229\u021f\3\2\2\2\u0229\u0223\3\2\2\2\u022a9\3\2\2\2\u022b\u022d"+
		"\7e\2\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e"+
		"\u0230\5\u010e\u0088\2\u022f\u0231\7\20\2\2\u0230\u022f\3\2\2\2\u0230"+
		"\u0231\3\2\2\2\u0231\u0233\3\2\2\2\u0232\u0234\5<\37\2\u0233\u0232\3\2"+
		"\2\2\u0233\u0234\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0236\7=\2\2\u0236"+
		"\u0238\5\26\f\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238;\3\2\2\2"+
		"\u0239\u023a\7\22\2\2\u023a\u023b\5\26\f\2\u023b=\3\2\2\2\u023c\u023e"+
		"\5\b\5\2\u023d\u023c\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\3\2\2\2\u023f"+
		"\u0241\7\b\2\2\u0240\u0242\5@!\2\u0241\u0240\3\2\2\2\u0241\u0242\3\2\2"+
		"\2\u0242\u0243\3\2\2\2\u0243\u0245\7\t\2\2\u0244\u0246\5<\37\2\u0245\u0244"+
		"\3\2\2\2\u0245\u0246\3\2\2\2\u0246?\3\2\2\2\u0247\u0258\5H%\2\u0248\u024d"+
		"\5D#\2\u0249\u024a\7\16\2\2\u024a\u024c\5D#\2\u024b\u0249\3\2\2\2\u024c"+
		"\u024f\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0252\3\2"+
		"\2\2\u024f\u024d\3\2\2\2\u0250\u0251\7\16\2\2\u0251\u0253\5H%\2\u0252"+
		"\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0255\3\2\2\2\u0254\u0256\7\16"+
		"\2\2\u0255\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0258\3\2\2\2\u0257"+
		"\u0247\3\2\2\2\u0257\u0248\3\2\2\2\u0258A\3\2\2\2\u0259\u025e\5J&\2\u025a"+
		"\u025b\7\16\2\2\u025b\u025d\5J&\2\u025c\u025a\3\2\2\2\u025d\u0260\3\2"+
		"\2\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025fC\3\2\2\2\u0260\u025e"+
		"\3\2\2\2\u0261\u0264\5J&\2\u0262\u0264\5F$\2\u0263\u0261\3\2\2\2\u0263"+
		"\u0262\3\2\2\2\u0264E\3\2\2\2\u0265\u0267\5n8\2\u0266\u0265\3\2\2\2\u0266"+
		"\u0267\3\2\2\2\u0267\u0269\3\2\2\2\u0268\u026a\5L\'\2\u0269\u0268\3\2"+
		"\2\2\u0269\u026a\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u0274\5N(\2\u026c\u026e"+
		"\7\20\2\2\u026d\u026f\5<\37\2\u026e\u026d\3\2\2\2\u026e\u026f\3\2\2\2"+
		"\u026f\u0275\3\2\2\2\u0270\u0272\5<\37\2\u0271\u0270\3\2\2\2\u0271\u0272"+
		"\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0275\5\4\3\2\u0274\u026c\3\2\2\2\u0274"+
		"\u0271\3\2\2\2\u0275G\3\2\2\2\u0276\u0277\7\23\2\2\u0277\u0279\5\u0118"+
		"\u008d\2\u0278\u027a\5<\37\2\u0279\u0278\3\2\2\2\u0279\u027a\3\2\2\2\u027a"+
		"I\3\2\2\2\u027b\u027d\5n8\2\u027c\u027b\3\2\2\2\u027c\u027d\3\2\2\2\u027d"+
		"\u027f\3\2\2\2\u027e\u0280\5L\'\2\u027f\u027e\3\2\2\2\u027f\u0280\3\2"+
		"\2\2\u0280\u0281\3\2\2\2\u0281\u0283\5N(\2\u0282\u0284\5<\37\2\u0283\u0282"+
		"\3\2\2\2\u0283\u0284\3\2\2\2\u0284K\3\2\2\2\u0285\u0286\t\4\2\2\u0286"+
		"M\3\2\2\2\u0287\u028a\5\u0136\u009c\2\u0288\u028a\5\6\4\2\u0289\u0287"+
		"\3\2\2\2\u0289\u0288\3\2\2\2\u028aO\3\2\2\2\u028b\u028d\7O\2\2\u028c\u028e"+
		"\5\b\5\2\u028d\u028c\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\3\2\2\2\u028f"+
		"\u0291\7\b\2\2\u0290\u0292\5@!\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2"+
		"\2\u0292\u0293\3\2\2\2\u0293\u0295\7\t\2\2\u0294\u0296\5<\37\2\u0295\u0294"+
		"\3\2\2\2\u0295\u0296\3\2\2\2\u0296Q\3\2\2\2\u0297\u0298\7\6\2\2\u0298"+
		"\u0299\5\u0138\u009d\2\u0299\u029a\7\22\2\2\u029a\u029b\t\5\2\2\u029b"+
		"\u029c\7\7\2\2\u029c\u029d\5<\37\2\u029dS\3\2\2\2\u029e\u02a0\5\u010e"+
		"\u0088\2\u029f\u02a1\7\20\2\2\u02a0\u029f\3\2\2\2\u02a0\u02a1\3\2\2\2"+
		"\u02a1\u02a2\3\2\2\2\u02a2\u02a3\5> \2\u02a3U\3\2\2\2\u02a4\u02a6\7o\2"+
		"\2\u02a5\u02a4\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a8"+
		"\7\u0084\2\2\u02a8\u02aa\5\u0138\u009d\2\u02a9\u02ab\5\b\5\2\u02aa\u02a9"+
		"\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ad\7\17\2\2"+
		"\u02ad\u02ae\5\26\f\2\u02ae\u02af\5\u0140\u00a1\2\u02afW\3\2\2\2\u02b0"+
		"\u02b2\5L\'\2\u02b1\u02b0\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\3\2"+
		"\2\2\u02b3\u02b4\7\u0085\2\2\u02b4\u02b6\7\b\2\2\u02b5\u02b7\5\u00f6|"+
		"\2\u02b6\u02b5\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02be"+
		"\7\t\2\2\u02b9\u02ba\7\n\2\2\u02ba\u02bb\5\u00fc\177\2\u02bb\u02bc\7\f"+
		"\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02bf\7\r\2\2\u02be\u02b9\3\2\2\2\u02be"+
		"\u02bd\3\2\2\2\u02be\u02bf\3\2\2\2\u02bfY\3\2\2\2\u02c0\u02c2\7o\2\2\u02c1"+
		"\u02c0\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c4\3\2\2\2\u02c3\u02c5\7\u0089"+
		"\2\2\u02c4\u02c3\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6"+
		"\u02c7\7u\2\2\u02c7\u02c9\5\u0138\u009d\2\u02c8\u02ca\5\b\5\2\u02c9\u02c8"+
		"\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cc\3\2\2\2\u02cb\u02cd\5\\/\2\u02cc"+
		"\u02cb\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02d0\5$"+
		"\23\2\u02cf\u02d1\7\r\2\2\u02d0\u02cf\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1"+
		"[\3\2\2\2\u02d2\u02d3\7l\2\2\u02d3\u02d4\5^\60\2\u02d4]\3\2\2\2\u02d5"+
		"\u02da\5\36\20\2\u02d6\u02d7\7\16\2\2\u02d7\u02d9\5\36\20\2\u02d8\u02d6"+
		"\3\2\2\2\u02d9\u02dc\3\2\2\2\u02da\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02db"+
		"_\3\2\2\2\u02dc\u02da\3\2\2\2\u02dd\u02df\7n\2\2\u02de\u02dd\3\2\2\2\u02de"+
		"\u02df\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\7k\2\2\u02e1\u02e2\5\u0138"+
		"\u009d\2\u02e2\u02e4\7\n\2\2\u02e3\u02e5\5b\62\2\u02e4\u02e3\3\2\2\2\u02e4"+
		"\u02e5\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7\7\f\2\2\u02e7a\3\2\2\2"+
		"\u02e8\u02ea\5d\63\2\u02e9\u02eb\7\16\2\2\u02ea\u02e9\3\2\2\2\u02ea\u02eb"+
		"\3\2\2\2\u02ebc\3\2\2\2\u02ec\u02f1\5f\64\2\u02ed\u02ee\7\16\2\2\u02ee"+
		"\u02f0\5f\64\2\u02ef\u02ed\3\2\2\2\u02f0\u02f3\3\2\2\2\u02f1\u02ef\3\2"+
		"\2\2\u02f1\u02f2\3\2\2\2\u02f2e\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f4\u02f7"+
		"\5\u010e\u0088\2\u02f5\u02f6\7\17\2\2\u02f6\u02f8\5\u0118\u008d\2\u02f7"+
		"\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8g\3\2\2\2\u02f9\u02fb\7\u0089"+
		"\2\2\u02fa\u02f9\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc"+
		"\u02fd\7\u0086\2\2\u02fd\u02fe\5j\66\2\u02fe\u0300\7\n\2\2\u02ff\u0301"+
		"\5z>\2\u0300\u02ff\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0302\3\2\2\2\u0302"+
		"\u0303\7\f\2\2\u0303i\3\2\2\2\u0304\u030d\5\u0138\u009d\2\u0305\u0307"+
		"\7\24\2\2\u0306\u0305\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u0306\3\2\2\2"+
		"\u0308\u0309\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030c\5\u0138\u009d\2\u030b"+
		"\u0306\3\2\2\2\u030c\u030f\3\2\2\2\u030d\u030b\3\2\2\2\u030d\u030e\3\2"+
		"\2\2\u030ek\3\2\2\2\u030f\u030d\3\2\2\2\u0310\u0311\5\u0138\u009d\2\u0311"+
		"\u0312\7\17\2\2\u0312\u0313\5j\66\2\u0313\u0314\7\r\2\2\u0314m\3\2\2\2"+
		"\u0315\u0317\5p9\2\u0316\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u0316"+
		"\3\2\2\2\u0318\u0319\3\2\2\2\u0319o\3\2\2\2\u031a\u031d\7\u008c\2\2\u031b"+
		"\u031e\5r:\2\u031c\u031e\5t;\2\u031d\u031b\3\2\2\2\u031d\u031c\3\2\2\2"+
		"\u031eq\3\2\2\2\u031f\u0320\b:\1\2\u0320\u0326\5\u0138\u009d\2\u0321\u0322"+
		"\7\b\2\2\u0322\u0323\5\u0118\u008d\2\u0323\u0324\7\t\2\2\u0324\u0326\3"+
		"\2\2\2\u0325\u031f\3\2\2\2\u0325\u0321\3\2\2\2\u0326\u032c\3\2\2\2\u0327"+
		"\u0328\f\4\2\2\u0328\u0329\7\24\2\2\u0329\u032b\5\u0136\u009c\2\u032a"+
		"\u0327\3\2\2\2\u032b\u032e\3\2\2\2\u032c\u032a\3\2\2\2\u032c\u032d\3\2"+
		"\2\2\u032ds\3\2\2\2\u032e\u032c\3\2\2\2\u032f\u0330\5r:\2\u0330\u0331"+
		"\5\u0110\u0089\2\u0331u\3\2\2\2\u0332\u0351\5x=\2\u0333\u0351\5\u00a2"+
		"R\2\u0334\u0351\5~@\2\u0335\u0351\5\u00a8U\2\u0336\u0351\5|?\2\u0337\u0351"+
		"\5\u00d4k\2\u0338\u0351\5\u00d2j\2\u0339\u0351\5\u00aaV\2\u033a\u0351"+
		"\5Z.\2\u033b\u0351\5h\65\2\u033c\u0351\5\u0092J\2\u033d\u0351\5\u00ac"+
		"W\2\u033e\u0351\5\u00aeX\2\u033f\u0351\5\u00b2Z\2\u0340\u0351\5\u00b4"+
		"[\2\u0341\u0351\5\u00b6\\\2\u0342\u0351\5\u00b8]\2\u0343\u0351\5\u00ba"+
		"^\2\u0344\u0351\5\u00c6d\2\u0345\u0351\5\u00bc_\2\u0346\u0351\5\u00c8"+
		"e\2\u0347\u0351\5\u00caf\2\u0348\u0351\5\u00d0i\2\u0349\u0351\5\u0120"+
		"\u0091\2\u034a\u0351\5\u00e8u\2\u034b\u0351\5V,\2\u034c\u0351\5`\61\2"+
		"\u034d\u0351\5\u009cO\2\u034e\u034f\7o\2\2\u034f\u0351\5v<\2\u0350\u0332"+
		"\3\2\2\2\u0350\u0333\3\2\2\2\u0350\u0334\3\2\2\2\u0350\u0335\3\2\2\2\u0350"+
		"\u0336\3\2\2\2\u0350\u0337\3\2\2\2\u0350\u0338\3\2\2\2\u0350\u0339\3\2"+
		"\2\2\u0350\u033a\3\2\2\2\u0350\u033b\3\2\2\2\u0350\u033c\3\2\2\2\u0350"+
		"\u033d\3\2\2\2\u0350\u033e\3\2\2\2\u0350\u033f\3\2\2\2\u0350\u0340\3\2"+
		"\2\2\u0350\u0341\3\2\2\2\u0350\u0342\3\2\2\2\u0350\u0343\3\2\2\2\u0350"+
		"\u0344\3\2\2\2\u0350\u0345\3\2\2\2\u0350\u0346\3\2\2\2\u0350\u0347\3\2"+
		"\2\2\u0350\u0348\3\2\2\2\u0350\u0349\3\2\2\2\u0350\u034a\3\2\2\2\u0350"+
		"\u034b\3\2\2\2\u0350\u034c\3\2\2\2\u0350\u034d\3\2\2\2\u0350\u034e\3\2"+
		"\2\2\u0351w\3\2\2\2\u0352\u0354\7\n\2\2\u0353\u0355\5z>\2\u0354\u0353"+
		"\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0357\7\f\2\2\u0357"+
		"y\3\2\2\2\u0358\u035a\5v<\2\u0359\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035b"+
		"\u0359\3\2\2\2\u035b\u035c\3\2\2\2\u035c{\3\2\2\2\u035d\u0362\7\u008a"+
		"\2\2\u035e\u035f\5\u0138\u009d\2\u035f\u0360\5> \2\u0360\u0363\3\2\2\2"+
		"\u0361\u0363\5\u00a2R\2\u0362\u035e\3\2\2\2\u0362\u0361\3\2\2\2\u0363"+
		"\u0364\3\2\2\2\u0364\u0365\5\u0140\u00a1\2\u0365}\3\2\2\2\u0366\u0367"+
		"\7p\2\2\u0367\u0368\5\u0080A\2\u0368\177\3\2\2\2\u0369\u036b\5\u008aF"+
		"\2\u036a\u0369\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036e\3\2\2\2\u036c\u036f"+
		"\5\u008cG\2\u036d\u036f\5\u0082B\2\u036e\u036c\3\2\2\2\u036e\u036d\3\2"+
		"\2\2\u036f\u0370\3\2\2\2\u0370\u0371\5\u008eH\2\u0371\u0372\5\u0140\u00a1"+
		"\2\u0372\u0376\3\2\2\2\u0373\u0374\7\u008e\2\2\u0374\u0376\5\u0140\u00a1"+
		"\2\u0375\u036a\3\2\2\2\u0375\u0373\3\2\2\2\u0376\u0081\3\2\2\2\u0377\u037d"+
		"\7\n\2\2\u0378\u0379\5\u0084C\2\u0379\u037a\7\16\2\2\u037a\u037c\3\2\2"+
		"\2\u037b\u0378\3\2\2\2\u037c\u037f\3\2\2\2\u037d\u037b\3\2\2\2\u037d\u037e"+
		"\3\2\2\2\u037e\u0384\3\2\2\2\u037f\u037d\3\2\2\2\u0380\u0382\5\u0084C"+
		"\2\u0381\u0383\7\16\2\2\u0382\u0381\3\2\2\2\u0382\u0383\3\2\2\2\u0383"+
		"\u0385\3\2\2\2\u0384\u0380\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0386\3\2"+
		"\2\2\u0386\u0387\7\f\2\2\u0387\u0083\3\2\2\2\u0388\u038b\5\u0086D\2\u0389"+
		"\u038a\7c\2\2\u038a\u038c\5\u0088E\2\u038b\u0389\3\2\2\2\u038b\u038c\3"+
		"\2\2\2\u038c\u0085\3\2\2\2\u038d\u0390\5\u0136\u009c\2\u038e\u0390\7\u008e"+
		"\2\2\u038f\u038d\3\2\2\2\u038f\u038e\3\2\2\2\u0390\u0087\3\2\2\2\u0391"+
		"\u0392\t\6\2\2\u0392\u0089\3\2\2\2\u0393\u0394\5\u0090I\2\u0394\u0395"+
		"\7\16\2\2\u0395\u008b\3\2\2\2\u0396\u0399\7\33\2\2\u0397\u0399\5\u0136"+
		"\u009c\2\u0398\u0396\3\2\2\2\u0398\u0397\3\2\2\2\u0399\u039c\3\2\2\2\u039a"+
		"\u039b\7c\2\2\u039b\u039d\5\u0136\u009c\2\u039c\u039a\3\2\2\2\u039c\u039d"+
		"\3\2\2\2\u039d\u008d\3\2\2\2\u039e\u039f\7d\2\2\u039f\u03a0\7\u008e\2"+
		"\2\u03a0\u008f\3\2\2\2\u03a1\u03a4\5\u0136\u009c\2\u03a2\u03a3\7c\2\2"+
		"\u03a3\u03a5\5\u0136\u009c\2\u03a4\u03a2\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5"+
		"\u0091\3\2\2\2\u03a6\u03a8\7o\2\2\u03a7\u03a9\7]\2\2\u03a8\u03a7\3\2\2"+
		"\2\u03a8\u03a9\3\2\2\2\u03a9\u03ac\3\2\2\2\u03aa\u03ad\5\u0094K\2\u03ab"+
		"\u03ad\5\u009aN\2\u03ac\u03aa\3\2\2\2\u03ac\u03ab\3\2\2\2\u03ad\u03ae"+
		"\3\2\2\2\u03ae\u03af\5\u0140\u00a1\2\u03af\u03b6\3\2\2\2\u03b0\u03b1\7"+
		"o\2\2\u03b1\u03b2\7]\2\2\u03b2\u03b3\5\u0118\u008d\2\u03b3\u03b4\5\u0140"+
		"\u00a1\2\u03b4\u03b6\3\2\2\2\u03b5\u03a6\3\2\2\2\u03b5\u03b0\3\2\2\2\u03b6"+
		"\u0093\3\2\2\2\u03b7\u03b8\5\u008cG\2\u03b8\u03b9\5\u008eH\2\u03b9\u03ba"+
		"\5\u0140\u00a1\2\u03ba\u03c2\3\2\2\2\u03bb\u03bd\5\u0096L\2\u03bc\u03be"+
		"\5\u008eH\2\u03bd\u03bc\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03bf\3\2\2"+
		"\2\u03bf\u03c0\5\u0140\u00a1\2\u03c0\u03c2\3\2\2\2\u03c1\u03b7\3\2\2\2"+
		"\u03c1\u03bb\3\2\2\2\u03c2\u0095\3\2\2\2\u03c3\u03c9\7\n\2\2\u03c4\u03c5"+
		"\5\u0098M\2\u03c5\u03c6\7\16\2\2\u03c6\u03c8\3\2\2\2\u03c7\u03c4\3\2\2"+
		"\2\u03c8\u03cb\3\2\2\2\u03c9\u03c7\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03d0"+
		"\3\2\2\2\u03cb\u03c9\3\2\2\2\u03cc\u03ce\5\u0098M\2\u03cd\u03cf\7\16\2"+
		"\2\u03ce\u03cd\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d1\3\2\2\2\u03d0\u03cc"+
		"\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d3\7\f\2\2\u03d3"+
		"\u0097\3\2\2\2\u03d4\u03d7\5\u0086D\2\u03d5\u03d6\7c\2\2\u03d6\u03d8\5"+
		"\u0086D\2\u03d7\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u0099\3\2\2\2"+
		"\u03d9\u03dd\5\u00a2R\2\u03da\u03dd\5\u00d4k\2\u03db\u03dd\5\u00d2j\2"+
		"\u03dc\u03d9\3\2\2\2\u03dc\u03da\3\2\2\2\u03dc\u03db\3\2\2\2\u03dd\u009b"+
		"\3\2\2\2\u03de\u03df\7\u0089\2\2\u03df\u03e0\7\u0088\2\2\u03e0\u03e1\7"+
		"\u008e\2\2\u03e1\u03e3\7\n\2\2\u03e2\u03e4\5\u009eP\2\u03e3\u03e2\3\2"+
		"\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e6\7\f\2\2\u03e6"+
		"\u009d\3\2\2\2\u03e7\u03e9\5\u00a0Q\2\u03e8\u03e7\3\2\2\2\u03e9\u03ea"+
		"\3\2\2\2\u03ea\u03e8\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u009f\3\2\2\2\u03ec"+
		"\u03ee\7o\2\2\u03ed\u03ec\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03ef\3\2"+
		"\2\2\u03ef\u03f0\7p\2\2\u03f0\u03fb\5\u0080A\2\u03f1\u03f3\7o\2\2\u03f2"+
		"\u03f1\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f5\7\u0098"+
		"\2\2\u03f5\u03fb\5\u0094K\2\u03f6\u03f8\7o\2\2\u03f7\u03f6\3\2\2\2\u03f7"+
		"\u03f8\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fb\5v<\2\u03fa\u03ed\3\2\2"+
		"\2\u03fa\u03f2\3\2\2\2\u03fa\u03f7\3\2\2\2\u03fb\u00a1\3\2\2\2\u03fc\u03fe"+
		"\5\6\4\2\u03fd\u03ff\5<\37\2\u03fe\u03fd\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff"+
		"\u0400\3\2\2\2\u0400\u0402\5\4\3\2\u0401\u0403\7\r\2\2\u0402\u0401\3\2"+
		"\2\2\u0402\u0403\3\2\2\2\u0403\u041a\3\2\2\2\u0404\u0406\5L\'\2\u0405"+
		"\u0404\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0408\3\2\2\2\u0407\u0409\5\u00b0"+
		"Y\2\u0408\u0407\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040b\3\2\2\2\u040a"+
		"\u040c\7e\2\2\u040b\u040a\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u040d\3\2"+
		"\2\2\u040d\u040f\5\u00a4S\2\u040e\u0410\7\r\2\2\u040f\u040e\3\2\2\2\u040f"+
		"\u0410\3\2\2\2\u0410\u041a\3\2\2\2\u0411\u0413\7\u0089\2\2\u0412\u0414"+
		"\5\u00b0Y\2\u0413\u0412\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0415\3\2\2"+
		"\2\u0415\u0417\5\u00a4S\2\u0416\u0418\7\r\2\2\u0417\u0416\3\2\2\2\u0417"+
		"\u0418\3\2\2\2\u0418\u041a\3\2\2\2\u0419\u03fc\3\2\2\2\u0419\u0405\3\2"+
		"\2\2\u0419\u0411\3\2\2\2\u041a\u00a3\3\2\2\2\u041b\u0420\5\u00a6T\2\u041c"+
		"\u041d\7\16\2\2\u041d\u041f\5\u00a6T\2\u041e\u041c\3\2\2\2\u041f\u0422"+
		"\3\2\2\2\u0420\u041e\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u00a5\3\2\2\2\u0422"+
		"\u0420\3\2\2\2\u0423\u0425\7n\2\2\u0424\u0423\3\2\2\2\u0424\u0425\3\2"+
		"\2\2\u0425\u042c\3\2\2\2\u0426\u0428\5\u013a\u009e\2\u0427\u0429\7\32"+
		"\2\2\u0428\u0427\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042d\3\2\2\2\u042a"+
		"\u042d\5\u0100\u0081\2\u042b\u042d\5\u0106\u0084\2\u042c\u0426\3\2\2\2"+
		"\u042c\u042a\3\2\2\2\u042c\u042b\3\2\2\2\u042d\u042f\3\2\2\2\u042e\u0430"+
		"\5<\37\2\u042f\u042e\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0432\3\2\2\2\u0431"+
		"\u0433\5\u0118\u008d\2\u0432\u0431\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u0439"+
		"\3\2\2\2\u0434\u0436\7\17\2\2\u0435\u0437\5\b\5\2\u0436\u0435\3\2\2\2"+
		"\u0436\u0437\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u043a\5\u0118\u008d\2\u0439"+
		"\u0434\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u00a7\3\2\2\2\u043b\u043c\7\r"+
		"\2\2\u043c\u00a9\3\2\2\2\u043d\u043e\6V\b\2\u043e\u0440\5\u0116\u008c"+
		"\2\u043f\u0441\7\r\2\2\u0440\u043f\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u00ab"+
		"\3\2\2\2\u0442\u0443\7^\2\2\u0443\u0444\7\b\2\2\u0444\u0445\5\u0116\u008c"+
		"\2\u0445\u0446\7\t\2\2\u0446\u0449\5v<\2\u0447\u0448\7N\2\2\u0448\u044a"+
		"\5v<\2\u0449\u0447\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u00ad\3\2\2\2\u044b"+
		"\u044c\7J\2\2\u044c\u044d\5v<\2\u044d\u044e\7X\2\2\u044e\u044f\7\b\2\2"+
		"\u044f\u0450\5\u0116\u008c\2\u0450\u0451\7\t\2\2\u0451\u0452\5\u0140\u00a1"+
		"\2\u0452\u04aa\3\2\2\2\u0453\u0454\7X\2\2\u0454\u0455\7\b\2\2\u0455\u0456"+
		"\5\u0116\u008c\2\u0456\u0457\7\t\2\2\u0457\u0458\5v<\2\u0458\u04aa\3\2"+
		"\2\2\u0459\u045a\7V\2\2\u045a\u045c\7\b\2\2\u045b\u045d\5\u0116\u008c"+
		"\2\u045c\u045b\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u045e\3\2\2\2\u045e\u0460"+
		"\7\r\2\2\u045f\u0461\5\u0116\u008c\2\u0460\u045f\3\2\2\2\u0460\u0461\3"+
		"\2\2\2\u0461\u0462\3\2\2\2\u0462\u0464\7\r\2\2\u0463\u0465\5\u0116\u008c"+
		"\2\u0464\u0463\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0467"+
		"\7\t\2\2\u0467\u04aa\5v<\2\u0468\u0469\7V\2\2\u0469\u046a\7\b\2\2\u046a"+
		"\u046b\5\u00b0Y\2\u046b\u046c\5\u00a4S\2\u046c\u046e\7\r\2\2\u046d\u046f"+
		"\5\u0116\u008c\2\u046e\u046d\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0470\3"+
		"\2\2\2\u0470\u0472\7\r\2\2\u0471\u0473\5\u0116\u008c\2\u0472\u0471\3\2"+
		"\2\2\u0472\u0473\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0475\7\t\2\2\u0475"+
		"\u0476\5v<\2\u0476\u04aa\3\2\2\2\u0477\u0478\7V\2\2\u0478\u0479\7\b\2"+
		"\2\u0479\u047a\5\u0118\u008d\2\u047a\u047b\7a\2\2\u047b\u047c\5\u0116"+
		"\u008c\2\u047c\u047d\7\t\2\2\u047d\u047e\5v<\2\u047e\u04aa\3\2\2\2\u047f"+
		"\u0480\7V\2\2\u0480\u0481\7\b\2\2\u0481\u0482\5\u00b0Y\2\u0482\u0483\5"+
		"\u00a6T\2\u0483\u0484\7a\2\2\u0484\u0485\5\u0116\u008c\2\u0485\u0486\7"+
		"\t\2\2\u0486\u0487\5v<\2\u0487\u04aa\3\2\2\2\u0488\u048a\7V\2\2\u0489"+
		"\u048b\7g\2\2\u048a\u0489\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u048c\3\2"+
		"\2\2\u048c\u048d\7\b\2\2\u048d\u048e\5\u0118\u008d\2\u048e\u048f\5\u0138"+
		"\u009d\2\u048f\u0490\6X\t\2\u0490\u0493\5\u0116\u008c\2\u0491\u0492\7"+
		"c\2\2\u0492\u0494\5\26\f\2\u0493\u0491\3\2\2\2\u0493\u0494\3\2\2\2\u0494"+
		"\u0495\3\2\2\2\u0495\u0496\7\t\2\2\u0496\u0497\5v<\2\u0497\u04aa\3\2\2"+
		"\2\u0498\u049a\7V\2\2\u0499\u049b\7g\2\2\u049a\u0499\3\2\2\2\u049a\u049b"+
		"\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049d\7\b\2\2\u049d\u049e\5\u00b0Y"+
		"\2\u049e\u049f\5\u00a6T\2\u049f\u04a0\5\u0138\u009d\2\u04a0\u04a1\6X\n"+
		"\2\u04a1\u04a4\5\u0116\u008c\2\u04a2\u04a3\7c\2\2\u04a3\u04a5\5\26\f\2"+
		"\u04a4\u04a2\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a7"+
		"\7\t\2\2\u04a7\u04a8\5v<\2\u04a8\u04aa\3\2\2\2\u04a9\u044b\3\2\2\2\u04a9"+
		"\u0453\3\2\2\2\u04a9\u0459\3\2\2\2\u04a9\u0468\3\2\2\2\u04a9\u0477\3\2"+
		"\2\2\u04a9\u047f\3\2\2\2\u04a9\u0488\3\2\2\2\u04a9\u0498\3\2\2\2\u04aa"+
		"\u00af\3\2\2\2\u04ab\u04ac\t\7\2\2\u04ac\u00b1\3\2\2\2\u04ad\u04b0\7U"+
		"\2\2\u04ae\u04af\6Z\13\2\u04af\u04b1\5\u0138\u009d\2\u04b0\u04ae\3\2\2"+
		"\2\u04b0\u04b1\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3\5\u0140\u00a1\2"+
		"\u04b3\u00b3\3\2\2\2\u04b4\u04b7\7I\2\2\u04b5\u04b6\6[\f\2\u04b6\u04b8"+
		"\5\u0138\u009d\2\u04b7\u04b5\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04b9\3"+
		"\2\2\2\u04b9\u04ba\5\u0140\u00a1\2\u04ba\u00b5\3\2\2\2\u04bb\u04be\7S"+
		"\2\2\u04bc\u04bd\6\\\r\2\u04bd\u04bf\5\u0116\u008c\2\u04be\u04bc\3\2\2"+
		"\2\u04be\u04bf\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c1\5\u0140\u00a1\2"+
		"\u04c1\u00b7\3\2\2\2\u04c2\u04c5\t\b\2\2\u04c3\u04c4\6]\16\2\u04c4\u04c6"+
		"\5\u0116\u008c\2\u04c5\u04c3\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04c7\3"+
		"\2\2\2\u04c7\u04c8\5\u0140\u00a1\2\u04c8\u00b9\3\2\2\2\u04c9\u04ca\7\\"+
		"\2\2\u04ca\u04cb\7\b\2\2\u04cb\u04cc\5\u0116\u008c\2\u04cc\u04cd\7\t\2"+
		"\2\u04cd\u04ce\5v<\2\u04ce\u00bb\3\2\2\2\u04cf\u04d0\7W\2\2\u04d0\u04d1"+
		"\7\b\2\2\u04d1\u04d2\5\u0116\u008c\2\u04d2\u04d3\7\t\2\2\u04d3\u04d4\5"+
		"\u00be`\2\u04d4\u00bd\3\2\2\2\u04d5\u04d7\7\n\2\2\u04d6\u04d8\5\u00c0"+
		"a\2\u04d7\u04d6\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04dd\3\2\2\2\u04d9"+
		"\u04db\5\u00c4c\2\u04da\u04dc\5\u00c0a\2\u04db\u04da\3\2\2\2\u04db\u04dc"+
		"\3\2\2\2\u04dc\u04de\3\2\2\2\u04dd\u04d9\3\2\2\2\u04dd\u04de\3\2\2\2\u04de"+
		"\u04df\3\2\2\2\u04df\u04e0\7\f\2\2\u04e0\u00bf\3\2\2\2\u04e1\u04e3\5\u00c2"+
		"b\2\u04e2\u04e1\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e4"+
		"\u04e5\3\2\2\2\u04e5\u00c1\3\2\2\2\u04e6\u04e7\7M\2\2\u04e7\u04e8\5\u0116"+
		"\u008c\2\u04e8\u04ea\7\22\2\2\u04e9\u04eb\5z>\2\u04ea\u04e9\3\2\2\2\u04ea"+
		"\u04eb\3\2\2\2\u04eb\u00c3\3\2\2\2\u04ec\u04ed\7]\2\2\u04ed\u04ef\7\22"+
		"\2\2\u04ee\u04f0\5z>\2\u04ef\u04ee\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u00c5"+
		"\3\2\2\2\u04f1\u04f2\5\u0138\u009d\2\u04f2\u04f3\7\22\2\2\u04f3\u04f4"+
		"\5v<\2\u04f4\u00c7\3\2\2\2\u04f5\u04f6\7_\2\2\u04f6\u04f7\6e\17\2\u04f7"+
		"\u04f8\5\u0116\u008c\2\u04f8\u04f9\5\u0140\u00a1\2\u04f9\u00c9\3\2\2\2"+
		"\u04fa\u04fb\7b\2\2\u04fb\u0501\5x=\2\u04fc\u04fe\5\u00ccg\2\u04fd\u04ff"+
		"\5\u00ceh\2\u04fe\u04fd\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0502\3\2\2"+
		"\2\u0500\u0502\5\u00ceh\2\u0501\u04fc\3\2\2\2\u0501\u0500\3\2\2\2\u0502"+
		"\u00cb\3\2\2\2\u0503\u050b\7Q\2\2\u0504\u0505\7\b\2\2\u0505\u0507\5\u0138"+
		"\u009d\2\u0506\u0508\5<\37\2\u0507\u0506\3\2\2\2\u0507\u0508\3\2\2\2\u0508"+
		"\u0509\3\2\2\2\u0509\u050a\7\t\2\2\u050a\u050c\3\2\2\2\u050b\u0504\3\2"+
		"\2\2\u050b\u050c\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u050e\5x=\2\u050e\u00cd"+
		"\3\2\2\2\u050f\u0510\7R\2\2\u0510\u0511\5x=\2\u0511\u00cf\3\2\2\2\u0512"+
		"\u0513\7Y\2\2\u0513\u0514\5\u0140\u00a1\2\u0514\u00d1\3\2\2\2\u0515\u0517"+
		"\7f\2\2\u0516\u0515\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u0518\3\2\2\2\u0518"+
		"\u051a\7Z\2\2\u0519\u051b\7\33\2\2\u051a\u0519\3\2\2\2\u051a\u051b\3\2"+
		"\2\2\u051b\u051c\3\2\2\2\u051c\u051d\5\u0138\u009d\2\u051d\u0523\5> \2"+
		"\u051e\u051f\7\n\2\2\u051f\u0520\5\u00fc\177\2\u0520\u0521\7\f\2\2\u0521"+
		"\u0524\3\2\2\2\u0522\u0524\7\r\2\2\u0523\u051e\3\2\2\2\u0523\u0522\3\2"+
		"\2\2\u0524\u00d3\3\2\2\2\u0525\u0527\5n8\2\u0526\u0525\3\2\2\2\u0526\u0527"+
		"\3\2\2\2\u0527\u052c\3\2\2\2\u0528\u052a\7o\2\2\u0529\u052b\7]\2\2\u052a"+
		"\u0529\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052d\3\2\2\2\u052c\u0528\3\2"+
		"\2\2\u052c\u052d\3\2\2\2\u052d\u052f\3\2\2\2\u052e\u0530\7\u008a\2\2\u052f"+
		"\u052e\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0532\7j"+
		"\2\2\u0532\u0534\5\u0138\u009d\2\u0533\u0535\5\b\5\2\u0534\u0533\3\2\2"+
		"\2\u0534\u0535\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u0537\5\u00d6l\2\u0537"+
		"\u0538\5\u00d8m\2\u0538\u00d5\3\2\2\2\u0539\u053b\5\u00dan\2\u053a\u0539"+
		"\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u053d\3\2\2\2\u053c\u053e\5\u00dco"+
		"\2\u053d\u053c\3\2\2\2\u053d\u053e\3\2\2\2\u053e\u00d7\3\2\2\2\u053f\u0543"+
		"\7\n\2\2\u0540\u0542\5\u00dep\2\u0541\u0540\3\2\2\2\u0542\u0545\3\2\2"+
		"\2\u0543\u0541\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u0546\3\2\2\2\u0545\u0543"+
		"\3\2\2\2\u0546\u0547\7\f\2\2\u0547\u00d9\3\2\2\2\u0548\u0549\7l\2\2\u0549"+
		"\u054a\5\36\20\2\u054a\u00db\3\2\2\2\u054b\u054c\7q\2\2\u054c\u054d\5"+
		"^\60\2\u054d\u00dd\3\2\2\2\u054e\u0556\5X-\2\u054f\u0551\5n8\2\u0550\u054f"+
		"\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0556\5\u00e0q"+
		"\2\u0553\u0556\5\u00e4s\2\u0554\u0556\5v<\2\u0555\u054e\3\2\2\2\u0555"+
		"\u0550\3\2\2\2\u0555\u0553\3\2\2\2\u0555\u0554\3\2\2\2\u0556\u00df\3\2"+
		"\2\2\u0557\u0558\5\u00e2r\2\u0558\u055a\5\u010e\u0088\2\u0559\u055b\7"+
		"\20\2\2\u055a\u0559\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u055d\3\2\2\2\u055c"+
		"\u055e\5<\37\2\u055d\u055c\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u0560\3\2"+
		"\2\2\u055f\u0561\5\4\3\2\u0560\u055f\3\2\2\2\u0560\u0561\3\2\2\2\u0561"+
		"\u0562\3\2\2\2\u0562\u0563\7\r\2\2\u0563\u0575\3\2\2\2\u0564\u0565\5\u00e2"+
		"r\2\u0565\u0566\5\u010e\u0088\2\u0566\u056c\5> \2\u0567\u0568\7\n\2\2"+
		"\u0568\u0569\5\u00fc\177\2\u0569\u056a\7\f\2\2\u056a\u056d\3\2\2\2\u056b"+
		"\u056d\7\r\2\2\u056c\u0567\3\2\2\2\u056c\u056b\3\2\2\2\u056d\u0575\3\2"+
		"\2\2\u056e\u0571\5\u00e2r\2\u056f\u0572\5\u010a\u0086\2\u0570\u0572\5"+
		"\u010c\u0087\2\u0571\u056f\3\2\2\2\u0571\u0570\3\2\2\2\u0572\u0575\3\2"+
		"\2\2\u0573\u0575\5|?\2\u0574\u0557\3\2\2\2\u0574\u0564\3\2\2\2\u0574\u056e"+
		"\3\2\2\2\u0574\u0573\3\2\2\2\u0575\u00e1\3\2\2\2\u0576\u0578\5L\'\2\u0577"+
		"\u0576\3\2\2\2\u0577\u0578\3\2\2\2\u0578\u057a\3\2\2\2\u0579\u057b\7f"+
		"\2\2\u057a\u0579\3\2\2\2\u057a\u057b\3\2\2\2\u057b\u057d\3\2\2\2\u057c"+
		"\u057e\7x\2\2\u057d\u057c\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u0580\3\2"+
		"\2\2\u057f\u0581\7e\2\2\u0580\u057f\3\2\2\2\u0580\u0581\3\2\2\2\u0581"+
		"\u00e3\3\2\2\2\u0582\u0583\5R*\2\u0583\u0584\7\r\2\2\u0584\u00e5\3\2\2"+
		"\2\u0585\u0586\7f\2\2\u0586\u0588\6t\20\2\u0587\u0585\3\2\2\2\u0587\u0588"+
		"\3\2\2\2\u0588\u058a\3\2\2\2\u0589\u058b\7\33\2\2\u058a\u0589\3\2\2\2"+
		"\u058a\u058b\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u058d\5\u010e\u0088\2\u058d"+
		"\u058f\7\b\2\2\u058e\u0590\5\u00f6|\2\u058f\u058e\3\2\2\2\u058f\u0590"+
		"\3\2\2\2\u0590\u0591\3\2\2\2\u0591\u0592\7\t\2\2\u0592\u0593\7\n\2\2\u0593"+
		"\u0594\5\u00fc\177\2\u0594\u0595\7\f\2\2\u0595\u00e7\3\2\2\2\u0596\u0598"+
		"\7f\2\2\u0597\u0596\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u0599\3\2\2\2\u0599"+
		"\u059a\7Z\2\2\u059a\u059c\7\33\2\2\u059b\u059d\5\u0138\u009d\2\u059c\u059b"+
		"\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u059e\3\2\2\2\u059e\u05a0\7\b\2\2\u059f"+
		"\u05a1\5\u00f6|\2\u05a0\u059f\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u05a2"+
		"\3\2\2\2\u05a2\u05a3\7\t\2\2\u05a3\u05a4\7\n\2\2\u05a4\u05a5\5\u00fc\177"+
		"\2\u05a5\u05a6\7\f\2\2\u05a6\u00e9\3\2\2\2\u05a7\u05a8\7\n\2\2\u05a8\u05ad"+
		"\5\u00ecw\2\u05a9\u05aa\7\16\2\2\u05aa\u05ac\5\u00ecw\2\u05ab\u05a9\3"+
		"\2\2\2\u05ac\u05af\3\2\2\2\u05ad\u05ab\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae"+
		"\u05b1\3\2\2\2\u05af\u05ad\3\2\2\2\u05b0\u05b2\7\16\2\2\u05b1\u05b0\3"+
		"\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b4\7\f\2\2\u05b4"+
		"\u00eb\3\2\2\2\u05b5\u05b6\7\33\2\2\u05b6\u05b7\5\u00f0y\2\u05b7\u00ed"+
		"\3\2\2\2\u05b8\u05b9\7\n\2\2\u05b9\u05be\5\u00f0y\2\u05ba\u05bb\7\16\2"+
		"\2\u05bb\u05bd\5\u00f0y\2\u05bc\u05ba\3\2\2\2\u05bd\u05c0\3\2\2\2\u05be"+
		"\u05bc\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c2\3\2\2\2\u05c0\u05be\3\2"+
		"\2\2\u05c1\u05c3\7\16\2\2\u05c2\u05c1\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3"+
		"\u05c4\3\2\2\2\u05c4\u05c5\7\f\2\2\u05c5\u00ef\3\2\2\2\u05c6\u05c7\7\6"+
		"\2\2\u05c7\u05c8\5\u0118\u008d\2\u05c8\u05c9\7\7\2\2\u05c9\u05cb\7\b\2"+
		"\2\u05ca\u05cc\5\u00f6|\2\u05cb\u05ca\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc"+
		"\u05cd\3\2\2\2\u05cd\u05ce\7\t\2\2\u05ce\u05cf\7\n\2\2\u05cf\u05d0\5\u00fc"+
		"\177\2\u05d0\u05d1\7\f\2\2\u05d1\u00f1\3\2\2\2\u05d2\u05d5\5\u010e\u0088"+
		"\2\u05d3\u05d5\5\u00f4{\2\u05d4\u05d2\3\2\2\2\u05d4\u05d3\3\2\2\2\u05d5"+
		"\u00f3\3\2\2\2\u05d6\u05d7\7 \2\2\u05d7\u05d8\5\u0136\u009c\2\u05d8\u00f5"+
		"\3\2\2\2\u05d9\u05de\5\u00f8}\2\u05da\u05db\7\16\2\2\u05db\u05dd\5\u00f8"+
		"}\2\u05dc\u05da\3\2\2\2\u05dd\u05e0\3\2\2\2\u05de\u05dc\3\2\2\2\u05de"+
		"\u05df\3\2\2\2\u05df\u05e3\3\2\2\2\u05e0\u05de\3\2\2\2\u05e1\u05e2\7\16"+
		"\2\2\u05e2\u05e4\5\u00fa~\2\u05e3\u05e1\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4"+
		"\u05e6\3\2\2\2\u05e5\u05e7\7\16\2\2\u05e6\u05e5\3\2\2\2\u05e6\u05e7\3"+
		"\2\2\2\u05e7\u05f0\3\2\2\2\u05e8\u05f0\5\u00fa~\2\u05e9\u05f0\5\u0100"+
		"\u0081\2\u05ea\u05ed\5\u0106\u0084\2\u05eb\u05ec\7\22\2\2\u05ec\u05ee"+
		"\5\u00f6|\2\u05ed\u05eb\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee\u05f0\3\2\2"+
		"\2\u05ef\u05d9\3\2\2\2\u05ef\u05e8\3\2\2\2\u05ef\u05e9\3\2\2\2\u05ef\u05ea"+
		"\3\2\2\2\u05f0\u00f7\3\2\2\2\u05f1\u05f3\5p9\2\u05f2\u05f1\3\2\2\2\u05f2"+
		"\u05f3\3\2\2\2\u05f3\u05f5\3\2\2\2\u05f4\u05f6\5L\'\2\u05f5\u05f4\3\2"+
		"\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f9\5\u011c\u008f"+
		"\2\u05f8\u05fa\7\20\2\2\u05f9\u05f8\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa"+
		"\u05fc\3\2\2\2\u05fb\u05fd\5<\37\2\u05fc\u05fb\3\2\2\2\u05fc\u05fd\3\2"+
		"\2\2\u05fd\u0600\3\2\2\2\u05fe\u05ff\7\17\2\2\u05ff\u0601\5\u0118\u008d"+
		"\2\u0600\u05fe\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u00f9\3\2\2\2\u0602\u0603"+
		"\7\23\2\2\u0603\u0605\5\u0138\u009d\2\u0604\u0606\5<\37\2\u0605\u0604"+
		"\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u00fb\3\2\2\2\u0607\u0609\5\u00fe\u0080"+
		"\2\u0608\u0607\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u00fd\3\2\2\2\u060a\u060c"+
		"\5v<\2\u060b\u060a\3\2\2\2\u060c\u060d\3\2\2\2\u060d\u060b\3\2\2\2\u060d"+
		"\u060e\3\2\2\2\u060e\u00ff\3\2\2\2\u060f\u0610\7\6\2\2\u0610\u0611\5\u0102"+
		"\u0082\2\u0611\u0612\7\7\2\2\u0612\u0101\3\2\2\2\u0613\u0615\7\16\2\2"+
		"\u0614\u0613\3\2\2\2\u0615\u0618\3\2\2\2\u0616\u0614\3\2\2\2\u0616\u0617"+
		"\3\2\2\2\u0617\u061a\3\2\2\2\u0618\u0616\3\2\2\2\u0619\u061b\5\u0104\u0083"+
		"\2\u061a\u0619\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u0624\3\2\2\2\u061c\u061e"+
		"\7\16\2\2\u061d\u061c\3\2\2\2\u061e\u061f\3\2\2\2\u061f\u061d\3\2\2\2"+
		"\u061f\u0620\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u0623\5\u0104\u0083\2\u0622"+
		"\u061d\3\2\2\2\u0623\u0626\3\2\2\2\u0624\u0622\3\2\2\2\u0624\u0625\3\2"+
		"\2\2\u0625\u062a\3\2\2\2\u0626\u0624\3\2\2\2\u0627\u0629\7\16\2\2\u0628"+
		"\u0627\3\2\2\2\u0629\u062c\3\2\2\2\u062a\u0628\3\2\2\2\u062a\u062b\3\2"+
		"\2\2\u062b\u0103\3\2\2\2\u062c\u062a\3\2\2\2\u062d\u062f\7\23\2\2\u062e"+
		"\u062d\3\2\2\2\u062e\u062f\3\2\2\2\u062f\u0632\3\2\2\2\u0630\u0633\5\u0118"+
		"\u008d\2\u0631\u0633\5\u0138\u009d\2\u0632\u0630\3\2\2\2\u0632\u0631\3"+
		"\2\2\2\u0633\u0635\3\2\2\2\u0634\u0636\7\16\2\2\u0635\u0634\3\2\2\2\u0635"+
		"\u0636\3\2\2\2\u0636\u0105\3\2\2\2\u0637\u0643\7\n\2\2\u0638\u063d\5\u0108"+
		"\u0085\2\u0639\u063a\7\16\2\2\u063a\u063c\5\u0108\u0085\2\u063b\u0639"+
		"\3\2\2\2\u063c\u063f\3\2\2\2\u063d\u063b\3\2\2\2\u063d\u063e\3\2\2\2\u063e"+
		"\u0641\3\2\2\2\u063f\u063d\3\2\2\2\u0640\u0642\7\16\2\2\u0641\u0640\3"+
		"\2\2\2\u0641\u0642\3\2\2\2\u0642\u0644\3\2\2\2\u0643\u0638\3\2\2\2\u0643"+
		"\u0644\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u0646\7\f\2\2\u0646\u0107\3\2"+
		"\2\2\u0647\u0648\5\u010e\u0088\2\u0648\u0649\t\t\2\2\u0649\u064a\5\u0118"+
		"\u008d\2\u064a\u065b\3\2\2\2\u064b\u064c\7\6\2\2\u064c\u064d\5\u0118\u008d"+
		"\2\u064d\u064e\7\7\2\2\u064e\u064f\7\22\2\2\u064f\u0650\5\u0118\u008d"+
		"\2\u0650\u065b\3\2\2\2\u0651\u065b\5\u010a\u0086\2\u0652\u065b\5\u010c"+
		"\u0087\2\u0653\u065b\5\u00e6t\2\u0654\u065b\5\u013a\u009e\2\u0655\u0657"+
		"\7\23\2\2\u0656\u0655\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u0658\3\2\2\2"+
		"\u0658\u065b\5\u0118\u008d\2\u0659\u065b\5H%\2\u065a\u0647\3\2\2\2\u065a"+
		"\u064b\3\2\2\2\u065a\u0651\3\2\2\2\u065a\u0652\3\2\2\2\u065a\u0653\3\2"+
		"\2\2\u065a\u0654\3\2\2\2\u065a\u0656\3\2\2\2\u065a\u0659\3\2\2\2\u065b"+
		"\u0109\3\2\2\2\u065c\u065d\5\u0132\u009a\2\u065d\u065e\7\b\2\2\u065e\u0660"+
		"\7\t\2\2\u065f\u0661\5<\37\2\u0660\u065f\3\2\2\2\u0660\u0661\3\2\2\2\u0661"+
		"\u0662\3\2\2\2\u0662\u0663\7\n\2\2\u0663\u0664\5\u00fc\177\2\u0664\u0665"+
		"\7\f\2\2\u0665\u010b\3\2\2\2\u0666\u0667\5\u0134\u009b\2\u0667\u0669\7"+
		"\b\2\2\u0668\u066a\5\u00f6|\2\u0669\u0668\3\2\2\2\u0669\u066a\3\2\2\2"+
		"\u066a\u066b\3\2\2\2\u066b\u066c\7\t\2\2\u066c\u066d\7\n\2\2\u066d\u066e"+
		"\5\u00fc\177\2\u066e\u066f\7\f\2\2\u066f\u010d\3\2\2\2\u0670\u0678\5\u0136"+
		"\u009c\2\u0671\u0678\7\u008e\2\2\u0672\u0678\5\u012e\u0098\2\u0673\u0674"+
		"\7\6\2\2\u0674\u0675\5\u0118\u008d\2\u0675\u0676\7\7\2\2\u0676\u0678\3"+
		"\2\2\2\u0677\u0670\3\2\2\2\u0677\u0671\3\2\2\2\u0677\u0672\3\2\2\2\u0677"+
		"\u0673\3\2\2\2\u0678\u010f\3\2\2\2\u0679\u067e\7\b\2\2\u067a\u067c\5\u0112"+
		"\u008a\2\u067b\u067d\7\16\2\2\u067c\u067b\3\2\2\2\u067c\u067d\3\2\2\2"+
		"\u067d\u067f\3\2\2\2\u067e\u067a\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u0680"+
		"\3\2\2\2\u0680\u0681\7\t\2\2\u0681\u0111\3\2\2\2\u0682\u0687\5\u0114\u008b"+
		"\2\u0683\u0684\7\16\2\2\u0684\u0686\5\u0114\u008b\2\u0685\u0683\3\2\2"+
		"\2\u0686\u0689\3\2\2\2\u0687\u0685\3\2\2\2\u0687\u0688\3\2\2\2\u0688\u0113"+
		"\3\2\2\2\u0689\u0687\3\2\2\2\u068a\u068c\7\23\2\2\u068b\u068a\3\2\2\2"+
		"\u068b\u068c\3\2\2\2\u068c\u068f\3\2\2\2\u068d\u0690\5\u0118\u008d\2\u068e"+
		"\u0690\5\u0138\u009d\2\u068f\u068d\3\2\2\2\u068f\u068e\3\2\2\2\u0690\u0115"+
		"\3\2\2\2\u0691\u0696\5\u0118\u008d\2\u0692\u0693\7\16\2\2\u0693\u0695"+
		"\5\u0118\u008d\2\u0694\u0692\3\2\2\2\u0695\u0698\3\2\2\2\u0696\u0694\3"+
		"\2\2\2\u0696\u0697\3\2\2\2\u0697\u0117\3\2\2\2\u0698\u0696\3\2\2\2\u0699"+
		"\u069a\b\u008d\1\2\u069a\u06db\5\u011e\u0090\2\u069b\u069d\7j\2\2\u069c"+
		"\u069e\5\u0138\u009d\2\u069d\u069c\3\2\2\2\u069d\u069e\3\2\2\2\u069e\u06a0"+
		"\3\2\2\2\u069f\u06a1\5\b\5\2\u06a0\u069f\3\2\2\2\u06a0\u06a1\3\2\2\2\u06a1"+
		"\u06a2\3\2\2\2\u06a2\u06a3\5\u00d6l\2\u06a3\u06a4\5\u00d8m\2\u06a4\u06db"+
		"\3\2\2\2\u06a5\u06a6\7O\2\2\u06a6\u06a8\5\u0118\u008d\2\u06a7\u06a9\5"+
		"\20\t\2\u06a8\u06a7\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u06aa\3\2\2\2\u06aa"+
		"\u06ab\5\u0110\u0089\2\u06ab\u06db\3\2\2\2\u06ac\u06ad\7O\2\2\u06ad\u06af"+
		"\5\u0118\u008d\2\u06ae\u06b0\5\20\t\2\u06af\u06ae\3\2\2\2\u06af\u06b0"+
		"\3\2\2\2\u06b0\u06db\3\2\2\2\u06b1\u06b2\7`\2\2\u06b2\u06db\5\u0118\u008d"+
		",\u06b3\u06b4\7T\2\2\u06b4\u06db\5\u0118\u008d+\u06b5\u06b6\7L\2\2\u06b6"+
		"\u06db\5\u0118\u008d*\u06b7\u06b8\7\25\2\2\u06b8\u06db\5\u0118\u008d)"+
		"\u06b9\u06ba\7\26\2\2\u06ba\u06db\5\u0118\u008d(\u06bb\u06bc\7\27\2\2"+
		"\u06bc\u06db\5\u0118\u008d\'\u06bd\u06be\7\30\2\2\u06be\u06db\5\u0118"+
		"\u008d&\u06bf\u06c0\7\31\2\2\u06c0\u06db\5\u0118\u008d%\u06c1\u06c2\7"+
		"\32\2\2\u06c2\u06db\5\u0118\u008d$\u06c3\u06c4\7g\2\2\u06c4\u06db\5\u0118"+
		"\u008d#\u06c5\u06db\5\u00eex\2\u06c6\u06db\5\u00eav\2\u06c7\u06db\5\u00e8"+
		"u\2\u06c8\u06db\5\u00b8]\2\u06c9\u06db\7[\2\2\u06ca\u06cc\5\u0136\u009c"+
		"\2\u06cb\u06cd\5\u0118\u008d\2\u06cc\u06cb\3\2\2\2\u06cc\u06cd\3\2\2\2"+
		"\u06cd\u06db\3\2\2\2\u06ce\u06db\7m\2\2\u06cf\u06db\5\u0128\u0095\2\u06d0"+
		"\u06db\5\u0100\u0081\2\u06d1\u06db\5\u0106\u0084\2\u06d2\u06d3\7\b\2\2"+
		"\u06d3\u06d4\5\u0116\u008c\2\u06d4\u06d5\7\t\2\2\u06d5\u06db\3\2\2\2\u06d6"+
		"\u06d8\5\20\t\2\u06d7\u06d9\5\u0116\u008c\2\u06d8\u06d7\3\2\2\2\u06d8"+
		"\u06d9\3\2\2\2\u06d9\u06db\3\2\2\2\u06da\u0699\3\2\2\2\u06da\u069b\3\2"+
		"\2\2\u06da\u06a5\3\2\2\2\u06da\u06ac\3\2\2\2\u06da\u06b1\3\2\2\2\u06da"+
		"\u06b3\3\2\2\2\u06da\u06b5\3\2\2\2\u06da\u06b7\3\2\2\2\u06da\u06b9\3\2"+
		"\2\2\u06da\u06bb\3\2\2\2\u06da\u06bd\3\2\2\2\u06da\u06bf\3\2\2\2\u06da"+
		"\u06c1\3\2\2\2\u06da\u06c3\3\2\2\2\u06da\u06c5\3\2\2\2\u06da\u06c6\3\2"+
		"\2\2\u06da\u06c7\3\2\2\2\u06da\u06c8\3\2\2\2\u06da\u06c9\3\2\2\2\u06da"+
		"\u06ca\3\2\2\2\u06da\u06ce\3\2\2\2\u06da\u06cf\3\2\2\2\u06da\u06d0\3\2"+
		"\2\2\u06da\u06d1\3\2\2\2\u06da\u06d2\3\2\2\2\u06da\u06d6\3\2\2\2\u06db"+
		"\u074e\3\2\2\2\u06dc\u06dd\f\64\2\2\u06dd\u06de\7\21\2\2\u06de\u074d\5"+
		"\u0118\u008d\65\u06df\u06e0\f\"\2\2\u06e0\u06e1\7\36\2\2\u06e1\u074d\5"+
		"\u0118\u008d\"\u06e2\u06e3\f!\2\2\u06e3\u06e4\t\n\2\2\u06e4\u074d\5\u0118"+
		"\u008d\"\u06e5\u06e6\f \2\2\u06e6\u06e7\t\13\2\2\u06e7\u074d\5\u0118\u008d"+
		"!\u06e8\u06e9\f\37\2\2\u06e9\u06ea\7\37\2\2\u06ea\u074d\5\u0118\u008d"+
		" \u06eb\u06f2\f\36\2\2\u06ec\u06f3\7!\2\2\u06ed\u06ee\7#\2\2\u06ee\u06f3"+
		"\7#\2\2\u06ef\u06f0\7#\2\2\u06f0\u06f1\7#\2\2\u06f1\u06f3\7#\2\2\u06f2"+
		"\u06ec\3\2\2\2\u06f2\u06ed\3\2\2\2\u06f2\u06ef\3\2\2\2\u06f3\u06f4\3\2"+
		"\2\2\u06f4\u074d\5\u0118\u008d\37\u06f5\u06f6\f\35\2\2\u06f6\u06f7\t\f"+
		"\2\2\u06f7\u074d\5\u0118\u008d\36\u06f8\u06f9\f\34\2\2\u06f9\u06fa\7K"+
		"\2\2\u06fa\u074d\5\u0118\u008d\35\u06fb\u06fc\f\33\2\2\u06fc\u06fd\7a"+
		"\2\2\u06fd\u074d\5\u0118\u008d\34\u06fe\u06ff\f\32\2\2\u06ff\u0700\t\r"+
		"\2\2\u0700\u074d\5\u0118\u008d\33\u0701\u0702\f\31\2\2\u0702\u0703\7*"+
		"\2\2\u0703\u074d\5\u0118\u008d\32\u0704\u0705\f\30\2\2\u0705\u0706\7+"+
		"\2\2\u0706\u074d\5\u0118\u008d\31\u0707\u0708\f\27\2\2\u0708\u0709\7,"+
		"\2\2\u0709\u074d\5\u0118\u008d\30\u070a\u070b\f\26\2\2\u070b\u070c\7-"+
		"\2\2\u070c\u074d\5\u0118\u008d\27\u070d\u070e\f\25\2\2\u070e\u070f\7."+
		"\2\2\u070f\u074d\5\u0118\u008d\26\u0710\u0711\f\24\2\2\u0711\u0712\7\20"+
		"\2\2\u0712\u0713\5\u0118\u008d\2\u0713\u0714\7\22\2\2\u0714\u0715\5\u0118"+
		"\u008d\25\u0715\u074d\3\2\2\2\u0716\u0717\f\23\2\2\u0717\u0718\7\17\2"+
		"\2\u0718\u074d\5\u0118\u008d\24\u0719\u071a\f\22\2\2\u071a\u071b\5\u0126"+
		"\u0094\2\u071b\u071c\5\u0118\u008d\23\u071c\u074d\3\2\2\2\u071d\u071f"+
		"\f\65\2\2\u071e\u0720\7\21\2\2\u071f\u071e\3\2\2\2\u071f\u0720\3\2\2\2"+
		"\u0720\u0721\3\2\2\2\u0721\u0722\7\6\2\2\u0722\u0723\5\u0116\u008c\2\u0723"+
		"\u0724\7\7\2\2\u0724\u074d\3\2\2\2\u0725\u0727\f\63\2\2\u0726\u0728\7"+
		"\32\2\2\u0727\u0726\3\2\2\2\u0727\u0728\3\2\2\2\u0728\u0729\3\2\2\2\u0729"+
		"\u072b\7\24\2\2\u072a\u072c\7 \2\2\u072b\u072a\3\2\2\2\u072b\u072c\3\2"+
		"\2\2\u072c\u072d\3\2\2\2\u072d\u072f\5\u0136\u009c\2\u072e\u0730\5 \21"+
		"\2\u072f\u072e\3\2\2\2\u072f\u0730\3\2\2\2\u0730\u074d\3\2\2\2\u0731\u0733"+
		"\f\62\2\2\u0732\u0734\7\20\2\2\u0733\u0732\3\2\2\2\u0733\u0734\3\2\2\2"+
		"\u0734\u0735\3\2\2\2\u0735\u0737\7\24\2\2\u0736\u0738\7 \2\2\u0737\u0736"+
		"\3\2\2\2\u0737\u0738\3\2\2\2\u0738\u0739\3\2\2\2\u0739\u073b\5\u0136\u009c"+
		"\2\u073a\u073c\5 \21\2\u073b\u073a\3\2\2\2\u073b\u073c\3\2\2\2\u073c\u074d"+
		"\3\2\2\2\u073d\u073e\f/\2\2\u073e\u074d\5\u0110\u0089\2\u073f\u0740\f"+
		".\2\2\u0740\u0741\6\u008d(\2\u0741\u074d\7\25\2\2\u0742\u0743\f-\2\2\u0743"+
		"\u0744\6\u008d*\2\u0744\u074d\7\26\2\2\u0745\u0746\f\21\2\2\u0746\u074d"+
		"\5\u012a\u0096\2\u0747\u0748\f\4\2\2\u0748\u0749\7c\2\2\u0749\u074d\5"+
		"\u011a\u008e\2\u074a\u074b\f\3\2\2\u074b\u074d\7\32\2\2\u074c\u06dc\3"+
		"\2\2\2\u074c\u06df\3\2\2\2\u074c\u06e2\3\2\2\2\u074c\u06e5\3\2\2\2\u074c"+
		"\u06e8\3\2\2\2\u074c\u06eb\3\2\2\2\u074c\u06f5\3\2\2\2\u074c\u06f8\3\2"+
		"\2\2\u074c\u06fb\3\2\2\2\u074c\u06fe\3\2\2\2\u074c\u0701\3\2\2\2\u074c"+
		"\u0704\3\2\2\2\u074c\u0707\3\2\2\2\u074c\u070a\3\2\2\2\u074c\u070d\3\2"+
		"\2\2\u074c\u0710\3\2\2\2\u074c\u0716\3\2\2\2\u074c\u0719\3\2\2\2\u074c"+
		"\u071d\3\2\2\2\u074c\u0725\3\2\2\2\u074c\u0731\3\2\2\2\u074c\u073d\3\2"+
		"\2\2\u074c\u073f\3\2\2\2\u074c\u0742\3\2\2\2\u074c\u0745\3\2\2\2\u074c"+
		"\u0747\3\2\2\2\u074c\u074a\3\2\2\2\u074d\u0750\3\2\2\2\u074e\u074c\3\2"+
		"\2\2\u074e\u074f\3\2\2\2\u074f\u0119\3\2\2\2\u0750\u074e\3\2\2\2\u0751"+
		"\u0754\5\34\17\2\u0752\u0753\7\6\2\2\u0753\u0755\7\7\2\2\u0754\u0752\3"+
		"\2\2\2\u0754\u0755\3\2\2\2\u0755\u0758\3\2\2\2\u0756\u0758\5\u0118\u008d"+
		"\2\u0757\u0751\3\2\2\2\u0757\u0756\3\2\2\2\u0758\u011b\3\2\2\2\u0759\u075e"+
		"\5\u0138\u009d\2\u075a\u075e\5\u013e\u00a0\2\u075b\u075e\5\u0100\u0081"+
		"\2\u075c\u075e\5\u0106\u0084\2\u075d\u0759\3\2\2\2\u075d\u075a\3\2\2\2"+
		"\u075d\u075b\3\2\2\2\u075d\u075c\3\2\2\2\u075e\u011d\3\2\2\2\u075f\u0775"+
		"\5\u00d2j\2\u0760\u0762\7f\2\2\u0761\u0760\3\2\2\2\u0761\u0762\3\2\2\2"+
		"\u0762\u0763\3\2\2\2\u0763\u0765\7Z\2\2\u0764\u0766\7\33\2\2\u0765\u0764"+
		"\3\2\2\2\u0765\u0766\3\2\2\2\u0766\u0767\3\2\2\2\u0767\u0769\7\b\2\2\u0768"+
		"\u076a\5\u00f6|\2\u0769\u0768\3\2\2\2\u0769\u076a\3\2\2\2\u076a\u076b"+
		"\3\2\2\2\u076b\u076d\7\t\2\2\u076c\u076e\5<\37\2\u076d\u076c\3\2\2\2\u076d"+
		"\u076e\3\2\2\2\u076e\u076f\3\2\2\2\u076f\u0770\7\n\2\2\u0770\u0771\5\u00fc"+
		"\177\2\u0771\u0772\7\f\2\2\u0772\u0775\3\2\2\2\u0773\u0775\5\u0120\u0091"+
		"\2\u0774\u075f\3\2\2\2\u0774\u0761\3\2\2\2\u0774\u0773\3\2\2\2\u0775\u011f"+
		"\3\2\2\2\u0776\u0778\7f\2\2\u0777\u0776\3\2\2\2\u0777\u0778\3\2\2\2\u0778"+
		"\u0779\3\2\2\2\u0779\u077b\5\u0122\u0092\2\u077a\u077c\5<\37\2\u077b\u077a"+
		"\3\2\2\2\u077b\u077c\3\2\2\2\u077c\u077d\3\2\2\2\u077d\u077e\7=\2\2\u077e"+
		"\u077f\5\u0124\u0093\2\u077f\u0121\3\2\2\2\u0780\u0787\5\u010e\u0088\2"+
		"\u0781\u0783\7\b\2\2\u0782\u0784\5\u00f6|\2\u0783\u0782\3\2\2\2\u0783"+
		"\u0784\3\2\2\2\u0784\u0785\3\2\2\2\u0785\u0787\7\t\2\2\u0786\u0780\3\2"+
		"\2\2\u0786\u0781\3\2\2\2\u0787\u0123\3\2\2\2\u0788\u078e\5\u0118\u008d"+
		"\2\u0789\u078a\7\n\2\2\u078a\u078b\5\u00fc\177\2\u078b\u078c\7\f\2\2\u078c"+
		"\u078e\3\2\2\2\u078d\u0788\3\2\2\2\u078d\u0789\3\2\2\2\u078e\u0125\3\2"+
		"\2\2\u078f\u0790\t\16\2\2\u0790\u0127\3\2\2\2\u0791\u0799\7>\2\2\u0792"+
		"\u0799\7?\2\2\u0793\u0799\7\u008e\2\2\u0794\u0799\5\u012a\u0096\2\u0795"+
		"\u0799\7\5\2\2\u0796\u0799\5\u012e\u0098\2\u0797\u0799\5\u0130\u0099\2"+
		"\u0798\u0791\3\2\2\2\u0798\u0792\3\2\2\2\u0798\u0793\3\2\2\2\u0798\u0794"+
		"\3\2\2\2\u0798\u0795\3\2\2\2\u0798\u0796\3\2\2\2\u0798\u0797\3\2\2\2\u0799"+
		"\u0129\3\2\2\2\u079a\u079e\7\u008f\2\2\u079b\u079d\5\u012c\u0097\2\u079c"+
		"\u079b\3\2\2\2\u079d\u07a0\3\2\2\2\u079e\u079c\3\2\2\2\u079e\u079f\3\2"+
		"\2\2\u079f\u07a1\3\2\2\2\u07a0\u079e\3\2\2\2\u07a1\u07a2\7\u008f\2\2\u07a2"+
		"\u012b\3\2\2\2\u07a3\u07aa\7\u0097\2\2\u07a4\u07a5\7\u0096\2\2\u07a5\u07a6"+
		"\5\u0118\u008d\2\u07a6\u07a7\7\13\2\2\u07a7\u07aa\3\2\2\2\u07a8\u07aa"+
		"\7\u0095\2\2\u07a9\u07a3\3\2\2\2\u07a9\u07a4\3\2\2\2\u07a9\u07a8\3\2\2"+
		"\2\u07aa\u012d\3\2\2\2\u07ab\u07ac\t\17\2\2\u07ac\u012f\3\2\2\2\u07ad"+
		"\u07ae\t\20\2\2\u07ae\u0131\3\2\2\2\u07af\u07b0\6\u009a.\2\u07b0\u07b1"+
		"\5\u0138\u009d\2\u07b1\u07b2\5\u00f2z\2\u07b2\u0133\3\2\2\2\u07b3\u07b4"+
		"\6\u009b/\2\u07b4\u07b5\5\u0138\u009d\2\u07b5\u07b6\5\u00f2z\2\u07b6\u0135"+
		"\3\2\2\2\u07b7\u07ba\5\u0138\u009d\2\u07b8\u07ba\5\u013c\u009f\2\u07b9"+
		"\u07b7\3\2\2\2\u07b9\u07b8\3\2\2\2\u07ba\u0137\3\2\2\2\u07bb\u07bc\t\21"+
		"\2\2\u07bc\u0139\3\2\2\2\u07bd\u07c1\5\u0138\u009d\2\u07be\u07c1\7\u0084"+
		"\2\2\u07bf\u07c1\7\u0087\2\2\u07c0\u07bd\3\2\2\2\u07c0\u07be\3\2\2\2\u07c0"+
		"\u07bf\3\2\2\2\u07c1\u013b\3\2\2\2\u07c2\u07c6\5\u013e\u00a0\2\u07c3\u07c6"+
		"\7>\2\2\u07c4\u07c6\7?\2\2\u07c5\u07c2\3\2\2\2\u07c5\u07c3\3\2\2\2\u07c5"+
		"\u07c4\3\2\2\2\u07c6\u013d\3\2\2\2\u07c7\u07c8\t\22\2\2\u07c8\u013f\3"+
		"\2\2\2\u07c9\u07ce\7\r\2\2\u07ca\u07ce\7\2\2\3\u07cb\u07ce\6\u00a1\60"+
		"\2\u07cc\u07ce\6\u00a1\61\2\u07cd\u07c9\3\2\2\2\u07cd\u07ca\3\2\2\2\u07cd"+
		"\u07cb\3\2\2\2\u07cd\u07cc\3\2\2\2\u07ce\u0141\3\2\2\2\u010b\u0143\u014c"+
		"\u0150\u0159\u015e\u0165\u016c\u0175\u017b\u0181\u018c\u018e\u01a5\u01ab"+
		"\u01b0\u01bc\u01c3\u01c7\u01cc\u01d2\u01d6\u01dc\u01e3\u01ed\u01ef\u01ff"+
		"\u0203\u0206\u020a\u0212\u0216\u0225\u0229\u022c\u0230\u0233\u0237\u023d"+
		"\u0241\u0245\u024d\u0252\u0255\u0257\u025e\u0263\u0266\u0269\u026e\u0271"+
		"\u0274\u0279\u027c\u027f\u0283\u0289\u028d\u0291\u0295\u02a0\u02a5\u02aa"+
		"\u02b1\u02b6\u02be\u02c1\u02c4\u02c9\u02cc\u02d0\u02da\u02de\u02e4\u02ea"+
		"\u02f1\u02f7\u02fa\u0300\u0308\u030d\u0318\u031d\u0325\u032c\u0350\u0354"+
		"\u035b\u0362\u036a\u036e\u0375\u037d\u0382\u0384\u038b\u038f\u0398\u039c"+
		"\u03a4\u03a8\u03ac\u03b5\u03bd\u03c1\u03c9\u03ce\u03d0\u03d7\u03dc\u03e3"+
		"\u03ea\u03ed\u03f2\u03f7\u03fa\u03fe\u0402\u0405\u0408\u040b\u040f\u0413"+
		"\u0417\u0419\u0420\u0424\u0428\u042c\u042f\u0432\u0436\u0439\u0440\u0449"+
		"\u045c\u0460\u0464\u046e\u0472\u048a\u0493\u049a\u04a4\u04a9\u04b0\u04b7"+
		"\u04be\u04c5\u04d7\u04db\u04dd\u04e4\u04ea\u04ef\u04fe\u0501\u0507\u050b"+
		"\u0516\u051a\u0523\u0526\u052a\u052c\u052f\u0534\u053a\u053d\u0543\u0550"+
		"\u0555\u055a\u055d\u0560\u056c\u0571\u0574\u0577\u057a\u057d\u0580\u0587"+
		"\u058a\u058f\u0597\u059c\u05a0\u05ad\u05b1\u05be\u05c2\u05cb\u05d4\u05de"+
		"\u05e3\u05e6\u05ed\u05ef\u05f2\u05f5\u05f9\u05fc\u0600\u0605\u0608\u060d"+
		"\u0616\u061a\u061f\u0624\u062a\u062e\u0632\u0635\u063d\u0641\u0643\u0656"+
		"\u065a\u0660\u0669\u0677\u067c\u067e\u0687\u068b\u068f\u0696\u069d\u06a0"+
		"\u06a8\u06af\u06cc\u06d8\u06da\u06f2\u071f\u0727\u072b\u072f\u0733\u0737"+
		"\u073b\u074c\u074e\u0754\u0757\u075d\u0761\u0765\u0769\u076d\u0774\u0777"+
		"\u077b\u0783\u0786\u078d\u0798\u079e\u07a9\u07b9\u07c0\u07c5\u07cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}