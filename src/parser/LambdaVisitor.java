// Generated from /home/baba_beda/typeTheory/Lambda.g4 by ANTLR 4.5.3

    package parser;
    import expression.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LambdaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LambdaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LambdaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LambdaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LambdaParser#application}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplication(LambdaParser.ApplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LambdaParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(LambdaParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link LambdaParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(LambdaParser.VariableContext ctx);
}