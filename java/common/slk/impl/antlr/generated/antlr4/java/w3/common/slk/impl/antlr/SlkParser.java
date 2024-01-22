// Generated from Slk.g4 by ANTLR 4.7.1

	package w3.common.slk.impl.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SlkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RECORD_PART=1, SEP=2, NEW_LINE=3, WS=4;
	public static final int
		RULE_root = 0, RULE_record = 1, RULE_recordPart = 2;
	public static final String[] ruleNames = {
		"root", "record", "recordPart"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "RECORD_PART", "SEP", "NEW_LINE", "WS"
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
	public String getGrammarFileName() { return "Slk.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SlkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public RecordContext record;
		public List<RecordContext> records = new ArrayList<RecordContext>();
		public List<RecordContext> record() {
			return getRuleContexts(RecordContext.class);
		}
		public RecordContext record(int i) {
			return getRuleContext(RecordContext.class,i);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(SlkParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(SlkParser.NEW_LINE, i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlkListener ) ((SlkListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlkListener ) ((SlkListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			((RootContext)_localctx).record = record();
			((RootContext)_localctx).records.add(((RootContext)_localctx).record);
			setState(15);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(8); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(7);
						match(NEW_LINE);
						}
						}
						setState(10); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEW_LINE );
					setState(12);
					((RootContext)_localctx).record = record();
					((RootContext)_localctx).records.add(((RootContext)_localctx).record);
					}
					} 
				}
				setState(17);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEW_LINE) {
				{
				{
				setState(18);
				match(NEW_LINE);
				}
				}
				setState(23);
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

	public static class RecordContext extends ParserRuleContext {
		public Token type;
		public TerminalNode RECORD_PART() { return getToken(SlkParser.RECORD_PART, 0); }
		public List<TerminalNode> SEP() { return getTokens(SlkParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(SlkParser.SEP, i);
		}
		public List<RecordPartContext> recordPart() {
			return getRuleContexts(RecordPartContext.class);
		}
		public RecordPartContext recordPart(int i) {
			return getRuleContext(RecordPartContext.class,i);
		}
		public RecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlkListener ) ((SlkListener)listener).enterRecord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlkListener ) ((SlkListener)listener).exitRecord(this);
		}
	}

	public final RecordContext record() throws RecognitionException {
		RecordContext _localctx = new RecordContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_record);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			((RecordContext)_localctx).type = match(RECORD_PART);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(25);
				match(SEP);
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RECORD_PART) {
					{
					setState(26);
					recordPart();
					}
				}

				}
				}
				setState(33);
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

	public static class RecordPartContext extends ParserRuleContext {
		public TerminalNode RECORD_PART() { return getToken(SlkParser.RECORD_PART, 0); }
		public RecordPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlkListener ) ((SlkListener)listener).enterRecordPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlkListener ) ((SlkListener)listener).exitRecordPart(this);
		}
	}

	public final RecordPartContext recordPart() throws RecognitionException {
		RecordPartContext _localctx = new RecordPartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_recordPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(RECORD_PART);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\6\'\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\6\2\13\n\2\r\2\16\2\f\3\2\7\2\20\n\2\f\2\16\2\23\13"+
		"\2\3\2\7\2\26\n\2\f\2\16\2\31\13\2\3\3\3\3\3\3\5\3\36\n\3\7\3 \n\3\f\3"+
		"\16\3#\13\3\3\4\3\4\3\4\2\2\5\2\4\6\2\2\2(\2\b\3\2\2\2\4\32\3\2\2\2\6"+
		"$\3\2\2\2\b\21\5\4\3\2\t\13\7\5\2\2\n\t\3\2\2\2\13\f\3\2\2\2\f\n\3\2\2"+
		"\2\f\r\3\2\2\2\r\16\3\2\2\2\16\20\5\4\3\2\17\n\3\2\2\2\20\23\3\2\2\2\21"+
		"\17\3\2\2\2\21\22\3\2\2\2\22\27\3\2\2\2\23\21\3\2\2\2\24\26\7\5\2\2\25"+
		"\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2\31"+
		"\27\3\2\2\2\32!\7\3\2\2\33\35\7\4\2\2\34\36\5\6\4\2\35\34\3\2\2\2\35\36"+
		"\3\2\2\2\36 \3\2\2\2\37\33\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\""+
		"\5\3\2\2\2#!\3\2\2\2$%\7\3\2\2%\7\3\2\2\2\7\f\21\27\35!";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}