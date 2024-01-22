// Generated from j.g4 by ANTLR 4.7.1
package w3.script.jass.extensible_jass;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class jParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARRAY=1, ASSIGN=2, BOOL_TYPE=3, BRACKET_LEFT=4, BRACKET_RIGHT=5, CALL=6, 
		CASE=7, CODE_TYPE=8, COMMA=9, CONSTANT=10, DEBUG=11, DEFAULT_CASE=12, 
		ELSE=13, ELSEIF=14, ENDFUNCTION=15, ENDGLOBALS=16, ENDIF=17, ENDLOOP=18, 
		ENDSELECT=19, EXITWHEN=20, EXTENDS=21, FUNCTION=22, GLOBALS=23, HANDLE_TYPE=24, 
		IF=25, INT_TYPE=26, LOCAL=27, LOOP=28, NATIVE=29, NOTHING=30, NULL=31, 
		PARENS_LEFT=32, PARENS_RIGHT=33, REAL_TYPE=34, RETURN=35, RETURNS=36, 
		SELECT=37, SET=38, STRING_TYPE=39, TAKES=40, THEN=41, TYPE=42, NEW_LINES=43, 
		UNARY_OP=44, INT=45, REAL=46, BOOL=47, STRING_LITERAL=48, BINARY_OP=49, 
		ID=50, WS=51;
	public static final int
		RULE_typedef = 0, RULE_type = 1, RULE_unary_op = 2, RULE_args_tail = 3, 
		RULE_args = 4, RULE_func_call = 5, RULE_array_ref = 6, RULE_funcRef = 7, 
		RULE_literal = 8, RULE_atomic_expr = 9, RULE_expr = 10, RULE_var_declaration = 11, 
		RULE_global_var_list = 12, RULE_globals = 13, RULE_param_list = 14, RULE_func_declaration = 15, 
		RULE_native_func = 16, RULE_local_var_list = 17, RULE_set = 18, RULE_call = 19, 
		RULE_else_if_clause = 20, RULE_else_clause = 21, RULE_if_then_else = 22, 
		RULE_loop = 23, RULE_exitwhen = 24, RULE_return_statement = 25, RULE_debug = 26, 
		RULE_case_clause = 27, RULE_default_case_clause = 28, RULE_select = 29, 
		RULE_statement = 30, RULE_statement_list = 31, RULE_func = 32, RULE_declaration = 33, 
		RULE_file = 34, RULE_program = 35;
	public static final String[] ruleNames = {
		"typedef", "type", "unary_op", "args_tail", "args", "func_call", "array_ref", 
		"funcRef", "literal", "atomic_expr", "expr", "var_declaration", "global_var_list", 
		"globals", "param_list", "func_declaration", "native_func", "local_var_list", 
		"set", "call", "else_if_clause", "else_clause", "if_then_else", "loop", 
		"exitwhen", "return_statement", "debug", "case_clause", "default_case_clause", 
		"select", "statement", "statement_list", "func", "declaration", "file", 
		"program"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'array'", "'='", "'boolean'", "'['", "']'", "'call'", "'case'", 
		"'code'", "','", "'constant'", "'debug'", "'default'", "'else'", "'elseif'", 
		"'endfunction'", "'endglobals'", "'endif'", "'endloop'", "'endselect'", 
		"'exitwhen'", "'extends'", "'function'", "'globals'", "'handle'", "'if'", 
		"'integer'", "'local'", "'loop'", "'native'", "'nothing'", "'null'", "'('", 
		"')'", "'real'", "'return'", "'returns'", "'select'", "'set'", "'string'", 
		"'takes'", "'then'", "'type'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ARRAY", "ASSIGN", "BOOL_TYPE", "BRACKET_LEFT", "BRACKET_RIGHT", 
		"CALL", "CASE", "CODE_TYPE", "COMMA", "CONSTANT", "DEBUG", "DEFAULT_CASE", 
		"ELSE", "ELSEIF", "ENDFUNCTION", "ENDGLOBALS", "ENDIF", "ENDLOOP", "ENDSELECT", 
		"EXITWHEN", "EXTENDS", "FUNCTION", "GLOBALS", "HANDLE_TYPE", "IF", "INT_TYPE", 
		"LOCAL", "LOOP", "NATIVE", "NOTHING", "NULL", "PARENS_LEFT", "PARENS_RIGHT", 
		"REAL_TYPE", "RETURN", "RETURNS", "SELECT", "SET", "STRING_TYPE", "TAKES", 
		"THEN", "TYPE", "NEW_LINES", "UNARY_OP", "INT", "REAL", "BOOL", "STRING_LITERAL", 
		"BINARY_OP", "ID", "WS"
	};
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
	public String getGrammarFileName() { return "j.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public jParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TypedefContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(jParser.TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(jParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(jParser.ID, i);
		}
		public TerminalNode EXTENDS() { return getToken(jParser.EXTENDS, 0); }
		public TerminalNode HANDLE_TYPE() { return getToken(jParser.HANDLE_TYPE, 0); }
		public TypedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterTypedef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitTypedef(this);
		}
	}

	public final TypedefContext typedef() throws RecognitionException {
		TypedefContext _localctx = new TypedefContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_typedef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(TYPE);
			setState(73);
			match(ID);
			setState(74);
			match(EXTENDS);
			setState(75);
			_la = _input.LA(1);
			if ( !(_la==HANDLE_TYPE || _la==ID) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(jParser.ID, 0); }
		public TerminalNode CODE_TYPE() { return getToken(jParser.CODE_TYPE, 0); }
		public TerminalNode HANDLE_TYPE() { return getToken(jParser.HANDLE_TYPE, 0); }
		public TerminalNode INT_TYPE() { return getToken(jParser.INT_TYPE, 0); }
		public TerminalNode REAL_TYPE() { return getToken(jParser.REAL_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(jParser.BOOL_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(jParser.STRING_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_TYPE) | (1L << CODE_TYPE) | (1L << HANDLE_TYPE) | (1L << INT_TYPE) | (1L << REAL_TYPE) | (1L << STRING_TYPE) | (1L << ID))) != 0)) ) {
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

	public static class Unary_opContext extends ParserRuleContext {
		public TerminalNode UNARY_OP() { return getToken(jParser.UNARY_OP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Unary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterUnary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitUnary_op(this);
		}
	}

	public final Unary_opContext unary_op() throws RecognitionException {
		Unary_opContext _localctx = new Unary_opContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_unary_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(UNARY_OP);
			setState(80);
			expr();
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

	public static class Args_tailContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(jParser.COMMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Args_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterArgs_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitArgs_tail(this);
		}
	}

	public final Args_tailContext args_tail() throws RecognitionException {
		Args_tailContext _localctx = new Args_tailContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_args_tail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(COMMA);
			setState(83);
			expr();
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

	public static class ArgsContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<Args_tailContext> args_tail() {
			return getRuleContexts(Args_tailContext.class);
		}
		public Args_tailContext args_tail(int i) {
			return getRuleContext(Args_tailContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			expr();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(86);
				args_tail();
				}
				}
				setState(91);
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

	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(jParser.ID, 0); }
		public TerminalNode PARENS_LEFT() { return getToken(jParser.PARENS_LEFT, 0); }
		public TerminalNode PARENS_RIGHT() { return getToken(jParser.PARENS_RIGHT, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitFunc_call(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(ID);
			setState(93);
			match(PARENS_LEFT);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << NULL) | (1L << PARENS_LEFT) | (1L << UNARY_OP) | (1L << INT) | (1L << REAL) | (1L << BOOL) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
				{
				setState(94);
				args();
				}
			}

			setState(97);
			match(PARENS_RIGHT);
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

	public static class Array_refContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(jParser.ID, 0); }
		public TerminalNode BRACKET_LEFT() { return getToken(jParser.BRACKET_LEFT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode BRACKET_RIGHT() { return getToken(jParser.BRACKET_RIGHT, 0); }
		public Array_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterArray_ref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitArray_ref(this);
		}
	}

	public final Array_refContext array_ref() throws RecognitionException {
		Array_refContext _localctx = new Array_refContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_array_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ID);
			setState(100);
			match(BRACKET_LEFT);
			setState(101);
			expr();
			setState(102);
			match(BRACKET_RIGHT);
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

	public static class FuncRefContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(jParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(jParser.ID, 0); }
		public FuncRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterFuncRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitFuncRef(this);
		}
	}

	public final FuncRefContext funcRef() throws RecognitionException {
		FuncRefContext _localctx = new FuncRefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(FUNCTION);
			setState(105);
			match(ID);
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
		public TerminalNode INT() { return getToken(jParser.INT, 0); }
		public TerminalNode REAL() { return getToken(jParser.REAL, 0); }
		public TerminalNode BOOL() { return getToken(jParser.BOOL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(jParser.STRING_LITERAL, 0); }
		public TerminalNode NULL() { return getToken(jParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << INT) | (1L << REAL) | (1L << BOOL) | (1L << STRING_LITERAL))) != 0)) ) {
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

	public static class Atomic_exprContext extends ParserRuleContext {
		public Unary_opContext unary_op() {
			return getRuleContext(Unary_opContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Array_refContext array_ref() {
			return getRuleContext(Array_refContext.class,0);
		}
		public FuncRefContext funcRef() {
			return getRuleContext(FuncRefContext.class,0);
		}
		public TerminalNode ID() { return getToken(jParser.ID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Atomic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterAtomic_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitAtomic_expr(this);
		}
	}

	public final Atomic_exprContext atomic_expr() throws RecognitionException {
		Atomic_exprContext _localctx = new Atomic_exprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atomic_expr);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				unary_op();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				func_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				array_ref();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				funcRef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(114);
				literal();
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

	public static class ExprContext extends ParserRuleContext {
		public Atomic_exprContext atomic_expr() {
			return getRuleContext(Atomic_exprContext.class,0);
		}
		public TerminalNode BINARY_OP() { return getToken(jParser.BINARY_OP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARENS_LEFT() { return getToken(jParser.PARENS_LEFT, 0); }
		public TerminalNode PARENS_RIGHT() { return getToken(jParser.PARENS_RIGHT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
			case NULL:
			case UNARY_OP:
			case INT:
			case REAL:
			case BOOL:
			case STRING_LITERAL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				atomic_expr();
				setState(120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(118);
					match(BINARY_OP);
					setState(119);
					expr();
					}
					break;
				}
				}
				break;
			case PARENS_LEFT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(122);
				match(PARENS_LEFT);
				setState(123);
				expr();
				setState(124);
				match(PARENS_RIGHT);
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

	public static class Var_declarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(jParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(jParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ARRAY() { return getToken(jParser.ARRAY, 0); }
		public Var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterVar_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitVar_declaration(this);
		}
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_var_declaration);
		int _la;
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(128);
				type();
				setState(129);
				match(ID);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(130);
					match(ASSIGN);
					setState(131);
					expr();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(134);
				type();
				setState(135);
				match(ARRAY);
				setState(136);
				match(ID);
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

	public static class Global_var_listContext extends ParserRuleContext {
		public List<TerminalNode> CONSTANT() { return getTokens(jParser.CONSTANT); }
		public TerminalNode CONSTANT(int i) {
			return getToken(jParser.CONSTANT, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(jParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(jParser.ID, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(jParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(jParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NEW_LINES() { return getTokens(jParser.NEW_LINES); }
		public TerminalNode NEW_LINES(int i) {
			return getToken(jParser.NEW_LINES, i);
		}
		public List<Var_declarationContext> var_declaration() {
			return getRuleContexts(Var_declarationContext.class);
		}
		public Var_declarationContext var_declaration(int i) {
			return getRuleContext(Var_declarationContext.class,i);
		}
		public List<TerminalNode> ARRAY() { return getTokens(jParser.ARRAY); }
		public TerminalNode ARRAY(int i) {
			return getToken(jParser.ARRAY, i);
		}
		public Global_var_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_var_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterGlobal_var_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitGlobal_var_list(this);
		}
	}

	public final Global_var_listContext global_var_list() throws RecognitionException {
		Global_var_listContext _localctx = new Global_var_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_global_var_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_TYPE) | (1L << CODE_TYPE) | (1L << CONSTANT) | (1L << HANDLE_TYPE) | (1L << INT_TYPE) | (1L << REAL_TYPE) | (1L << STRING_TYPE) | (1L << ID))) != 0)) {
				{
				setState(153);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONSTANT:
					{
					{
					setState(140);
					match(CONSTANT);
					setState(141);
					type();
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ARRAY) {
						{
						setState(142);
						match(ARRAY);
						}
					}

					setState(145);
					match(ID);
					setState(146);
					match(ASSIGN);
					setState(147);
					expr();
					setState(148);
					match(NEW_LINES);
					}
					}
					break;
				case BOOL_TYPE:
				case CODE_TYPE:
				case HANDLE_TYPE:
				case INT_TYPE:
				case REAL_TYPE:
				case STRING_TYPE:
				case ID:
					{
					{
					setState(150);
					var_declaration();
					setState(151);
					match(NEW_LINES);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(157);
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

	public static class GlobalsContext extends ParserRuleContext {
		public TerminalNode GLOBALS() { return getToken(jParser.GLOBALS, 0); }
		public TerminalNode NEW_LINES() { return getToken(jParser.NEW_LINES, 0); }
		public Global_var_listContext global_var_list() {
			return getRuleContext(Global_var_listContext.class,0);
		}
		public TerminalNode ENDGLOBALS() { return getToken(jParser.ENDGLOBALS, 0); }
		public GlobalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterGlobals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitGlobals(this);
		}
	}

	public final GlobalsContext globals() throws RecognitionException {
		GlobalsContext _localctx = new GlobalsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_globals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(GLOBALS);
			setState(159);
			match(NEW_LINES);
			setState(160);
			global_var_list();
			setState(161);
			match(ENDGLOBALS);
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

	public static class Param_listContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(jParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(jParser.ID, i);
		}
		public TerminalNode COMMA() { return getToken(jParser.COMMA, 0); }
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterParam_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitParam_list(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			type();
			setState(164);
			match(ID);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(165);
				match(COMMA);
				setState(166);
				type();
				setState(167);
				match(ID);
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

	public static class Func_declarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(jParser.ID, 0); }
		public TerminalNode TAKES() { return getToken(jParser.TAKES, 0); }
		public TerminalNode RETURNS() { return getToken(jParser.RETURNS, 0); }
		public List<TerminalNode> NOTHING() { return getTokens(jParser.NOTHING); }
		public TerminalNode NOTHING(int i) {
			return getToken(jParser.NOTHING, i);
		}
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Func_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterFunc_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitFunc_declaration(this);
		}
	}

	public final Func_declarationContext func_declaration() throws RecognitionException {
		Func_declarationContext _localctx = new Func_declarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_func_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(ID);
			setState(172);
			match(TAKES);
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOTHING:
				{
				setState(173);
				match(NOTHING);
				}
				break;
			case BOOL_TYPE:
			case CODE_TYPE:
			case HANDLE_TYPE:
			case INT_TYPE:
			case REAL_TYPE:
			case STRING_TYPE:
			case ID:
				{
				setState(174);
				param_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(177);
			match(RETURNS);
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_TYPE:
			case CODE_TYPE:
			case HANDLE_TYPE:
			case INT_TYPE:
			case REAL_TYPE:
			case STRING_TYPE:
			case ID:
				{
				setState(178);
				type();
				}
				break;
			case NOTHING:
				{
				setState(179);
				match(NOTHING);
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

	public static class Native_funcContext extends ParserRuleContext {
		public TerminalNode NATIVE() { return getToken(jParser.NATIVE, 0); }
		public Func_declarationContext func_declaration() {
			return getRuleContext(Func_declarationContext.class,0);
		}
		public TerminalNode CONSTANT() { return getToken(jParser.CONSTANT, 0); }
		public Native_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterNative_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitNative_func(this);
		}
	}

	public final Native_funcContext native_func() throws RecognitionException {
		Native_funcContext _localctx = new Native_funcContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_native_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTANT) {
				{
				setState(182);
				match(CONSTANT);
				}
			}

			setState(185);
			match(NATIVE);
			setState(186);
			func_declaration();
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

	public static class Local_var_listContext extends ParserRuleContext {
		public List<TerminalNode> LOCAL() { return getTokens(jParser.LOCAL); }
		public TerminalNode LOCAL(int i) {
			return getToken(jParser.LOCAL, i);
		}
		public List<Var_declarationContext> var_declaration() {
			return getRuleContexts(Var_declarationContext.class);
		}
		public Var_declarationContext var_declaration(int i) {
			return getRuleContext(Var_declarationContext.class,i);
		}
		public List<TerminalNode> NEW_LINES() { return getTokens(jParser.NEW_LINES); }
		public TerminalNode NEW_LINES(int i) {
			return getToken(jParser.NEW_LINES, i);
		}
		public Local_var_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_var_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterLocal_var_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitLocal_var_list(this);
		}
	}

	public final Local_var_listContext local_var_list() throws RecognitionException {
		Local_var_listContext _localctx = new Local_var_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_local_var_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOCAL) {
				{
				{
				setState(188);
				match(LOCAL);
				setState(189);
				var_declaration();
				setState(190);
				match(NEW_LINES);
				}
				}
				setState(196);
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

	public static class SetContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(jParser.SET, 0); }
		public TerminalNode ID() { return getToken(jParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(jParser.ASSIGN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BRACKET_LEFT() { return getToken(jParser.BRACKET_LEFT, 0); }
		public TerminalNode BRACKET_RIGHT() { return getToken(jParser.BRACKET_RIGHT, 0); }
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitSet(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_set);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(197);
				match(SET);
				setState(198);
				match(ID);
				setState(199);
				match(ASSIGN);
				setState(200);
				expr();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(201);
				match(SET);
				setState(202);
				match(ID);
				setState(203);
				match(BRACKET_LEFT);
				setState(204);
				expr();
				setState(205);
				match(BRACKET_RIGHT);
				setState(206);
				match(ASSIGN);
				setState(207);
				expr();
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(jParser.CALL, 0); }
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(CALL);
			setState(212);
			func_call();
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

	public static class Else_if_clauseContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(jParser.ELSEIF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(jParser.THEN, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public List<TerminalNode> NEW_LINES() { return getTokens(jParser.NEW_LINES); }
		public TerminalNode NEW_LINES(int i) {
			return getToken(jParser.NEW_LINES, i);
		}
		public Else_if_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterElse_if_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitElse_if_clause(this);
		}
	}

	public final Else_if_clauseContext else_if_clause() throws RecognitionException {
		Else_if_clauseContext _localctx = new Else_if_clauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_else_if_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(ELSEIF);
			setState(215);
			expr();
			setState(216);
			match(THEN);
			setState(218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(217);
				match(NEW_LINES);
				}
				}
				setState(220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEW_LINES );
			setState(222);
			statement_list();
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

	public static class Else_clauseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(jParser.ELSE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public List<TerminalNode> NEW_LINES() { return getTokens(jParser.NEW_LINES); }
		public TerminalNode NEW_LINES(int i) {
			return getToken(jParser.NEW_LINES, i);
		}
		public TerminalNode ELSEIF() { return getToken(jParser.ELSEIF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(jParser.THEN, 0); }
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public Else_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterElse_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitElse_clause(this);
		}
	}

	public final Else_clauseContext else_clause() throws RecognitionException {
		Else_clauseContext _localctx = new Else_clauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_else_clause);
		int _la;
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(224);
				match(ELSE);
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(225);
					match(NEW_LINES);
					}
					}
					setState(228); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINES );
				setState(230);
				statement_list();
				}
				}
				break;
			case ELSEIF:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(231);
				match(ELSEIF);
				setState(232);
				expr();
				setState(233);
				match(THEN);
				setState(235); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(234);
					match(NEW_LINES);
					}
					}
					setState(237); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINES );
				setState(239);
				statement_list();
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE || _la==ELSEIF) {
					{
					setState(240);
					else_clause();
					}
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

	public static class If_then_elseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(jParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(jParser.THEN, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(jParser.ENDIF, 0); }
		public List<TerminalNode> NEW_LINES() { return getTokens(jParser.NEW_LINES); }
		public TerminalNode NEW_LINES(int i) {
			return getToken(jParser.NEW_LINES, i);
		}
		public List<Else_if_clauseContext> else_if_clause() {
			return getRuleContexts(Else_if_clauseContext.class);
		}
		public Else_if_clauseContext else_if_clause(int i) {
			return getRuleContext(Else_if_clauseContext.class,i);
		}
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public If_then_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_then_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterIf_then_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitIf_then_else(this);
		}
	}

	public final If_then_elseContext if_then_else() throws RecognitionException {
		If_then_elseContext _localctx = new If_then_elseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_if_then_else);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(IF);
			setState(246);
			expr();
			setState(247);
			match(THEN);
			setState(249); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(248);
				match(NEW_LINES);
				}
				}
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEW_LINES );
			setState(253);
			statement_list();
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(254);
					else_if_clause();
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE || _la==ELSEIF) {
				{
				setState(260);
				else_clause();
				}
			}

			setState(263);
			match(ENDIF);
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(jParser.LOOP, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode ENDLOOP() { return getToken(jParser.ENDLOOP, 0); }
		public List<TerminalNode> NEW_LINES() { return getTokens(jParser.NEW_LINES); }
		public TerminalNode NEW_LINES(int i) {
			return getToken(jParser.NEW_LINES, i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(LOOP);
			setState(267); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(266);
				match(NEW_LINES);
				}
				}
				setState(269); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEW_LINES );
			setState(271);
			statement_list();
			setState(272);
			match(ENDLOOP);
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

	public static class ExitwhenContext extends ParserRuleContext {
		public TerminalNode EXITWHEN() { return getToken(jParser.EXITWHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExitwhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitwhen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterExitwhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitExitwhen(this);
		}
	}

	public final ExitwhenContext exitwhen() throws RecognitionException {
		ExitwhenContext _localctx = new ExitwhenContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exitwhen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(EXITWHEN);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << NULL) | (1L << PARENS_LEFT) | (1L << UNARY_OP) | (1L << INT) | (1L << REAL) | (1L << BOOL) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
				{
				setState(275);
				expr();
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(jParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(RETURN);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << NULL) | (1L << PARENS_LEFT) | (1L << UNARY_OP) | (1L << INT) | (1L << REAL) | (1L << BOOL) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
				{
				setState(279);
				expr();
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

	public static class DebugContext extends ParserRuleContext {
		public TerminalNode DEBUG() { return getToken(jParser.DEBUG, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DebugContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debug; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterDebug(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitDebug(this);
		}
	}

	public final DebugContext debug() throws RecognitionException {
		DebugContext _localctx = new DebugContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_debug);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(DEBUG);
			setState(283);
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

	public static class Case_clauseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(jParser.CASE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEW_LINES() { return getToken(jParser.NEW_LINES, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Case_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterCase_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitCase_clause(this);
		}
	}

	public final Case_clauseContext case_clause() throws RecognitionException {
		Case_clauseContext _localctx = new Case_clauseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_case_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(CASE);
			setState(286);
			expr();
			setState(287);
			match(NEW_LINES);
			setState(288);
			statement_list();
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

	public static class Default_case_clauseContext extends ParserRuleContext {
		public TerminalNode DEFAULT_CASE() { return getToken(jParser.DEFAULT_CASE, 0); }
		public TerminalNode NEW_LINES() { return getToken(jParser.NEW_LINES, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Default_case_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_case_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterDefault_case_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitDefault_case_clause(this);
		}
	}

	public final Default_case_clauseContext default_case_clause() throws RecognitionException {
		Default_case_clauseContext _localctx = new Default_case_clauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_default_case_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(DEFAULT_CASE);
			setState(291);
			match(NEW_LINES);
			setState(292);
			statement_list();
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

	public static class SelectContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(jParser.SELECT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NEW_LINES() { return getTokens(jParser.NEW_LINES); }
		public TerminalNode NEW_LINES(int i) {
			return getToken(jParser.NEW_LINES, i);
		}
		public TerminalNode ENDSELECT() { return getToken(jParser.ENDSELECT, 0); }
		public List<Case_clauseContext> case_clause() {
			return getRuleContexts(Case_clauseContext.class);
		}
		public Case_clauseContext case_clause(int i) {
			return getRuleContext(Case_clauseContext.class,i);
		}
		public Default_case_clauseContext default_case_clause() {
			return getRuleContext(Default_case_clauseContext.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitSelect(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(SELECT);
			setState(295);
			expr();
			setState(296);
			match(NEW_LINES);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(297);
				case_clause();
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT_CASE) {
				{
				setState(303);
				default_case_clause();
				}
			}

			setState(306);
			match(NEW_LINES);
			setState(307);
			match(ENDSELECT);
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
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public If_then_elseContext if_then_else() {
			return getRuleContext(If_then_elseContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public ExitwhenContext exitwhen() {
			return getRuleContext(ExitwhenContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public DebugContext debug() {
			return getRuleContext(DebugContext.class,0);
		}
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_statement);
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				set();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				call();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				if_then_else();
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 4);
				{
				setState(312);
				loop();
				}
				break;
			case EXITWHEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(313);
				exitwhen();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(314);
				return_statement();
				}
				break;
			case DEBUG:
				enterOuterAlt(_localctx, 7);
				{
				setState(315);
				debug();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 8);
				{
				setState(316);
				select();
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

	public static class Statement_listContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NEW_LINES() { return getTokens(jParser.NEW_LINES); }
		public TerminalNode NEW_LINES(int i) {
			return getToken(jParser.NEW_LINES, i);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitStatement_list(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALL) | (1L << DEBUG) | (1L << EXITWHEN) | (1L << IF) | (1L << LOOP) | (1L << RETURN) | (1L << SELECT) | (1L << SET))) != 0)) {
				{
				{
				setState(319);
				statement();
				setState(320);
				match(NEW_LINES);
				}
				}
				setState(326);
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

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(jParser.FUNCTION, 0); }
		public Func_declarationContext func_declaration() {
			return getRuleContext(Func_declarationContext.class,0);
		}
		public List<TerminalNode> NEW_LINES() { return getTokens(jParser.NEW_LINES); }
		public TerminalNode NEW_LINES(int i) {
			return getToken(jParser.NEW_LINES, i);
		}
		public Local_var_listContext local_var_list() {
			return getRuleContext(Local_var_listContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode ENDFUNCTION() { return getToken(jParser.ENDFUNCTION, 0); }
		public TerminalNode CONSTANT() { return getToken(jParser.CONSTANT, 0); }
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTANT) {
				{
				setState(327);
				match(CONSTANT);
				}
			}

			setState(330);
			match(FUNCTION);
			setState(331);
			func_declaration();
			setState(332);
			match(NEW_LINES);
			setState(333);
			local_var_list();
			setState(334);
			statement_list();
			setState(335);
			match(ENDFUNCTION);
			setState(336);
			match(NEW_LINES);
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
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public GlobalsContext globals() {
			return getRuleContext(GlobalsContext.class,0);
		}
		public Native_funcContext native_func() {
			return getRuleContext(Native_funcContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_declaration);
		try {
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				typedef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				globals();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				native_func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(341);
				func();
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

	public static class FileContext extends ParserRuleContext {
		public List<TerminalNode> NEW_LINES() { return getTokens(jParser.NEW_LINES); }
		public TerminalNode NEW_LINES(int i) {
			return getToken(jParser.NEW_LINES, i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_file);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(NEW_LINES);
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(345);
					declaration();
					setState(346);
					match(NEW_LINES);
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONSTANT || _la==FUNCTION) {
				{
				{
				setState(353);
				func();
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(359);
				match(NEW_LINES);
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

	public static class ProgramContext extends ParserRuleContext {
		public List<FileContext> file() {
			return getRuleContexts(FileContext.class);
		}
		public FileContext file(int i) {
			return getRuleContext(FileContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jListener ) ((jListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(362);
				file();
				}
				}
				setState(365); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEW_LINES );
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u0172\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\6\3\6\7\6Z\n\6\f\6\16\6]\13\6\3\7\3\7\3\7\5\7b\n\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13v\n\13\3\f\3\f\3\f\5\f{\n\f\3\f\3\f\3\f\3\f\5\f\u0081\n\f\3"+
		"\r\3\r\3\r\3\r\5\r\u0087\n\r\3\r\3\r\3\r\3\r\5\r\u008d\n\r\3\16\3\16\3"+
		"\16\5\16\u0092\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u009c"+
		"\n\16\f\16\16\16\u009f\13\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\5\20\u00ac\n\20\3\21\3\21\3\21\3\21\5\21\u00b2\n\21\3\21"+
		"\3\21\3\21\5\21\u00b7\n\21\3\22\5\22\u00ba\n\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\7\23\u00c3\n\23\f\23\16\23\u00c6\13\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00d4\n\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\6\26\u00dd\n\26\r\26\16\26\u00de\3\26\3\26\3"+
		"\27\3\27\6\27\u00e5\n\27\r\27\16\27\u00e6\3\27\3\27\3\27\3\27\3\27\6\27"+
		"\u00ee\n\27\r\27\16\27\u00ef\3\27\3\27\5\27\u00f4\n\27\5\27\u00f6\n\27"+
		"\3\30\3\30\3\30\3\30\6\30\u00fc\n\30\r\30\16\30\u00fd\3\30\3\30\7\30\u0102"+
		"\n\30\f\30\16\30\u0105\13\30\3\30\5\30\u0108\n\30\3\30\3\30\3\31\3\31"+
		"\6\31\u010e\n\31\r\31\16\31\u010f\3\31\3\31\3\31\3\32\3\32\5\32\u0117"+
		"\n\32\3\33\3\33\5\33\u011b\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u012d\n\37\f\37\16\37\u0130"+
		"\13\37\3\37\5\37\u0133\n\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \5 "+
		"\u0140\n \3!\3!\3!\7!\u0145\n!\f!\16!\u0148\13!\3\"\5\"\u014b\n\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\5#\u0159\n#\3$\3$\3$\3$\7$\u015f"+
		"\n$\f$\16$\u0162\13$\3$\7$\u0165\n$\f$\16$\u0168\13$\3$\5$\u016b\n$\3"+
		"%\6%\u016e\n%\r%\16%\u016f\3%\2\2&\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\5\4\2\32\32\64\64\t\2\5\5\n\n\32\32"+
		"\34\34$$))\64\64\4\2!!/\62\2\u017e\2J\3\2\2\2\4O\3\2\2\2\6Q\3\2\2\2\b"+
		"T\3\2\2\2\nW\3\2\2\2\f^\3\2\2\2\16e\3\2\2\2\20j\3\2\2\2\22m\3\2\2\2\24"+
		"u\3\2\2\2\26\u0080\3\2\2\2\30\u008c\3\2\2\2\32\u009d\3\2\2\2\34\u00a0"+
		"\3\2\2\2\36\u00a5\3\2\2\2 \u00ad\3\2\2\2\"\u00b9\3\2\2\2$\u00c4\3\2\2"+
		"\2&\u00d3\3\2\2\2(\u00d5\3\2\2\2*\u00d8\3\2\2\2,\u00f5\3\2\2\2.\u00f7"+
		"\3\2\2\2\60\u010b\3\2\2\2\62\u0114\3\2\2\2\64\u0118\3\2\2\2\66\u011c\3"+
		"\2\2\28\u011f\3\2\2\2:\u0124\3\2\2\2<\u0128\3\2\2\2>\u013f\3\2\2\2@\u0146"+
		"\3\2\2\2B\u014a\3\2\2\2D\u0158\3\2\2\2F\u015a\3\2\2\2H\u016d\3\2\2\2J"+
		"K\7,\2\2KL\7\64\2\2LM\7\27\2\2MN\t\2\2\2N\3\3\2\2\2OP\t\3\2\2P\5\3\2\2"+
		"\2QR\7.\2\2RS\5\26\f\2S\7\3\2\2\2TU\7\13\2\2UV\5\26\f\2V\t\3\2\2\2W[\5"+
		"\26\f\2XZ\5\b\5\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\13\3\2\2"+
		"\2][\3\2\2\2^_\7\64\2\2_a\7\"\2\2`b\5\n\6\2a`\3\2\2\2ab\3\2\2\2bc\3\2"+
		"\2\2cd\7#\2\2d\r\3\2\2\2ef\7\64\2\2fg\7\6\2\2gh\5\26\f\2hi\7\7\2\2i\17"+
		"\3\2\2\2jk\7\30\2\2kl\7\64\2\2l\21\3\2\2\2mn\t\4\2\2n\23\3\2\2\2ov\5\6"+
		"\4\2pv\5\f\7\2qv\5\16\b\2rv\5\20\t\2sv\7\64\2\2tv\5\22\n\2uo\3\2\2\2u"+
		"p\3\2\2\2uq\3\2\2\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v\25\3\2\2\2wz\5\24\13"+
		"\2xy\7\63\2\2y{\5\26\f\2zx\3\2\2\2z{\3\2\2\2{\u0081\3\2\2\2|}\7\"\2\2"+
		"}~\5\26\f\2~\177\7#\2\2\177\u0081\3\2\2\2\u0080w\3\2\2\2\u0080|\3\2\2"+
		"\2\u0081\27\3\2\2\2\u0082\u0083\5\4\3\2\u0083\u0086\7\64\2\2\u0084\u0085"+
		"\7\4\2\2\u0085\u0087\5\26\f\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2"+
		"\u0087\u008d\3\2\2\2\u0088\u0089\5\4\3\2\u0089\u008a\7\3\2\2\u008a\u008b"+
		"\7\64\2\2\u008b\u008d\3\2\2\2\u008c\u0082\3\2\2\2\u008c\u0088\3\2\2\2"+
		"\u008d\31\3\2\2\2\u008e\u008f\7\f\2\2\u008f\u0091\5\4\3\2\u0090\u0092"+
		"\7\3\2\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\7\64\2\2\u0094\u0095\7\4\2\2\u0095\u0096\5\26\f\2\u0096\u0097\7"+
		"-\2\2\u0097\u009c\3\2\2\2\u0098\u0099\5\30\r\2\u0099\u009a\7-\2\2\u009a"+
		"\u009c\3\2\2\2\u009b\u008e\3\2\2\2\u009b\u0098\3\2\2\2\u009c\u009f\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\33\3\2\2\2\u009f\u009d"+
		"\3\2\2\2\u00a0\u00a1\7\31\2\2\u00a1\u00a2\7-\2\2\u00a2\u00a3\5\32\16\2"+
		"\u00a3\u00a4\7\22\2\2\u00a4\35\3\2\2\2\u00a5\u00a6\5\4\3\2\u00a6\u00ab"+
		"\7\64\2\2\u00a7\u00a8\7\13\2\2\u00a8\u00a9\5\4\3\2\u00a9\u00aa\7\64\2"+
		"\2\u00aa\u00ac\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\37"+
		"\3\2\2\2\u00ad\u00ae\7\64\2\2\u00ae\u00b1\7*\2\2\u00af\u00b2\7 \2\2\u00b0"+
		"\u00b2\5\36\20\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3"+
		"\2\2\2\u00b3\u00b6\7&\2\2\u00b4\u00b7\5\4\3\2\u00b5\u00b7\7 \2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7!\3\2\2\2\u00b8\u00ba\7\f\2\2"+
		"\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc"+
		"\7\37\2\2\u00bc\u00bd\5 \21\2\u00bd#\3\2\2\2\u00be\u00bf\7\35\2\2\u00bf"+
		"\u00c0\5\30\r\2\u00c0\u00c1\7-\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00be\3\2"+
		"\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"%\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7(\2\2\u00c8\u00c9\7\64\2\2"+
		"\u00c9\u00ca\7\4\2\2\u00ca\u00d4\5\26\f\2\u00cb\u00cc\7(\2\2\u00cc\u00cd"+
		"\7\64\2\2\u00cd\u00ce\7\6\2\2\u00ce\u00cf\5\26\f\2\u00cf\u00d0\7\7\2\2"+
		"\u00d0\u00d1\7\4\2\2\u00d1\u00d2\5\26\f\2\u00d2\u00d4\3\2\2\2\u00d3\u00c7"+
		"\3\2\2\2\u00d3\u00cb\3\2\2\2\u00d4\'\3\2\2\2\u00d5\u00d6\7\b\2\2\u00d6"+
		"\u00d7\5\f\7\2\u00d7)\3\2\2\2\u00d8\u00d9\7\20\2\2\u00d9\u00da\5\26\f"+
		"\2\u00da\u00dc\7+\2\2\u00db\u00dd\7-\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\5@!\2\u00e1+\3\2\2\2\u00e2\u00e4\7\17\2\2\u00e3\u00e5\7-\2\2\u00e4"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00f6\5@!\2\u00e9\u00ea\7\20\2\2\u00ea"+
		"\u00eb\5\26\f\2\u00eb\u00ed\7+\2\2\u00ec\u00ee\7-\2\2\u00ed\u00ec\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f3\5@!\2\u00f2\u00f4\5,\27\2\u00f3\u00f2\3\2\2"+
		"\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00e2\3\2\2\2\u00f5\u00e9"+
		"\3\2\2\2\u00f6-\3\2\2\2\u00f7\u00f8\7\33\2\2\u00f8\u00f9\5\26\f\2\u00f9"+
		"\u00fb\7+\2\2\u00fa\u00fc\7-\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2"+
		"\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0103"+
		"\5@!\2\u0100\u0102\5*\26\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0106\u0108\5,\27\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\7\23\2\2\u010a/\3\2\2\2\u010b\u010d\7\36\2"+
		"\2\u010c\u010e\7-\2\2\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\5@!\2\u0112"+
		"\u0113\7\24\2\2\u0113\61\3\2\2\2\u0114\u0116\7\26\2\2\u0115\u0117\5\26"+
		"\f\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\63\3\2\2\2\u0118\u011a"+
		"\7%\2\2\u0119\u011b\5\26\f\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\65\3\2\2\2\u011c\u011d\7\r\2\2\u011d\u011e\5> \2\u011e\67\3\2\2\2\u011f"+
		"\u0120\7\t\2\2\u0120\u0121\5\26\f\2\u0121\u0122\7-\2\2\u0122\u0123\5@"+
		"!\2\u01239\3\2\2\2\u0124\u0125\7\16\2\2\u0125\u0126\7-\2\2\u0126\u0127"+
		"\5@!\2\u0127;\3\2\2\2\u0128\u0129\7\'\2\2\u0129\u012a\5\26\f\2\u012a\u012e"+
		"\7-\2\2\u012b\u012d\58\35\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2"+
		"\2\2\u0131\u0133\5:\36\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0135\7-\2\2\u0135\u0136\7\25\2\2\u0136=\3\2\2\2"+
		"\u0137\u0140\5&\24\2\u0138\u0140\5(\25\2\u0139\u0140\5.\30\2\u013a\u0140"+
		"\5\60\31\2\u013b\u0140\5\62\32\2\u013c\u0140\5\64\33\2\u013d\u0140\5\66"+
		"\34\2\u013e\u0140\5<\37\2\u013f\u0137\3\2\2\2\u013f\u0138\3\2\2\2\u013f"+
		"\u0139\3\2\2\2\u013f\u013a\3\2\2\2\u013f\u013b\3\2\2\2\u013f\u013c\3\2"+
		"\2\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140?\3\2\2\2\u0141\u0142"+
		"\5> \2\u0142\u0143\7-\2\2\u0143\u0145\3\2\2\2\u0144\u0141\3\2\2\2\u0145"+
		"\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147A\3\2\2\2"+
		"\u0148\u0146\3\2\2\2\u0149\u014b\7\f\2\2\u014a\u0149\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\7\30\2\2\u014d\u014e\5 \21\2"+
		"\u014e\u014f\7-\2\2\u014f\u0150\5$\23\2\u0150\u0151\5@!\2\u0151\u0152"+
		"\7\21\2\2\u0152\u0153\7-\2\2\u0153C\3\2\2\2\u0154\u0159\5\2\2\2\u0155"+
		"\u0159\5\34\17\2\u0156\u0159\5\"\22\2\u0157\u0159\5B\"\2\u0158\u0154\3"+
		"\2\2\2\u0158\u0155\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159"+
		"E\3\2\2\2\u015a\u0160\7-\2\2\u015b\u015c\5D#\2\u015c\u015d\7-\2\2\u015d"+
		"\u015f\3\2\2\2\u015e\u015b\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2"+
		"\2\2\u0160\u0161\3\2\2\2\u0161\u0166\3\2\2\2\u0162\u0160\3\2\2\2\u0163"+
		"\u0165\5B\"\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2"+
		"\2\2\u0166\u0167\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0169"+
		"\u016b\7-\2\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016bG\3\2\2\2\u016c"+
		"\u016e\5F$\2\u016d\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u016d\3\2\2"+
		"\2\u016f\u0170\3\2\2\2\u0170I\3\2\2\2\'[auz\u0080\u0086\u008c\u0091\u009b"+
		"\u009d\u00ab\u00b1\u00b6\u00b9\u00c4\u00d3\u00de\u00e6\u00ef\u00f3\u00f5"+
		"\u00fd\u0103\u0107\u010f\u0116\u011a\u012e\u0132\u013f\u0146\u014a\u0158"+
		"\u0160\u0166\u016a\u016f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}