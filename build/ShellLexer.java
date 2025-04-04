// Generated from antlr/ShellLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShellLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, THEN=2, ELIF=3, ELSE=4, FI=5, FOR=6, IN=7, WHILE=8, DO=9, DONE=10, 
		CASE=11, ESAC=12, FUNCTION=13, ASSIGN=14, PIPE=15, AND=16, OR=17, SEMI=18, 
		LESS=19, GREATER=20, APPEND=21, REDIRECT_ERR=22, REDIRECT_BOTH=23, LPAREN=24, 
		RPAREN=25, LBRACE=26, RBRACE=27, LBRACKET=28, RBRACKET=29, DOLLAR_LPAREN=30, 
		DOUBLE_LBRACKET=31, DOUBLE_RBRACKET=32, NEWLINE=33, ECHO=34, CD=35, PWD=36, 
		LS=37, MKDIR=38, RM=39, CP=40, MV=41, GREP=42, SED=43, CAT=44, CHMOD=45, 
		EXPORT=46, READ=47, SOURCE=48, TEST=49, DOLLAR=50, DOLLAR_LBRACE=51, RBRACE_VAR=52, 
		DOUBLE_QUOTE=53, SINGLE_QUOTE=54, BACKTICK=55, NUMBER=56, COMMENT=57, 
		IDENTIFIER=58, ARGUMENT=59, WS=60, OTHER=61, DOUBLE_QUOTE_CONTENT=62, 
		DOUBLE_QUOTE_ESCAPE=63, SINGLE_QUOTE_CONTENT=64, BACKTICK_CONTENT=65;
	public static final int
		IN_DOUBLE_QUOTE=1, IN_SINGLE_QUOTE=2, IN_BACKTICK=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "IN_DOUBLE_QUOTE", "IN_SINGLE_QUOTE", "IN_BACKTICK"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "THEN", "ELIF", "ELSE", "FI", "FOR", "IN", "WHILE", "DO", "DONE", 
			"CASE", "ESAC", "FUNCTION", "ASSIGN", "PIPE", "AND", "OR", "SEMI", "LESS", 
			"GREATER", "APPEND", "REDIRECT_ERR", "REDIRECT_BOTH", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "DOLLAR_LPAREN", "DOUBLE_LBRACKET", 
			"DOUBLE_RBRACKET", "NEWLINE", "ECHO", "CD", "PWD", "LS", "MKDIR", "RM", 
			"CP", "MV", "GREP", "SED", "CAT", "CHMOD", "EXPORT", "READ", "SOURCE", 
			"TEST", "DOLLAR", "DOLLAR_LBRACE", "RBRACE_VAR", "DOUBLE_QUOTE", "SINGLE_QUOTE", 
			"BACKTICK", "NUMBER", "COMMENT", "IDENTIFIER", "ARGUMENT", "WS", "OTHER", 
			"DOUBLE_QUOTE_CONTENT", "DOUBLE_QUOTE_ESCAPE", "DOUBLE_QUOTE_DOLLAR", 
			"DOUBLE_QUOTE_END", "SINGLE_QUOTE_CONTENT", "SINGLE_QUOTE_END", "BACKTICK_CONTENT", 
			"BACKTICK_END"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'elif'", "'else'", "'fi'", "'for'", "'in'", 
			"'while'", "'do'", "'done'", "'case'", "'esac'", "'function'", "'='", 
			"'|'", "'&&'", "'||'", "';'", "'<'", "'>'", "'>>'", "'2>'", "'&>'", "'('", 
			"')'", "'{'", null, "'['", "']'", "'$('", "'[['", "']]'", null, "'echo'", 
			"'cd'", "'pwd'", "'ls'", "'mkdir'", "'rm'", "'cp'", "'mv'", "'grep'", 
			"'sed'", "'cat'", "'chmod'", "'export'", "'read'", null, "'test'", null, 
			"'${'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "THEN", "ELIF", "ELSE", "FI", "FOR", "IN", "WHILE", "DO", 
			"DONE", "CASE", "ESAC", "FUNCTION", "ASSIGN", "PIPE", "AND", "OR", "SEMI", 
			"LESS", "GREATER", "APPEND", "REDIRECT_ERR", "REDIRECT_BOTH", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "DOLLAR_LPAREN", 
			"DOUBLE_LBRACKET", "DOUBLE_RBRACKET", "NEWLINE", "ECHO", "CD", "PWD", 
			"LS", "MKDIR", "RM", "CP", "MV", "GREP", "SED", "CAT", "CHMOD", "EXPORT", 
			"READ", "SOURCE", "TEST", "DOLLAR", "DOLLAR_LBRACE", "RBRACE_VAR", "DOUBLE_QUOTE", 
			"SINGLE_QUOTE", "BACKTICK", "NUMBER", "COMMENT", "IDENTIFIER", "ARGUMENT", 
			"WS", "OTHER", "DOUBLE_QUOTE_CONTENT", "DOUBLE_QUOTE_ESCAPE", "SINGLE_QUOTE_CONTENT", 
			"BACKTICK_CONTENT"
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


	public ShellLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ShellLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2C\u01ad\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\5\"\u00fd\n"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3"+
		"-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0145\n\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\3\67\38\38\38\38\39\69\u0160\n9\r9\169\u0161\3:\3:\7:\u0166\n:\f"+
		":\16:\u0169\13:\3:\3:\3;\3;\7;\u016f\n;\f;\16;\u0172\13;\3<\6<\u0175\n"+
		"<\r<\16<\u0176\3=\6=\u017a\n=\r=\16=\u017b\3=\3=\3>\3>\3>\3>\3?\6?\u0185"+
		"\n?\r?\16?\u0186\3?\3?\3?\5?\u018c\n?\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3"+
		"B\3B\3C\6C\u019b\nC\rC\16C\u019c\3D\3D\3D\3D\3D\3E\6E\u01a5\nE\rE\16E"+
		"\u01a6\3F\3F\3F\3F\3F\2\2G\6\3\b\4\n\5\f\6\16\7\20\b\22\t\24\n\26\13\30"+
		"\f\32\r\34\16\36\17 \20\"\21$\22&\23(\24*\25,\26.\27\60\30\62\31\64\32"+
		"\66\338\34:\35<\36>\37@ B!D\"F#H$J%L&N\'P(R)T*V+X,Z-\\.^/`\60b\61d\62"+
		"f\63h\64j\65l\66n\67p8r9t:v;x<z=|>~?\u0080@\u0082A\u0084\2\u0086\2\u0088"+
		"B\u008a\2\u008cC\u008e\2\6\2\3\4\5\13\3\2\62;\4\2\f\f\17\17\5\2C\\aac"+
		"|\6\2\62;C\\aac|\7\2,-/;A\\aac|\4\2\13\13\"\"\7\2\f\f\17\17$$&&^^\5\2"+
		"\f\f\17\17))\5\2\f\f\17\17bb\2\u01b5\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2"+
		"\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26"+
		"\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2"+
		"\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2"+
		"\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2"+
		"\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2"+
		"\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R"+
		"\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\\3\2\2\2\2^\3"+
		"\2\2\2\2`\3\2\2\2\2b\3\2\2\2\2d\3\2\2\2\2f\3\2\2\2\2h\3\2\2\2\2j\3\2\2"+
		"\2\2l\3\2\2\2\2n\3\2\2\2\2p\3\2\2\2\2r\3\2\2\2\2t\3\2\2\2\2v\3\2\2\2\2"+
		"x\3\2\2\2\2z\3\2\2\2\2|\3\2\2\2\2~\3\2\2\2\3\u0080\3\2\2\2\3\u0082\3\2"+
		"\2\2\3\u0084\3\2\2\2\3\u0086\3\2\2\2\4\u0088\3\2\2\2\4\u008a\3\2\2\2\5"+
		"\u008c\3\2\2\2\5\u008e\3\2\2\2\6\u0090\3\2\2\2\b\u0093\3\2\2\2\n\u0098"+
		"\3\2\2\2\f\u009d\3\2\2\2\16\u00a2\3\2\2\2\20\u00a5\3\2\2\2\22\u00a9\3"+
		"\2\2\2\24\u00ac\3\2\2\2\26\u00b2\3\2\2\2\30\u00b5\3\2\2\2\32\u00ba\3\2"+
		"\2\2\34\u00bf\3\2\2\2\36\u00c4\3\2\2\2 \u00cd\3\2\2\2\"\u00cf\3\2\2\2"+
		"$\u00d1\3\2\2\2&\u00d4\3\2\2\2(\u00d7\3\2\2\2*\u00d9\3\2\2\2,\u00db\3"+
		"\2\2\2.\u00dd\3\2\2\2\60\u00e0\3\2\2\2\62\u00e3\3\2\2\2\64\u00e6\3\2\2"+
		"\2\66\u00e8\3\2\2\28\u00ea\3\2\2\2:\u00ec\3\2\2\2<\u00ee\3\2\2\2>\u00f0"+
		"\3\2\2\2@\u00f2\3\2\2\2B\u00f5\3\2\2\2D\u00f8\3\2\2\2F\u00fc\3\2\2\2H"+
		"\u0100\3\2\2\2J\u0105\3\2\2\2L\u0108\3\2\2\2N\u010c\3\2\2\2P\u010f\3\2"+
		"\2\2R\u0115\3\2\2\2T\u0118\3\2\2\2V\u011b\3\2\2\2X\u011e\3\2\2\2Z\u0123"+
		"\3\2\2\2\\\u0127\3\2\2\2^\u012b\3\2\2\2`\u0131\3\2\2\2b\u0138\3\2\2\2"+
		"d\u0144\3\2\2\2f\u0146\3\2\2\2h\u014b\3\2\2\2j\u014d\3\2\2\2l\u0150\3"+
		"\2\2\2n\u0152\3\2\2\2p\u0156\3\2\2\2r\u015a\3\2\2\2t\u015f\3\2\2\2v\u0163"+
		"\3\2\2\2x\u016c\3\2\2\2z\u0174\3\2\2\2|\u0179\3\2\2\2~\u017f\3\2\2\2\u0080"+
		"\u018b\3\2\2\2\u0082\u018d\3\2\2\2\u0084\u0190\3\2\2\2\u0086\u0194\3\2"+
		"\2\2\u0088\u019a\3\2\2\2\u008a\u019e\3\2\2\2\u008c\u01a4\3\2\2\2\u008e"+
		"\u01a8\3\2\2\2\u0090\u0091\7k\2\2\u0091\u0092\7h\2\2\u0092\7\3\2\2\2\u0093"+
		"\u0094\7v\2\2\u0094\u0095\7j\2\2\u0095\u0096\7g\2\2\u0096\u0097\7p\2\2"+
		"\u0097\t\3\2\2\2\u0098\u0099\7g\2\2\u0099\u009a\7n\2\2\u009a\u009b\7k"+
		"\2\2\u009b\u009c\7h\2\2\u009c\13\3\2\2\2\u009d\u009e\7g\2\2\u009e\u009f"+
		"\7n\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1\7g\2\2\u00a1\r\3\2\2\2\u00a2\u00a3"+
		"\7h\2\2\u00a3\u00a4\7k\2\2\u00a4\17\3\2\2\2\u00a5\u00a6\7h\2\2\u00a6\u00a7"+
		"\7q\2\2\u00a7\u00a8\7t\2\2\u00a8\21\3\2\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab"+
		"\7p\2\2\u00ab\23\3\2\2\2\u00ac\u00ad\7y\2\2\u00ad\u00ae\7j\2\2\u00ae\u00af"+
		"\7k\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7g\2\2\u00b1\25\3\2\2\2\u00b2\u00b3"+
		"\7f\2\2\u00b3\u00b4\7q\2\2\u00b4\27\3\2\2\2\u00b5\u00b6\7f\2\2\u00b6\u00b7"+
		"\7q\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7g\2\2\u00b9\31\3\2\2\2\u00ba\u00bb"+
		"\7e\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7g\2\2\u00be"+
		"\33\3\2\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7c\2\2\u00c2"+
		"\u00c3\7e\2\2\u00c3\35\3\2\2\2\u00c4\u00c5\7h\2\2\u00c5\u00c6\7w\2\2\u00c6"+
		"\u00c7\7p\2\2\u00c7\u00c8\7e\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7k\2\2"+
		"\u00ca\u00cb\7q\2\2\u00cb\u00cc\7p\2\2\u00cc\37\3\2\2\2\u00cd\u00ce\7"+
		"?\2\2\u00ce!\3\2\2\2\u00cf\u00d0\7~\2\2\u00d0#\3\2\2\2\u00d1\u00d2\7("+
		"\2\2\u00d2\u00d3\7(\2\2\u00d3%\3\2\2\2\u00d4\u00d5\7~\2\2\u00d5\u00d6"+
		"\7~\2\2\u00d6\'\3\2\2\2\u00d7\u00d8\7=\2\2\u00d8)\3\2\2\2\u00d9\u00da"+
		"\7>\2\2\u00da+\3\2\2\2\u00db\u00dc\7@\2\2\u00dc-\3\2\2\2\u00dd\u00de\7"+
		"@\2\2\u00de\u00df\7@\2\2\u00df/\3\2\2\2\u00e0\u00e1\7\64\2\2\u00e1\u00e2"+
		"\7@\2\2\u00e2\61\3\2\2\2\u00e3\u00e4\7(\2\2\u00e4\u00e5\7@\2\2\u00e5\63"+
		"\3\2\2\2\u00e6\u00e7\7*\2\2\u00e7\65\3\2\2\2\u00e8\u00e9\7+\2\2\u00e9"+
		"\67\3\2\2\2\u00ea\u00eb\7}\2\2\u00eb9\3\2\2\2\u00ec\u00ed\7\177\2\2\u00ed"+
		";\3\2\2\2\u00ee\u00ef\7]\2\2\u00ef=\3\2\2\2\u00f0\u00f1\7_\2\2\u00f1?"+
		"\3\2\2\2\u00f2\u00f3\7&\2\2\u00f3\u00f4\7*\2\2\u00f4A\3\2\2\2\u00f5\u00f6"+
		"\7]\2\2\u00f6\u00f7\7]\2\2\u00f7C\3\2\2\2\u00f8\u00f9\7_\2\2\u00f9\u00fa"+
		"\7_\2\2\u00faE\3\2\2\2\u00fb\u00fd\7\17\2\2\u00fc\u00fb\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\7\f\2\2\u00ffG\3\2\2\2"+
		"\u0100\u0101\7g\2\2\u0101\u0102\7e\2\2\u0102\u0103\7j\2\2\u0103\u0104"+
		"\7q\2\2\u0104I\3\2\2\2\u0105\u0106\7e\2\2\u0106\u0107\7f\2\2\u0107K\3"+
		"\2\2\2\u0108\u0109\7r\2\2\u0109\u010a\7y\2\2\u010a\u010b\7f\2\2\u010b"+
		"M\3\2\2\2\u010c\u010d\7n\2\2\u010d\u010e\7u\2\2\u010eO\3\2\2\2\u010f\u0110"+
		"\7o\2\2\u0110\u0111\7m\2\2\u0111\u0112\7f\2\2\u0112\u0113\7k\2\2\u0113"+
		"\u0114\7t\2\2\u0114Q\3\2\2\2\u0115\u0116\7t\2\2\u0116\u0117\7o\2\2\u0117"+
		"S\3\2\2\2\u0118\u0119\7e\2\2\u0119\u011a\7r\2\2\u011aU\3\2\2\2\u011b\u011c"+
		"\7o\2\2\u011c\u011d\7x\2\2\u011dW\3\2\2\2\u011e\u011f\7i\2\2\u011f\u0120"+
		"\7t\2\2\u0120\u0121\7g\2\2\u0121\u0122\7r\2\2\u0122Y\3\2\2\2\u0123\u0124"+
		"\7u\2\2\u0124\u0125\7g\2\2\u0125\u0126\7f\2\2\u0126[\3\2\2\2\u0127\u0128"+
		"\7e\2\2\u0128\u0129\7c\2\2\u0129\u012a\7v\2\2\u012a]\3\2\2\2\u012b\u012c"+
		"\7e\2\2\u012c\u012d\7j\2\2\u012d\u012e\7o\2\2\u012e\u012f\7q\2\2\u012f"+
		"\u0130\7f\2\2\u0130_\3\2\2\2\u0131\u0132\7g\2\2\u0132\u0133\7z\2\2\u0133"+
		"\u0134\7r\2\2\u0134\u0135\7q\2\2\u0135\u0136\7t\2\2\u0136\u0137\7v\2\2"+
		"\u0137a\3\2\2\2\u0138\u0139\7t\2\2\u0139\u013a\7g\2\2\u013a\u013b\7c\2"+
		"\2\u013b\u013c\7f\2\2\u013cc\3\2\2\2\u013d\u013e\7u\2\2\u013e\u013f\7"+
		"q\2\2\u013f\u0140\7w\2\2\u0140\u0141\7t\2\2\u0141\u0142\7e\2\2\u0142\u0145"+
		"\7g\2\2\u0143\u0145\7\60\2\2\u0144\u013d\3\2\2\2\u0144\u0143\3\2\2\2\u0145"+
		"e\3\2\2\2\u0146\u0147\7v\2\2\u0147\u0148\7g\2\2\u0148\u0149\7u\2\2\u0149"+
		"\u014a\7v\2\2\u014ag\3\2\2\2\u014b\u014c\7&\2\2\u014ci\3\2\2\2\u014d\u014e"+
		"\7&\2\2\u014e\u014f\7}\2\2\u014fk\3\2\2\2\u0150\u0151\7\177\2\2\u0151"+
		"m\3\2\2\2\u0152\u0153\7$\2\2\u0153\u0154\3\2\2\2\u0154\u0155\b\66\2\2"+
		"\u0155o\3\2\2\2\u0156\u0157\7)\2\2\u0157\u0158\3\2\2\2\u0158\u0159\b\67"+
		"\3\2\u0159q\3\2\2\2\u015a\u015b\7b\2\2\u015b\u015c\3\2\2\2\u015c\u015d"+
		"\b8\4\2\u015ds\3\2\2\2\u015e\u0160\t\2\2\2\u015f\u015e\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162u\3\2\2\2\u0163"+
		"\u0167\7%\2\2\u0164\u0166\n\3\2\2\u0165\u0164\3\2\2\2\u0166\u0169\3\2"+
		"\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a\3\2\2\2\u0169"+
		"\u0167\3\2\2\2\u016a\u016b\b:\5\2\u016bw\3\2\2\2\u016c\u0170\t\4\2\2\u016d"+
		"\u016f\t\5\2\2\u016e\u016d\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2"+
		"\2\2\u0170\u0171\3\2\2\2\u0171y\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0175"+
		"\t\6\2\2\u0174\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0174\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177{\3\2\2\2\u0178\u017a\t\7\2\2\u0179\u0178\3\2\2\2"+
		"\u017a\u017b\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d"+
		"\3\2\2\2\u017d\u017e\b=\5\2\u017e}\3\2\2\2\u017f\u0180\13\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0182\b>\6\2\u0182\177\3\2\2\2\u0183\u0185\n\b\2"+
		"\2\u0184\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187"+
		"\3\2\2\2\u0187\u018c\3\2\2\2\u0188\u0189\7^\2\2\u0189\u018c\13\2\2\2\u018a"+
		"\u018c\7&\2\2\u018b\u0184\3\2\2\2\u018b\u0188\3\2\2\2\u018b\u018a\3\2"+
		"\2\2\u018c\u0081\3\2\2\2\u018d\u018e\7^\2\2\u018e\u018f\13\2\2\2\u018f"+
		"\u0083\3\2\2\2\u0190\u0191\7&\2\2\u0191\u0192\3\2\2\2\u0192\u0193\bA\7"+
		"\2\u0193\u0085\3\2\2\2\u0194\u0195\7$\2\2\u0195\u0196\3\2\2\2\u0196\u0197"+
		"\bB\b\2\u0197\u0198\bB\t\2\u0198\u0087\3\2\2\2\u0199\u019b\n\t\2\2\u019a"+
		"\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2"+
		"\2\2\u019d\u0089\3\2\2\2\u019e\u019f\7)\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u01a1\bD\n\2\u01a1\u01a2\bD\t\2\u01a2\u008b\3\2\2\2\u01a3\u01a5\n\n\2"+
		"\2\u01a4\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7"+
		"\3\2\2\2\u01a7\u008d\3\2\2\2\u01a8\u01a9\7b\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"\u01ab\bF\13\2\u01ab\u01ac\bF\t\2\u01ac\u008f\3\2\2\2\21\2\3\4\5\u00fc"+
		"\u0144\u0161\u0167\u0170\u0176\u017b\u0186\u018b\u019c\u01a6\f\7\3\2\7"+
		"\4\2\7\5\2\2\3\2\b\2\2\t\64\2\t\67\2\6\2\2\t8\2\t9\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}