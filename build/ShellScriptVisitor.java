// Generated from ShellScript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ShellScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ShellScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ShellScriptParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(ShellScriptParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShellScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ShellScriptParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShellScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ShellScriptParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShellScriptParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(ShellScriptParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShellScriptParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(ShellScriptParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShellScriptParser#echoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEchoStatement(ShellScriptParser.EchoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShellScriptParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ShellScriptParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShellScriptParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(ShellScriptParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShellScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ShellScriptParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShellScriptParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator(ShellScriptParser.ComparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShellScriptParser#valueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueList(ShellScriptParser.ValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShellScriptParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ShellScriptParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShellScriptParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpr(ShellScriptParser.ArithmeticExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShellScriptParser#arithmeticOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperation(ShellScriptParser.ArithmeticOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShellScriptParser#arithmeticTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticTerm(ShellScriptParser.ArithmeticTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShellScriptParser#arithmeticFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticFactor(ShellScriptParser.ArithmeticFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShellScriptParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ShellScriptParser.VariableContext ctx);
}