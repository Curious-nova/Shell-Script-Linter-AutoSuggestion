// Generated from ShellParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ShellParser}.
 */
public interface ShellParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ShellParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(ShellParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(ShellParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#complete_command}.
	 * @param ctx the parse tree
	 */
	void enterComplete_command(ShellParser.Complete_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#complete_command}.
	 * @param ctx the parse tree
	 */
	void exitComplete_command(ShellParser.Complete_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(ShellParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(ShellParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#list_item}.
	 * @param ctx the parse tree
	 */
	void enterList_item(ShellParser.List_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#list_item}.
	 * @param ctx the parse tree
	 */
	void exitList_item(ShellParser.List_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#pipeline}.
	 * @param ctx the parse tree
	 */
	void enterPipeline(ShellParser.PipelineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#pipeline}.
	 * @param ctx the parse tree
	 */
	void exitPipeline(ShellParser.PipelineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#pipeline_item}.
	 * @param ctx the parse tree
	 */
	void enterPipeline_item(ShellParser.Pipeline_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#pipeline_item}.
	 * @param ctx the parse tree
	 */
	void exitPipeline_item(ShellParser.Pipeline_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(ShellParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(ShellParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#simple_command}.
	 * @param ctx the parse tree
	 */
	void enterSimple_command(ShellParser.Simple_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#simple_command}.
	 * @param ctx the parse tree
	 */
	void exitSimple_command(ShellParser.Simple_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#cmd_name}.
	 * @param ctx the parse tree
	 */
	void enterCmd_name(ShellParser.Cmd_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#cmd_name}.
	 * @param ctx the parse tree
	 */
	void exitCmd_name(ShellParser.Cmd_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#cmd_prefix}.
	 * @param ctx the parse tree
	 */
	void enterCmd_prefix(ShellParser.Cmd_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#cmd_prefix}.
	 * @param ctx the parse tree
	 */
	void exitCmd_prefix(ShellParser.Cmd_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#cmd_suffix}.
	 * @param ctx the parse tree
	 */
	void enterCmd_suffix(ShellParser.Cmd_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#cmd_suffix}.
	 * @param ctx the parse tree
	 */
	void exitCmd_suffix(ShellParser.Cmd_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#redirect}.
	 * @param ctx the parse tree
	 */
	void enterRedirect(ShellParser.RedirectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#redirect}.
	 * @param ctx the parse tree
	 */
	void exitRedirect(ShellParser.RedirectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#compound_command}.
	 * @param ctx the parse tree
	 */
	void enterCompound_command(ShellParser.Compound_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#compound_command}.
	 * @param ctx the parse tree
	 */
	void exitCompound_command(ShellParser.Compound_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(ShellParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(ShellParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#elif_part}.
	 * @param ctx the parse tree
	 */
	void enterElif_part(ShellParser.Elif_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#elif_part}.
	 * @param ctx the parse tree
	 */
	void exitElif_part(ShellParser.Elif_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#else_part}.
	 * @param ctx the parse tree
	 */
	void enterElse_part(ShellParser.Else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#else_part}.
	 * @param ctx the parse tree
	 */
	void exitElse_part(ShellParser.Else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(ShellParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(ShellParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(ShellParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(ShellParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(ShellParser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(ShellParser.Case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#case_item}.
	 * @param ctx the parse tree
	 */
	void enterCase_item(ShellParser.Case_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#case_item}.
	 * @param ctx the parse tree
	 */
	void exitCase_item(ShellParser.Case_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#pattern_list}.
	 * @param ctx the parse tree
	 */
	void enterPattern_list(ShellParser.Pattern_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#pattern_list}.
	 * @param ctx the parse tree
	 */
	void exitPattern_list(ShellParser.Pattern_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#brace_group}.
	 * @param ctx the parse tree
	 */
	void enterBrace_group(ShellParser.Brace_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#brace_group}.
	 * @param ctx the parse tree
	 */
	void exitBrace_group(ShellParser.Brace_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#subshell}.
	 * @param ctx the parse tree
	 */
	void enterSubshell(ShellParser.SubshellContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#subshell}.
	 * @param ctx the parse tree
	 */
	void exitSubshell(ShellParser.SubshellContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(ShellParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(ShellParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(ShellParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(ShellParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void enterVariable_assignment(ShellParser.Variable_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void exitVariable_assignment(ShellParser.Variable_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#list_sequence}.
	 * @param ctx the parse tree
	 */
	void enterList_sequence(ShellParser.List_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#list_sequence}.
	 * @param ctx the parse tree
	 */
	void exitList_sequence(ShellParser.List_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#separator}.
	 * @param ctx the parse tree
	 */
	void enterSeparator(ShellParser.SeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#separator}.
	 * @param ctx the parse tree
	 */
	void exitSeparator(ShellParser.SeparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(ShellParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(ShellParser.Argument_listContext ctx);
}