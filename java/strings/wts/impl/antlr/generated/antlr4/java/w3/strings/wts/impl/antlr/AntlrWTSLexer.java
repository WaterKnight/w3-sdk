// Generated from AntlrWTS.g4 by ANTLR 4.7.1
package w3.strings.wts.impl.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AntlrWTSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, COMMENT=2, WS=3, NL=4, STR=5, INT=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "COMMENT", "WS", "NL", "STR", "INT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'STRING'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "COMMENT", "WS", "NL", "STR", "INT"
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


	public AntlrWTSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AntlrWTS.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\bD\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\4\6\4!\n\4\r\4\16\4\"\3\5\6"+
		"\5&\n\5\r\5\16\5\'\3\5\3\5\3\6\3\6\7\6.\n\6\f\6\16\6\61\13\6\3\6\6\6\64"+
		"\n\6\r\6\16\6\65\3\6\7\69\n\6\f\6\16\6<\13\6\3\6\3\6\3\7\6\7A\n\7\r\7"+
		"\16\7B\2\2\b\3\3\5\4\7\5\t\6\13\7\r\b\3\2\6\4\2\f\f\17\17\4\2\13\13\""+
		"\"\3\2\177\177\3\2\62;\2J\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\17\3\2\2\2\5\26\3\2\2\2\7 \3\2\2\2\t%"+
		"\3\2\2\2\13+\3\2\2\2\r@\3\2\2\2\17\20\7U\2\2\20\21\7V\2\2\21\22\7T\2\2"+
		"\22\23\7K\2\2\23\24\7P\2\2\24\25\7I\2\2\25\4\3\2\2\2\26\27\7\61\2\2\27"+
		"\30\7\61\2\2\30\34\3\2\2\2\31\33\n\2\2\2\32\31\3\2\2\2\33\36\3\2\2\2\34"+
		"\32\3\2\2\2\34\35\3\2\2\2\35\6\3\2\2\2\36\34\3\2\2\2\37!\t\3\2\2 \37\3"+
		"\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\b\3\2\2\2$&\t\2\2\2%$\3\2\2\2"+
		"&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2()\3\2\2\2)*\b\5\2\2*\n\3\2\2\2+/\7}"+
		"\2\2,.\5\t\5\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\63\3\2\2"+
		"\2\61/\3\2\2\2\62\64\n\4\2\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2"+
		"\65\66\3\2\2\2\66:\3\2\2\2\679\5\t\5\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2"+
		":;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7\177\2\2>\f\3\2\2\2?A\t\5\2\2@?\3\2"+
		"\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\16\3\2\2\2\n\2\34\"\'/\65:B\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}