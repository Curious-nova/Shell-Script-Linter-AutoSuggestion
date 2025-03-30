// Generated from ShellParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ShellParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

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
		RULE_script = 0, RULE_complete_command = 1, RULE_list = 2, RULE_list_item = 3, 
		RULE_pipeline = 4, RULE_pipeline_item = 5, RULE_command = 6, RULE_simple_command = 7, 
		RULE_cmd_name = 8, RULE_cmd_prefix = 9, RULE_cmd_suffix = 10, RULE_redirect = 11, 
		RULE_compound_command = 12, RULE_if_statement = 13, RULE_elif_part = 14, 
		RULE_else_part = 15, RULE_while_loop = 16, RULE_for_loop = 17, RULE_case_statement = 18, 
		RULE_case_item = 19, RULE_pattern_list = 20, RULE_brace_group = 21, RULE_subshell = 22, 
		RULE_function_definition = 23, RULE_function_body = 24, RULE_variable_assignment = 25, 
		RULE_list_sequence = 26, RULE_separator = 27, RULE_argument_list = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "complete_command", "list", "list_item", "pipeline", "pipeline_item", 
			"command", "simple_command", "cmd_name", "cmd_prefix", "cmd_suffix", 
			"redirect", "compound_command", "if_statement", "elif_part", "else_part", 
			"while_loop", "for_loop", "case_statement", "case_item", "pattern_list", 
			"brace_group", "subshell", "function_definition", "function_body", "variable_assignment", 
			"list_sequence", "separator", "argument_list"
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

	@Override
	public String getGrammarFileName() { return "ShellParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ShellParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ShellParser.EOF, 0); }
		public List<Complete_commandContext> complete_command() {
			return getRuleContexts(Complete_commandContext.class);
		}
		public Complete_commandContext complete_command(int i) {
			return getRuleContext(Complete_commandContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).exitScript(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 289356258978834754L) != 0)) {
				{
				{
				setState(58);
				complete_command();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Complete_commandContext extends ParserRuleContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ShellParser.NEWLINE, 0); }
		public TerminalNode SEMI() { return getToken(ShellParser.SEMI, 0); }
		public TerminalNode EOF() { return getToken(ShellParser.EOF, 0); }
		public Complete_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complete_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).enterComplete_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).exitComplete_command(this);
		}
	}

	public final Complete_commandContext complete_command() throws RecognitionException {
		Complete_commandContext _localctx = new Complete_commandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_complete_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			list();
			setState(67);
			_la = _input.LA(1);
			if ( !(((((_la - -1)) & ~0x3f) == 0 && ((1L << (_la - -1)) & 17180393473L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public List<List_itemContext> list_item() {
			return getRuleContexts(List_itemContext.class);
		}
		public List_itemContext list_item(int i) {
			return getRuleContext(List_itemContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(ShellParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ShellParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(ShellParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ShellParser.OR, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			list_item();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(70);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(71);
				list_item();
				}
				}
				setState(76);
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

	@SuppressWarnings("CheckReturnValue")
	public static class List_itemContext extends ParserRuleContext {
		public PipelineContext pipeline() {
			return getRuleContext(PipelineContext.class,0);
		}
		public List_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).enterList_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).exitList_item(this);
		}
	}

	public final List_itemContext list_item() throws RecognitionException {
		List_itemContext _localctx = new List_itemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_list_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			pipeline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PipelineContext extends ParserRuleContext {
		public List<Pipeline_itemContext> pipeline_item() {
			return getRuleContexts(Pipeline_itemContext.class);
		}
		public Pipeline_itemContext pipeline_item(int i) {
			return getRuleContext(Pipeline_itemContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(ShellParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(ShellParser.PIPE, i);
		}
		public PipelineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipeline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).enterPipeline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).exitPipeline(this);
		}
	}

	public final PipelineContext pipeline() throws RecognitionException {
		PipelineContext _localctx = new PipelineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pipeline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			pipeline_item();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(80);
				match(PIPE);
				setState(81);
				pipeline_item();
				}
				}
				setState(86);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pipeline_itemContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public Pipeline_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipeline_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).enterPipeline_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).exitPipeline_item(this);
		}
	}

	public final Pipeline_itemContext pipeline_item() throws RecognitionException {
		Pipeline_itemContext _localctx = new Pipeline_itemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pipeline_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			command();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public Simple_commandContext simple_command() {
			return getRuleContext(Simple_commandContext.class,0);
		}
		public Compound_commandContext compound_command() {
			return getRuleContext(Compound_commandContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Variable_assignmentContext variable_assignment() {
			return getRuleContext(Variable_assignmentContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_command);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				simple_command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				compound_command();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				function_definition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				variable_assignment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_commandContext extends ParserRuleContext {
		public Cmd_nameContext cmd_name() {
			return getRuleContext(Cmd_nameContext.class,0);
		}
		public Cmd_prefixContext cmd_prefix() {
			return getRuleContext(Cmd_prefixContext.class,0);
		}
		public Cmd_suffixContext cmd_suffix() {
			return getRuleContext(Cmd_suffixContext.class,0);
		}
		public Simple_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).enterSimple_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).exitSimple_command(this);
		}
	}

	public final Simple_commandContext simple_command() throws RecognitionException {
		Simple_commandContext _localctx = new Simple_commandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simple_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16252928L) != 0)) {
				{
				setState(95);
				cmd_prefix();
				}
			}

			setState(98);
			cmd_name();
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(99);
				cmd_suffix();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Cmd_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ShellParser.IDENTIFIER, 0); }
		public TerminalNode ECHO() { return getToken(ShellParser.ECHO, 0); }
		public TerminalNode CD() { return getToken(ShellParser.CD, 0); }
		public TerminalNode PWD() { return getToken(ShellParser.PWD, 0); }
		public TerminalNode LS() { return getToken(ShellParser.LS, 0); }
		public TerminalNode MKDIR() { return getToken(ShellParser.MKDIR, 0); }
		public TerminalNode RM() { return getToken(ShellParser.RM, 0); }
		public TerminalNode CP() { return getToken(ShellParser.CP, 0); }
		public TerminalNode MV() { return getToken(ShellParser.MV, 0); }
		public TerminalNode GREP() { return getToken(ShellParser.GREP, 0); }
		public TerminalNode SED() { return getToken(ShellParser.SED, 0); }
		public TerminalNode CAT() { return getToken(ShellParser.CAT, 0); }
		public TerminalNode CHMOD() { return getToken(ShellParser.CHMOD, 0); }
		public TerminalNode EXPORT() { return getToken(ShellParser.EXPORT, 0); }
		public TerminalNode READ() { return getToken(ShellParser.READ, 0); }
		public TerminalNode SOURCE() { return getToken(ShellParser.SOURCE, 0); }
		public TerminalNode TEST() { return getToken(ShellParser.TEST, 0); }
		public Cmd_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).enterCmd_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).exitCmd_name(this);
		}
	}

	public final Cmd_nameContext cmd_name() throws RecognitionException {
		Cmd_nameContext _localctx = new Cmd_nameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmd_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 289356258878685184L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Cmd_prefixContext extends ParserRuleContext {
		public List<RedirectContext> redirect() {
			return getRuleContexts(RedirectContext.class);
		}
		public RedirectContext redirect(int i) {
			return getRuleContext(RedirectContext.class,i);
		}
		public Cmd_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).enterCmd_prefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).exitCmd_prefix(this);
		}
	}

	public final Cmd_prefixContext cmd_prefix() throws RecognitionException {
		Cmd_prefixContext _localctx = new Cmd_prefixContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmd_prefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104);
				redirect();
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16252928L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cmd_suffixContext extends ParserRuleContext {
		public List<TerminalNode> ARGUMENT() { return getTokens(ShellParser.ARGUMENT); }
		public TerminalNode ARGUMENT(int i) {
			return getToken(ShellParser.ARGUMENT, i);
		}
		public List<RedirectContext> redirect() {
			return getRuleContexts(RedirectContext.class);
		}
		public RedirectContext redirect(int i) {
			return getRuleContext(RedirectContext.class,i);
		}
		public Cmd_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).enterCmd_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).exitCmd_suffix(this);
		}
	}

	public final Cmd_suffixContext cmd_suffix() throws RecognitionException {
		Cmd_suffixContext _localctx = new Cmd_suffixContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmd_suffix);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(111);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ARGUMENT:
						{
						setState(109);
						match(ARGUMENT);
						}
						break;
					case LESS:
					case GREATER:
					case APPEND:
					case REDIRECT_ERR:
					case REDIRECT_BOTH:
						{
						setState(110);
						redirect();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(113); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RedirectContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(ShellParser.LESS, 0); }
		public TerminalNode ARGUMENT() { return getToken(ShellParser.ARGUMENT, 0); }
		public TerminalNode GREATER() { return getToken(ShellParser.GREATER, 0); }
		public TerminalNode APPEND() { return getToken(ShellParser.APPEND, 0); }
		public TerminalNode REDIRECT_ERR() { return getToken(ShellParser.REDIRECT_ERR, 0); }
		public TerminalNode REDIRECT_BOTH() { return getToken(ShellParser.REDIRECT_BOTH, 0); }
		public RedirectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redirect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).enterRedirect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).exitRedirect(this);
		}
	}

	public final RedirectContext redirect() throws RecognitionException {
		RedirectContext _localctx = new RedirectContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_redirect);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LESS:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(LESS);
				setState(116);
				match(ARGUMENT);
				}
				break;
			case GREATER:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(GREATER);
				setState(118);
				match(ARGUMENT);
				}
				break;
			case APPEND:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(APPEND);
				setState(120);
				match(ARGUMENT);
				}
				break;
			case REDIRECT_ERR:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				match(REDIRECT_ERR);
				setState(122);
				match(ARGUMENT);
				}
				break;
			case REDIRECT_BOTH:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				match(REDIRECT_BOTH);
				setState(124);
				match(ARGUMENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Compound_commandContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Case_statementContext case_statement() {
			return getRuleContext(Case_statementContext.class,0);
		}
		public Brace_groupContext brace_group() {
			return getRuleContext(Brace_groupContext.class,0);
		}
		public SubshellContext subshell() {
			return getRuleContext(SubshellContext.class,0);
		}
		public Compound_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).enterCompound_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).exitCompound_command(this);
		}
	}

	public final Compound_commandContext compound_command() throws RecognitionException {
		Compound_commandContext _localctx = new Compound_commandContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_compound_command);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				if_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				while_loop();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				for_loop();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				case_statement();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				brace_group();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
				subshell();
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ShellParser.IF, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ShellParser.THEN, 0); }
		public List_sequenceContext list_sequence() {
			return getRuleContext(List_sequenceContext.class,0);
		}
		public TerminalNode FI() { return getToken(ShellParser.FI, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ShellParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ShellParser.NEWLINE, i);
		}
		public List<Elif_partContext> elif_part() {
			return getRuleContexts(Elif_partContext.class);
		}
		public Elif_partContext elif_part(int i) {
			return getRuleContext(Elif_partContext.class,i);
		}
		public Else_partContext else_part() {
			return getRuleContext(Else_partContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(IF);
			setState(136);
			list();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(137);
				match(NEWLINE);
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(THEN);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(144);
					match(NEWLINE);
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(150);
			list_sequence();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(151);
				elif_part();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(157);
				else_part();
				}
			}

			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(160);
				match(NEWLINE);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			match(FI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Elif_partContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(ShellParser.ELIF, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ShellParser.THEN, 0); }
		public List_sequenceContext list_sequence() {
			return getRuleContext(List_sequenceContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ShellParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ShellParser.NEWLINE, i);
		}
		public Elif_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).enterElif_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).exitElif_part(this);
		}
	}

	public final Elif_partContext elif_part() throws RecognitionException {
		Elif_partContext _localctx = new Elif_partContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elif_part);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(ELIF);
			setState(169);
			list();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(170);
				match(NEWLINE);
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(THEN);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(177);
					match(NEWLINE);
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(183);
			list_sequence();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_partContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ShellParser.ELSE, 0); }
		public List_sequenceContext list_sequence() {
			return getRuleContext(List_sequenceContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ShellParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ShellParser.NEWLINE, i);
		}
		public Else_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).enterElse_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).exitElse_part(this);
		}
	}

	public final Else_partContext else_part() throws RecognitionException {
		Else_partContext _localctx = new Else_partContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_else_part);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(ELSE);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(186);
					match(NEWLINE);
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(192);
			list_sequence();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ShellParser.WHILE, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode DO() { return getToken(ShellParser.DO, 0); }
		public List_sequenceContext list_sequence() {
			return getRuleContext(List_sequenceContext.class,0);
		}
		public TerminalNode DONE() { return getToken(ShellParser.DONE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ShellParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ShellParser.NEWLINE, i);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).exitWhile_loop(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_while_loop);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(WHILE);
			setState(195);
			list();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(196);
				match(NEWLINE);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(DO);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(203);
					match(NEWLINE);
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(209);
			list_sequence();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(210);
				match(NEWLINE);
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(DONE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ShellParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ShellParser.IDENTIFIER, 0); }
		public TerminalNode DO() { return getToken(ShellParser.DO, 0); }
		public List_sequenceContext list_sequence() {
			return getRuleContext(List_sequenceContext.class,0);
		}
		public TerminalNode DONE() { return getToken(ShellParser.DONE, 0); }
		public TerminalNode IN() { return getToken(ShellParser.IN, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ShellParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ShellParser.NEWLINE, i);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).exitFor_loop(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_for_loop);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(FOR);
			setState(219);
			match(IDENTIFIER);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(220);
				match(IN);
				setState(221);
				argument_list();
				}
			}

			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(224);
				match(NEWLINE);
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			match(DO);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					match(NEWLINE);
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(237);
			list_sequence();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(238);
				match(NEWLINE);
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			match(DONE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Case_statementContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(ShellParser.CASE, 0); }
		public TerminalNode ARGUMENT() { return getToken(ShellParser.ARGUMENT, 0); }
		public TerminalNode IN() { return getToken(ShellParser.IN, 0); }
		public TerminalNode ESAC() { return getToken(ShellParser.ESAC, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ShellParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ShellParser.NEWLINE, i);
		}
		public List<Case_itemContext> case_item() {
			return getRuleContexts(Case_itemContext.class);
		}
		public Case_itemContext case_item(int i) {
			return getRuleContext(Case_itemContext.class,i);
		}
		public Case_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).enterCase_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).exitCase_statement(this);
		}
	}

	public final Case_statementContext case_statement() throws RecognitionException {
		Case_statementContext _localctx = new Case_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_case_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(CASE);
			setState(247);
			match(ARGUMENT);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(248);
				match(NEWLINE);
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			match(IN);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(255);
				match(NEWLINE);
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARGUMENT) {
				{
				{
				setState(261);
				case_item();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			match(ESAC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Case_itemContext extends ParserRuleContext {
		public Pattern_listContext pattern_list() {
			return getRuleContext(Pattern_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ShellParser.RPAREN, 0); }
		public List_sequenceContext list_sequence() {
			return getRuleContext(List_sequenceContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ShellParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ShellParser.NEWLINE, i);
		}
		public TerminalNode SEMI() { return getToken(ShellParser.SEMI, 0); }
		public Case_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).enterCase_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).exitCase_item(this);
		}
	}

	public final Case_itemContext case_item() throws RecognitionException {
		Case_itemContext _localctx = new Case_itemContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_case_item);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			pattern_list();
			setState(270);
			match(RPAREN);
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(271);
					match(NEWLINE);
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(277);
			list_sequence();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(278);
				match(SEMI);
				}
			}

			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(281);
				match(NEWLINE);
				}
				}
				setState(286);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pattern_listContext extends ParserRuleContext {
		public List<TerminalNode> ARGUMENT() { return getTokens(ShellParser.ARGUMENT); }
		public TerminalNode ARGUMENT(int i) {
			return getToken(ShellParser.ARGUMENT, i);
		}
		public List<TerminalNode> PIPE() { return getTokens(ShellParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(ShellParser.PIPE, i);
		}
		public Pattern_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).enterPattern_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).exitPattern_list(this);
		}
	}

	public final Pattern_listContext pattern_list() throws RecognitionException {
		Pattern_listContext _localctx = new Pattern_listContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pattern_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(ARGUMENT);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(288);
				match(PIPE);
				setState(289);
				match(ARGUMENT);
				}
				}
				setState(294);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Brace_groupContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ShellParser.LBRACE, 0); }
		public List_sequenceContext list_sequence() {
			return getRuleContext(List_sequenceContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ShellParser.RBRACE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ShellParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ShellParser.NEWLINE, i);
		}
		public Brace_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brace_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).enterBrace_group(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).exitBrace_group(this);
		}
	}

	public final Brace_groupContext brace_group() throws RecognitionException {
		Brace_groupContext _localctx = new Brace_groupContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_brace_group);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(LBRACE);
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(296);
					match(NEWLINE);
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(302);
			list_sequence();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(303);
				match(NEWLINE);
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubshellContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ShellParser.LPAREN, 0); }
		public List_sequenceContext list_sequence() {
			return getRuleContext(List_sequenceContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ShellParser.RPAREN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ShellParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ShellParser.NEWLINE, i);
		}
		public SubshellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subshell; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).enterSubshell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).exitSubshell(this);
		}
	}

	public final SubshellContext subshell() throws RecognitionException {
		SubshellContext _localctx = new SubshellContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_subshell);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(LPAREN);
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(312);
					match(NEWLINE);
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(318);
			list_sequence();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(319);
				match(NEWLINE);
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_definitionContext extends ParserRuleContext {
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(ShellParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ShellParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ShellParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ShellParser.RPAREN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ShellParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ShellParser.NEWLINE, i);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).exitFunction_definition(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				{
				setState(327);
				match(FUNCTION);
				setState(328);
				match(IDENTIFIER);
				}
				break;
			case IDENTIFIER:
				{
				setState(329);
				match(IDENTIFIER);
				setState(330);
				match(LPAREN);
				setState(331);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(334);
				match(NEWLINE);
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(340);
			function_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_bodyContext extends ParserRuleContext {
		public Brace_groupContext brace_group() {
			return getRuleContext(Brace_groupContext.class,0);
		}
		public Compound_commandContext compound_command() {
			return getRuleContext(Compound_commandContext.class,0);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).exitFunction_body(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_function_body);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				brace_group();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				compound_command();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_assignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ShellParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(ShellParser.ASSIGN, 0); }
		public TerminalNode ARGUMENT() { return getToken(ShellParser.ARGUMENT, 0); }
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(ShellParser.SINGLE_QUOTE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(ShellParser.SINGLE_QUOTE, i);
		}
		public List<TerminalNode> DOUBLE_QUOTE() { return getTokens(ShellParser.DOUBLE_QUOTE); }
		public TerminalNode DOUBLE_QUOTE(int i) {
			return getToken(ShellParser.DOUBLE_QUOTE, i);
		}
		public TerminalNode SINGLE_QUOTE_CONTENT() { return getToken(ShellParser.SINGLE_QUOTE_CONTENT, 0); }
		public TerminalNode DOUBLE_QUOTE_CONTENT() { return getToken(ShellParser.DOUBLE_QUOTE_CONTENT, 0); }
		public Variable_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).enterVariable_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).exitVariable_assignment(this);
		}
	}

	public final Variable_assignmentContext variable_assignment() throws RecognitionException {
		Variable_assignmentContext _localctx = new Variable_assignmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variable_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(IDENTIFIER);
			setState(347);
			match(ASSIGN);
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARGUMENT:
				{
				setState(348);
				match(ARGUMENT);
				}
				break;
			case SINGLE_QUOTE:
				{
				setState(349);
				match(SINGLE_QUOTE);
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SINGLE_QUOTE_CONTENT) {
					{
					setState(350);
					match(SINGLE_QUOTE_CONTENT);
					}
				}

				setState(353);
				match(SINGLE_QUOTE);
				}
				break;
			case DOUBLE_QUOTE:
				{
				setState(354);
				match(DOUBLE_QUOTE);
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOUBLE_QUOTE_CONTENT) {
					{
					setState(355);
					match(DOUBLE_QUOTE_CONTENT);
					}
				}

				setState(358);
				match(DOUBLE_QUOTE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class List_sequenceContext extends ParserRuleContext {
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public List_sequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).enterList_sequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).exitList_sequence(this);
		}
	}

	public final List_sequenceContext list_sequence() throws RecognitionException {
		List_sequenceContext _localctx = new List_sequenceContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_list_sequence);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 289356258978834754L) != 0)) {
				{
				setState(361);
				list();
				}
			}

			setState(370);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(364);
					separator();
					setState(366);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 289356258978834754L) != 0)) {
						{
						setState(365);
						list();
						}
					}

					}
					} 
				}
				setState(372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SeparatorContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(ShellParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ShellParser.NEWLINE, i);
		}
		public TerminalNode SEMI() { return getToken(ShellParser.SEMI, 0); }
		public SeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).enterSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).exitSeparator(this);
		}
	}

	public final SeparatorContext separator() throws RecognitionException {
		SeparatorContext _localctx = new SeparatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_separator);
		try {
			int _alt;
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(374); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(373);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(376); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(SEMI);
				setState(382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(379);
						match(NEWLINE);
						}
						} 
					}
					setState(384);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Argument_listContext extends ParserRuleContext {
		public List<TerminalNode> ARGUMENT() { return getTokens(ShellParser.ARGUMENT); }
		public TerminalNode ARGUMENT(int i) {
			return getToken(ShellParser.ARGUMENT, i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShellParserListener ) ((ShellParserListener)listener).exitArgument_list(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(387);
				match(ARGUMENT);
				}
				}
				setState(390); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ARGUMENT );
			}
		}
		catch (RecognitionException re) {
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
		"\u0004\u0001A\u0189\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0005\u0000<\b\u0000\n\u0000\f\u0000"+
		"?\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002I\b\u0002\n\u0002\f\u0002"+
		"L\t\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004S\b\u0004\n\u0004\f\u0004V\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006^\b\u0006"+
		"\u0001\u0007\u0003\u0007a\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"e\b\u0007\u0001\b\u0001\b\u0001\t\u0004\tj\b\t\u000b\t\f\tk\u0001\n\u0001"+
		"\n\u0004\np\b\n\u000b\n\f\nq\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b~\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u0086\b\f\u0001\r\u0001\r\u0001\r\u0005\r\u008b\b\r\n\r\f\r"+
		"\u008e\t\r\u0001\r\u0001\r\u0005\r\u0092\b\r\n\r\f\r\u0095\t\r\u0001\r"+
		"\u0001\r\u0005\r\u0099\b\r\n\r\f\r\u009c\t\r\u0001\r\u0003\r\u009f\b\r"+
		"\u0001\r\u0005\r\u00a2\b\r\n\r\f\r\u00a5\t\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u00ac\b\u000e\n\u000e\f\u000e\u00af"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00b3\b\u000e\n\u000e\f\u000e"+
		"\u00b6\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u00bc\b\u000f\n\u000f\f\u000f\u00bf\t\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00c6\b\u0010\n\u0010\f\u0010"+
		"\u00c9\t\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00cd\b\u0010\n\u0010"+
		"\f\u0010\u00d0\t\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00d4\b\u0010"+
		"\n\u0010\f\u0010\u00d7\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00df\b\u0011\u0001\u0011\u0005"+
		"\u0011\u00e2\b\u0011\n\u0011\f\u0011\u00e5\t\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u00e9\b\u0011\n\u0011\f\u0011\u00ec\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u00f0\b\u0011\n\u0011\f\u0011\u00f3\t\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00fa\b\u0012"+
		"\n\u0012\f\u0012\u00fd\t\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0101"+
		"\b\u0012\n\u0012\f\u0012\u0104\t\u0012\u0001\u0012\u0005\u0012\u0107\b"+
		"\u0012\n\u0012\f\u0012\u010a\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u0111\b\u0013\n\u0013\f\u0013\u0114"+
		"\t\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0118\b\u0013\u0001\u0013"+
		"\u0005\u0013\u011b\b\u0013\n\u0013\f\u0013\u011e\t\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u0123\b\u0014\n\u0014\f\u0014\u0126\t\u0014"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u012a\b\u0015\n\u0015\f\u0015\u012d"+
		"\t\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0131\b\u0015\n\u0015\f\u0015"+
		"\u0134\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u013a\b\u0016\n\u0016\f\u0016\u013d\t\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u0141\b\u0016\n\u0016\f\u0016\u0144\t\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u014d\b\u0017\u0001\u0017\u0005\u0017\u0150\b\u0017\n\u0017\f\u0017\u0153"+
		"\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u0159"+
		"\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u0160\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0165"+
		"\b\u0019\u0001\u0019\u0003\u0019\u0168\b\u0019\u0001\u001a\u0003\u001a"+
		"\u016b\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u016f\b\u001a\u0005"+
		"\u001a\u0171\b\u001a\n\u001a\f\u001a\u0174\t\u001a\u0001\u001b\u0004\u001b"+
		"\u0177\b\u001b\u000b\u001b\f\u001b\u0178\u0001\u001b\u0001\u001b\u0005"+
		"\u001b\u017d\b\u001b\n\u001b\f\u001b\u0180\t\u001b\u0003\u001b\u0182\b"+
		"\u001b\u0001\u001c\u0004\u001c\u0185\b\u001c\u000b\u001c\f\u001c\u0186"+
		"\u0001\u001c\u0000\u0000\u001d\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468\u0000\u0003\u0002"+
		"\u0001\u0012\u0012!!\u0001\u0000\u0010\u0011\u0002\u0000\"1::\u01a7\u0000"+
		"=\u0001\u0000\u0000\u0000\u0002B\u0001\u0000\u0000\u0000\u0004E\u0001"+
		"\u0000\u0000\u0000\u0006M\u0001\u0000\u0000\u0000\bO\u0001\u0000\u0000"+
		"\u0000\nW\u0001\u0000\u0000\u0000\f]\u0001\u0000\u0000\u0000\u000e`\u0001"+
		"\u0000\u0000\u0000\u0010f\u0001\u0000\u0000\u0000\u0012i\u0001\u0000\u0000"+
		"\u0000\u0014o\u0001\u0000\u0000\u0000\u0016}\u0001\u0000\u0000\u0000\u0018"+
		"\u0085\u0001\u0000\u0000\u0000\u001a\u0087\u0001\u0000\u0000\u0000\u001c"+
		"\u00a8\u0001\u0000\u0000\u0000\u001e\u00b9\u0001\u0000\u0000\u0000 \u00c2"+
		"\u0001\u0000\u0000\u0000\"\u00da\u0001\u0000\u0000\u0000$\u00f6\u0001"+
		"\u0000\u0000\u0000&\u010d\u0001\u0000\u0000\u0000(\u011f\u0001\u0000\u0000"+
		"\u0000*\u0127\u0001\u0000\u0000\u0000,\u0137\u0001\u0000\u0000\u0000."+
		"\u014c\u0001\u0000\u0000\u00000\u0158\u0001\u0000\u0000\u00002\u015a\u0001"+
		"\u0000\u0000\u00004\u016a\u0001\u0000\u0000\u00006\u0181\u0001\u0000\u0000"+
		"\u00008\u0184\u0001\u0000\u0000\u0000:<\u0003\u0002\u0001\u0000;:\u0001"+
		"\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000"+
		"=>\u0001\u0000\u0000\u0000>@\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000"+
		"\u0000@A\u0005\u0000\u0000\u0001A\u0001\u0001\u0000\u0000\u0000BC\u0003"+
		"\u0004\u0002\u0000CD\u0007\u0000\u0000\u0000D\u0003\u0001\u0000\u0000"+
		"\u0000EJ\u0003\u0006\u0003\u0000FG\u0007\u0001\u0000\u0000GI\u0003\u0006"+
		"\u0003\u0000HF\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\u0005\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000MN\u0003\b\u0004\u0000N\u0007\u0001\u0000"+
		"\u0000\u0000OT\u0003\n\u0005\u0000PQ\u0005\u000f\u0000\u0000QS\u0003\n"+
		"\u0005\u0000RP\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\t\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000WX\u0003\f\u0006\u0000X\u000b\u0001\u0000\u0000"+
		"\u0000Y^\u0003\u000e\u0007\u0000Z^\u0003\u0018\f\u0000[^\u0003.\u0017"+
		"\u0000\\^\u00032\u0019\u0000]Y\u0001\u0000\u0000\u0000]Z\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000]\\\u0001\u0000\u0000\u0000^\r\u0001\u0000"+
		"\u0000\u0000_a\u0003\u0012\t\u0000`_\u0001\u0000\u0000\u0000`a\u0001\u0000"+
		"\u0000\u0000ab\u0001\u0000\u0000\u0000bd\u0003\u0010\b\u0000ce\u0003\u0014"+
		"\n\u0000dc\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000e\u000f\u0001"+
		"\u0000\u0000\u0000fg\u0007\u0002\u0000\u0000g\u0011\u0001\u0000\u0000"+
		"\u0000hj\u0003\u0016\u000b\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l\u0013"+
		"\u0001\u0000\u0000\u0000mp\u0005;\u0000\u0000np\u0003\u0016\u000b\u0000"+
		"om\u0001\u0000\u0000\u0000on\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\u0015\u0001"+
		"\u0000\u0000\u0000st\u0005\u0013\u0000\u0000t~\u0005;\u0000\u0000uv\u0005"+
		"\u0014\u0000\u0000v~\u0005;\u0000\u0000wx\u0005\u0015\u0000\u0000x~\u0005"+
		";\u0000\u0000yz\u0005\u0016\u0000\u0000z~\u0005;\u0000\u0000{|\u0005\u0017"+
		"\u0000\u0000|~\u0005;\u0000\u0000}s\u0001\u0000\u0000\u0000}u\u0001\u0000"+
		"\u0000\u0000}w\u0001\u0000\u0000\u0000}y\u0001\u0000\u0000\u0000}{\u0001"+
		"\u0000\u0000\u0000~\u0017\u0001\u0000\u0000\u0000\u007f\u0086\u0003\u001a"+
		"\r\u0000\u0080\u0086\u0003 \u0010\u0000\u0081\u0086\u0003\"\u0011\u0000"+
		"\u0082\u0086\u0003$\u0012\u0000\u0083\u0086\u0003*\u0015\u0000\u0084\u0086"+
		"\u0003,\u0016\u0000\u0085\u007f\u0001\u0000\u0000\u0000\u0085\u0080\u0001"+
		"\u0000\u0000\u0000\u0085\u0081\u0001\u0000\u0000\u0000\u0085\u0082\u0001"+
		"\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0084\u0001"+
		"\u0000\u0000\u0000\u0086\u0019\u0001\u0000\u0000\u0000\u0087\u0088\u0005"+
		"\u0001\u0000\u0000\u0088\u008c\u0003\u0004\u0002\u0000\u0089\u008b\u0005"+
		"!\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000"+
		"\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000"+
		"\u0000\u0000\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000"+
		"\u0000\u0000\u008f\u0093\u0005\u0002\u0000\u0000\u0090\u0092\u0005!\u0000"+
		"\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000"+
		"\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000"+
		"\u0000\u0096\u009a\u00034\u001a\u0000\u0097\u0099\u0003\u001c\u000e\u0000"+
		"\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000"+
		"\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000"+
		"\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009d\u009f\u0003\u001e\u000f\u0000\u009e\u009d\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a2\u0005!\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0005\u0000\u0000\u00a7"+
		"\u001b\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0003\u0000\u0000\u00a9"+
		"\u00ad\u0003\u0004\u0002\u0000\u00aa\u00ac\u0005!\u0000\u0000\u00ab\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b0"+
		"\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b4"+
		"\u0005\u0002\u0000\u0000\u00b1\u00b3\u0005!\u0000\u0000\u00b2\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8\u0003"+
		"4\u001a\u0000\u00b8\u001d\u0001\u0000\u0000\u0000\u00b9\u00bd\u0005\u0004"+
		"\u0000\u0000\u00ba\u00bc\u0005!\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00c0\u0001\u0000\u0000"+
		"\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c1\u00034\u001a\u0000"+
		"\u00c1\u001f\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\b\u0000\u0000\u00c3"+
		"\u00c7\u0003\u0004\u0002\u0000\u00c4\u00c6\u0005!\u0000\u0000\u00c5\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00ca"+
		"\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00ce"+
		"\u0005\t\u0000\u0000\u00cb\u00cd\u0005!\u0000\u0000\u00cc\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d5\u0003"+
		"4\u001a\u0000\u00d2\u00d4\u0005!\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\n\u0000\u0000"+
		"\u00d9!\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u0006\u0000\u0000\u00db"+
		"\u00de\u0005:\u0000\u0000\u00dc\u00dd\u0005\u0007\u0000\u0000\u00dd\u00df"+
		"\u00038\u001c\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001"+
		"\u0000\u0000\u0000\u00df\u00e3\u0001\u0000\u0000\u0000\u00e0\u00e2\u0005"+
		"!\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e6\u00ea\u0005\t\u0000\u0000\u00e7\u00e9\u0005!\u0000"+
		"\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ed\u00f1\u00034\u001a\u0000\u00ee\u00f0\u0005!\u0000\u0000\u00ef"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1"+
		"\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0005\n\u0000\u0000\u00f5#\u0001\u0000\u0000\u0000\u00f6\u00f7"+
		"\u0005\u000b\u0000\u0000\u00f7\u00fb\u0005;\u0000\u0000\u00f8\u00fa\u0005"+
		"!\u0000\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fe\u0102\u0005\u0007\u0000\u0000\u00ff\u0101\u0005!\u0000"+
		"\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u0104\u0001\u0000\u0000"+
		"\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000"+
		"\u0000\u0103\u0108\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000"+
		"\u0000\u0105\u0107\u0003&\u0013\u0000\u0106\u0105\u0001\u0000\u0000\u0000"+
		"\u0107\u010a\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010b\u0001\u0000\u0000\u0000"+
		"\u010a\u0108\u0001\u0000\u0000\u0000\u010b\u010c\u0005\f\u0000\u0000\u010c"+
		"%\u0001\u0000\u0000\u0000\u010d\u010e\u0003(\u0014\u0000\u010e\u0112\u0005"+
		"\u0019\u0000\u0000\u010f\u0111\u0005!\u0000\u0000\u0110\u010f\u0001\u0000"+
		"\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0115\u0001\u0000"+
		"\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0117\u00034\u001a"+
		"\u0000\u0116\u0118\u0005\u0012\u0000\u0000\u0117\u0116\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u011c\u0001\u0000\u0000"+
		"\u0000\u0119\u011b\u0005!\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000"+
		"\u011b\u011e\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000"+
		"\u011c\u011d\u0001\u0000\u0000\u0000\u011d\'\u0001\u0000\u0000\u0000\u011e"+
		"\u011c\u0001\u0000\u0000\u0000\u011f\u0124\u0005;\u0000\u0000\u0120\u0121"+
		"\u0005\u000f\u0000\u0000\u0121\u0123\u0005;\u0000\u0000\u0122\u0120\u0001"+
		"\u0000\u0000\u0000\u0123\u0126\u0001\u0000\u0000\u0000\u0124\u0122\u0001"+
		"\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125)\u0001\u0000"+
		"\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0127\u012b\u0005\u001a"+
		"\u0000\u0000\u0128\u012a\u0005!\u0000\u0000\u0129\u0128\u0001\u0000\u0000"+
		"\u0000\u012a\u012d\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000"+
		"\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012e\u0001\u0000\u0000"+
		"\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012e\u0132\u00034\u001a\u0000"+
		"\u012f\u0131\u0005!\u0000\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0131"+
		"\u0134\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132"+
		"\u0133\u0001\u0000\u0000\u0000\u0133\u0135\u0001\u0000\u0000\u0000\u0134"+
		"\u0132\u0001\u0000\u0000\u0000\u0135\u0136\u0005\u001b\u0000\u0000\u0136"+
		"+\u0001\u0000\u0000\u0000\u0137\u013b\u0005\u0018\u0000\u0000\u0138\u013a"+
		"\u0005!\u0000\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u013a\u013d\u0001"+
		"\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001"+
		"\u0000\u0000\u0000\u013c\u013e\u0001\u0000\u0000\u0000\u013d\u013b\u0001"+
		"\u0000\u0000\u0000\u013e\u0142\u00034\u001a\u0000\u013f\u0141\u0005!\u0000"+
		"\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000"+
		"\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000"+
		"\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\u0005\u0019\u0000\u0000\u0146-\u0001\u0000\u0000\u0000"+
		"\u0147\u0148\u0005\r\u0000\u0000\u0148\u014d\u0005:\u0000\u0000\u0149"+
		"\u014a\u0005:\u0000\u0000\u014a\u014b\u0005\u0018\u0000\u0000\u014b\u014d"+
		"\u0005\u0019\u0000\u0000\u014c\u0147\u0001\u0000\u0000\u0000\u014c\u0149"+
		"\u0001\u0000\u0000\u0000\u014d\u0151\u0001\u0000\u0000\u0000\u014e\u0150"+
		"\u0005!\u0000\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u0150\u0153\u0001"+
		"\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0152\u0001"+
		"\u0000\u0000\u0000\u0152\u0154\u0001\u0000\u0000\u0000\u0153\u0151\u0001"+
		"\u0000\u0000\u0000\u0154\u0155\u00030\u0018\u0000\u0155/\u0001\u0000\u0000"+
		"\u0000\u0156\u0159\u0003*\u0015\u0000\u0157\u0159\u0003\u0018\f\u0000"+
		"\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0157\u0001\u0000\u0000\u0000"+
		"\u01591\u0001\u0000\u0000\u0000\u015a\u015b\u0005:\u0000\u0000\u015b\u0167"+
		"\u0005\u000e\u0000\u0000\u015c\u0168\u0005;\u0000\u0000\u015d\u015f\u0005"+
		"6\u0000\u0000\u015e\u0160\u0005@\u0000\u0000\u015f\u015e\u0001\u0000\u0000"+
		"\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000"+
		"\u0000\u0161\u0168\u00056\u0000\u0000\u0162\u0164\u00055\u0000\u0000\u0163"+
		"\u0165\u0005>\u0000\u0000\u0164\u0163\u0001\u0000\u0000\u0000\u0164\u0165"+
		"\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0168"+
		"\u00055\u0000\u0000\u0167\u015c\u0001\u0000\u0000\u0000\u0167\u015d\u0001"+
		"\u0000\u0000\u0000\u0167\u0162\u0001\u0000\u0000\u0000\u01683\u0001\u0000"+
		"\u0000\u0000\u0169\u016b\u0003\u0004\u0002\u0000\u016a\u0169\u0001\u0000"+
		"\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u0172\u0001\u0000"+
		"\u0000\u0000\u016c\u016e\u00036\u001b\u0000\u016d\u016f\u0003\u0004\u0002"+
		"\u0000\u016e\u016d\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000"+
		"\u0000\u016f\u0171\u0001\u0000\u0000\u0000\u0170\u016c\u0001\u0000\u0000"+
		"\u0000\u0171\u0174\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000"+
		"\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u01735\u0001\u0000\u0000\u0000"+
		"\u0174\u0172\u0001\u0000\u0000\u0000\u0175\u0177\u0005!\u0000\u0000\u0176"+
		"\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178"+
		"\u0176\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179"+
		"\u0182\u0001\u0000\u0000\u0000\u017a\u017e\u0005\u0012\u0000\u0000\u017b"+
		"\u017d\u0005!\u0000\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017d\u0180"+
		"\u0001\u0000\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017e\u017f"+
		"\u0001\u0000\u0000\u0000\u017f\u0182\u0001\u0000\u0000\u0000\u0180\u017e"+
		"\u0001\u0000\u0000\u0000\u0181\u0176\u0001\u0000\u0000\u0000\u0181\u017a"+
		"\u0001\u0000\u0000\u0000\u01827\u0001\u0000\u0000\u0000\u0183\u0185\u0005"+
		";\u0000\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000"+
		"\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000"+
		"\u0000\u0000\u01879\u0001\u0000\u0000\u00002=JT]`dkoq}\u0085\u008c\u0093"+
		"\u009a\u009e\u00a3\u00ad\u00b4\u00bd\u00c7\u00ce\u00d5\u00de\u00e3\u00ea"+
		"\u00f1\u00fb\u0102\u0108\u0112\u0117\u011c\u0124\u012b\u0132\u013b\u0142"+
		"\u014c\u0151\u0158\u015f\u0164\u0167\u016a\u016e\u0172\u0178\u017e\u0181"+
		"\u0186";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}