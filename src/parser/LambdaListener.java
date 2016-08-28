// Generated from /home/baba_beda/typeTheory/Lambda.g4 by ANTLR 4.5.3

    package parser;
    import expression.*;
    import pattern.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LambdaParser}.
 */
public interface LambdaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LambdaParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(LambdaParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(LambdaParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LambdaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LambdaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LambdaParser#application}.
	 * @param ctx the parse tree
	 */
	void enterApplication(LambdaParser.ApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#application}.
	 * @param ctx the parse tree
	 */
	void exitApplication(LambdaParser.ApplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LambdaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(LambdaParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(LambdaParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link LambdaParser#numeral}.
	 * @param ctx the parse tree
	 */
	void enterNumeral(LambdaParser.NumeralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#numeral}.
	 * @param ctx the parse tree
	 */
	void exitNumeral(LambdaParser.NumeralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LambdaParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(LambdaParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(LambdaParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LambdaParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(LambdaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(LambdaParser.VariableContext ctx);
}