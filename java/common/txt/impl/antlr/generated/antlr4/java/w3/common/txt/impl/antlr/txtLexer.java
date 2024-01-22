// Generated from txt.g4 by ANTLR 4.7.1
package w3.common.txt.impl.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class txtLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, COMMENT=4, NL=5, STR=6, COMMA=7, WS=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "COMMENT", "NL", "STR", "COMMA", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'='", null, null, null, "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "COMMENT", "NL", "STR", "COMMA", "WS"
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


	public txtLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "txt.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\nN\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\7\5\36\n\5\f\5\16\5!\13\5\3\6\6\6$\n\6\r\6\16"+
		"\6%\3\7\6\7)\n\7\r\7\16\7*\3\7\3\7\6\7/\n\7\r\7\16\7\60\3\7\3\7\6\7\65"+
		"\n\7\r\7\16\7\66\3\7\3\7\6\7;\n\7\r\7\16\7<\3\7\5\7@\n\7\5\7B\n\7\5\7"+
		"D\n\7\3\b\3\b\3\b\3\b\3\t\6\tK\n\t\r\t\16\tL\2\2\n\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\3\2\6\4\2\f\f\17\17\t\2\f\f\17\17$$..??]]__\5\2\f\f\17"+
		"\17$$\4\2\13\13\"\"\2X\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\23\3\2\2\2\5\25"+
		"\3\2\2\2\7\27\3\2\2\2\t\31\3\2\2\2\13#\3\2\2\2\rC\3\2\2\2\17E\3\2\2\2"+
		"\21J\3\2\2\2\23\24\7]\2\2\24\4\3\2\2\2\25\26\7_\2\2\26\6\3\2\2\2\27\30"+
		"\7?\2\2\30\b\3\2\2\2\31\32\7\61\2\2\32\33\7\61\2\2\33\37\3\2\2\2\34\36"+
		"\n\2\2\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \n\3\2\2"+
		"\2!\37\3\2\2\2\"$\t\2\2\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\f"+
		"\3\2\2\2\')\n\3\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+,\3\2\2\2"+
		",.\7]\2\2-/\n\3\2\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61"+
		"\62\3\2\2\2\62D\7_\2\2\63\65\n\3\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64"+
		"\3\2\2\2\66\67\3\2\2\2\67D\3\2\2\28A\7$\2\29;\n\4\2\2:9\3\2\2\2;<\3\2"+
		"\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2>@\7$\2\2?>\3\2\2\2?@\3\2\2\2@B\3\2"+
		"\2\2A:\3\2\2\2AB\3\2\2\2BD\3\2\2\2C(\3\2\2\2C\64\3\2\2\2C8\3\2\2\2D\16"+
		"\3\2\2\2EF\7.\2\2FG\3\2\2\2GH\b\b\2\2H\20\3\2\2\2IK\t\5\2\2JI\3\2\2\2"+
		"KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\22\3\2\2\2\r\2\37%*\60\66<?ACL\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}