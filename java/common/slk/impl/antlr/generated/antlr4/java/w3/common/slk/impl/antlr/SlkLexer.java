// Generated from Slk.g4 by ANTLR 4.7.1

	package w3.common.slk.impl.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SlkLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RECORD_PART=1, SEP=2, NEW_LINE=3, WS=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"RECORD_PART", "STRING_UNQUOTED", "STRING_QUOTED", "EscapeSequence", "SEP", 
		"NEW_LINE", "WS"
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


	public SlkLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Slk.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\6:\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\23\n\2\r\2\16\2"+
		"\24\3\3\3\3\6\3\31\n\3\r\3\16\3\32\3\4\3\4\3\4\3\4\7\4!\n\4\f\4\16\4$"+
		"\13\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\6\7\60\n\7\r\7\16\7\61\3"+
		"\b\6\b\65\n\b\r\b\16\b\66\3\b\3\b\2\2\t\3\3\5\2\7\2\t\2\13\4\r\5\17\6"+
		"\3\2\b\5\2\f\f\17\17==\6\2\f\f\17\17$$==\5\2\f\f\17\17$$\f\2$$))^^cdh"+
		"hppttvvxx||\4\2\f\f\17\17\4\2\13\13\"\"\2?\2\3\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\3\22\3\2\2\2\5\30\3\2\2\2\7\34\3\2\2\2\t\'\3\2"+
		"\2\2\13*\3\2\2\2\r/\3\2\2\2\17\64\3\2\2\2\21\23\n\2\2\2\22\21\3\2\2\2"+
		"\23\24\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\4\3\2\2\2\26\31\5\t\5\2"+
		"\27\31\n\3\2\2\30\26\3\2\2\2\30\27\3\2\2\2\31\32\3\2\2\2\32\30\3\2\2\2"+
		"\32\33\3\2\2\2\33\6\3\2\2\2\34\"\7$\2\2\35!\5\t\5\2\36!\n\4\2\2\37!\5"+
		"\r\7\2 \35\3\2\2\2 \36\3\2\2\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2"+
		"\2\2#%\3\2\2\2$\"\3\2\2\2%&\7$\2\2&\b\3\2\2\2\'(\7^\2\2()\t\5\2\2)\n\3"+
		"\2\2\2*+\7=\2\2+\f\3\2\2\2,-\7\17\2\2-\60\7\f\2\2.\60\t\6\2\2/,\3\2\2"+
		"\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\16\3\2\2\2\63"+
		"\65\t\7\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67"+
		"8\3\2\2\289\b\b\2\29\20\3\2\2\2\13\2\24\30\32 \"/\61\66\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}