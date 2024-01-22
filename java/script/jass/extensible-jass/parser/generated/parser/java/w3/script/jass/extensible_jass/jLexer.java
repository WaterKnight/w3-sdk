// Generated from j.g4 by ANTLR 4.7.1
package w3.script.jass.extensible_jass;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class jLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ARRAY", "ASSIGN", "BOOL_TYPE", "BRACKET_LEFT", "BRACKET_RIGHT", "CALL", 
		"CASE", "CODE_TYPE", "COMMA", "CONSTANT", "DEBUG", "DEFAULT_CASE", "ELSE", 
		"ELSEIF", "ENDFUNCTION", "ENDGLOBALS", "ENDIF", "ENDLOOP", "ENDSELECT", 
		"EXITWHEN", "EXTENDS", "FUNCTION", "GLOBALS", "HANDLE_TYPE", "IF", "INT_TYPE", 
		"LOCAL", "LOOP", "NATIVE", "NOTHING", "NULL", "PARENS_LEFT", "PARENS_RIGHT", 
		"REAL_TYPE", "RETURN", "RETURNS", "SELECT", "SET", "STRING_TYPE", "TAKES", 
		"THEN", "TYPE", "NEW_LINES", "UNARY_OP", "INT", "REAL", "BOOL", "STRING_LITERAL", 
		"BINARY_OP", "ID", "WS"
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


	public jLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "j.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u01ee\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3"+
		"*\3+\3+\3+\3+\3+\3,\3,\3,\6,\u0171\n,\r,\16,\u0172\3-\3-\3-\3-\5-\u0179"+
		"\n-\3.\3.\7.\u017d\n.\f.\16.\u0180\13.\3.\3.\3.\7.\u0185\n.\f.\16.\u0188"+
		"\13.\3.\3.\3.\5.\u018d\n.\3.\6.\u0190\n.\r.\16.\u0191\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\5.\u019f\n.\3/\6/\u01a2\n/\r/\16/\u01a3\3/\3/\7/\u01a8"+
		"\n/\f/\16/\u01ab\13/\3/\3/\6/\u01af\n/\r/\16/\u01b0\5/\u01b3\n/\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u01be\n\60\3\61\3\61\3\61"+
		"\3\61\3\61\7\61\u01c5\n\61\f\61\16\61\u01c8\13\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\5\62\u01dc\n\62\3\63\3\63\7\63\u01e0\n\63\f\63\16\63\u01e3\13\63\3\63"+
		"\5\63\u01e6\n\63\3\64\6\64\u01e9\n\64\r\64\16\64\u01ea\3\64\3\64\2\2\65"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65\3\2\20\4\2"+
		"\f\f\17\17\4\2--//\3\2\63;\3\2\62;\3\2\629\4\2ZZzz\5\2\62;CHch\f\2$$)"+
		")^^cdhhppttvvxx||\6\2\f\f\17\17$$^^\5\2,-//\61\61\4\2C\\c|\6\2\62;C\\"+
		"aac|\5\2\62;C\\c|\4\2\13\13\"\"\2\u020b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\3i\3\2\2\2\5o\3\2\2\2\7q\3\2\2\2\ty\3\2\2\2\13{\3\2\2\2\r}\3"+
		"\2\2\2\17\u0082\3\2\2\2\21\u0087\3\2\2\2\23\u008c\3\2\2\2\25\u008e\3\2"+
		"\2\2\27\u0097\3\2\2\2\31\u009d\3\2\2\2\33\u00a5\3\2\2\2\35\u00aa\3\2\2"+
		"\2\37\u00b1\3\2\2\2!\u00bd\3\2\2\2#\u00c8\3\2\2\2%\u00ce\3\2\2\2\'\u00d6"+
		"\3\2\2\2)\u00e0\3\2\2\2+\u00e9\3\2\2\2-\u00f1\3\2\2\2/\u00fa\3\2\2\2\61"+
		"\u0102\3\2\2\2\63\u0109\3\2\2\2\65\u010c\3\2\2\2\67\u0114\3\2\2\29\u011a"+
		"\3\2\2\2;\u011f\3\2\2\2=\u0126\3\2\2\2?\u012e\3\2\2\2A\u0133\3\2\2\2C"+
		"\u0135\3\2\2\2E\u0137\3\2\2\2G\u013c\3\2\2\2I\u0143\3\2\2\2K\u014b\3\2"+
		"\2\2M\u0152\3\2\2\2O\u0156\3\2\2\2Q\u015d\3\2\2\2S\u0163\3\2\2\2U\u0168"+
		"\3\2\2\2W\u0170\3\2\2\2Y\u0178\3\2\2\2[\u019e\3\2\2\2]\u01b2\3\2\2\2_"+
		"\u01bd\3\2\2\2a\u01bf\3\2\2\2c\u01db\3\2\2\2e\u01dd\3\2\2\2g\u01e8\3\2"+
		"\2\2ij\7c\2\2jk\7t\2\2kl\7t\2\2lm\7c\2\2mn\7{\2\2n\4\3\2\2\2op\7?\2\2"+
		"p\6\3\2\2\2qr\7d\2\2rs\7q\2\2st\7q\2\2tu\7n\2\2uv\7g\2\2vw\7c\2\2wx\7"+
		"p\2\2x\b\3\2\2\2yz\7]\2\2z\n\3\2\2\2{|\7_\2\2|\f\3\2\2\2}~\7e\2\2~\177"+
		"\7c\2\2\177\u0080\7n\2\2\u0080\u0081\7n\2\2\u0081\16\3\2\2\2\u0082\u0083"+
		"\7e\2\2\u0083\u0084\7c\2\2\u0084\u0085\7u\2\2\u0085\u0086\7g\2\2\u0086"+
		"\20\3\2\2\2\u0087\u0088\7e\2\2\u0088\u0089\7q\2\2\u0089\u008a\7f\2\2\u008a"+
		"\u008b\7g\2\2\u008b\22\3\2\2\2\u008c\u008d\7.\2\2\u008d\24\3\2\2\2\u008e"+
		"\u008f\7e\2\2\u008f\u0090\7q\2\2\u0090\u0091\7p\2\2\u0091\u0092\7u\2\2"+
		"\u0092\u0093\7v\2\2\u0093\u0094\7c\2\2\u0094\u0095\7p\2\2\u0095\u0096"+
		"\7v\2\2\u0096\26\3\2\2\2\u0097\u0098\7f\2\2\u0098\u0099\7g\2\2\u0099\u009a"+
		"\7d\2\2\u009a\u009b\7w\2\2\u009b\u009c\7i\2\2\u009c\30\3\2\2\2\u009d\u009e"+
		"\7f\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7h\2\2\u00a0\u00a1\7c\2\2\u00a1"+
		"\u00a2\7w\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7v\2\2\u00a4\32\3\2\2\2\u00a5"+
		"\u00a6\7g\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7g\2\2"+
		"\u00a9\34\3\2\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7"+
		"u\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7h\2\2\u00b0\36"+
		"\3\2\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7f\2\2\u00b4"+
		"\u00b5\7h\2\2\u00b5\u00b6\7w\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7e\2\2"+
		"\u00b8\u00b9\7v\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc"+
		"\7p\2\2\u00bc \3\2\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0"+
		"\7f\2\2\u00c0\u00c1\7i\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7q\2\2\u00c3"+
		"\u00c4\7d\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7u\2\2"+
		"\u00c7\"\3\2\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7f"+
		"\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7h\2\2\u00cd$\3\2\2\2\u00ce\u00cf"+
		"\7g\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7f\2\2\u00d1\u00d2\7n\2\2\u00d2"+
		"\u00d3\7q\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7r\2\2\u00d5&\3\2\2\2\u00d6"+
		"\u00d7\7g\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7f\2\2\u00d9\u00da\7u\2\2"+
		"\u00da\u00db\7g\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de"+
		"\7e\2\2\u00de\u00df\7v\2\2\u00df(\3\2\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2"+
		"\7z\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7y\2\2\u00e5"+
		"\u00e6\7j\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7p\2\2\u00e8*\3\2\2\2\u00e9"+
		"\u00ea\7g\2\2\u00ea\u00eb\7z\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7g\2\2"+
		"\u00ed\u00ee\7p\2\2\u00ee\u00ef\7f\2\2\u00ef\u00f0\7u\2\2\u00f0,\3\2\2"+
		"\2\u00f1\u00f2\7h\2\2\u00f2\u00f3\7w\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5"+
		"\7e\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8\7q\2\2\u00f8"+
		"\u00f9\7p\2\2\u00f9.\3\2\2\2\u00fa\u00fb\7i\2\2\u00fb\u00fc\7n\2\2\u00fc"+
		"\u00fd\7q\2\2\u00fd\u00fe\7d\2\2\u00fe\u00ff\7c\2\2\u00ff\u0100\7n\2\2"+
		"\u0100\u0101\7u\2\2\u0101\60\3\2\2\2\u0102\u0103\7j\2\2\u0103\u0104\7"+
		"c\2\2\u0104\u0105\7p\2\2\u0105\u0106\7f\2\2\u0106\u0107\7n\2\2\u0107\u0108"+
		"\7g\2\2\u0108\62\3\2\2\2\u0109\u010a\7k\2\2\u010a\u010b\7h\2\2\u010b\64"+
		"\3\2\2\2\u010c\u010d\7k\2\2\u010d\u010e\7p\2\2\u010e\u010f\7v\2\2\u010f"+
		"\u0110\7g\2\2\u0110\u0111\7i\2\2\u0111\u0112\7g\2\2\u0112\u0113\7t\2\2"+
		"\u0113\66\3\2\2\2\u0114\u0115\7n\2\2\u0115\u0116\7q\2\2\u0116\u0117\7"+
		"e\2\2\u0117\u0118\7c\2\2\u0118\u0119\7n\2\2\u01198\3\2\2\2\u011a\u011b"+
		"\7n\2\2\u011b\u011c\7q\2\2\u011c\u011d\7q\2\2\u011d\u011e\7r\2\2\u011e"+
		":\3\2\2\2\u011f\u0120\7p\2\2\u0120\u0121\7c\2\2\u0121\u0122\7v\2\2\u0122"+
		"\u0123\7k\2\2\u0123\u0124\7x\2\2\u0124\u0125\7g\2\2\u0125<\3\2\2\2\u0126"+
		"\u0127\7p\2\2\u0127\u0128\7q\2\2\u0128\u0129\7v\2\2\u0129\u012a\7j\2\2"+
		"\u012a\u012b\7k\2\2\u012b\u012c\7p\2\2\u012c\u012d\7i\2\2\u012d>\3\2\2"+
		"\2\u012e\u012f\7p\2\2\u012f\u0130\7w\2\2\u0130\u0131\7n\2\2\u0131\u0132"+
		"\7n\2\2\u0132@\3\2\2\2\u0133\u0134\7*\2\2\u0134B\3\2\2\2\u0135\u0136\7"+
		"+\2\2\u0136D\3\2\2\2\u0137\u0138\7t\2\2\u0138\u0139\7g\2\2\u0139\u013a"+
		"\7c\2\2\u013a\u013b\7n\2\2\u013bF\3\2\2\2\u013c\u013d\7t\2\2\u013d\u013e"+
		"\7g\2\2\u013e\u013f\7v\2\2\u013f\u0140\7w\2\2\u0140\u0141\7t\2\2\u0141"+
		"\u0142\7p\2\2\u0142H\3\2\2\2\u0143\u0144\7t\2\2\u0144\u0145\7g\2\2\u0145"+
		"\u0146\7v\2\2\u0146\u0147\7w\2\2\u0147\u0148\7t\2\2\u0148\u0149\7p\2\2"+
		"\u0149\u014a\7u\2\2\u014aJ\3\2\2\2\u014b\u014c\7u\2\2\u014c\u014d\7g\2"+
		"\2\u014d\u014e\7n\2\2\u014e\u014f\7g\2\2\u014f\u0150\7e\2\2\u0150\u0151"+
		"\7v\2\2\u0151L\3\2\2\2\u0152\u0153\7u\2\2\u0153\u0154\7g\2\2\u0154\u0155"+
		"\7v\2\2\u0155N\3\2\2\2\u0156\u0157\7u\2\2\u0157\u0158\7v\2\2\u0158\u0159"+
		"\7t\2\2\u0159\u015a\7k\2\2\u015a\u015b\7p\2\2\u015b\u015c\7i\2\2\u015c"+
		"P\3\2\2\2\u015d\u015e\7v\2\2\u015e\u015f\7c\2\2\u015f\u0160\7m\2\2\u0160"+
		"\u0161\7g\2\2\u0161\u0162\7u\2\2\u0162R\3\2\2\2\u0163\u0164\7v\2\2\u0164"+
		"\u0165\7j\2\2\u0165\u0166\7g\2\2\u0166\u0167\7p\2\2\u0167T\3\2\2\2\u0168"+
		"\u0169\7v\2\2\u0169\u016a\7{\2\2\u016a\u016b\7r\2\2\u016b\u016c\7g\2\2"+
		"\u016cV\3\2\2\2\u016d\u016e\7\17\2\2\u016e\u0171\7\f\2\2\u016f\u0171\t"+
		"\2\2\2\u0170\u016d\3\2\2\2\u0170\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173X\3\2\2\2\u0174\u0179\t\3\2\2"+
		"\u0175\u0176\7p\2\2\u0176\u0177\7q\2\2\u0177\u0179\7v\2\2\u0178\u0174"+
		"\3\2\2\2\u0178\u0175\3\2\2\2\u0179Z\3\2\2\2\u017a\u017e\t\4\2\2\u017b"+
		"\u017d\t\5\2\2\u017c\u017b\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2"+
		"\2\2\u017e\u017f\3\2\2\2\u017f\u019f\3\2\2\2\u0180\u017e\3\2\2\2\u0181"+
		"\u019f\t\5\2\2\u0182\u0186\7\62\2\2\u0183\u0185\t\6\2\2\u0184\u0183\3"+
		"\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u019f\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018a\7\62\2\2\u018a\u018d\t"+
		"\7\2\2\u018b\u018d\7&\2\2\u018c\u0189\3\2\2\2\u018c\u018b\3\2\2\2\u018d"+
		"\u018f\3\2\2\2\u018e\u0190\t\b\2\2\u018f\u018e\3\2\2\2\u0190\u0191\3\2"+
		"\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u019f\3\2\2\2\u0193"+
		"\u0194\7*\2\2\u0194\u0195\7]\2\2\u0195\u0196\7\2\2\2\u0196\u0197\7/\2"+
		"\2\u0197\u0198\7(\2\2\u0198\u0199\7*\2\2\u0199\u019a\7/\2\2\u019a\u019b"+
		"\7\u0101\2\2\u019b\u019c\7_\2\2\u019c\u019d\7-\2\2\u019d\u019f\7+\2\2"+
		"\u019e\u017a\3\2\2\2\u019e\u0181\3\2\2\2\u019e\u0182\3\2\2\2\u019e\u018c"+
		"\3\2\2\2\u019e\u0193\3\2\2\2\u019f\\\3\2\2\2\u01a0\u01a2\t\5\2\2\u01a1"+
		"\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2"+
		"\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a9\7\60\2\2\u01a6\u01a8\t\5\2\2\u01a7"+
		"\u01a6\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2"+
		"\2\2\u01aa\u01b3\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ae\7\60\2\2\u01ad"+
		"\u01af\t\5\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01ae\3\2"+
		"\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01a1\3\2\2\2\u01b2"+
		"\u01ac\3\2\2\2\u01b3^\3\2\2\2\u01b4\u01b5\7v\2\2\u01b5\u01b6\7t\2\2\u01b6"+
		"\u01b7\7w\2\2\u01b7\u01be\7g\2\2\u01b8\u01b9\7h\2\2\u01b9\u01ba\7c\2\2"+
		"\u01ba\u01bb\7n\2\2\u01bb\u01bc\7u\2\2\u01bc\u01be\7g\2\2\u01bd\u01b4"+
		"\3\2\2\2\u01bd\u01b8\3\2\2\2\u01be`\3\2\2\2\u01bf\u01c6\7$\2\2\u01c0\u01c1"+
		"\7^\2\2\u01c1\u01c5\t\t\2\2\u01c2\u01c5\n\n\2\2\u01c3\u01c5\5W,\2\u01c4"+
		"\u01c0\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5\u01c8\3\2"+
		"\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8"+
		"\u01c6\3\2\2\2\u01c9\u01ca\7$\2\2\u01cab\3\2\2\2\u01cb\u01dc\t\13\2\2"+
		"\u01cc\u01cd\7?\2\2\u01cd\u01dc\7?\2\2\u01ce\u01cf\7#\2\2\u01cf\u01dc"+
		"\7?\2\2\u01d0\u01dc\7@\2\2\u01d1\u01d2\7@\2\2\u01d2\u01dc\7?\2\2\u01d3"+
		"\u01dc\7>\2\2\u01d4\u01d5\7>\2\2\u01d5\u01dc\7?\2\2\u01d6\u01d7\7c\2\2"+
		"\u01d7\u01d8\7p\2\2\u01d8\u01dc\7f\2\2\u01d9\u01da\7q\2\2\u01da\u01dc"+
		"\7t\2\2\u01db\u01cb\3\2\2\2\u01db\u01cc\3\2\2\2\u01db\u01ce\3\2\2\2\u01db"+
		"\u01d0\3\2\2\2\u01db\u01d1\3\2\2\2\u01db\u01d3\3\2\2\2\u01db\u01d4\3\2"+
		"\2\2\u01db\u01d6\3\2\2\2\u01db\u01d9\3\2\2\2\u01dcd\3\2\2\2\u01dd\u01e5"+
		"\t\f\2\2\u01de\u01e0\t\r\2\2\u01df\u01de\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1"+
		"\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01e1\3\2"+
		"\2\2\u01e4\u01e6\t\16\2\2\u01e5\u01e1\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6"+
		"f\3\2\2\2\u01e7\u01e9\t\17\2\2\u01e8\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2"+
		"\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed"+
		"\b\64\2\2\u01edh\3\2\2\2\26\2\u0170\u0172\u0178\u017e\u0186\u018c\u0191"+
		"\u019e\u01a3\u01a9\u01b0\u01b2\u01bd\u01c4\u01c6\u01db\u01e1\u01e5\u01ea"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}