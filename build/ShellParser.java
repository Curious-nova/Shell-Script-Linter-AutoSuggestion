// Generated from antlr/ShellParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShellParser extends Parser {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << CASE) | (1L << FUNCTION) | (1L << LESS) | (1L << GREATER) | (1L << APPEND) | (1L << REDIRECT_ERR) | (1L << REDIRECT_BOTH) | (1L << LPAREN) | (1L << LBRACE) | (1L << ECHO) | (1L << CD) | (1L << PWD) | (1L << LS) | (1L << MKDIR) | (1L << RM) | (1L << CP) | (1L << MV) | (1L << GREP) | (1L << SED) | (1L << CAT) | (1L << CHMOD) | (1L << EXPORT) | (1L << READ) | (1L << SOURCE) | (1L << TEST) | (1L << IDENTIFIER))) != 0)) {
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
			if ( !(((((_la - -1)) & ~0x3f) == 0 && ((1L << (_la - -1)) & ((1L << (EOF - -1)) | (1L << (SEMI - -1)) | (1L << (NEWLINE - -1)))) != 0)) ) {
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << GREATER) | (1L << APPEND) | (1L << REDIRECT_ERR) | (1L << REDIRECT_BOTH))) != 0)) {
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ECHO) | (1L << CD) | (1L << PWD) | (1L << LS) | (1L << MKDIR) | (1L << RM) | (1L << CP) | (1L << MV) | (1L << GREP) | (1L << SED) | (1L << CAT) | (1L << CHMOD) | (1L << EXPORT) | (1L << READ) | (1L << SOURCE) | (1L << TEST) | (1L << IDENTIFIER))) != 0)) ) {
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << GREATER) | (1L << APPEND) | (1L << REDIRECT_ERR) | (1L << REDIRECT_BOTH))) != 0) );
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << CASE) | (1L << FUNCTION) | (1L << LESS) | (1L << GREATER) | (1L << APPEND) | (1L << REDIRECT_ERR) | (1L << REDIRECT_BOTH) | (1L << LPAREN) | (1L << LBRACE) | (1L << ECHO) | (1L << CD) | (1L << PWD) | (1L << LS) | (1L << MKDIR) | (1L << RM) | (1L << CP) | (1L << MV) | (1L << GREP) | (1L << SED) | (1L << CAT) | (1L << CHMOD) | (1L << EXPORT) | (1L << READ) | (1L << SOURCE) | (1L << TEST) | (1L << IDENTIFIER))) != 0)) {
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
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << CASE) | (1L << FUNCTION) | (1L << LESS) | (1L << GREATER) | (1L << APPEND) | (1L << REDIRECT_ERR) | (1L << REDIRECT_BOTH) | (1L << LPAREN) | (1L << LBRACE) | (1L << ECHO) | (1L << CD) | (1L << PWD) | (1L << LS) | (1L << MKDIR) | (1L << RM) | (1L << CP) | (1L << MV) | (1L << GREP) | (1L << SED) | (1L << CAT) | (1L << CHMOD) | (1L << EXPORT) | (1L << READ) | (1L << SOURCE) | (1L << TEST) | (1L << IDENTIFIER))) != 0)) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3C\u018b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\3\5\3"+
		"\5\3\6\3\6\3\6\7\6U\n\6\f\6\16\6X\13\6\3\7\3\7\3\b\3\b\3\b\3\b\5\b`\n"+
		"\b\3\t\5\tc\n\t\3\t\3\t\5\tg\n\t\3\n\3\n\3\13\6\13l\n\13\r\13\16\13m\3"+
		"\f\3\f\6\fr\n\f\r\f\16\fs\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u0080\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0088\n\16\3\17\3\17\3\17"+
		"\7\17\u008d\n\17\f\17\16\17\u0090\13\17\3\17\3\17\7\17\u0094\n\17\f\17"+
		"\16\17\u0097\13\17\3\17\3\17\7\17\u009b\n\17\f\17\16\17\u009e\13\17\3"+
		"\17\5\17\u00a1\n\17\3\17\7\17\u00a4\n\17\f\17\16\17\u00a7\13\17\3\17\3"+
		"\17\3\20\3\20\3\20\7\20\u00ae\n\20\f\20\16\20\u00b1\13\20\3\20\3\20\7"+
		"\20\u00b5\n\20\f\20\16\20\u00b8\13\20\3\20\3\20\3\21\3\21\7\21\u00be\n"+
		"\21\f\21\16\21\u00c1\13\21\3\21\3\21\3\22\3\22\3\22\7\22\u00c8\n\22\f"+
		"\22\16\22\u00cb\13\22\3\22\3\22\7\22\u00cf\n\22\f\22\16\22\u00d2\13\22"+
		"\3\22\3\22\7\22\u00d6\n\22\f\22\16\22\u00d9\13\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\5\23\u00e1\n\23\3\23\7\23\u00e4\n\23\f\23\16\23\u00e7\13\23"+
		"\3\23\3\23\7\23\u00eb\n\23\f\23\16\23\u00ee\13\23\3\23\3\23\7\23\u00f2"+
		"\n\23\f\23\16\23\u00f5\13\23\3\23\3\23\3\24\3\24\3\24\7\24\u00fc\n\24"+
		"\f\24\16\24\u00ff\13\24\3\24\3\24\7\24\u0103\n\24\f\24\16\24\u0106\13"+
		"\24\3\24\7\24\u0109\n\24\f\24\16\24\u010c\13\24\3\24\3\24\3\25\3\25\3"+
		"\25\7\25\u0113\n\25\f\25\16\25\u0116\13\25\3\25\3\25\5\25\u011a\n\25\3"+
		"\25\7\25\u011d\n\25\f\25\16\25\u0120\13\25\3\26\3\26\3\26\7\26\u0125\n"+
		"\26\f\26\16\26\u0128\13\26\3\27\3\27\7\27\u012c\n\27\f\27\16\27\u012f"+
		"\13\27\3\27\3\27\7\27\u0133\n\27\f\27\16\27\u0136\13\27\3\27\3\27\3\30"+
		"\3\30\7\30\u013c\n\30\f\30\16\30\u013f\13\30\3\30\3\30\7\30\u0143\n\30"+
		"\f\30\16\30\u0146\13\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u014f"+
		"\n\31\3\31\7\31\u0152\n\31\f\31\16\31\u0155\13\31\3\31\3\31\3\32\3\32"+
		"\5\32\u015b\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u0162\n\33\3\33\3\33\3"+
		"\33\5\33\u0167\n\33\3\33\5\33\u016a\n\33\3\34\5\34\u016d\n\34\3\34\3\34"+
		"\5\34\u0171\n\34\7\34\u0173\n\34\f\34\16\34\u0176\13\34\3\35\6\35\u0179"+
		"\n\35\r\35\16\35\u017a\3\35\3\35\7\35\u017f\n\35\f\35\16\35\u0182\13\35"+
		"\5\35\u0184\n\35\3\36\6\36\u0187\n\36\r\36\16\36\u0188\3\36\2\2\37\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\5\4\3\24"+
		"\24##\3\2\22\23\4\2$\63<<\2\u01a9\2?\3\2\2\2\4D\3\2\2\2\6G\3\2\2\2\bO"+
		"\3\2\2\2\nQ\3\2\2\2\fY\3\2\2\2\16_\3\2\2\2\20b\3\2\2\2\22h\3\2\2\2\24"+
		"k\3\2\2\2\26q\3\2\2\2\30\177\3\2\2\2\32\u0087\3\2\2\2\34\u0089\3\2\2\2"+
		"\36\u00aa\3\2\2\2 \u00bb\3\2\2\2\"\u00c4\3\2\2\2$\u00dc\3\2\2\2&\u00f8"+
		"\3\2\2\2(\u010f\3\2\2\2*\u0121\3\2\2\2,\u0129\3\2\2\2.\u0139\3\2\2\2\60"+
		"\u014e\3\2\2\2\62\u015a\3\2\2\2\64\u015c\3\2\2\2\66\u016c\3\2\2\28\u0183"+
		"\3\2\2\2:\u0186\3\2\2\2<>\5\4\3\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2"+
		"\2\2@B\3\2\2\2A?\3\2\2\2BC\7\2\2\3C\3\3\2\2\2DE\5\6\4\2EF\t\2\2\2F\5\3"+
		"\2\2\2GL\5\b\5\2HI\t\3\2\2IK\5\b\5\2JH\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3"+
		"\2\2\2M\7\3\2\2\2NL\3\2\2\2OP\5\n\6\2P\t\3\2\2\2QV\5\f\7\2RS\7\21\2\2"+
		"SU\5\f\7\2TR\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\13\3\2\2\2XV\3\2\2"+
		"\2YZ\5\16\b\2Z\r\3\2\2\2[`\5\20\t\2\\`\5\32\16\2]`\5\60\31\2^`\5\64\33"+
		"\2_[\3\2\2\2_\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2`\17\3\2\2\2ac\5\24\13\2ba"+
		"\3\2\2\2bc\3\2\2\2cd\3\2\2\2df\5\22\n\2eg\5\26\f\2fe\3\2\2\2fg\3\2\2\2"+
		"g\21\3\2\2\2hi\t\4\2\2i\23\3\2\2\2jl\5\30\r\2kj\3\2\2\2lm\3\2\2\2mk\3"+
		"\2\2\2mn\3\2\2\2n\25\3\2\2\2or\7=\2\2pr\5\30\r\2qo\3\2\2\2qp\3\2\2\2r"+
		"s\3\2\2\2sq\3\2\2\2st\3\2\2\2t\27\3\2\2\2uv\7\25\2\2v\u0080\7=\2\2wx\7"+
		"\26\2\2x\u0080\7=\2\2yz\7\27\2\2z\u0080\7=\2\2{|\7\30\2\2|\u0080\7=\2"+
		"\2}~\7\31\2\2~\u0080\7=\2\2\177u\3\2\2\2\177w\3\2\2\2\177y\3\2\2\2\177"+
		"{\3\2\2\2\177}\3\2\2\2\u0080\31\3\2\2\2\u0081\u0088\5\34\17\2\u0082\u0088"+
		"\5\"\22\2\u0083\u0088\5$\23\2\u0084\u0088\5&\24\2\u0085\u0088\5,\27\2"+
		"\u0086\u0088\5.\30\2\u0087\u0081\3\2\2\2\u0087\u0082\3\2\2\2\u0087\u0083"+
		"\3\2\2\2\u0087\u0084\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\33\3\2\2\2\u0089\u008a\7\3\2\2\u008a\u008e\5\6\4\2\u008b\u008d\7#\2\2"+
		"\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0095\7\4\2\2\u0092"+
		"\u0094\7#\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u009c\5\66\34\2\u0099\u009b\5\36\20\2\u009a\u0099\3\2\2\2\u009b\u009e"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009f\u00a1\5 \21\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a5\3\2\2\2\u00a2\u00a4\7#\2\2\u00a3\u00a2\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\7\2\2\u00a9\35\3\2\2\2\u00aa\u00ab"+
		"\7\5\2\2\u00ab\u00af\5\6\4\2\u00ac\u00ae\7#\2\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b6\7\4\2\2\u00b3\u00b5\7#\2\2\u00b4"+
		"\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\5\66\34\2\u00ba"+
		"\37\3\2\2\2\u00bb\u00bf\7\6\2\2\u00bc\u00be\7#\2\2\u00bd\u00bc\3\2\2\2"+
		"\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2"+
		"\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\5\66\34\2\u00c3!\3\2\2\2\u00c4"+
		"\u00c5\7\n\2\2\u00c5\u00c9\5\6\4\2\u00c6\u00c8\7#\2\2\u00c7\u00c6\3\2"+
		"\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00d0\7\13\2\2\u00cd\u00cf\7"+
		"#\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d7\5\66"+
		"\34\2\u00d4\u00d6\7#\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00da\u00db\7\f\2\2\u00db#\3\2\2\2\u00dc\u00dd\7\b\2\2\u00dd\u00e0"+
		"\7<\2\2\u00de\u00df\7\t\2\2\u00df\u00e1\5:\36\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e5\3\2\2\2\u00e2\u00e4\7#\2\2\u00e3\u00e2\3\2"+
		"\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ec\7\13\2\2\u00e9\u00eb\7"+
		"#\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f3\5\66"+
		"\34\2\u00f0\u00f2\7#\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f6\u00f7\7\f\2\2\u00f7%\3\2\2\2\u00f8\u00f9\7\r\2\2\u00f9\u00fd"+
		"\7=\2\2\u00fa\u00fc\7#\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u0100\u0104\7\t\2\2\u0101\u0103\7#\2\2\u0102\u0101\3\2\2\2\u0103"+
		"\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u010a\3\2"+
		"\2\2\u0106\u0104\3\2\2\2\u0107\u0109\5(\25\2\u0108\u0107\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7\16\2\2\u010e\'\3\2\2\2\u010f\u0110"+
		"\5*\26\2\u0110\u0114\7\33\2\2\u0111\u0113\7#\2\2\u0112\u0111\3\2\2\2\u0113"+
		"\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2"+
		"\2\2\u0116\u0114\3\2\2\2\u0117\u0119\5\66\34\2\u0118\u011a\7\24\2\2\u0119"+
		"\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011e\3\2\2\2\u011b\u011d\7#"+
		"\2\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f)\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0126\7=\2\2\u0122"+
		"\u0123\7\21\2\2\u0123\u0125\7=\2\2\u0124\u0122\3\2\2\2\u0125\u0128\3\2"+
		"\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127+\3\2\2\2\u0128\u0126"+
		"\3\2\2\2\u0129\u012d\7\34\2\2\u012a\u012c\7#\2\2\u012b\u012a\3\2\2\2\u012c"+
		"\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2"+
		"\2\2\u012f\u012d\3\2\2\2\u0130\u0134\5\66\34\2\u0131\u0133\7#\2\2\u0132"+
		"\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\7\35\2\2\u0138"+
		"-\3\2\2\2\u0139\u013d\7\32\2\2\u013a\u013c\7#\2\2\u013b\u013a\3\2\2\2"+
		"\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140"+
		"\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0144\5\66\34\2\u0141\u0143\7#\2\2"+
		"\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\7\33\2\2"+
		"\u0148/\3\2\2\2\u0149\u014a\7\17\2\2\u014a\u014f\7<\2\2\u014b\u014c\7"+
		"<\2\2\u014c\u014d\7\32\2\2\u014d\u014f\7\33\2\2\u014e\u0149\3\2\2\2\u014e"+
		"\u014b\3\2\2\2\u014f\u0153\3\2\2\2\u0150\u0152\7#\2\2\u0151\u0150\3\2"+
		"\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157\5\62\32\2\u0157\61\3\2"+
		"\2\2\u0158\u015b\5,\27\2\u0159\u015b\5\32\16\2\u015a\u0158\3\2\2\2\u015a"+
		"\u0159\3\2\2\2\u015b\63\3\2\2\2\u015c\u015d\7<\2\2\u015d\u0169\7\20\2"+
		"\2\u015e\u016a\7=\2\2\u015f\u0161\78\2\2\u0160\u0162\7B\2\2\u0161\u0160"+
		"\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u016a\78\2\2\u0164"+
		"\u0166\7\67\2\2\u0165\u0167\7@\2\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2"+
		"\2\2\u0167\u0168\3\2\2\2\u0168\u016a\7\67\2\2\u0169\u015e\3\2\2\2\u0169"+
		"\u015f\3\2\2\2\u0169\u0164\3\2\2\2\u016a\65\3\2\2\2\u016b\u016d\5\6\4"+
		"\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0174\3\2\2\2\u016e\u0170"+
		"\58\35\2\u016f\u0171\5\6\4\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u0173\3\2\2\2\u0172\u016e\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2"+
		"\2\2\u0174\u0175\3\2\2\2\u0175\67\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0179"+
		"\7#\2\2\u0178\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u0178\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\u0184\3\2\2\2\u017c\u0180\7\24\2\2\u017d\u017f\7"+
		"#\2\2\u017e\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0178\3\2"+
		"\2\2\u0183\u017c\3\2\2\2\u01849\3\2\2\2\u0185\u0187\7=\2\2\u0186\u0185"+
		"\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		";\3\2\2\2\64?LV_bfmqs\177\u0087\u008e\u0095\u009c\u00a0\u00a5\u00af\u00b6"+
		"\u00bf\u00c9\u00d0\u00d7\u00e0\u00e5\u00ec\u00f3\u00fd\u0104\u010a\u0114"+
		"\u0119\u011e\u0126\u012d\u0134\u013d\u0144\u014e\u0153\u015a\u0161\u0166"+
		"\u0169\u016c\u0170\u0174\u017a\u0180\u0183\u0188";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}