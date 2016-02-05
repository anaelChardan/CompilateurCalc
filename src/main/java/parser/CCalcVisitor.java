// Generated from /Users/Ananas/Documents/FIL/IntelliJ/SELP/calc2c/src/main/java/parser/CCalc.g4 by ANTLR 4.1
package parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CCalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CCalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CCalcParser#CondExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExp(@NotNull CCalcParser.CondExpContext ctx);

	/**
	 * Visit a parse tree produced by {@link CCalcParser#BooLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooLit(@NotNull CCalcParser.BooLitContext ctx);

	/**
	 * Visit a parse tree produced by {@link CCalcParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(@NotNull CCalcParser.BodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link CCalcParser#BinExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinExp(@NotNull CCalcParser.BinExpContext ctx);

	/**
	 * Visit a parse tree produced by {@link CCalcParser#VariaLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariaLit(@NotNull CCalcParser.VariaLitContext ctx);

	/**
	 * Visit a parse tree produced by {@link CCalcParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(@NotNull CCalcParser.DefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CCalcParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull CCalcParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link CCalcParser#IntLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLit(@NotNull CCalcParser.IntLitContext ctx);

	/**
	 * Visit a parse tree produced by {@link CCalcParser#ParExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExp(@NotNull CCalcParser.ParExpContext ctx);

	/**
	 * Visit a parse tree produced by {@link CCalcParser#UnaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExp(@NotNull CCalcParser.UnaryExpContext ctx);
}