// Generated from /media/trungbkit/DATA/document/OneDrive/4thYear/Xu ly ngon ngu tu nhien/NLP/src/Grammar/nlp.g4 by ANTLR 4.7
package Grammar.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class nlpLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WS=3, CITY_NAME=4, CITY_N=5, P_TIME=6, FLIGHT_N=7, A_FLIGHT_V=8, 
		D_FLIGHT_V=9, DET=10, WH_QUERY=11, TIME_MOD=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "WS", "CITY_NAME", "CITY_N", "P_TIME", "FLIGHT_N", "A_FLIGHT_V", 
		"D_FLIGHT_V", "DET", "WH_QUERY", "TIME_MOD"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'to'", "'for'", "' '", null, "'city'", "'at'", "'flight'", null, 
		null, "'the'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "WS", "CITY_NAME", "CITY_N", "P_TIME", "FLIGHT_N", "A_FLIGHT_V", 
		"D_FLIGHT_V", "DET", "WH_QUERY", "TIME_MOD"
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


	public nlpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "nlp.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u00a9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\63\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"Z\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n|"+
		"\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u009e\n\f\3\r\5\r\u00a1\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\2\2\16\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\4\3\2\62\64\3"+
		"\2\62;\2\u00b4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\36\3\2\2\2\7\"\3\2\2\2\t\62"+
		"\3\2\2\2\13\64\3\2\2\2\r9\3\2\2\2\17<\3\2\2\2\21Y\3\2\2\2\23{\3\2\2\2"+
		"\25}\3\2\2\2\27\u009d\3\2\2\2\31\u00a0\3\2\2\2\33\34\7v\2\2\34\35\7q\2"+
		"\2\35\4\3\2\2\2\36\37\7h\2\2\37 \7q\2\2 !\7t\2\2!\6\3\2\2\2\"#\7\"\2\2"+
		"#\b\3\2\2\2$%\7J\2\2%&\7\u1ed5\2\2&\'\7\"\2\2\'(\7E\2\2()\7j\2\2)*\7\u00ef"+
		"\2\2*+\7\"\2\2+,\7O\2\2,-\7k\2\2-.\7p\2\2.\63\7j\2\2/\60\7J\2\2\60\61"+
		"\7w\2\2\61\63\7\u1ec1\2\2\62$\3\2\2\2\62/\3\2\2\2\63\n\3\2\2\2\64\65\7"+
		"e\2\2\65\66\7k\2\2\66\67\7v\2\2\678\7{\2\28\f\3\2\2\29:\7c\2\2:;\7v\2"+
		"\2;\16\3\2\2\2<=\7h\2\2=>\7n\2\2>?\7k\2\2?@\7i\2\2@A\7j\2\2AB\7v\2\2B"+
		"\20\3\2\2\2CD\7e\2\2DE\7q\2\2EF\7o\2\2FZ\7g\2\2GH\7e\2\2HI\7q\2\2IJ\7"+
		"o\2\2JK\7g\2\2KZ\7u\2\2LM\7c\2\2MN\7t\2\2NO\7t\2\2OP\7k\2\2PQ\7x\2\2Q"+
		"Z\7g\2\2RS\7c\2\2ST\7t\2\2TU\7t\2\2UV\7k\2\2VW\7x\2\2WX\7g\2\2XZ\7u\2"+
		"\2YC\3\2\2\2YG\3\2\2\2YL\3\2\2\2YR\3\2\2\2Z\22\3\2\2\2[\\\7h\2\2\\]\7"+
		"n\2\2]|\7{\2\2^_\7h\2\2_`\7n\2\2`a\7k\2\2ab\7g\2\2b|\7u\2\2cd\7f\2\2d"+
		"e\7g\2\2ef\7r\2\2fg\7c\2\2gh\7t\2\2h|\7v\2\2ij\7f\2\2jk\7g\2\2kl\7r\2"+
		"\2lm\7c\2\2mn\7t\2\2no\7v\2\2o|\7u\2\2pq\7n\2\2qr\7g\2\2rs\7c\2\2st\7"+
		"x\2\2t|\7g\2\2uv\7n\2\2vw\7g\2\2wx\7c\2\2xy\7x\2\2yz\7g\2\2z|\7u\2\2{"+
		"[\3\2\2\2{^\3\2\2\2{c\3\2\2\2{i\3\2\2\2{p\3\2\2\2{u\3\2\2\2|\24\3\2\2"+
		"\2}~\7v\2\2~\177\7j\2\2\177\u0080\7g\2\2\u0080\26\3\2\2\2\u0081\u0082"+
		"\7y\2\2\u0082\u0083\7j\2\2\u0083\u0084\7c\2\2\u0084\u0085\7v\2\2\u0085"+
		"\u0086\7\"\2\2\u0086\u0087\7v\2\2\u0087\u0088\7k\2\2\u0088\u0089\7o\2"+
		"\2\u0089\u008a\7g\2\2\u008a\u008b\7\"\2\2\u008b\u008c\7f\2\2\u008c\u008d"+
		"\7q\2\2\u008d\u008e\7g\2\2\u008e\u009e\7u\2\2\u008f\u0090\7y\2\2\u0090"+
		"\u0091\7j\2\2\u0091\u0092\7g\2\2\u0092\u0093\7p\2\2\u0093\u0094\7\"\2"+
		"\2\u0094\u0095\7f\2\2\u0095\u0096\7q\2\2\u0096\u0097\7g\2\2\u0097\u009e"+
		"\7u\2\2\u0098\u0099\7y\2\2\u0099\u009a\7j\2\2\u009a\u009b\7k\2\2\u009b"+
		"\u009c\7e\2\2\u009c\u009e\7j\2\2\u009d\u0081\3\2\2\2\u009d\u008f\3\2\2"+
		"\2\u009d\u0098\3\2\2\2\u009e\30\3\2\2\2\u009f\u00a1\t\2\2\2\u00a0\u009f"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\t\3\2\2\u00a3"+
		"\u00a4\7<\2\2\u00a4\u00a5\t\3\2\2\u00a5\u00a6\t\3\2\2\u00a6\u00a7\7J\2"+
		"\2\u00a7\u00a8\7T\2\2\u00a8\32\3\2\2\2\b\2\62Y{\u009d\u00a0\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}