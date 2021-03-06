package parser;

import ast.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ASTVisitor extends CCalcBaseVisitor<AST> {
	public AST visitProgram(CCalcParser.ProgramContext ctx) {
        // retrieve ASTs for functions
//        List<CCalcParser.FunctionContext> functionCtxs = ctx.function();
//        List<Function> functions = new ArrayList<Function>();
//        for (CCalcParser.FunctionContext functionCtx : functionCtxs)
//          functions.add((Function)visit(functionCtx));
        // retrieve AST for body
        Body body = (Body)visit(ctx.body());
        // return AST for program
//        return new Program(functions, body);
        return new Program(body);
	}
	
	public AST visitBody(CCalcParser.BodyContext ctx) {
		List<Definition> definitionList = new ArrayList<Definition>();
		for (CCalcParser.DefinitionContext def : ctx.definition())
		{
			definitionList.add((Definition)visit(def));
		}
		Expression expr = (Expression)visit(ctx.expression()); 
		return new Body(expr, definitionList);
	}

	public AST visitIntLit(CCalcParser.IntLitContext ctx) {
		return new IntLit(Integer.parseInt(ctx.getText()));
	}

    public AST visitBooLit(CCalcParser.BooLitContext ctx) {
        return new BooLit(Boolean.parseBoolean(ctx.getText()));
    }

	public AST visitParExp(CCalcParser.ParExpContext ctx) {
		Expression expr = (Expression)visit(ctx.expression());
		return new ParExp(expr);
	}

    public AST visitBinExp(CCalcParser.BinExpContext ctx)
	{
        Expression expr1 = (Expression)visit(ctx.getChild(0));
		Operator operator = Operator.fromString(ctx.getChild(1).getText());
		Expression expr2 = (Expression)visit(ctx.getChild(2));
        return new BinExp(expr1, operator, expr2);
    }

	public AST visitUnaryExp(CCalcParser.UnaryExpContext ctx)
	{
		UnaryOperator unaryOperator = UnaryOperator.fromString(ctx.getChild(0).getText());
		Expression expr = (Expression)visit(ctx.expression());
		return new UnaryExp(unaryOperator, expr);
	}

	public AST visitCondExp(CCalcParser.CondExpContext ctx)
	{
		Expression expression1 = (Expression)visit(ctx.getChild(0));
		Expression expression2 = (Expression)visit(ctx.getChild(2));
		Expression expression3 = (Expression)visit(ctx.getChild(4));
		return new CondExp(expression1, expression2, expression3);
	}

	public AST visitVariaLit(@NotNull CCalcParser.VariaLitContext ctx) {
		return new VarialIt(ctx.getText());
	}

	public AST visitDefinition(@NotNull CCalcParser.DefinitionContext ctx) {
		return new Definition(ctx.VARIABLE().toString(), (Expression)visit(ctx.expression()));
	}
}