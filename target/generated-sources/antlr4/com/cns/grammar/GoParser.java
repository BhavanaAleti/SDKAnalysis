// Generated from com\cns\grammar\GoParser.g4 by ANTLR 4.7.2
package com.cns.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GoParser extends GoParserBase {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BREAK=1, DEFAULT=2, FUNC=3, INTERFACE=4, SELECT=5, CASE=6, DEFER=7, GO=8, 
		MAP=9, STRUCT=10, CHAN=11, ELSE=12, GOTO=13, PACKAGE=14, SWITCH=15, CONST=16, 
		FALLTHROUGH=17, IF=18, RANGE=19, TYPE=20, CONTINUE=21, FOR=22, IMPORT=23, 
		RETURN=24, VAR=25, NIL_LIT=26, IDENTIFIER=27, L_PAREN=28, R_PAREN=29, 
		L_CURLY=30, R_CURLY=31, L_BRACKET=32, R_BRACKET=33, ASSIGN=34, COMMA=35, 
		SEMI=36, COLON=37, DOT=38, PLUS_PLUS=39, MINUS_MINUS=40, DECLARE_ASSIGN=41, 
		ELLIPSIS=42, LOGICAL_OR=43, LOGICAL_AND=44, EQUALS=45, NOT_EQUALS=46, 
		LESS=47, LESS_OR_EQUALS=48, GREATER=49, GREATER_OR_EQUALS=50, OR=51, DIV=52, 
		MOD=53, LSHIFT=54, RSHIFT=55, BIT_CLEAR=56, EXCLAMATION=57, PLUS=58, MINUS=59, 
		CARET=60, STAR=61, AMPERSAND=62, RECEIVE=63, DECIMAL_LIT=64, BINARY_LIT=65, 
		OCTAL_LIT=66, HEX_LIT=67, FLOAT_LIT=68, DECIMAL_FLOAT_LIT=69, HEX_FLOAT_LIT=70, 
		IMAGINARY_LIT=71, RUNE_LIT=72, BYTE_VALUE=73, OCTAL_BYTE_VALUE=74, HEX_BYTE_VALUE=75, 
		LITTLE_U_VALUE=76, BIG_U_VALUE=77, RAW_STRING_LIT=78, INTERPRETED_STRING_LIT=79, 
		WS=80, COMMENT=81, TERMINATOR=82, LINE_COMMENT=83, WS_NLSEMI=84, COMMENT_NLSEMI=85, 
		LINE_COMMENT_NLSEMI=86, EOS=87, OTHER=88;
	public static final int
		RULE_sourceFile = 0, RULE_packageClause = 1, RULE_importDecl = 2, RULE_importSpec = 3, 
		RULE_importPath = 4, RULE_declaration = 5, RULE_constDecl = 6, RULE_constSpec = 7, 
		RULE_identifierList = 8, RULE_expressionList = 9, RULE_typeDecl = 10, 
		RULE_typeSpec = 11, RULE_functionDecl = 12, RULE_methodDecl = 13, RULE_receiver = 14, 
		RULE_varDecl = 15, RULE_varSpec = 16, RULE_block = 17, RULE_statementList = 18, 
		RULE_statement = 19, RULE_simpleStmt = 20, RULE_expressionStmt = 21, RULE_sendStmt = 22, 
		RULE_incDecStmt = 23, RULE_assignment = 24, RULE_assign_op = 25, RULE_shortVarDecl = 26, 
		RULE_emptyStmt = 27, RULE_labeledStmt = 28, RULE_returnStmt = 29, RULE_breakStmt = 30, 
		RULE_continueStmt = 31, RULE_gotoStmt = 32, RULE_fallthroughStmt = 33, 
		RULE_deferStmt = 34, RULE_ifStmt = 35, RULE_switchStmt = 36, RULE_exprSwitchStmt = 37, 
		RULE_exprCaseClause = 38, RULE_exprSwitchCase = 39, RULE_typeSwitchStmt = 40, 
		RULE_typeSwitchGuard = 41, RULE_typeCaseClause = 42, RULE_typeSwitchCase = 43, 
		RULE_typeList = 44, RULE_selectStmt = 45, RULE_commClause = 46, RULE_commCase = 47, 
		RULE_recvStmt = 48, RULE_forStmt = 49, RULE_forClause = 50, RULE_rangeClause = 51, 
		RULE_goStmt = 52, RULE_type_ = 53, RULE_typeName = 54, RULE_typeLit = 55, 
		RULE_arrayType = 56, RULE_arrayLength = 57, RULE_elementType = 58, RULE_pointerType = 59, 
		RULE_interfaceType = 60, RULE_sliceType = 61, RULE_mapType = 62, RULE_channelType = 63, 
		RULE_methodSpec = 64, RULE_functionType = 65, RULE_signature = 66, RULE_result = 67, 
		RULE_parameters = 68, RULE_parameterDecl = 69, RULE_expression = 70, RULE_primaryExpr = 71, 
		RULE_conversion = 72, RULE_nonNamedType = 73, RULE_operand = 74, RULE_literal = 75, 
		RULE_basicLit = 76, RULE_integer = 77, RULE_operandName = 78, RULE_qualifiedIdent = 79, 
		RULE_compositeLit = 80, RULE_literalType = 81, RULE_literalValue = 82, 
		RULE_elementList = 83, RULE_keyedElement = 84, RULE_key = 85, RULE_element = 86, 
		RULE_structType = 87, RULE_fieldDecl = 88, RULE_string_ = 89, RULE_embeddedField = 90, 
		RULE_functionLit = 91, RULE_index = 92, RULE_slice_ = 93, RULE_typeAssertion = 94, 
		RULE_arguments = 95, RULE_methodExpr = 96, RULE_receiverType = 97, RULE_eos = 98;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceFile", "packageClause", "importDecl", "importSpec", "importPath", 
			"declaration", "constDecl", "constSpec", "identifierList", "expressionList", 
			"typeDecl", "typeSpec", "functionDecl", "methodDecl", "receiver", "varDecl", 
			"varSpec", "block", "statementList", "statement", "simpleStmt", "expressionStmt", 
			"sendStmt", "incDecStmt", "assignment", "assign_op", "shortVarDecl", 
			"emptyStmt", "labeledStmt", "returnStmt", "breakStmt", "continueStmt", 
			"gotoStmt", "fallthroughStmt", "deferStmt", "ifStmt", "switchStmt", "exprSwitchStmt", 
			"exprCaseClause", "exprSwitchCase", "typeSwitchStmt", "typeSwitchGuard", 
			"typeCaseClause", "typeSwitchCase", "typeList", "selectStmt", "commClause", 
			"commCase", "recvStmt", "forStmt", "forClause", "rangeClause", "goStmt", 
			"type_", "typeName", "typeLit", "arrayType", "arrayLength", "elementType", 
			"pointerType", "interfaceType", "sliceType", "mapType", "channelType", 
			"methodSpec", "functionType", "signature", "result", "parameters", "parameterDecl", 
			"expression", "primaryExpr", "conversion", "nonNamedType", "operand", 
			"literal", "basicLit", "integer", "operandName", "qualifiedIdent", "compositeLit", 
			"literalType", "literalValue", "elementList", "keyedElement", "key", 
			"element", "structType", "fieldDecl", "string_", "embeddedField", "functionLit", 
			"index", "slice_", "typeAssertion", "arguments", "methodExpr", "receiverType", 
			"eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'break'", "'default'", "'func'", "'interface'", "'select'", "'case'", 
			"'defer'", "'go'", "'map'", "'struct'", "'chan'", "'else'", "'goto'", 
			"'package'", "'switch'", "'const'", "'fallthrough'", "'if'", "'range'", 
			"'type'", "'continue'", "'for'", "'import'", "'return'", "'var'", "'nil'", 
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'='", "','", "';'", 
			"':'", "'.'", "'++'", "'--'", "':='", "'...'", "'||'", "'&&'", "'=='", 
			"'!='", "'<'", "'<='", "'>'", "'>='", "'|'", "'/'", "'%'", "'<<'", "'>>'", 
			"'&^'", "'!'", "'+'", "'-'", "'^'", "'*'", "'&'", "'<-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BREAK", "DEFAULT", "FUNC", "INTERFACE", "SELECT", "CASE", "DEFER", 
			"GO", "MAP", "STRUCT", "CHAN", "ELSE", "GOTO", "PACKAGE", "SWITCH", "CONST", 
			"FALLTHROUGH", "IF", "RANGE", "TYPE", "CONTINUE", "FOR", "IMPORT", "RETURN", 
			"VAR", "NIL_LIT", "IDENTIFIER", "L_PAREN", "R_PAREN", "L_CURLY", "R_CURLY", 
			"L_BRACKET", "R_BRACKET", "ASSIGN", "COMMA", "SEMI", "COLON", "DOT", 
			"PLUS_PLUS", "MINUS_MINUS", "DECLARE_ASSIGN", "ELLIPSIS", "LOGICAL_OR", 
			"LOGICAL_AND", "EQUALS", "NOT_EQUALS", "LESS", "LESS_OR_EQUALS", "GREATER", 
			"GREATER_OR_EQUALS", "OR", "DIV", "MOD", "LSHIFT", "RSHIFT", "BIT_CLEAR", 
			"EXCLAMATION", "PLUS", "MINUS", "CARET", "STAR", "AMPERSAND", "RECEIVE", 
			"DECIMAL_LIT", "BINARY_LIT", "OCTAL_LIT", "HEX_LIT", "FLOAT_LIT", "DECIMAL_FLOAT_LIT", 
			"HEX_FLOAT_LIT", "IMAGINARY_LIT", "RUNE_LIT", "BYTE_VALUE", "OCTAL_BYTE_VALUE", 
			"HEX_BYTE_VALUE", "LITTLE_U_VALUE", "BIG_U_VALUE", "RAW_STRING_LIT", 
			"INTERPRETED_STRING_LIT", "WS", "COMMENT", "TERMINATOR", "LINE_COMMENT", 
			"WS_NLSEMI", "COMMENT_NLSEMI", "LINE_COMMENT_NLSEMI", "EOS", "OTHER"
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
	public String getGrammarFileName() { return "GoParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SourceFileContext extends ParserRuleContext {
		public PackageClauseContext packageClause() {
			return getRuleContext(PackageClauseContext.class,0);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public TerminalNode EOF() { return getToken(GoParser.EOF, 0); }
		public List<ImportDeclContext> importDecl() {
			return getRuleContexts(ImportDeclContext.class);
		}
		public ImportDeclContext importDecl(int i) {
			return getRuleContext(ImportDeclContext.class,i);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public SourceFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterSourceFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitSourceFile(this);
		}
	}

	public final SourceFileContext sourceFile() throws RecognitionException {
		SourceFileContext _localctx = new SourceFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			packageClause();
			setState(199);
			eos();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(200);
				importDecl();
				setState(201);
				eos();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << CONST) | (1L << TYPE) | (1L << VAR))) != 0)) {
				{
				{
				setState(211);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(208);
					functionDecl();
					}
					break;
				case 2:
					{
					setState(209);
					methodDecl();
					}
					break;
				case 3:
					{
					setState(210);
					declaration();
					}
					break;
				}
				setState(213);
				eos();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
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

	public static class PackageClauseContext extends ParserRuleContext {
		public Token packageName;
		public TerminalNode PACKAGE() { return getToken(GoParser.PACKAGE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public PackageClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterPackageClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitPackageClause(this);
		}
	}

	public final PackageClauseContext packageClause() throws RecognitionException {
		PackageClauseContext _localctx = new PackageClauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(PACKAGE);
			setState(223);
			((PackageClauseContext)_localctx).packageName = match(IDENTIFIER);
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

	public static class ImportDeclContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(GoParser.IMPORT, 0); }
		public List<ImportSpecContext> importSpec() {
			return getRuleContexts(ImportSpecContext.class);
		}
		public ImportSpecContext importSpec(int i) {
			return getRuleContext(ImportSpecContext.class,i);
		}
		public TerminalNode L_PAREN() { return getToken(GoParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(GoParser.R_PAREN, 0); }
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public ImportDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterImportDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitImportDecl(this);
		}
	}

	public final ImportDeclContext importDecl() throws RecognitionException {
		ImportDeclContext _localctx = new ImportDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(IMPORT);
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case DOT:
			case RAW_STRING_LIT:
			case INTERPRETED_STRING_LIT:
				{
				setState(226);
				importSpec();
				}
				break;
			case L_PAREN:
				{
				setState(227);
				match(L_PAREN);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (IDENTIFIER - 27)) | (1L << (DOT - 27)) | (1L << (RAW_STRING_LIT - 27)) | (1L << (INTERPRETED_STRING_LIT - 27)))) != 0)) {
					{
					{
					setState(228);
					importSpec();
					setState(229);
					eos();
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(236);
				match(R_PAREN);
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

	public static class ImportSpecContext extends ParserRuleContext {
		public Token alias;
		public ImportPathContext importPath() {
			return getRuleContext(ImportPathContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GoParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public ImportSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterImportSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitImportSpec(this);
		}
	}

	public final ImportSpecContext importSpec() throws RecognitionException {
		ImportSpecContext _localctx = new ImportSpecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER || _la==DOT) {
				{
				setState(239);
				((ImportSpecContext)_localctx).alias = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==DOT) ) {
					((ImportSpecContext)_localctx).alias = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(242);
			importPath();
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

	public static class ImportPathContext extends ParserRuleContext {
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public ImportPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterImportPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitImportPath(this);
		}
	}

	public final ImportPathContext importPath() throws RecognitionException {
		ImportPathContext _localctx = new ImportPathContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			string_();
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
		public ConstDeclContext constDecl() {
			return getRuleContext(ConstDeclContext.class,0);
		}
		public TypeDeclContext typeDecl() {
			return getRuleContext(TypeDeclContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				constDecl();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				typeDecl();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				varDecl();
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

	public static class ConstDeclContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(GoParser.CONST, 0); }
		public List<ConstSpecContext> constSpec() {
			return getRuleContexts(ConstSpecContext.class);
		}
		public ConstSpecContext constSpec(int i) {
			return getRuleContext(ConstSpecContext.class,i);
		}
		public TerminalNode L_PAREN() { return getToken(GoParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(GoParser.R_PAREN, 0); }
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitConstDecl(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(CONST);
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(252);
				constSpec();
				}
				break;
			case L_PAREN:
				{
				setState(253);
				match(L_PAREN);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(254);
					constSpec();
					setState(255);
					eos();
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262);
				match(R_PAREN);
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

	public static class ConstSpecContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(GoParser.ASSIGN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ConstSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterConstSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitConstSpec(this);
		}
	}

	public final ConstSpecContext constSpec() throws RecognitionException {
		ConstSpecContext _localctx = new ConstSpecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			identifierList();
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << INTERFACE) | (1L << MAP) | (1L << STRUCT) | (1L << CHAN) | (1L << IDENTIFIER) | (1L << L_PAREN) | (1L << L_BRACKET) | (1L << STAR) | (1L << RECEIVE))) != 0)) {
					{
					setState(266);
					type_();
					}
				}

				setState(269);
				match(ASSIGN);
				setState(270);
				expressionList();
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(GoParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GoParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GoParser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_identifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(IDENTIFIER);
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(274);
					match(COMMA);
					setState(275);
					match(IDENTIFIER);
					}
					} 
				}
				setState(280);
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
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GoParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			expression(0);
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(282);
					match(COMMA);
					setState(283);
					expression(0);
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class TypeDeclContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(GoParser.TYPE, 0); }
		public List<TypeSpecContext> typeSpec() {
			return getRuleContexts(TypeSpecContext.class);
		}
		public TypeSpecContext typeSpec(int i) {
			return getRuleContext(TypeSpecContext.class,i);
		}
		public TerminalNode L_PAREN() { return getToken(GoParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(GoParser.R_PAREN, 0); }
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public TypeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterTypeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitTypeDecl(this);
		}
	}

	public final TypeDeclContext typeDecl() throws RecognitionException {
		TypeDeclContext _localctx = new TypeDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(TYPE);
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(290);
				typeSpec();
				}
				break;
			case L_PAREN:
				{
				setState(291);
				match(L_PAREN);
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(292);
					typeSpec();
					setState(293);
					eos();
					}
					}
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(300);
				match(R_PAREN);
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

	public static class TypeSpecContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(GoParser.ASSIGN, 0); }
		public TypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitTypeSpec(this);
		}
	}

	public final TypeSpecContext typeSpec() throws RecognitionException {
		TypeSpecContext _localctx = new TypeSpecContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(IDENTIFIER);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(304);
				match(ASSIGN);
				}
			}

			setState(307);
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

	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(GoParser.FUNC, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitFunctionDecl(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(FUNC);
			setState(310);
			match(IDENTIFIER);
			{
			setState(311);
			signature();
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(312);
				block();
				}
				break;
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

	public static class MethodDeclContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(GoParser.FUNC, 0); }
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitMethodDecl(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methodDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(FUNC);
			setState(316);
			receiver();
			setState(317);
			match(IDENTIFIER);
			{
			setState(318);
			signature();
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(319);
				block();
				}
				break;
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

	public static class ReceiverContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitReceiver(this);
		}
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_receiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			parameters();
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

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GoParser.VAR, 0); }
		public List<VarSpecContext> varSpec() {
			return getRuleContexts(VarSpecContext.class);
		}
		public VarSpecContext varSpec(int i) {
			return getRuleContext(VarSpecContext.class,i);
		}
		public TerminalNode L_PAREN() { return getToken(GoParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(GoParser.R_PAREN, 0); }
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(VAR);
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(325);
				varSpec();
				}
				break;
			case L_PAREN:
				{
				setState(326);
				match(L_PAREN);
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(327);
					varSpec();
					setState(328);
					eos();
					}
					}
					setState(334);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(335);
				match(R_PAREN);
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

	public static class VarSpecContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(GoParser.ASSIGN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public VarSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterVarSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitVarSpec(this);
		}
	}

	public final VarSpecContext varSpec() throws RecognitionException {
		VarSpecContext _localctx = new VarSpecContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_varSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			identifierList();
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case INTERFACE:
			case MAP:
			case STRUCT:
			case CHAN:
			case IDENTIFIER:
			case L_PAREN:
			case L_BRACKET:
			case STAR:
			case RECEIVE:
				{
				setState(339);
				type_();
				setState(342);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(340);
					match(ASSIGN);
					setState(341);
					expressionList();
					}
					break;
				}
				}
				break;
			case ASSIGN:
				{
				setState(344);
				match(ASSIGN);
				setState(345);
				expressionList();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode L_CURLY() { return getToken(GoParser.L_CURLY, 0); }
		public TerminalNode R_CURLY() { return getToken(GoParser.R_CURLY, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(L_CURLY);
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(349);
				statementList();
				}
				break;
			}
			setState(352);
			match(R_CURLY);
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
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(GoParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(GoParser.SEMI, i);
		}
		public List<TerminalNode> EOS() { return getTokens(GoParser.EOS); }
		public TerminalNode EOS(int i) {
			return getToken(GoParser.EOS, i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(366); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(361);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(355);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SEMI) {
							{
							setState(354);
							match(SEMI);
							}
						}

						}
						break;
					case 2:
						{
						setState(358);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==EOS) {
							{
							setState(357);
							match(EOS);
							}
						}

						}
						break;
					case 3:
						{
						setState(360);
						if (!(this.closingBracket())) throw new FailedPredicateException(this, "this.closingBracket()");
						}
						break;
					}
					setState(363);
					statement();
					setState(364);
					eos();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(368); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public LabeledStmtContext labeledStmt() {
			return getRuleContext(LabeledStmtContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public GoStmtContext goStmt() {
			return getRuleContext(GoStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public ContinueStmtContext continueStmt() {
			return getRuleContext(ContinueStmtContext.class,0);
		}
		public GotoStmtContext gotoStmt() {
			return getRuleContext(GotoStmtContext.class,0);
		}
		public FallthroughStmtContext fallthroughStmt() {
			return getRuleContext(FallthroughStmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public SwitchStmtContext switchStmt() {
			return getRuleContext(SwitchStmtContext.class,0);
		}
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public DeferStmtContext deferStmt() {
			return getRuleContext(DeferStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statement);
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				labeledStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				simpleStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(373);
				goStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(374);
				returnStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(375);
				breakStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(376);
				continueStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(377);
				gotoStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(378);
				fallthroughStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(379);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(380);
				ifStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(381);
				switchStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(382);
				selectStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(383);
				forStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(384);
				deferStmt();
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

	public static class SimpleStmtContext extends ParserRuleContext {
		public SendStmtContext sendStmt() {
			return getRuleContext(SendStmtContext.class,0);
		}
		public IncDecStmtContext incDecStmt() {
			return getRuleContext(IncDecStmtContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public ShortVarDeclContext shortVarDecl() {
			return getRuleContext(ShortVarDeclContext.class,0);
		}
		public SimpleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterSimpleStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitSimpleStmt(this);
		}
	}

	public final SimpleStmtContext simpleStmt() throws RecognitionException {
		SimpleStmtContext _localctx = new SimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_simpleStmt);
		try {
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				sendStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				incDecStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(389);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(390);
				expressionStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(391);
				shortVarDecl();
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

	public static class ExpressionStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterExpressionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitExpressionStmt(this);
		}
	}

	public final ExpressionStmtContext expressionStmt() throws RecognitionException {
		ExpressionStmtContext _localctx = new ExpressionStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressionStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			expression(0);
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

	public static class SendStmtContext extends ParserRuleContext {
		public ExpressionContext channel;
		public TerminalNode RECEIVE() { return getToken(GoParser.RECEIVE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SendStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sendStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterSendStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitSendStmt(this);
		}
	}

	public final SendStmtContext sendStmt() throws RecognitionException {
		SendStmtContext _localctx = new SendStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sendStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			((SendStmtContext)_localctx).channel = expression(0);
			setState(397);
			match(RECEIVE);
			setState(398);
			expression(0);
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

	public static class IncDecStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUS_PLUS() { return getToken(GoParser.PLUS_PLUS, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(GoParser.MINUS_MINUS, 0); }
		public IncDecStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDecStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterIncDecStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitIncDecStmt(this);
		}
	}

	public final IncDecStmtContext incDecStmt() throws RecognitionException {
		IncDecStmtContext _localctx = new IncDecStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_incDecStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			expression(0);
			setState(401);
			_la = _input.LA(1);
			if ( !(_la==PLUS_PLUS || _la==MINUS_MINUS) ) {
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

	public static class AssignmentContext extends ParserRuleContext {
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			expressionList();
			setState(404);
			assign_op();
			setState(405);
			expressionList();
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

	public static class Assign_opContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(GoParser.ASSIGN, 0); }
		public TerminalNode PLUS() { return getToken(GoParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GoParser.MINUS, 0); }
		public TerminalNode OR() { return getToken(GoParser.OR, 0); }
		public TerminalNode CARET() { return getToken(GoParser.CARET, 0); }
		public TerminalNode STAR() { return getToken(GoParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(GoParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(GoParser.MOD, 0); }
		public TerminalNode LSHIFT() { return getToken(GoParser.LSHIFT, 0); }
		public TerminalNode RSHIFT() { return getToken(GoParser.RSHIFT, 0); }
		public TerminalNode AMPERSAND() { return getToken(GoParser.AMPERSAND, 0); }
		public TerminalNode BIT_CLEAR() { return getToken(GoParser.BIT_CLEAR, 0); }
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterAssign_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitAssign_op(this);
		}
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << DIV) | (1L << MOD) | (1L << LSHIFT) | (1L << RSHIFT) | (1L << BIT_CLEAR) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND))) != 0)) {
				{
				setState(407);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << DIV) | (1L << MOD) | (1L << LSHIFT) | (1L << RSHIFT) | (1L << BIT_CLEAR) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(410);
			match(ASSIGN);
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

	public static class ShortVarDeclContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode DECLARE_ASSIGN() { return getToken(GoParser.DECLARE_ASSIGN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ShortVarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortVarDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterShortVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitShortVarDecl(this);
		}
	}

	public final ShortVarDeclContext shortVarDecl() throws RecognitionException {
		ShortVarDeclContext _localctx = new ShortVarDeclContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_shortVarDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			identifierList();
			setState(413);
			match(DECLARE_ASSIGN);
			setState(414);
			expressionList();
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

	public static class EmptyStmtContext extends ParserRuleContext {
		public TerminalNode EOS() { return getToken(GoParser.EOS, 0); }
		public TerminalNode SEMI() { return getToken(GoParser.SEMI, 0); }
		public EmptyStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterEmptyStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitEmptyStmt(this);
		}
	}

	public final EmptyStmtContext emptyStmt() throws RecognitionException {
		EmptyStmtContext _localctx = new EmptyStmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_emptyStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_la = _input.LA(1);
			if ( !(_la==SEMI || _la==EOS) ) {
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

	public static class LabeledStmtContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(GoParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterLabeledStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitLabeledStmt(this);
		}
	}

	public final LabeledStmtContext labeledStmt() throws RecognitionException {
		LabeledStmtContext _localctx = new LabeledStmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_labeledStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(IDENTIFIER);
			setState(419);
			match(COLON);
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(420);
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

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(GoParser.RETURN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitReturnStmt(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(RETURN);
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(424);
				expressionList();
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

	public static class BreakStmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(GoParser.BREAK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitBreakStmt(this);
		}
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(BREAK);
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(428);
				match(IDENTIFIER);
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

	public static class ContinueStmtContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(GoParser.CONTINUE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public ContinueStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterContinueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitContinueStmt(this);
		}
	}

	public final ContinueStmtContext continueStmt() throws RecognitionException {
		ContinueStmtContext _localctx = new ContinueStmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_continueStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(CONTINUE);
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(432);
				match(IDENTIFIER);
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

	public static class GotoStmtContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(GoParser.GOTO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public GotoStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterGotoStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitGotoStmt(this);
		}
	}

	public final GotoStmtContext gotoStmt() throws RecognitionException {
		GotoStmtContext _localctx = new GotoStmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_gotoStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(GOTO);
			setState(436);
			match(IDENTIFIER);
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

	public static class FallthroughStmtContext extends ParserRuleContext {
		public TerminalNode FALLTHROUGH() { return getToken(GoParser.FALLTHROUGH, 0); }
		public FallthroughStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fallthroughStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterFallthroughStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitFallthroughStmt(this);
		}
	}

	public final FallthroughStmtContext fallthroughStmt() throws RecognitionException {
		FallthroughStmtContext _localctx = new FallthroughStmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_fallthroughStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(FALLTHROUGH);
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

	public static class DeferStmtContext extends ParserRuleContext {
		public TerminalNode DEFER() { return getToken(GoParser.DEFER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeferStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deferStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterDeferStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitDeferStmt(this);
		}
	}

	public final DeferStmtContext deferStmt() throws RecognitionException {
		DeferStmtContext _localctx = new DeferStmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_deferStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(DEFER);
			setState(441);
			expression(0);
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

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GoParser.IF, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(GoParser.ELSE, 0); }
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitIfStmt(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(IF);
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(444);
				expression(0);
				}
				break;
			case 2:
				{
				setState(445);
				eos();
				setState(446);
				expression(0);
				}
				break;
			case 3:
				{
				setState(448);
				simpleStmt();
				setState(449);
				eos();
				setState(450);
				expression(0);
				}
				break;
			}
			setState(454);
			block();
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(455);
				match(ELSE);
				setState(458);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(456);
					ifStmt();
					}
					break;
				case L_CURLY:
					{
					setState(457);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class SwitchStmtContext extends ParserRuleContext {
		public ExprSwitchStmtContext exprSwitchStmt() {
			return getRuleContext(ExprSwitchStmtContext.class,0);
		}
		public TypeSwitchStmtContext typeSwitchStmt() {
			return getRuleContext(TypeSwitchStmtContext.class,0);
		}
		public SwitchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterSwitchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitSwitchStmt(this);
		}
	}

	public final SwitchStmtContext switchStmt() throws RecognitionException {
		SwitchStmtContext _localctx = new SwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_switchStmt);
		try {
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				exprSwitchStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				typeSwitchStmt();
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

	public static class ExprSwitchStmtContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(GoParser.SWITCH, 0); }
		public TerminalNode L_CURLY() { return getToken(GoParser.L_CURLY, 0); }
		public TerminalNode R_CURLY() { return getToken(GoParser.R_CURLY, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public List<ExprCaseClauseContext> exprCaseClause() {
			return getRuleContexts(ExprCaseClauseContext.class);
		}
		public ExprCaseClauseContext exprCaseClause(int i) {
			return getRuleContext(ExprCaseClauseContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public ExprSwitchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSwitchStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterExprSwitchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitExprSwitchStmt(this);
		}
	}

	public final ExprSwitchStmtContext exprSwitchStmt() throws RecognitionException {
		ExprSwitchStmtContext _localctx = new ExprSwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_exprSwitchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(SWITCH);
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << INTERFACE) | (1L << MAP) | (1L << STRUCT) | (1L << CHAN) | (1L << NIL_LIT) | (1L << IDENTIFIER) | (1L << L_PAREN) | (1L << L_BRACKET) | (1L << EXCLAMATION) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND) | (1L << RECEIVE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECIMAL_LIT - 64)) | (1L << (BINARY_LIT - 64)) | (1L << (OCTAL_LIT - 64)) | (1L << (HEX_LIT - 64)) | (1L << (FLOAT_LIT - 64)) | (1L << (IMAGINARY_LIT - 64)) | (1L << (RUNE_LIT - 64)) | (1L << (RAW_STRING_LIT - 64)) | (1L << (INTERPRETED_STRING_LIT - 64)))) != 0)) {
					{
					setState(467);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(471);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(470);
					simpleStmt();
					}
					break;
				}
				setState(473);
				eos();
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << INTERFACE) | (1L << MAP) | (1L << STRUCT) | (1L << CHAN) | (1L << NIL_LIT) | (1L << IDENTIFIER) | (1L << L_PAREN) | (1L << L_BRACKET) | (1L << EXCLAMATION) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND) | (1L << RECEIVE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECIMAL_LIT - 64)) | (1L << (BINARY_LIT - 64)) | (1L << (OCTAL_LIT - 64)) | (1L << (HEX_LIT - 64)) | (1L << (FLOAT_LIT - 64)) | (1L << (IMAGINARY_LIT - 64)) | (1L << (RUNE_LIT - 64)) | (1L << (RAW_STRING_LIT - 64)) | (1L << (INTERPRETED_STRING_LIT - 64)))) != 0)) {
					{
					setState(474);
					expression(0);
					}
				}

				}
				break;
			}
			setState(479);
			match(L_CURLY);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFAULT || _la==CASE) {
				{
				{
				setState(480);
				exprCaseClause();
				}
				}
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(486);
			match(R_CURLY);
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

	public static class ExprCaseClauseContext extends ParserRuleContext {
		public ExprSwitchCaseContext exprSwitchCase() {
			return getRuleContext(ExprSwitchCaseContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GoParser.COLON, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ExprCaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprCaseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterExprCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitExprCaseClause(this);
		}
	}

	public final ExprCaseClauseContext exprCaseClause() throws RecognitionException {
		ExprCaseClauseContext _localctx = new ExprCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exprCaseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			exprSwitchCase();
			setState(489);
			match(COLON);
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(490);
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

	public static class ExprSwitchCaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(GoParser.CASE, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(GoParser.DEFAULT, 0); }
		public ExprSwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSwitchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterExprSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitExprSwitchCase(this);
		}
	}

	public final ExprSwitchCaseContext exprSwitchCase() throws RecognitionException {
		ExprSwitchCaseContext _localctx = new ExprSwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_exprSwitchCase);
		try {
			setState(496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				match(CASE);
				setState(494);
				expressionList();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				match(DEFAULT);
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

	public static class TypeSwitchStmtContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(GoParser.SWITCH, 0); }
		public TerminalNode L_CURLY() { return getToken(GoParser.L_CURLY, 0); }
		public TerminalNode R_CURLY() { return getToken(GoParser.R_CURLY, 0); }
		public TypeSwitchGuardContext typeSwitchGuard() {
			return getRuleContext(TypeSwitchGuardContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public List<TypeCaseClauseContext> typeCaseClause() {
			return getRuleContexts(TypeCaseClauseContext.class);
		}
		public TypeCaseClauseContext typeCaseClause(int i) {
			return getRuleContext(TypeCaseClauseContext.class,i);
		}
		public TypeSwitchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSwitchStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterTypeSwitchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitTypeSwitchStmt(this);
		}
	}

	public final TypeSwitchStmtContext typeSwitchStmt() throws RecognitionException {
		TypeSwitchStmtContext _localctx = new TypeSwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typeSwitchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(SWITCH);
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(499);
				typeSwitchGuard();
				}
				break;
			case 2:
				{
				setState(500);
				eos();
				setState(501);
				typeSwitchGuard();
				}
				break;
			case 3:
				{
				setState(503);
				simpleStmt();
				setState(504);
				eos();
				setState(505);
				typeSwitchGuard();
				}
				break;
			}
			setState(509);
			match(L_CURLY);
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFAULT || _la==CASE) {
				{
				{
				setState(510);
				typeCaseClause();
				}
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(516);
			match(R_CURLY);
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

	public static class TypeSwitchGuardContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GoParser.DOT, 0); }
		public TerminalNode L_PAREN() { return getToken(GoParser.L_PAREN, 0); }
		public TerminalNode TYPE() { return getToken(GoParser.TYPE, 0); }
		public TerminalNode R_PAREN() { return getToken(GoParser.R_PAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public TerminalNode DECLARE_ASSIGN() { return getToken(GoParser.DECLARE_ASSIGN, 0); }
		public TypeSwitchGuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSwitchGuard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterTypeSwitchGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitTypeSwitchGuard(this);
		}
	}

	public final TypeSwitchGuardContext typeSwitchGuard() throws RecognitionException {
		TypeSwitchGuardContext _localctx = new TypeSwitchGuardContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_typeSwitchGuard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(518);
				match(IDENTIFIER);
				setState(519);
				match(DECLARE_ASSIGN);
				}
				break;
			}
			setState(522);
			primaryExpr(0);
			setState(523);
			match(DOT);
			setState(524);
			match(L_PAREN);
			setState(525);
			match(TYPE);
			setState(526);
			match(R_PAREN);
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

	public static class TypeCaseClauseContext extends ParserRuleContext {
		public TypeSwitchCaseContext typeSwitchCase() {
			return getRuleContext(TypeSwitchCaseContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GoParser.COLON, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TypeCaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCaseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterTypeCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitTypeCaseClause(this);
		}
	}

	public final TypeCaseClauseContext typeCaseClause() throws RecognitionException {
		TypeCaseClauseContext _localctx = new TypeCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeCaseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			typeSwitchCase();
			setState(529);
			match(COLON);
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(530);
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

	public static class TypeSwitchCaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(GoParser.CASE, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(GoParser.DEFAULT, 0); }
		public TypeSwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSwitchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterTypeSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitTypeSwitchCase(this);
		}
	}

	public final TypeSwitchCaseContext typeSwitchCase() throws RecognitionException {
		TypeSwitchCaseContext _localctx = new TypeSwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_typeSwitchCase);
		try {
			setState(536);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				match(CASE);
				setState(534);
				typeList();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				match(DEFAULT);
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

	public static class TypeListContext extends ParserRuleContext {
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public List<TerminalNode> NIL_LIT() { return getTokens(GoParser.NIL_LIT); }
		public TerminalNode NIL_LIT(int i) {
			return getToken(GoParser.NIL_LIT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GoParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case INTERFACE:
			case MAP:
			case STRUCT:
			case CHAN:
			case IDENTIFIER:
			case L_PAREN:
			case L_BRACKET:
			case STAR:
			case RECEIVE:
				{
				setState(538);
				type_();
				}
				break;
			case NIL_LIT:
				{
				setState(539);
				match(NIL_LIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(542);
				match(COMMA);
				setState(545);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNC:
				case INTERFACE:
				case MAP:
				case STRUCT:
				case CHAN:
				case IDENTIFIER:
				case L_PAREN:
				case L_BRACKET:
				case STAR:
				case RECEIVE:
					{
					setState(543);
					type_();
					}
					break;
				case NIL_LIT:
					{
					setState(544);
					match(NIL_LIT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(551);
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

	public static class SelectStmtContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(GoParser.SELECT, 0); }
		public TerminalNode L_CURLY() { return getToken(GoParser.L_CURLY, 0); }
		public TerminalNode R_CURLY() { return getToken(GoParser.R_CURLY, 0); }
		public List<CommClauseContext> commClause() {
			return getRuleContexts(CommClauseContext.class);
		}
		public CommClauseContext commClause(int i) {
			return getRuleContext(CommClauseContext.class,i);
		}
		public SelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterSelectStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitSelectStmt(this);
		}
	}

	public final SelectStmtContext selectStmt() throws RecognitionException {
		SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_selectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(SELECT);
			setState(553);
			match(L_CURLY);
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFAULT || _la==CASE) {
				{
				{
				setState(554);
				commClause();
				}
				}
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(560);
			match(R_CURLY);
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

	public static class CommClauseContext extends ParserRuleContext {
		public CommCaseContext commCase() {
			return getRuleContext(CommCaseContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GoParser.COLON, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CommClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterCommClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitCommClause(this);
		}
	}

	public final CommClauseContext commClause() throws RecognitionException {
		CommClauseContext _localctx = new CommClauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_commClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			commCase();
			setState(563);
			match(COLON);
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(564);
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

	public static class CommCaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(GoParser.CASE, 0); }
		public SendStmtContext sendStmt() {
			return getRuleContext(SendStmtContext.class,0);
		}
		public RecvStmtContext recvStmt() {
			return getRuleContext(RecvStmtContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(GoParser.DEFAULT, 0); }
		public CommCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterCommCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitCommCase(this);
		}
	}

	public final CommCaseContext commCase() throws RecognitionException {
		CommCaseContext _localctx = new CommCaseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_commCase);
		try {
			setState(573);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				match(CASE);
				setState(570);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(568);
					sendStmt();
					}
					break;
				case 2:
					{
					setState(569);
					recvStmt();
					}
					break;
				}
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(572);
				match(DEFAULT);
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

	public static class RecvStmtContext extends ParserRuleContext {
		public ExpressionContext recvExpr;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(GoParser.ASSIGN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode DECLARE_ASSIGN() { return getToken(GoParser.DECLARE_ASSIGN, 0); }
		public RecvStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recvStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterRecvStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitRecvStmt(this);
		}
	}

	public final RecvStmtContext recvStmt() throws RecognitionException {
		RecvStmtContext _localctx = new RecvStmtContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_recvStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(575);
				expressionList();
				setState(576);
				match(ASSIGN);
				}
				break;
			case 2:
				{
				setState(578);
				identifierList();
				setState(579);
				match(DECLARE_ASSIGN);
				}
				break;
			}
			setState(583);
			((RecvStmtContext)_localctx).recvExpr = expression(0);
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

	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GoParser.FOR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RangeClauseContext rangeClause() {
			return getRuleContext(RangeClauseContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitForStmt(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(FOR);
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << INTERFACE) | (1L << MAP) | (1L << STRUCT) | (1L << CHAN) | (1L << NIL_LIT) | (1L << IDENTIFIER) | (1L << L_PAREN) | (1L << L_BRACKET) | (1L << EXCLAMATION) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND) | (1L << RECEIVE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECIMAL_LIT - 64)) | (1L << (BINARY_LIT - 64)) | (1L << (OCTAL_LIT - 64)) | (1L << (HEX_LIT - 64)) | (1L << (FLOAT_LIT - 64)) | (1L << (IMAGINARY_LIT - 64)) | (1L << (RUNE_LIT - 64)) | (1L << (RAW_STRING_LIT - 64)) | (1L << (INTERPRETED_STRING_LIT - 64)))) != 0)) {
					{
					setState(586);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(589);
				forClause();
				}
				break;
			case 3:
				{
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << INTERFACE) | (1L << MAP) | (1L << STRUCT) | (1L << CHAN) | (1L << RANGE) | (1L << NIL_LIT) | (1L << IDENTIFIER) | (1L << L_PAREN) | (1L << L_BRACKET) | (1L << EXCLAMATION) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND) | (1L << RECEIVE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECIMAL_LIT - 64)) | (1L << (BINARY_LIT - 64)) | (1L << (OCTAL_LIT - 64)) | (1L << (HEX_LIT - 64)) | (1L << (FLOAT_LIT - 64)) | (1L << (IMAGINARY_LIT - 64)) | (1L << (RUNE_LIT - 64)) | (1L << (RAW_STRING_LIT - 64)) | (1L << (INTERPRETED_STRING_LIT - 64)))) != 0)) {
					{
					setState(590);
					rangeClause();
					}
				}

				}
				break;
			}
			setState(595);
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

	public static class ForClauseContext extends ParserRuleContext {
		public SimpleStmtContext initStmt;
		public SimpleStmtContext postStmt;
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<SimpleStmtContext> simpleStmt() {
			return getRuleContexts(SimpleStmtContext.class);
		}
		public SimpleStmtContext simpleStmt(int i) {
			return getRuleContext(SimpleStmtContext.class,i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitForClause(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(597);
				((ForClauseContext)_localctx).initStmt = simpleStmt();
				}
				break;
			}
			setState(600);
			eos();
			setState(602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(601);
				expression(0);
				}
				break;
			}
			setState(604);
			eos();
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << INTERFACE) | (1L << MAP) | (1L << STRUCT) | (1L << CHAN) | (1L << NIL_LIT) | (1L << IDENTIFIER) | (1L << L_PAREN) | (1L << L_BRACKET) | (1L << EXCLAMATION) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND) | (1L << RECEIVE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECIMAL_LIT - 64)) | (1L << (BINARY_LIT - 64)) | (1L << (OCTAL_LIT - 64)) | (1L << (HEX_LIT - 64)) | (1L << (FLOAT_LIT - 64)) | (1L << (IMAGINARY_LIT - 64)) | (1L << (RUNE_LIT - 64)) | (1L << (RAW_STRING_LIT - 64)) | (1L << (INTERPRETED_STRING_LIT - 64)))) != 0)) {
				{
				setState(605);
				((ForClauseContext)_localctx).postStmt = simpleStmt();
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

	public static class RangeClauseContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(GoParser.RANGE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(GoParser.ASSIGN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode DECLARE_ASSIGN() { return getToken(GoParser.DECLARE_ASSIGN, 0); }
		public RangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterRangeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitRangeClause(this);
		}
	}

	public final RangeClauseContext rangeClause() throws RecognitionException {
		RangeClauseContext _localctx = new RangeClauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_rangeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(608);
				expressionList();
				setState(609);
				match(ASSIGN);
				}
				break;
			case 2:
				{
				setState(611);
				identifierList();
				setState(612);
				match(DECLARE_ASSIGN);
				}
				break;
			}
			setState(616);
			match(RANGE);
			setState(617);
			expression(0);
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

	public static class GoStmtContext extends ParserRuleContext {
		public TerminalNode GO() { return getToken(GoParser.GO, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GoStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterGoStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitGoStmt(this);
		}
	}

	public final GoStmtContext goStmt() throws RecognitionException {
		GoStmtContext _localctx = new GoStmtContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_goStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(GO);
			setState(620);
			expression(0);
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
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeLitContext typeLit() {
			return getRuleContext(TypeLitContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(GoParser.L_PAREN, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(GoParser.R_PAREN, 0); }
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterType_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitType_(this);
		}
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 106, RULE_type_);
		try {
			setState(628);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(622);
				typeName();
				}
				break;
			case FUNC:
			case INTERFACE:
			case MAP:
			case STRUCT:
			case CHAN:
			case L_BRACKET:
			case STAR:
			case RECEIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				typeLit();
				}
				break;
			case L_PAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(624);
				match(L_PAREN);
				setState(625);
				type_();
				setState(626);
				match(R_PAREN);
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

	public static class TypeNameContext extends ParserRuleContext {
		public QualifiedIdentContext qualifiedIdent() {
			return getRuleContext(QualifiedIdentContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_typeName);
		try {
			setState(632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				qualifiedIdent();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				match(IDENTIFIER);
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

	public static class TypeLitContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public PointerTypeContext pointerType() {
			return getRuleContext(PointerTypeContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public SliceTypeContext sliceType() {
			return getRuleContext(SliceTypeContext.class,0);
		}
		public MapTypeContext mapType() {
			return getRuleContext(MapTypeContext.class,0);
		}
		public ChannelTypeContext channelType() {
			return getRuleContext(ChannelTypeContext.class,0);
		}
		public TypeLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterTypeLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitTypeLit(this);
		}
	}

	public final TypeLitContext typeLit() throws RecognitionException {
		TypeLitContext _localctx = new TypeLitContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_typeLit);
		try {
			setState(642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(634);
				arrayType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(635);
				structType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(636);
				pointerType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(637);
				functionType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(638);
				interfaceType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(639);
				sliceType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(640);
				mapType();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(641);
				channelType();
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
		public TerminalNode L_BRACKET() { return getToken(GoParser.L_BRACKET, 0); }
		public ArrayLengthContext arrayLength() {
			return getRuleContext(ArrayLengthContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(GoParser.R_BRACKET, 0); }
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(L_BRACKET);
			setState(645);
			arrayLength();
			setState(646);
			match(R_BRACKET);
			setState(647);
			elementType();
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

	public static class ArrayLengthContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterArrayLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitArrayLength(this);
		}
	}

	public final ArrayLengthContext arrayLength() throws RecognitionException {
		ArrayLengthContext _localctx = new ArrayLengthContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			expression(0);
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

	public static class ElementTypeContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ElementTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterElementType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitElementType(this);
		}
	}

	public final ElementTypeContext elementType() throws RecognitionException {
		ElementTypeContext _localctx = new ElementTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_elementType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
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

	public static class PointerTypeContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(GoParser.STAR, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public PointerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterPointerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitPointerType(this);
		}
	}

	public final PointerTypeContext pointerType() throws RecognitionException {
		PointerTypeContext _localctx = new PointerTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_pointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(STAR);
			setState(654);
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

	public static class InterfaceTypeContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(GoParser.INTERFACE, 0); }
		public TerminalNode L_CURLY() { return getToken(GoParser.L_CURLY, 0); }
		public TerminalNode R_CURLY() { return getToken(GoParser.R_CURLY, 0); }
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public List<MethodSpecContext> methodSpec() {
			return getRuleContexts(MethodSpecContext.class);
		}
		public MethodSpecContext methodSpec(int i) {
			return getRuleContext(MethodSpecContext.class,i);
		}
		public List<TypeNameContext> typeName() {
			return getRuleContexts(TypeNameContext.class);
		}
		public TypeNameContext typeName(int i) {
			return getRuleContext(TypeNameContext.class,i);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitInterfaceType(this);
		}
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_interfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(INTERFACE);
			setState(657);
			match(L_CURLY);
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(660);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(658);
					methodSpec();
					}
					break;
				case 2:
					{
					setState(659);
					typeName();
					}
					break;
				}
				setState(662);
				eos();
				}
				}
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(669);
			match(R_CURLY);
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

	public static class SliceTypeContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(GoParser.L_BRACKET, 0); }
		public TerminalNode R_BRACKET() { return getToken(GoParser.R_BRACKET, 0); }
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public SliceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterSliceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitSliceType(this);
		}
	}

	public final SliceTypeContext sliceType() throws RecognitionException {
		SliceTypeContext _localctx = new SliceTypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_sliceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(L_BRACKET);
			setState(672);
			match(R_BRACKET);
			setState(673);
			elementType();
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

	public static class MapTypeContext extends ParserRuleContext {
		public TerminalNode MAP() { return getToken(GoParser.MAP, 0); }
		public TerminalNode L_BRACKET() { return getToken(GoParser.L_BRACKET, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(GoParser.R_BRACKET, 0); }
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public MapTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterMapType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitMapType(this);
		}
	}

	public final MapTypeContext mapType() throws RecognitionException {
		MapTypeContext _localctx = new MapTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_mapType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(MAP);
			setState(676);
			match(L_BRACKET);
			setState(677);
			type_();
			setState(678);
			match(R_BRACKET);
			setState(679);
			elementType();
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

	public static class ChannelTypeContext extends ParserRuleContext {
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public TerminalNode CHAN() { return getToken(GoParser.CHAN, 0); }
		public TerminalNode RECEIVE() { return getToken(GoParser.RECEIVE, 0); }
		public ChannelTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_channelType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterChannelType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitChannelType(this);
		}
	}

	public final ChannelTypeContext channelType() throws RecognitionException {
		ChannelTypeContext _localctx = new ChannelTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_channelType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(681);
				match(CHAN);
				}
				break;
			case 2:
				{
				setState(682);
				match(CHAN);
				setState(683);
				match(RECEIVE);
				}
				break;
			case 3:
				{
				setState(684);
				match(RECEIVE);
				setState(685);
				match(CHAN);
				}
				break;
			}
			setState(688);
			elementType();
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

	public static class MethodSpecContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public MethodSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterMethodSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitMethodSpec(this);
		}
	}

	public final MethodSpecContext methodSpec() throws RecognitionException {
		MethodSpecContext _localctx = new MethodSpecContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_methodSpec);
		try {
			setState(696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(690);
				match(IDENTIFIER);
				setState(691);
				parameters();
				setState(692);
				result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(694);
				match(IDENTIFIER);
				setState(695);
				parameters();
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

	public static class FunctionTypeContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(GoParser.FUNC, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitFunctionType(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_functionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(FUNC);
			setState(699);
			signature();
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

	public static class SignatureContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitSignature(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_signature);
		try {
			setState(705);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(701);
				parameters();
				setState(702);
				result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
				parameters();
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

	public static class ResultContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_result);
		try {
			setState(709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(707);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(708);
				type_();
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

	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(GoParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(GoParser.R_PAREN, 0); }
		public List<ParameterDeclContext> parameterDecl() {
			return getRuleContexts(ParameterDeclContext.class);
		}
		public ParameterDeclContext parameterDecl(int i) {
			return getRuleContext(ParameterDeclContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GoParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(L_PAREN);
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << INTERFACE) | (1L << MAP) | (1L << STRUCT) | (1L << CHAN) | (1L << IDENTIFIER) | (1L << L_PAREN) | (1L << L_BRACKET) | (1L << ELLIPSIS) | (1L << STAR) | (1L << RECEIVE))) != 0)) {
				{
				setState(712);
				parameterDecl();
				setState(717);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(713);
						match(COMMA);
						setState(714);
						parameterDecl();
						}
						} 
					}
					setState(719);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(720);
					match(COMMA);
					}
				}

				}
			}

			setState(725);
			match(R_PAREN);
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

	public static class ParameterDeclContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(GoParser.ELLIPSIS, 0); }
		public ParameterDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterParameterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitParameterDecl(this);
		}
	}

	public final ParameterDeclContext parameterDecl() throws RecognitionException {
		ParameterDeclContext _localctx = new ParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_parameterDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(727);
				identifierList();
				}
				break;
			}
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELLIPSIS) {
				{
				setState(730);
				match(ELLIPSIS);
				}
			}

			setState(733);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token unary_op;
		public Token mul_op;
		public Token add_op;
		public Token rel_op;
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(GoParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GoParser.MINUS, 0); }
		public TerminalNode EXCLAMATION() { return getToken(GoParser.EXCLAMATION, 0); }
		public TerminalNode CARET() { return getToken(GoParser.CARET, 0); }
		public TerminalNode STAR() { return getToken(GoParser.STAR, 0); }
		public TerminalNode AMPERSAND() { return getToken(GoParser.AMPERSAND, 0); }
		public TerminalNode RECEIVE() { return getToken(GoParser.RECEIVE, 0); }
		public TerminalNode DIV() { return getToken(GoParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(GoParser.MOD, 0); }
		public TerminalNode LSHIFT() { return getToken(GoParser.LSHIFT, 0); }
		public TerminalNode RSHIFT() { return getToken(GoParser.RSHIFT, 0); }
		public TerminalNode BIT_CLEAR() { return getToken(GoParser.BIT_CLEAR, 0); }
		public TerminalNode OR() { return getToken(GoParser.OR, 0); }
		public TerminalNode EQUALS() { return getToken(GoParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(GoParser.NOT_EQUALS, 0); }
		public TerminalNode LESS() { return getToken(GoParser.LESS, 0); }
		public TerminalNode LESS_OR_EQUALS() { return getToken(GoParser.LESS_OR_EQUALS, 0); }
		public TerminalNode GREATER() { return getToken(GoParser.GREATER, 0); }
		public TerminalNode GREATER_OR_EQUALS() { return getToken(GoParser.GREATER_OR_EQUALS, 0); }
		public TerminalNode LOGICAL_AND() { return getToken(GoParser.LOGICAL_AND, 0); }
		public TerminalNode LOGICAL_OR() { return getToken(GoParser.LOGICAL_OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 140;
		enterRecursionRule(_localctx, 140, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(736);
				primaryExpr(0);
				}
				break;
			case 2:
				{
				setState(737);
				((ExpressionContext)_localctx).unary_op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCLAMATION) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND) | (1L << RECEIVE))) != 0)) ) {
					((ExpressionContext)_localctx).unary_op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(738);
				expression(6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(758);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(756);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(741);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(742);
						((ExpressionContext)_localctx).mul_op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MOD) | (1L << LSHIFT) | (1L << RSHIFT) | (1L << BIT_CLEAR) | (1L << STAR) | (1L << AMPERSAND))) != 0)) ) {
							((ExpressionContext)_localctx).mul_op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(743);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(744);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(745);
						((ExpressionContext)_localctx).add_op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS) | (1L << CARET))) != 0)) ) {
							((ExpressionContext)_localctx).add_op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(746);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(747);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(748);
						((ExpressionContext)_localctx).rel_op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << NOT_EQUALS) | (1L << LESS) | (1L << LESS_OR_EQUALS) | (1L << GREATER) | (1L << GREATER_OR_EQUALS))) != 0)) ) {
							((ExpressionContext)_localctx).rel_op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(749);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(750);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(751);
						match(LOGICAL_AND);
						setState(752);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(753);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(754);
						match(LOGICAL_OR);
						setState(755);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(760);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
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

	public static class PrimaryExprContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ConversionContext conversion() {
			return getRuleContext(ConversionContext.class,0);
		}
		public MethodExprContext methodExpr() {
			return getRuleContext(MethodExprContext.class,0);
		}
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public Slice_Context slice_() {
			return getRuleContext(Slice_Context.class,0);
		}
		public TypeAssertionContext typeAssertion() {
			return getRuleContext(TypeAssertionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GoParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitPrimaryExpr(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		return primaryExpr(0);
	}

	private PrimaryExprContext primaryExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, _parentState);
		PrimaryExprContext _prevctx = _localctx;
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_primaryExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(762);
				operand();
				}
				break;
			case 2:
				{
				setState(763);
				conversion();
				}
				break;
			case 3:
				{
				setState(764);
				methodExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(778);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrimaryExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
					setState(767);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(774);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						{
						setState(768);
						match(DOT);
						setState(769);
						match(IDENTIFIER);
						}
						}
						break;
					case 2:
						{
						setState(770);
						index();
						}
						break;
					case 3:
						{
						setState(771);
						slice_();
						}
						break;
					case 4:
						{
						setState(772);
						typeAssertion();
						}
						break;
					case 5:
						{
						setState(773);
						arguments();
						}
						break;
					}
					}
					} 
				}
				setState(780);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
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

	public static class ConversionContext extends ParserRuleContext {
		public NonNamedTypeContext nonNamedType() {
			return getRuleContext(NonNamedTypeContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(GoParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(GoParser.R_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(GoParser.COMMA, 0); }
		public ConversionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitConversion(this);
		}
	}

	public final ConversionContext conversion() throws RecognitionException {
		ConversionContext _localctx = new ConversionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_conversion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			nonNamedType();
			setState(782);
			match(L_PAREN);
			setState(783);
			expression(0);
			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(784);
				match(COMMA);
				}
			}

			setState(787);
			match(R_PAREN);
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

	public static class NonNamedTypeContext extends ParserRuleContext {
		public TypeLitContext typeLit() {
			return getRuleContext(TypeLitContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(GoParser.L_PAREN, 0); }
		public NonNamedTypeContext nonNamedType() {
			return getRuleContext(NonNamedTypeContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(GoParser.R_PAREN, 0); }
		public NonNamedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonNamedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterNonNamedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitNonNamedType(this);
		}
	}

	public final NonNamedTypeContext nonNamedType() throws RecognitionException {
		NonNamedTypeContext _localctx = new NonNamedTypeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_nonNamedType);
		try {
			setState(794);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case INTERFACE:
			case MAP:
			case STRUCT:
			case CHAN:
			case L_BRACKET:
			case STAR:
			case RECEIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(789);
				typeLit();
				}
				break;
			case L_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(790);
				match(L_PAREN);
				setState(791);
				nonNamedType();
				setState(792);
				match(R_PAREN);
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

	public static class OperandContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperandNameContext operandName() {
			return getRuleContext(OperandNameContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(GoParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(GoParser.R_PAREN, 0); }
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_operand);
		try {
			setState(802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(796);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(797);
				operandName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(798);
				match(L_PAREN);
				setState(799);
				expression(0);
				setState(800);
				match(R_PAREN);
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

	public static class LiteralContext extends ParserRuleContext {
		public BasicLitContext basicLit() {
			return getRuleContext(BasicLitContext.class,0);
		}
		public CompositeLitContext compositeLit() {
			return getRuleContext(CompositeLitContext.class,0);
		}
		public FunctionLitContext functionLit() {
			return getRuleContext(FunctionLitContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_literal);
		try {
			setState(807);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NIL_LIT:
			case DECIMAL_LIT:
			case BINARY_LIT:
			case OCTAL_LIT:
			case HEX_LIT:
			case FLOAT_LIT:
			case IMAGINARY_LIT:
			case RUNE_LIT:
			case RAW_STRING_LIT:
			case INTERPRETED_STRING_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				basicLit();
				}
				break;
			case MAP:
			case STRUCT:
			case IDENTIFIER:
			case L_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(805);
				compositeLit();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 3);
				{
				setState(806);
				functionLit();
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

	public static class BasicLitContext extends ParserRuleContext {
		public TerminalNode NIL_LIT() { return getToken(GoParser.NIL_LIT, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public TerminalNode FLOAT_LIT() { return getToken(GoParser.FLOAT_LIT, 0); }
		public BasicLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterBasicLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitBasicLit(this);
		}
	}

	public final BasicLitContext basicLit() throws RecognitionException {
		BasicLitContext _localctx = new BasicLitContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_basicLit);
		try {
			setState(813);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NIL_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(809);
				match(NIL_LIT);
				}
				break;
			case DECIMAL_LIT:
			case BINARY_LIT:
			case OCTAL_LIT:
			case HEX_LIT:
			case IMAGINARY_LIT:
			case RUNE_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(810);
				integer();
				}
				break;
			case RAW_STRING_LIT:
			case INTERPRETED_STRING_LIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(811);
				string_();
				}
				break;
			case FLOAT_LIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(812);
				match(FLOAT_LIT);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LIT() { return getToken(GoParser.DECIMAL_LIT, 0); }
		public TerminalNode BINARY_LIT() { return getToken(GoParser.BINARY_LIT, 0); }
		public TerminalNode OCTAL_LIT() { return getToken(GoParser.OCTAL_LIT, 0); }
		public TerminalNode HEX_LIT() { return getToken(GoParser.HEX_LIT, 0); }
		public TerminalNode IMAGINARY_LIT() { return getToken(GoParser.IMAGINARY_LIT, 0); }
		public TerminalNode RUNE_LIT() { return getToken(GoParser.RUNE_LIT, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			_la = _input.LA(1);
			if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECIMAL_LIT - 64)) | (1L << (BINARY_LIT - 64)) | (1L << (OCTAL_LIT - 64)) | (1L << (HEX_LIT - 64)) | (1L << (IMAGINARY_LIT - 64)) | (1L << (RUNE_LIT - 64)))) != 0)) ) {
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

	public static class OperandNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public OperandNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operandName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterOperandName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitOperandName(this);
		}
	}

	public final OperandNameContext operandName() throws RecognitionException {
		OperandNameContext _localctx = new OperandNameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_operandName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			match(IDENTIFIER);
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

	public static class QualifiedIdentContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(GoParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GoParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(GoParser.DOT, 0); }
		public QualifiedIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterQualifiedIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitQualifiedIdent(this);
		}
	}

	public final QualifiedIdentContext qualifiedIdent() throws RecognitionException {
		QualifiedIdentContext _localctx = new QualifiedIdentContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_qualifiedIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			match(IDENTIFIER);
			setState(820);
			match(DOT);
			setState(821);
			match(IDENTIFIER);
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

	public static class CompositeLitContext extends ParserRuleContext {
		public LiteralTypeContext literalType() {
			return getRuleContext(LiteralTypeContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public CompositeLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositeLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterCompositeLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitCompositeLit(this);
		}
	}

	public final CompositeLitContext compositeLit() throws RecognitionException {
		CompositeLitContext _localctx = new CompositeLitContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_compositeLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			literalType();
			setState(824);
			literalValue();
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

	public static class LiteralTypeContext extends ParserRuleContext {
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(GoParser.L_BRACKET, 0); }
		public TerminalNode ELLIPSIS() { return getToken(GoParser.ELLIPSIS, 0); }
		public TerminalNode R_BRACKET() { return getToken(GoParser.R_BRACKET, 0); }
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public SliceTypeContext sliceType() {
			return getRuleContext(SliceTypeContext.class,0);
		}
		public MapTypeContext mapType() {
			return getRuleContext(MapTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public LiteralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterLiteralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitLiteralType(this);
		}
	}

	public final LiteralTypeContext literalType() throws RecognitionException {
		LiteralTypeContext _localctx = new LiteralTypeContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_literalType);
		try {
			setState(835);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(826);
				structType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(827);
				arrayType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(828);
				match(L_BRACKET);
				setState(829);
				match(ELLIPSIS);
				setState(830);
				match(R_BRACKET);
				setState(831);
				elementType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(832);
				sliceType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(833);
				mapType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(834);
				typeName();
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

	public static class LiteralValueContext extends ParserRuleContext {
		public TerminalNode L_CURLY() { return getToken(GoParser.L_CURLY, 0); }
		public TerminalNode R_CURLY() { return getToken(GoParser.R_CURLY, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GoParser.COMMA, 0); }
		public LiteralValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterLiteralValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitLiteralValue(this);
		}
	}

	public final LiteralValueContext literalValue() throws RecognitionException {
		LiteralValueContext _localctx = new LiteralValueContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_literalValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			match(L_CURLY);
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << INTERFACE) | (1L << MAP) | (1L << STRUCT) | (1L << CHAN) | (1L << NIL_LIT) | (1L << IDENTIFIER) | (1L << L_PAREN) | (1L << L_CURLY) | (1L << L_BRACKET) | (1L << EXCLAMATION) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND) | (1L << RECEIVE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECIMAL_LIT - 64)) | (1L << (BINARY_LIT - 64)) | (1L << (OCTAL_LIT - 64)) | (1L << (HEX_LIT - 64)) | (1L << (FLOAT_LIT - 64)) | (1L << (IMAGINARY_LIT - 64)) | (1L << (RUNE_LIT - 64)) | (1L << (RAW_STRING_LIT - 64)) | (1L << (INTERPRETED_STRING_LIT - 64)))) != 0)) {
				{
				setState(838);
				elementList();
				setState(840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(839);
					match(COMMA);
					}
				}

				}
			}

			setState(844);
			match(R_CURLY);
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
		public List<KeyedElementContext> keyedElement() {
			return getRuleContexts(KeyedElementContext.class);
		}
		public KeyedElementContext keyedElement(int i) {
			return getRuleContext(KeyedElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GoParser.COMMA, i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitElementList(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_elementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			keyedElement();
			setState(851);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(847);
					match(COMMA);
					setState(848);
					keyedElement();
					}
					} 
				}
				setState(853);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
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

	public static class KeyedElementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GoParser.COLON, 0); }
		public KeyedElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyedElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterKeyedElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitKeyedElement(this);
		}
	}

	public final KeyedElementContext keyedElement() throws RecognitionException {
		KeyedElementContext _localctx = new KeyedElementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_keyedElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(854);
				key();
				setState(855);
				match(COLON);
				}
				break;
			}
			setState(859);
			element();
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

	public static class KeyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_key);
		try {
			setState(863);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case INTERFACE:
			case MAP:
			case STRUCT:
			case CHAN:
			case NIL_LIT:
			case IDENTIFIER:
			case L_PAREN:
			case L_BRACKET:
			case EXCLAMATION:
			case PLUS:
			case MINUS:
			case CARET:
			case STAR:
			case AMPERSAND:
			case RECEIVE:
			case DECIMAL_LIT:
			case BINARY_LIT:
			case OCTAL_LIT:
			case HEX_LIT:
			case FLOAT_LIT:
			case IMAGINARY_LIT:
			case RUNE_LIT:
			case RAW_STRING_LIT:
			case INTERPRETED_STRING_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(861);
				expression(0);
				}
				break;
			case L_CURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(862);
				literalValue();
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

	public static class ElementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_element);
		try {
			setState(867);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case INTERFACE:
			case MAP:
			case STRUCT:
			case CHAN:
			case NIL_LIT:
			case IDENTIFIER:
			case L_PAREN:
			case L_BRACKET:
			case EXCLAMATION:
			case PLUS:
			case MINUS:
			case CARET:
			case STAR:
			case AMPERSAND:
			case RECEIVE:
			case DECIMAL_LIT:
			case BINARY_LIT:
			case OCTAL_LIT:
			case HEX_LIT:
			case FLOAT_LIT:
			case IMAGINARY_LIT:
			case RUNE_LIT:
			case RAW_STRING_LIT:
			case INTERPRETED_STRING_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(865);
				expression(0);
				}
				break;
			case L_CURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(866);
				literalValue();
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

	public static class StructTypeContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(GoParser.STRUCT, 0); }
		public TerminalNode L_CURLY() { return getToken(GoParser.L_CURLY, 0); }
		public TerminalNode R_CURLY() { return getToken(GoParser.R_CURLY, 0); }
		public List<FieldDeclContext> fieldDecl() {
			return getRuleContexts(FieldDeclContext.class);
		}
		public FieldDeclContext fieldDecl(int i) {
			return getRuleContext(FieldDeclContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public StructTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterStructType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitStructType(this);
		}
	}

	public final StructTypeContext structType() throws RecognitionException {
		StructTypeContext _localctx = new StructTypeContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_structType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			match(STRUCT);
			setState(870);
			match(L_CURLY);
			setState(876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER || _la==STAR) {
				{
				{
				setState(871);
				fieldDecl();
				setState(872);
				eos();
				}
				}
				setState(878);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(879);
			match(R_CURLY);
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

	public static class FieldDeclContext extends ParserRuleContext {
		public String_Context tag;
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public EmbeddedFieldContext embeddedField() {
			return getRuleContext(EmbeddedFieldContext.class,0);
		}
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitFieldDecl(this);
		}
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_fieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(881);
				identifierList();
				setState(882);
				type_();
				}
				break;
			case 2:
				{
				setState(884);
				embeddedField();
				}
				break;
			}
			setState(888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(887);
				((FieldDeclContext)_localctx).tag = string_();
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

	public static class String_Context extends ParserRuleContext {
		public TerminalNode RAW_STRING_LIT() { return getToken(GoParser.RAW_STRING_LIT, 0); }
		public TerminalNode INTERPRETED_STRING_LIT() { return getToken(GoParser.INTERPRETED_STRING_LIT, 0); }
		public String_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterString_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitString_(this);
		}
	}

	public final String_Context string_() throws RecognitionException {
		String_Context _localctx = new String_Context(_ctx, getState());
		enterRule(_localctx, 178, RULE_string_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			_la = _input.LA(1);
			if ( !(_la==RAW_STRING_LIT || _la==INTERPRETED_STRING_LIT) ) {
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

	public static class EmbeddedFieldContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode STAR() { return getToken(GoParser.STAR, 0); }
		public EmbeddedFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_embeddedField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterEmbeddedField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitEmbeddedField(this);
		}
	}

	public final EmbeddedFieldContext embeddedField() throws RecognitionException {
		EmbeddedFieldContext _localctx = new EmbeddedFieldContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_embeddedField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(892);
				match(STAR);
				}
			}

			setState(895);
			typeName();
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

	public static class FunctionLitContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(GoParser.FUNC, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterFunctionLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitFunctionLit(this);
		}
	}

	public final FunctionLitContext functionLit() throws RecognitionException {
		FunctionLitContext _localctx = new FunctionLitContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_functionLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			match(FUNC);
			setState(898);
			signature();
			setState(899);
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

	public static class IndexContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(GoParser.L_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(GoParser.R_BRACKET, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitIndex(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			match(L_BRACKET);
			setState(902);
			expression(0);
			setState(903);
			match(R_BRACKET);
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

	public static class Slice_Context extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(GoParser.L_BRACKET, 0); }
		public TerminalNode R_BRACKET() { return getToken(GoParser.R_BRACKET, 0); }
		public List<TerminalNode> COLON() { return getTokens(GoParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(GoParser.COLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Slice_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slice_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterSlice_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitSlice_(this);
		}
	}

	public final Slice_Context slice_() throws RecognitionException {
		Slice_Context _localctx = new Slice_Context(_ctx, getState());
		enterRule(_localctx, 186, RULE_slice_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			match(L_BRACKET);
			setState(921);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << INTERFACE) | (1L << MAP) | (1L << STRUCT) | (1L << CHAN) | (1L << NIL_LIT) | (1L << IDENTIFIER) | (1L << L_PAREN) | (1L << L_BRACKET) | (1L << EXCLAMATION) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND) | (1L << RECEIVE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECIMAL_LIT - 64)) | (1L << (BINARY_LIT - 64)) | (1L << (OCTAL_LIT - 64)) | (1L << (HEX_LIT - 64)) | (1L << (FLOAT_LIT - 64)) | (1L << (IMAGINARY_LIT - 64)) | (1L << (RUNE_LIT - 64)) | (1L << (RAW_STRING_LIT - 64)) | (1L << (INTERPRETED_STRING_LIT - 64)))) != 0)) {
					{
					setState(906);
					expression(0);
					}
				}

				setState(909);
				match(COLON);
				setState(911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << INTERFACE) | (1L << MAP) | (1L << STRUCT) | (1L << CHAN) | (1L << NIL_LIT) | (1L << IDENTIFIER) | (1L << L_PAREN) | (1L << L_BRACKET) | (1L << EXCLAMATION) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND) | (1L << RECEIVE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECIMAL_LIT - 64)) | (1L << (BINARY_LIT - 64)) | (1L << (OCTAL_LIT - 64)) | (1L << (HEX_LIT - 64)) | (1L << (FLOAT_LIT - 64)) | (1L << (IMAGINARY_LIT - 64)) | (1L << (RUNE_LIT - 64)) | (1L << (RAW_STRING_LIT - 64)) | (1L << (INTERPRETED_STRING_LIT - 64)))) != 0)) {
					{
					setState(910);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << INTERFACE) | (1L << MAP) | (1L << STRUCT) | (1L << CHAN) | (1L << NIL_LIT) | (1L << IDENTIFIER) | (1L << L_PAREN) | (1L << L_BRACKET) | (1L << EXCLAMATION) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND) | (1L << RECEIVE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECIMAL_LIT - 64)) | (1L << (BINARY_LIT - 64)) | (1L << (OCTAL_LIT - 64)) | (1L << (HEX_LIT - 64)) | (1L << (FLOAT_LIT - 64)) | (1L << (IMAGINARY_LIT - 64)) | (1L << (RUNE_LIT - 64)) | (1L << (RAW_STRING_LIT - 64)) | (1L << (INTERPRETED_STRING_LIT - 64)))) != 0)) {
					{
					setState(913);
					expression(0);
					}
				}

				setState(916);
				match(COLON);
				setState(917);
				expression(0);
				setState(918);
				match(COLON);
				setState(919);
				expression(0);
				}
				break;
			}
			setState(923);
			match(R_BRACKET);
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

	public static class TypeAssertionContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(GoParser.DOT, 0); }
		public TerminalNode L_PAREN() { return getToken(GoParser.L_PAREN, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(GoParser.R_PAREN, 0); }
		public TypeAssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAssertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterTypeAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitTypeAssertion(this);
		}
	}

	public final TypeAssertionContext typeAssertion() throws RecognitionException {
		TypeAssertionContext _localctx = new TypeAssertionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_typeAssertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			match(DOT);
			setState(926);
			match(L_PAREN);
			setState(927);
			type_();
			setState(928);
			match(R_PAREN);
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
		public TerminalNode L_PAREN() { return getToken(GoParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(GoParser.R_PAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public NonNamedTypeContext nonNamedType() {
			return getRuleContext(NonNamedTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(GoParser.ELLIPSIS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GoParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			match(L_PAREN);
			setState(945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << INTERFACE) | (1L << MAP) | (1L << STRUCT) | (1L << CHAN) | (1L << NIL_LIT) | (1L << IDENTIFIER) | (1L << L_PAREN) | (1L << L_BRACKET) | (1L << EXCLAMATION) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND) | (1L << RECEIVE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECIMAL_LIT - 64)) | (1L << (BINARY_LIT - 64)) | (1L << (OCTAL_LIT - 64)) | (1L << (HEX_LIT - 64)) | (1L << (FLOAT_LIT - 64)) | (1L << (IMAGINARY_LIT - 64)) | (1L << (RUNE_LIT - 64)) | (1L << (RAW_STRING_LIT - 64)) | (1L << (INTERPRETED_STRING_LIT - 64)))) != 0)) {
				{
				setState(937);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(931);
					expressionList();
					}
					break;
				case 2:
					{
					setState(932);
					nonNamedType();
					setState(935);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
					case 1:
						{
						setState(933);
						match(COMMA);
						setState(934);
						expressionList();
						}
						break;
					}
					}
					break;
				}
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELLIPSIS) {
					{
					setState(939);
					match(ELLIPSIS);
					}
				}

				setState(943);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(942);
					match(COMMA);
					}
				}

				}
			}

			setState(947);
			match(R_PAREN);
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

	public static class MethodExprContext extends ParserRuleContext {
		public NonNamedTypeContext nonNamedType() {
			return getRuleContext(NonNamedTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GoParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public MethodExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterMethodExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitMethodExpr(this);
		}
	}

	public final MethodExprContext methodExpr() throws RecognitionException {
		MethodExprContext _localctx = new MethodExprContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_methodExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			nonNamedType();
			setState(950);
			match(DOT);
			setState(951);
			match(IDENTIFIER);
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

	public static class ReceiverTypeContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ReceiverTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterReceiverType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitReceiverType(this);
		}
	}

	public final ReceiverTypeContext receiverType() throws RecognitionException {
		ReceiverTypeContext _localctx = new ReceiverTypeContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_receiverType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
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

	public static class EosContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(GoParser.SEMI, 0); }
		public TerminalNode EOF() { return getToken(GoParser.EOF, 0); }
		public TerminalNode EOS() { return getToken(GoParser.EOS, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoParserListener ) ((GoParserListener)listener).exitEos(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_eos);
		try {
			setState(959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(955);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(956);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(957);
				match(EOS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(958);
				if (!(this.closingBracket())) throw new FailedPredicateException(this, "this.closingBracket()");
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
		case 18:
			return statementList_sempred((StatementListContext)_localctx, predIndex);
		case 70:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 71:
			return primaryExpr_sempred((PrimaryExprContext)_localctx, predIndex);
		case 98:
			return eos_sempred((EosContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statementList_sempred(StatementListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return this.closingBracket();
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpr_sempred(PrimaryExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean eos_sempred(EosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return this.closingBracket();
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Z\u03c4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\3\2\3\2\3\2\3\2\3\2\7\2\u00ce\n\2\f\2\16"+
		"\2\u00d1\13\2\3\2\3\2\3\2\5\2\u00d6\n\2\3\2\3\2\7\2\u00da\n\2\f\2\16\2"+
		"\u00dd\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00ea\n\4"+
		"\f\4\16\4\u00ed\13\4\3\4\5\4\u00f0\n\4\3\5\5\5\u00f3\n\5\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\7\5\7\u00fc\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0104\n\b\f\b"+
		"\16\b\u0107\13\b\3\b\5\b\u010a\n\b\3\t\3\t\5\t\u010e\n\t\3\t\3\t\5\t\u0112"+
		"\n\t\3\n\3\n\3\n\7\n\u0117\n\n\f\n\16\n\u011a\13\n\3\13\3\13\3\13\7\13"+
		"\u011f\n\13\f\13\16\13\u0122\13\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u012a\n"+
		"\f\f\f\16\f\u012d\13\f\3\f\5\f\u0130\n\f\3\r\3\r\5\r\u0134\n\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\5\16\u013c\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u0143"+
		"\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u014d\n\21\f\21\16"+
		"\21\u0150\13\21\3\21\5\21\u0153\n\21\3\22\3\22\3\22\3\22\5\22\u0159\n"+
		"\22\3\22\3\22\5\22\u015d\n\22\3\23\3\23\5\23\u0161\n\23\3\23\3\23\3\24"+
		"\5\24\u0166\n\24\3\24\5\24\u0169\n\24\3\24\5\24\u016c\n\24\3\24\3\24\3"+
		"\24\6\24\u0171\n\24\r\24\16\24\u0172\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0184\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u018b\n\26\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\33\5\33\u019b\n\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\36\5\36\u01a8\n\36\3\37\3\37\5\37\u01ac\n\37\3"+
		" \3 \5 \u01b0\n \3!\3!\5!\u01b4\n!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\5%\u01c7\n%\3%\3%\3%\3%\5%\u01cd\n%\5%\u01cf\n%\3"+
		"&\3&\5&\u01d3\n&\3\'\3\'\5\'\u01d7\n\'\3\'\5\'\u01da\n\'\3\'\3\'\5\'\u01de"+
		"\n\'\5\'\u01e0\n\'\3\'\3\'\7\'\u01e4\n\'\f\'\16\'\u01e7\13\'\3\'\3\'\3"+
		"(\3(\3(\5(\u01ee\n(\3)\3)\3)\5)\u01f3\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\5"+
		"*\u01fe\n*\3*\3*\7*\u0202\n*\f*\16*\u0205\13*\3*\3*\3+\3+\5+\u020b\n+"+
		"\3+\3+\3+\3+\3+\3+\3,\3,\3,\5,\u0216\n,\3-\3-\3-\5-\u021b\n-\3.\3.\5."+
		"\u021f\n.\3.\3.\3.\5.\u0224\n.\7.\u0226\n.\f.\16.\u0229\13.\3/\3/\3/\7"+
		"/\u022e\n/\f/\16/\u0231\13/\3/\3/\3\60\3\60\3\60\5\60\u0238\n\60\3\61"+
		"\3\61\3\61\5\61\u023d\n\61\3\61\5\61\u0240\n\61\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\5\62\u0248\n\62\3\62\3\62\3\63\3\63\5\63\u024e\n\63\3\63\3\63"+
		"\5\63\u0252\n\63\5\63\u0254\n\63\3\63\3\63\3\64\5\64\u0259\n\64\3\64\3"+
		"\64\5\64\u025d\n\64\3\64\3\64\5\64\u0261\n\64\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\5\65\u0269\n\65\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\5\67\u0277\n\67\38\38\58\u027b\n8\39\39\39\39\39\39\39\39\5"+
		"9\u0285\n9\3:\3:\3:\3:\3:\3;\3;\3<\3<\3=\3=\3=\3>\3>\3>\3>\5>\u0297\n"+
		">\3>\3>\7>\u029b\n>\f>\16>\u029e\13>\3>\3>\3?\3?\3?\3?\3@\3@\3@\3@\3@"+
		"\3@\3A\3A\3A\3A\3A\5A\u02b1\nA\3A\3A\3B\3B\3B\3B\3B\3B\5B\u02bb\nB\3C"+
		"\3C\3C\3D\3D\3D\3D\5D\u02c4\nD\3E\3E\5E\u02c8\nE\3F\3F\3F\3F\7F\u02ce"+
		"\nF\fF\16F\u02d1\13F\3F\5F\u02d4\nF\5F\u02d6\nF\3F\3F\3G\5G\u02db\nG\3"+
		"G\5G\u02de\nG\3G\3G\3H\3H\3H\3H\5H\u02e6\nH\3H\3H\3H\3H\3H\3H\3H\3H\3"+
		"H\3H\3H\3H\3H\3H\3H\7H\u02f7\nH\fH\16H\u02fa\13H\3I\3I\3I\3I\5I\u0300"+
		"\nI\3I\3I\3I\3I\3I\3I\3I\5I\u0309\nI\7I\u030b\nI\fI\16I\u030e\13I\3J\3"+
		"J\3J\3J\5J\u0314\nJ\3J\3J\3K\3K\3K\3K\3K\5K\u031d\nK\3L\3L\3L\3L\3L\3"+
		"L\5L\u0325\nL\3M\3M\3M\5M\u032a\nM\3N\3N\3N\3N\5N\u0330\nN\3O\3O\3P\3"+
		"P\3Q\3Q\3Q\3Q\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u0346\nS\3T\3T\3"+
		"T\5T\u034b\nT\5T\u034d\nT\3T\3T\3U\3U\3U\7U\u0354\nU\fU\16U\u0357\13U"+
		"\3V\3V\3V\5V\u035c\nV\3V\3V\3W\3W\5W\u0362\nW\3X\3X\5X\u0366\nX\3Y\3Y"+
		"\3Y\3Y\3Y\7Y\u036d\nY\fY\16Y\u0370\13Y\3Y\3Y\3Z\3Z\3Z\3Z\5Z\u0378\nZ\3"+
		"Z\5Z\u037b\nZ\3[\3[\3\\\5\\\u0380\n\\\3\\\3\\\3]\3]\3]\3]\3^\3^\3^\3^"+
		"\3_\3_\5_\u038e\n_\3_\3_\5_\u0392\n_\3_\5_\u0395\n_\3_\3_\3_\3_\3_\5_"+
		"\u039c\n_\3_\3_\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\5a\u03aa\na\5a\u03ac\na"+
		"\3a\5a\u03af\na\3a\5a\u03b2\na\5a\u03b4\na\3a\3a\3b\3b\3b\3b\3c\3c\3d"+
		"\3d\3d\3d\5d\u03c2\nd\3d\2\4\u008e\u0090e\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\2\f"+
		"\4\2\35\35((\3\2)*\4\2\65:<@\4\2&&YY\3\2;A\4\2\66:?@\4\2\65\65<>\3\2/"+
		"\64\4\2BEIJ\3\2PQ\2\u0400\2\u00c8\3\2\2\2\4\u00e0\3\2\2\2\6\u00e3\3\2"+
		"\2\2\b\u00f2\3\2\2\2\n\u00f6\3\2\2\2\f\u00fb\3\2\2\2\16\u00fd\3\2\2\2"+
		"\20\u010b\3\2\2\2\22\u0113\3\2\2\2\24\u011b\3\2\2\2\26\u0123\3\2\2\2\30"+
		"\u0131\3\2\2\2\32\u0137\3\2\2\2\34\u013d\3\2\2\2\36\u0144\3\2\2\2 \u0146"+
		"\3\2\2\2\"\u0154\3\2\2\2$\u015e\3\2\2\2&\u0170\3\2\2\2(\u0183\3\2\2\2"+
		"*\u018a\3\2\2\2,\u018c\3\2\2\2.\u018e\3\2\2\2\60\u0192\3\2\2\2\62\u0195"+
		"\3\2\2\2\64\u019a\3\2\2\2\66\u019e\3\2\2\28\u01a2\3\2\2\2:\u01a4\3\2\2"+
		"\2<\u01a9\3\2\2\2>\u01ad\3\2\2\2@\u01b1\3\2\2\2B\u01b5\3\2\2\2D\u01b8"+
		"\3\2\2\2F\u01ba\3\2\2\2H\u01bd\3\2\2\2J\u01d2\3\2\2\2L\u01d4\3\2\2\2N"+
		"\u01ea\3\2\2\2P\u01f2\3\2\2\2R\u01f4\3\2\2\2T\u020a\3\2\2\2V\u0212\3\2"+
		"\2\2X\u021a\3\2\2\2Z\u021e\3\2\2\2\\\u022a\3\2\2\2^\u0234\3\2\2\2`\u023f"+
		"\3\2\2\2b\u0247\3\2\2\2d\u024b\3\2\2\2f\u0258\3\2\2\2h\u0268\3\2\2\2j"+
		"\u026d\3\2\2\2l\u0276\3\2\2\2n\u027a\3\2\2\2p\u0284\3\2\2\2r\u0286\3\2"+
		"\2\2t\u028b\3\2\2\2v\u028d\3\2\2\2x\u028f\3\2\2\2z\u0292\3\2\2\2|\u02a1"+
		"\3\2\2\2~\u02a5\3\2\2\2\u0080\u02b0\3\2\2\2\u0082\u02ba\3\2\2\2\u0084"+
		"\u02bc\3\2\2\2\u0086\u02c3\3\2\2\2\u0088\u02c7\3\2\2\2\u008a\u02c9\3\2"+
		"\2\2\u008c\u02da\3\2\2\2\u008e\u02e5\3\2\2\2\u0090\u02ff\3\2\2\2\u0092"+
		"\u030f\3\2\2\2\u0094\u031c\3\2\2\2\u0096\u0324\3\2\2\2\u0098\u0329\3\2"+
		"\2\2\u009a\u032f\3\2\2\2\u009c\u0331\3\2\2\2\u009e\u0333\3\2\2\2\u00a0"+
		"\u0335\3\2\2\2\u00a2\u0339\3\2\2\2\u00a4\u0345\3\2\2\2\u00a6\u0347\3\2"+
		"\2\2\u00a8\u0350\3\2\2\2\u00aa\u035b\3\2\2\2\u00ac\u0361\3\2\2\2\u00ae"+
		"\u0365\3\2\2\2\u00b0\u0367\3\2\2\2\u00b2\u0377\3\2\2\2\u00b4\u037c\3\2"+
		"\2\2\u00b6\u037f\3\2\2\2\u00b8\u0383\3\2\2\2\u00ba\u0387\3\2\2\2\u00bc"+
		"\u038b\3\2\2\2\u00be\u039f\3\2\2\2\u00c0\u03a4\3\2\2\2\u00c2\u03b7\3\2"+
		"\2\2\u00c4\u03bb\3\2\2\2\u00c6\u03c1\3\2\2\2\u00c8\u00c9\5\4\3\2\u00c9"+
		"\u00cf\5\u00c6d\2\u00ca\u00cb\5\6\4\2\u00cb\u00cc\5\u00c6d\2\u00cc\u00ce"+
		"\3\2\2\2\u00cd\u00ca\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00db\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d6\5\32"+
		"\16\2\u00d3\u00d6\5\34\17\2\u00d4\u00d6\5\f\7\2\u00d5\u00d2\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\5\u00c6"+
		"d\2\u00d8\u00da\3\2\2\2\u00d9\u00d5\3\2\2\2\u00da\u00dd\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00de\u00df\7\2\2\3\u00df\3\3\2\2\2\u00e0\u00e1\7\20\2\2\u00e1\u00e2"+
		"\7\35\2\2\u00e2\5\3\2\2\2\u00e3\u00ef\7\31\2\2\u00e4\u00f0\5\b\5\2\u00e5"+
		"\u00eb\7\36\2\2\u00e6\u00e7\5\b\5\2\u00e7\u00e8\5\u00c6d\2\u00e8\u00ea"+
		"\3\2\2\2\u00e9\u00e6\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f0\7\37"+
		"\2\2\u00ef\u00e4\3\2\2\2\u00ef\u00e5\3\2\2\2\u00f0\7\3\2\2\2\u00f1\u00f3"+
		"\t\2\2\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f5\5\n\6\2\u00f5\t\3\2\2\2\u00f6\u00f7\5\u00b4[\2\u00f7\13\3\2\2\2"+
		"\u00f8\u00fc\5\16\b\2\u00f9\u00fc\5\26\f\2\u00fa\u00fc\5 \21\2\u00fb\u00f8"+
		"\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\r\3\2\2\2\u00fd"+
		"\u0109\7\22\2\2\u00fe\u010a\5\20\t\2\u00ff\u0105\7\36\2\2\u0100\u0101"+
		"\5\20\t\2\u0101\u0102\5\u00c6d\2\u0102\u0104\3\2\2\2\u0103\u0100\3\2\2"+
		"\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108"+
		"\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010a\7\37\2\2\u0109\u00fe\3\2\2\2"+
		"\u0109\u00ff\3\2\2\2\u010a\17\3\2\2\2\u010b\u0111\5\22\n\2\u010c\u010e"+
		"\5l\67\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0110\7$\2\2\u0110\u0112\5\24\13\2\u0111\u010d\3\2\2\2\u0111\u0112\3"+
		"\2\2\2\u0112\21\3\2\2\2\u0113\u0118\7\35\2\2\u0114\u0115\7%\2\2\u0115"+
		"\u0117\7\35\2\2\u0116\u0114\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3"+
		"\2\2\2\u0118\u0119\3\2\2\2\u0119\23\3\2\2\2\u011a\u0118\3\2\2\2\u011b"+
		"\u0120\5\u008eH\2\u011c\u011d\7%\2\2\u011d\u011f\5\u008eH\2\u011e\u011c"+
		"\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\25\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u012f\7\26\2\2\u0124\u0130\5\30"+
		"\r\2\u0125\u012b\7\36\2\2\u0126\u0127\5\30\r\2\u0127\u0128\5\u00c6d\2"+
		"\u0128\u012a\3\2\2\2\u0129\u0126\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129"+
		"\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e"+
		"\u0130\7\37\2\2\u012f\u0124\3\2\2\2\u012f\u0125\3\2\2\2\u0130\27\3\2\2"+
		"\2\u0131\u0133\7\35\2\2\u0132\u0134\7$\2\2\u0133\u0132\3\2\2\2\u0133\u0134"+
		"\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\5l\67\2\u0136\31\3\2\2\2\u0137"+
		"\u0138\7\5\2\2\u0138\u0139\7\35\2\2\u0139\u013b\5\u0086D\2\u013a\u013c"+
		"\5$\23\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\33\3\2\2\2\u013d"+
		"\u013e\7\5\2\2\u013e\u013f\5\36\20\2\u013f\u0140\7\35\2\2\u0140\u0142"+
		"\5\u0086D\2\u0141\u0143\5$\23\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2"+
		"\2\u0143\35\3\2\2\2\u0144\u0145\5\u008aF\2\u0145\37\3\2\2\2\u0146\u0152"+
		"\7\33\2\2\u0147\u0153\5\"\22\2\u0148\u014e\7\36\2\2\u0149\u014a\5\"\22"+
		"\2\u014a\u014b\5\u00c6d\2\u014b\u014d\3\2\2\2\u014c\u0149\3\2\2\2\u014d"+
		"\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2"+
		"\2\2\u0150\u014e\3\2\2\2\u0151\u0153\7\37\2\2\u0152\u0147\3\2\2\2\u0152"+
		"\u0148\3\2\2\2\u0153!\3\2\2\2\u0154\u015c\5\22\n\2\u0155\u0158\5l\67\2"+
		"\u0156\u0157\7$\2\2\u0157\u0159\5\24\13\2\u0158\u0156\3\2\2\2\u0158\u0159"+
		"\3\2\2\2\u0159\u015d\3\2\2\2\u015a\u015b\7$\2\2\u015b\u015d\5\24\13\2"+
		"\u015c\u0155\3\2\2\2\u015c\u015a\3\2\2\2\u015d#\3\2\2\2\u015e\u0160\7"+
		" \2\2\u015f\u0161\5&\24\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0163\7!\2\2\u0163%\3\2\2\2\u0164\u0166\7&\2\2\u0165"+
		"\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u016c\3\2\2\2\u0167\u0169\7Y"+
		"\2\2\u0168\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016c\3\2\2\2\u016a"+
		"\u016c\6\24\2\2\u016b\u0165\3\2\2\2\u016b\u0168\3\2\2\2\u016b\u016a\3"+
		"\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\5(\25\2\u016e\u016f\5\u00c6d\2"+
		"\u016f\u0171\3\2\2\2\u0170\u016b\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0170"+
		"\3\2\2\2\u0172\u0173\3\2\2\2\u0173\'\3\2\2\2\u0174\u0184\5\f\7\2\u0175"+
		"\u0184\5:\36\2\u0176\u0184\5*\26\2\u0177\u0184\5j\66\2\u0178\u0184\5<"+
		"\37\2\u0179\u0184\5> \2\u017a\u0184\5@!\2\u017b\u0184\5B\"\2\u017c\u0184"+
		"\5D#\2\u017d\u0184\5$\23\2\u017e\u0184\5H%\2\u017f\u0184\5J&\2\u0180\u0184"+
		"\5\\/\2\u0181\u0184\5d\63\2\u0182\u0184\5F$\2\u0183\u0174\3\2\2\2\u0183"+
		"\u0175\3\2\2\2\u0183\u0176\3\2\2\2\u0183\u0177\3\2\2\2\u0183\u0178\3\2"+
		"\2\2\u0183\u0179\3\2\2\2\u0183\u017a\3\2\2\2\u0183\u017b\3\2\2\2\u0183"+
		"\u017c\3\2\2\2\u0183\u017d\3\2\2\2\u0183\u017e\3\2\2\2\u0183\u017f\3\2"+
		"\2\2\u0183\u0180\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0182\3\2\2\2\u0184"+
		")\3\2\2\2\u0185\u018b\5.\30\2\u0186\u018b\5\60\31\2\u0187\u018b\5\62\32"+
		"\2\u0188\u018b\5,\27\2\u0189\u018b\5\66\34\2\u018a\u0185\3\2\2\2\u018a"+
		"\u0186\3\2\2\2\u018a\u0187\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u0189\3\2"+
		"\2\2\u018b+\3\2\2\2\u018c\u018d\5\u008eH\2\u018d-\3\2\2\2\u018e\u018f"+
		"\5\u008eH\2\u018f\u0190\7A\2\2\u0190\u0191\5\u008eH\2\u0191/\3\2\2\2\u0192"+
		"\u0193\5\u008eH\2\u0193\u0194\t\3\2\2\u0194\61\3\2\2\2\u0195\u0196\5\24"+
		"\13\2\u0196\u0197\5\64\33\2\u0197\u0198\5\24\13\2\u0198\63\3\2\2\2\u0199"+
		"\u019b\t\4\2\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2"+
		"\2\2\u019c\u019d\7$\2\2\u019d\65\3\2\2\2\u019e\u019f\5\22\n\2\u019f\u01a0"+
		"\7+\2\2\u01a0\u01a1\5\24\13\2\u01a1\67\3\2\2\2\u01a2\u01a3\t\5\2\2\u01a3"+
		"9\3\2\2\2\u01a4\u01a5\7\35\2\2\u01a5\u01a7\7\'\2\2\u01a6\u01a8\5(\25\2"+
		"\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8;\3\2\2\2\u01a9\u01ab\7"+
		"\32\2\2\u01aa\u01ac\5\24\13\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2"+
		"\u01ac=\3\2\2\2\u01ad\u01af\7\3\2\2\u01ae\u01b0\7\35\2\2\u01af\u01ae\3"+
		"\2\2\2\u01af\u01b0\3\2\2\2\u01b0?\3\2\2\2\u01b1\u01b3\7\27\2\2\u01b2\u01b4"+
		"\7\35\2\2\u01b3\u01b2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4A\3\2\2\2\u01b5"+
		"\u01b6\7\17\2\2\u01b6\u01b7\7\35\2\2\u01b7C\3\2\2\2\u01b8\u01b9\7\23\2"+
		"\2\u01b9E\3\2\2\2\u01ba\u01bb\7\t\2\2\u01bb\u01bc\5\u008eH\2\u01bcG\3"+
		"\2\2\2\u01bd\u01c6\7\24\2\2\u01be\u01c7\5\u008eH\2\u01bf\u01c0\5\u00c6"+
		"d\2\u01c0\u01c1\5\u008eH\2\u01c1\u01c7\3\2\2\2\u01c2\u01c3\5*\26\2\u01c3"+
		"\u01c4\5\u00c6d\2\u01c4\u01c5\5\u008eH\2\u01c5\u01c7\3\2\2\2\u01c6\u01be"+
		"\3\2\2\2\u01c6\u01bf\3\2\2\2\u01c6\u01c2\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01ce\5$\23\2\u01c9\u01cc\7\16\2\2\u01ca\u01cd\5H%\2\u01cb\u01cd\5$\23"+
		"\2\u01cc\u01ca\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01c9"+
		"\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cfI\3\2\2\2\u01d0\u01d3\5L\'\2\u01d1\u01d3"+
		"\5R*\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3K\3\2\2\2\u01d4\u01df"+
		"\7\21\2\2\u01d5\u01d7\5\u008eH\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2"+
		"\2\u01d7\u01e0\3\2\2\2\u01d8\u01da\5*\26\2\u01d9\u01d8\3\2\2\2\u01d9\u01da"+
		"\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dd\5\u00c6d\2\u01dc\u01de\5\u008e"+
		"H\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df"+
		"\u01d6\3\2\2\2\u01df\u01d9\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e5\7 "+
		"\2\2\u01e2\u01e4\5N(\2\u01e3\u01e2\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3"+
		"\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8"+
		"\u01e9\7!\2\2\u01e9M\3\2\2\2\u01ea\u01eb\5P)\2\u01eb\u01ed\7\'\2\2\u01ec"+
		"\u01ee\5&\24\2\u01ed\u01ec\3\2\2\2\u01ed\u01ee\3\2\2\2\u01eeO\3\2\2\2"+
		"\u01ef\u01f0\7\b\2\2\u01f0\u01f3\5\24\13\2\u01f1\u01f3\7\4\2\2\u01f2\u01ef"+
		"\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f3Q\3\2\2\2\u01f4\u01fd\7\21\2\2\u01f5"+
		"\u01fe\5T+\2\u01f6\u01f7\5\u00c6d\2\u01f7\u01f8\5T+\2\u01f8\u01fe\3\2"+
		"\2\2\u01f9\u01fa\5*\26\2\u01fa\u01fb\5\u00c6d\2\u01fb\u01fc\5T+\2\u01fc"+
		"\u01fe\3\2\2\2\u01fd\u01f5\3\2\2\2\u01fd\u01f6\3\2\2\2\u01fd\u01f9\3\2"+
		"\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0203\7 \2\2\u0200\u0202\5V,\2\u0201\u0200"+
		"\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"\u0206\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0207\7!\2\2\u0207S\3\2\2\2\u0208"+
		"\u0209\7\35\2\2\u0209\u020b\7+\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2"+
		"\2\2\u020b\u020c\3\2\2\2\u020c\u020d\5\u0090I\2\u020d\u020e\7(\2\2\u020e"+
		"\u020f\7\36\2\2\u020f\u0210\7\26\2\2\u0210\u0211\7\37\2\2\u0211U\3\2\2"+
		"\2\u0212\u0213\5X-\2\u0213\u0215\7\'\2\2\u0214\u0216\5&\24\2\u0215\u0214"+
		"\3\2\2\2\u0215\u0216\3\2\2\2\u0216W\3\2\2\2\u0217\u0218\7\b\2\2\u0218"+
		"\u021b\5Z.\2\u0219\u021b\7\4\2\2\u021a\u0217\3\2\2\2\u021a\u0219\3\2\2"+
		"\2\u021bY\3\2\2\2\u021c\u021f\5l\67\2\u021d\u021f\7\34\2\2\u021e\u021c"+
		"\3\2\2\2\u021e\u021d\3\2\2\2\u021f\u0227\3\2\2\2\u0220\u0223\7%\2\2\u0221"+
		"\u0224\5l\67\2\u0222\u0224\7\34\2\2\u0223\u0221\3\2\2\2\u0223\u0222\3"+
		"\2\2\2\u0224\u0226\3\2\2\2\u0225\u0220\3\2\2\2\u0226\u0229\3\2\2\2\u0227"+
		"\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228[\3\2\2\2\u0229\u0227\3\2\2\2"+
		"\u022a\u022b\7\7\2\2\u022b\u022f\7 \2\2\u022c\u022e\5^\60\2\u022d\u022c"+
		"\3\2\2\2\u022e\u0231\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230"+
		"\u0232\3\2\2\2\u0231\u022f\3\2\2\2\u0232\u0233\7!\2\2\u0233]\3\2\2\2\u0234"+
		"\u0235\5`\61\2\u0235\u0237\7\'\2\2\u0236\u0238\5&\24\2\u0237\u0236\3\2"+
		"\2\2\u0237\u0238\3\2\2\2\u0238_\3\2\2\2\u0239\u023c\7\b\2\2\u023a\u023d"+
		"\5.\30\2\u023b\u023d\5b\62\2\u023c\u023a\3\2\2\2\u023c\u023b\3\2\2\2\u023d"+
		"\u0240\3\2\2\2\u023e\u0240\7\4\2\2\u023f\u0239\3\2\2\2\u023f\u023e\3\2"+
		"\2\2\u0240a\3\2\2\2\u0241\u0242\5\24\13\2\u0242\u0243\7$\2\2\u0243\u0248"+
		"\3\2\2\2\u0244\u0245\5\22\n\2\u0245\u0246\7+\2\2\u0246\u0248\3\2\2\2\u0247"+
		"\u0241\3\2\2\2\u0247\u0244\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249\3\2"+
		"\2\2\u0249\u024a\5\u008eH\2\u024ac\3\2\2\2\u024b\u0253\7\30\2\2\u024c"+
		"\u024e\5\u008eH\2\u024d\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0254"+
		"\3\2\2\2\u024f\u0254\5f\64\2\u0250\u0252\5h\65\2\u0251\u0250\3\2\2\2\u0251"+
		"\u0252\3\2\2\2\u0252\u0254\3\2\2\2\u0253\u024d\3\2\2\2\u0253\u024f\3\2"+
		"\2\2\u0253\u0251\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256\5$\23\2\u0256"+
		"e\3\2\2\2\u0257\u0259\5*\26\2\u0258\u0257\3\2\2\2\u0258\u0259\3\2\2\2"+
		"\u0259\u025a\3\2\2\2\u025a\u025c\5\u00c6d\2\u025b\u025d\5\u008eH\2\u025c"+
		"\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0260\5\u00c6"+
		"d\2\u025f\u0261\5*\26\2\u0260\u025f\3\2\2\2\u0260\u0261\3\2\2\2\u0261"+
		"g\3\2\2\2\u0262\u0263\5\24\13\2\u0263\u0264\7$\2\2\u0264\u0269\3\2\2\2"+
		"\u0265\u0266\5\22\n\2\u0266\u0267\7+\2\2\u0267\u0269\3\2\2\2\u0268\u0262"+
		"\3\2\2\2\u0268\u0265\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a\3\2\2\2\u026a"+
		"\u026b\7\25\2\2\u026b\u026c\5\u008eH\2\u026ci\3\2\2\2\u026d\u026e\7\n"+
		"\2\2\u026e\u026f\5\u008eH\2\u026fk\3\2\2\2\u0270\u0277\5n8\2\u0271\u0277"+
		"\5p9\2\u0272\u0273\7\36\2\2\u0273\u0274\5l\67\2\u0274\u0275\7\37\2\2\u0275"+
		"\u0277\3\2\2\2\u0276\u0270\3\2\2\2\u0276\u0271\3\2\2\2\u0276\u0272\3\2"+
		"\2\2\u0277m\3\2\2\2\u0278\u027b\5\u00a0Q\2\u0279\u027b\7\35\2\2\u027a"+
		"\u0278\3\2\2\2\u027a\u0279\3\2\2\2\u027bo\3\2\2\2\u027c\u0285\5r:\2\u027d"+
		"\u0285\5\u00b0Y\2\u027e\u0285\5x=\2\u027f\u0285\5\u0084C\2\u0280\u0285"+
		"\5z>\2\u0281\u0285\5|?\2\u0282\u0285\5~@\2\u0283\u0285\5\u0080A\2\u0284"+
		"\u027c\3\2\2\2\u0284\u027d\3\2\2\2\u0284\u027e\3\2\2\2\u0284\u027f\3\2"+
		"\2\2\u0284\u0280\3\2\2\2\u0284\u0281\3\2\2\2\u0284\u0282\3\2\2\2\u0284"+
		"\u0283\3\2\2\2\u0285q\3\2\2\2\u0286\u0287\7\"\2\2\u0287\u0288\5t;\2\u0288"+
		"\u0289\7#\2\2\u0289\u028a\5v<\2\u028as\3\2\2\2\u028b\u028c\5\u008eH\2"+
		"\u028cu\3\2\2\2\u028d\u028e\5l\67\2\u028ew\3\2\2\2\u028f\u0290\7?\2\2"+
		"\u0290\u0291\5l\67\2\u0291y\3\2\2\2\u0292\u0293\7\6\2\2\u0293\u029c\7"+
		" \2\2\u0294\u0297\5\u0082B\2\u0295\u0297\5n8\2\u0296\u0294\3\2\2\2\u0296"+
		"\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\5\u00c6d\2\u0299\u029b"+
		"\3\2\2\2\u029a\u0296\3\2\2\2\u029b\u029e\3\2\2\2\u029c\u029a\3\2\2\2\u029c"+
		"\u029d\3\2\2\2\u029d\u029f\3\2\2\2\u029e\u029c\3\2\2\2\u029f\u02a0\7!"+
		"\2\2\u02a0{\3\2\2\2\u02a1\u02a2\7\"\2\2\u02a2\u02a3\7#\2\2\u02a3\u02a4"+
		"\5v<\2\u02a4}\3\2\2\2\u02a5\u02a6\7\13\2\2\u02a6\u02a7\7\"\2\2\u02a7\u02a8"+
		"\5l\67\2\u02a8\u02a9\7#\2\2\u02a9\u02aa\5v<\2\u02aa\177\3\2\2\2\u02ab"+
		"\u02b1\7\r\2\2\u02ac\u02ad\7\r\2\2\u02ad\u02b1\7A\2\2\u02ae\u02af\7A\2"+
		"\2\u02af\u02b1\7\r\2\2\u02b0\u02ab\3\2\2\2\u02b0\u02ac\3\2\2\2\u02b0\u02ae"+
		"\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\5v<\2\u02b3\u0081\3\2\2\2\u02b4"+
		"\u02b5\7\35\2\2\u02b5\u02b6\5\u008aF\2\u02b6\u02b7\5\u0088E\2\u02b7\u02bb"+
		"\3\2\2\2\u02b8\u02b9\7\35\2\2\u02b9\u02bb\5\u008aF\2\u02ba\u02b4\3\2\2"+
		"\2\u02ba\u02b8\3\2\2\2\u02bb\u0083\3\2\2\2\u02bc\u02bd\7\5\2\2\u02bd\u02be"+
		"\5\u0086D\2\u02be\u0085\3\2\2\2\u02bf\u02c0\5\u008aF\2\u02c0\u02c1\5\u0088"+
		"E\2\u02c1\u02c4\3\2\2\2\u02c2\u02c4\5\u008aF\2\u02c3\u02bf\3\2\2\2\u02c3"+
		"\u02c2\3\2\2\2\u02c4\u0087\3\2\2\2\u02c5\u02c8\5\u008aF\2\u02c6\u02c8"+
		"\5l\67\2\u02c7\u02c5\3\2\2\2\u02c7\u02c6\3\2\2\2\u02c8\u0089\3\2\2\2\u02c9"+
		"\u02d5\7\36\2\2\u02ca\u02cf\5\u008cG\2\u02cb\u02cc\7%\2\2\u02cc\u02ce"+
		"\5\u008cG\2\u02cd\u02cb\3\2\2\2\u02ce\u02d1\3\2\2\2\u02cf\u02cd\3\2\2"+
		"\2\u02cf\u02d0\3\2\2\2\u02d0\u02d3\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d2\u02d4"+
		"\7%\2\2\u02d3\u02d2\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d6\3\2\2\2\u02d5"+
		"\u02ca\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d8\7\37"+
		"\2\2\u02d8\u008b\3\2\2\2\u02d9\u02db\5\22\n\2\u02da\u02d9\3\2\2\2\u02da"+
		"\u02db\3\2\2\2\u02db\u02dd\3\2\2\2\u02dc\u02de\7,\2\2\u02dd\u02dc\3\2"+
		"\2\2\u02dd\u02de\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e0\5l\67\2\u02e0"+
		"\u008d\3\2\2\2\u02e1\u02e2\bH\1\2\u02e2\u02e6\5\u0090I\2\u02e3\u02e4\t"+
		"\6\2\2\u02e4\u02e6\5\u008eH\b\u02e5\u02e1\3\2\2\2\u02e5\u02e3\3\2\2\2"+
		"\u02e6\u02f8\3\2\2\2\u02e7\u02e8\f\7\2\2\u02e8\u02e9\t\7\2\2\u02e9\u02f7"+
		"\5\u008eH\b\u02ea\u02eb\f\6\2\2\u02eb\u02ec\t\b\2\2\u02ec\u02f7\5\u008e"+
		"H\7\u02ed\u02ee\f\5\2\2\u02ee\u02ef\t\t\2\2\u02ef\u02f7\5\u008eH\6\u02f0"+
		"\u02f1\f\4\2\2\u02f1\u02f2\7.\2\2\u02f2\u02f7\5\u008eH\5\u02f3\u02f4\f"+
		"\3\2\2\u02f4\u02f5\7-\2\2\u02f5\u02f7\5\u008eH\4\u02f6\u02e7\3\2\2\2\u02f6"+
		"\u02ea\3\2\2\2\u02f6\u02ed\3\2\2\2\u02f6\u02f0\3\2\2\2\u02f6\u02f3\3\2"+
		"\2\2\u02f7\u02fa\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9"+
		"\u008f\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fb\u02fc\bI\1\2\u02fc\u0300\5\u0096"+
		"L\2\u02fd\u0300\5\u0092J\2\u02fe\u0300\5\u00c2b\2\u02ff\u02fb\3\2\2\2"+
		"\u02ff\u02fd\3\2\2\2\u02ff\u02fe\3\2\2\2\u0300\u030c\3\2\2\2\u0301\u0308"+
		"\f\3\2\2\u0302\u0303\7(\2\2\u0303\u0309\7\35\2\2\u0304\u0309\5\u00ba^"+
		"\2\u0305\u0309\5\u00bc_\2\u0306\u0309\5\u00be`\2\u0307\u0309\5\u00c0a"+
		"\2\u0308\u0302\3\2\2\2\u0308\u0304\3\2\2\2\u0308\u0305\3\2\2\2\u0308\u0306"+
		"\3\2\2\2\u0308\u0307\3\2\2\2\u0309\u030b\3\2\2\2\u030a\u0301\3\2\2\2\u030b"+
		"\u030e\3\2\2\2\u030c\u030a\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u0091\3\2"+
		"\2\2\u030e\u030c\3\2\2\2\u030f\u0310\5\u0094K\2\u0310\u0311\7\36\2\2\u0311"+
		"\u0313\5\u008eH\2\u0312\u0314\7%\2\2\u0313\u0312\3\2\2\2\u0313\u0314\3"+
		"\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316\7\37\2\2\u0316\u0093\3\2\2\2\u0317"+
		"\u031d\5p9\2\u0318\u0319\7\36\2\2\u0319\u031a\5\u0094K\2\u031a\u031b\7"+
		"\37\2\2\u031b\u031d\3\2\2\2\u031c\u0317\3\2\2\2\u031c\u0318\3\2\2\2\u031d"+
		"\u0095\3\2\2\2\u031e\u0325\5\u0098M\2\u031f\u0325\5\u009eP\2\u0320\u0321"+
		"\7\36\2\2\u0321\u0322\5\u008eH\2\u0322\u0323\7\37\2\2\u0323\u0325\3\2"+
		"\2\2\u0324\u031e\3\2\2\2\u0324\u031f\3\2\2\2\u0324\u0320\3\2\2\2\u0325"+
		"\u0097\3\2\2\2\u0326\u032a\5\u009aN\2\u0327\u032a\5\u00a2R\2\u0328\u032a"+
		"\5\u00b8]\2\u0329\u0326\3\2\2\2\u0329\u0327\3\2\2\2\u0329\u0328\3\2\2"+
		"\2\u032a\u0099\3\2\2\2\u032b\u0330\7\34\2\2\u032c\u0330\5\u009cO\2\u032d"+
		"\u0330\5\u00b4[\2\u032e\u0330\7F\2\2\u032f\u032b\3\2\2\2\u032f\u032c\3"+
		"\2\2\2\u032f\u032d\3\2\2\2\u032f\u032e\3\2\2\2\u0330\u009b\3\2\2\2\u0331"+
		"\u0332\t\n\2\2\u0332\u009d\3\2\2\2\u0333\u0334\7\35\2\2\u0334\u009f\3"+
		"\2\2\2\u0335\u0336\7\35\2\2\u0336\u0337\7(\2\2\u0337\u0338\7\35\2\2\u0338"+
		"\u00a1\3\2\2\2\u0339\u033a\5\u00a4S\2\u033a\u033b\5\u00a6T\2\u033b\u00a3"+
		"\3\2\2\2\u033c\u0346\5\u00b0Y\2\u033d\u0346\5r:\2\u033e\u033f\7\"\2\2"+
		"\u033f\u0340\7,\2\2\u0340\u0341\7#\2\2\u0341\u0346\5v<\2\u0342\u0346\5"+
		"|?\2\u0343\u0346\5~@\2\u0344\u0346\5n8\2\u0345\u033c\3\2\2\2\u0345\u033d"+
		"\3\2\2\2\u0345\u033e\3\2\2\2\u0345\u0342\3\2\2\2\u0345\u0343\3\2\2\2\u0345"+
		"\u0344\3\2\2\2\u0346\u00a5\3\2\2\2\u0347\u034c\7 \2\2\u0348\u034a\5\u00a8"+
		"U\2\u0349\u034b\7%\2\2\u034a\u0349\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034d"+
		"\3\2\2\2\u034c\u0348\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034e\3\2\2\2\u034e"+
		"\u034f\7!\2\2\u034f\u00a7\3\2\2\2\u0350\u0355\5\u00aaV\2\u0351\u0352\7"+
		"%\2\2\u0352\u0354\5\u00aaV\2\u0353\u0351\3\2\2\2\u0354\u0357\3\2\2\2\u0355"+
		"\u0353\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u00a9\3\2\2\2\u0357\u0355\3\2"+
		"\2\2\u0358\u0359\5\u00acW\2\u0359\u035a\7\'\2\2\u035a\u035c\3\2\2\2\u035b"+
		"\u0358\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035e\5\u00ae"+
		"X\2\u035e\u00ab\3\2\2\2\u035f\u0362\5\u008eH\2\u0360\u0362\5\u00a6T\2"+
		"\u0361\u035f\3\2\2\2\u0361\u0360\3\2\2\2\u0362\u00ad\3\2\2\2\u0363\u0366"+
		"\5\u008eH\2\u0364\u0366\5\u00a6T\2\u0365\u0363\3\2\2\2\u0365\u0364\3\2"+
		"\2\2\u0366\u00af\3\2\2\2\u0367\u0368\7\f\2\2\u0368\u036e\7 \2\2\u0369"+
		"\u036a\5\u00b2Z\2\u036a\u036b\5\u00c6d\2\u036b\u036d\3\2\2\2\u036c\u0369"+
		"\3\2\2\2\u036d\u0370\3\2\2\2\u036e\u036c\3\2\2\2\u036e\u036f\3\2\2\2\u036f"+
		"\u0371\3\2\2\2\u0370\u036e\3\2\2\2\u0371\u0372\7!\2\2\u0372\u00b1\3\2"+
		"\2\2\u0373\u0374\5\22\n\2\u0374\u0375\5l\67\2\u0375\u0378\3\2\2\2\u0376"+
		"\u0378\5\u00b6\\\2\u0377\u0373\3\2\2\2\u0377\u0376\3\2\2\2\u0378\u037a"+
		"\3\2\2\2\u0379\u037b\5\u00b4[\2\u037a\u0379\3\2\2\2\u037a\u037b\3\2\2"+
		"\2\u037b\u00b3\3\2\2\2\u037c\u037d\t\13\2\2\u037d\u00b5\3\2\2\2\u037e"+
		"\u0380\7?\2\2\u037f\u037e\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381\3\2"+
		"\2\2\u0381\u0382\5n8\2\u0382\u00b7\3\2\2\2\u0383\u0384\7\5\2\2\u0384\u0385"+
		"\5\u0086D\2\u0385\u0386\5$\23\2\u0386\u00b9\3\2\2\2\u0387\u0388\7\"\2"+
		"\2\u0388\u0389\5\u008eH\2\u0389\u038a\7#\2\2\u038a\u00bb\3\2\2\2\u038b"+
		"\u039b\7\"\2\2\u038c\u038e\5\u008eH\2\u038d\u038c\3\2\2\2\u038d\u038e"+
		"\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0391\7\'\2\2\u0390\u0392\5\u008eH"+
		"\2\u0391\u0390\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u039c\3\2\2\2\u0393\u0395"+
		"\5\u008eH\2\u0394\u0393\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0396\3\2\2"+
		"\2\u0396\u0397\7\'\2\2\u0397\u0398\5\u008eH\2\u0398\u0399\7\'\2\2\u0399"+
		"\u039a\5\u008eH\2\u039a\u039c\3\2\2\2\u039b\u038d\3\2\2\2\u039b\u0394"+
		"\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039e\7#\2\2\u039e\u00bd\3\2\2\2\u039f"+
		"\u03a0\7(\2\2\u03a0\u03a1\7\36\2\2\u03a1\u03a2\5l\67\2\u03a2\u03a3\7\37"+
		"\2\2\u03a3\u00bf\3\2\2\2\u03a4\u03b3\7\36\2\2\u03a5\u03ac\5\24\13\2\u03a6"+
		"\u03a9\5\u0094K\2\u03a7\u03a8\7%\2\2\u03a8\u03aa\5\24\13\2\u03a9\u03a7"+
		"\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ac\3\2\2\2\u03ab\u03a5\3\2\2\2\u03ab"+
		"\u03a6\3\2\2\2\u03ac\u03ae\3\2\2\2\u03ad\u03af\7,\2\2\u03ae\u03ad\3\2"+
		"\2\2\u03ae\u03af\3\2\2\2\u03af\u03b1\3\2\2\2\u03b0\u03b2\7%\2\2\u03b1"+
		"\u03b0\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b4\3\2\2\2\u03b3\u03ab\3\2"+
		"\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b6\7\37\2\2\u03b6"+
		"\u00c1\3\2\2\2\u03b7\u03b8\5\u0094K\2\u03b8\u03b9\7(\2\2\u03b9\u03ba\7"+
		"\35\2\2\u03ba\u00c3\3\2\2\2\u03bb\u03bc\5l\67\2\u03bc\u00c5\3\2\2\2\u03bd"+
		"\u03c2\7&\2\2\u03be\u03c2\7\2\2\3\u03bf\u03c2\7Y\2\2\u03c0\u03c2\6d\t"+
		"\2\u03c1\u03bd\3\2\2\2\u03c1\u03be\3\2\2\2\u03c1\u03bf\3\2\2\2\u03c1\u03c0"+
		"\3\2\2\2\u03c2\u00c7\3\2\2\2q\u00cf\u00d5\u00db\u00eb\u00ef\u00f2\u00fb"+
		"\u0105\u0109\u010d\u0111\u0118\u0120\u012b\u012f\u0133\u013b\u0142\u014e"+
		"\u0152\u0158\u015c\u0160\u0165\u0168\u016b\u0172\u0183\u018a\u019a\u01a7"+
		"\u01ab\u01af\u01b3\u01c6\u01cc\u01ce\u01d2\u01d6\u01d9\u01dd\u01df\u01e5"+
		"\u01ed\u01f2\u01fd\u0203\u020a\u0215\u021a\u021e\u0223\u0227\u022f\u0237"+
		"\u023c\u023f\u0247\u024d\u0251\u0253\u0258\u025c\u0260\u0268\u0276\u027a"+
		"\u0284\u0296\u029c\u02b0\u02ba\u02c3\u02c7\u02cf\u02d3\u02d5\u02da\u02dd"+
		"\u02e5\u02f6\u02f8\u02ff\u0308\u030c\u0313\u031c\u0324\u0329\u032f\u0345"+
		"\u034a\u034c\u0355\u035b\u0361\u0365\u036e\u0377\u037a\u037f\u038d\u0391"+
		"\u0394\u039b\u03a9\u03ab\u03ae\u03b1\u03b3\u03c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}