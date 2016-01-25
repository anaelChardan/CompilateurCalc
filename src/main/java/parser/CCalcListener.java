// Generated from /Users/Ananas/Documents/FIL/IntelliJ/SELP/calc2c/src/main/java/parser/CCalc.g4 by ANTLR 4.1
package parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CCalcParser}.
 */
public interface CCalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CCalcParser#BooLit}.
	 * @param ctx the parse tree
	 */
	void enterBooLit(@NotNull CCalcParser.BooLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCalcParser#BooLit}.
	 * @param ctx the parse tree
	 */
	void exitBooLit(@NotNull CCalcParser.BooLitContext ctx);

	/**
	 * Enter a parse tree produced by {@link CCalcParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(@NotNull CCalcParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCalcParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(@NotNull CCalcParser.BodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link CCalcParser#BinExp}.
	 * @param ctx the parse tree
	 */
	void enterBinExp(@NotNull CCalcParser.BinExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCalcParser#BinExp}.
	 * @param ctx the parse tree
	 */
	void exitBinExp(@NotNull CCalcParser.BinExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link CCalcParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull CCalcParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCalcParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull CCalcParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link CCalcParser#IntLit}.
	 * @param ctx the parse tree
	 */
	void enterIntLit(@NotNull CCalcParser.IntLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCalcParser#IntLit}.
	 * @param ctx the parse tree
	 */
	void exitIntLit(@NotNull CCalcParser.IntLitContext ctx);

	/**
	 * Enter a parse tree produced by {@link CCalcParser#ParExp}.
	 * @param ctx the parse tree
	 */
	void enterParExp(@NotNull CCalcParser.ParExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCalcParser#ParExp}.
	 * @param ctx the parse tree
	 */
	void exitParExp(@NotNull CCalcParser.ParExpContext ctx);
}