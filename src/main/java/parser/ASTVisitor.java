package parser;

import ast.*;
import org.antlr.v4.runtime.misc.NotNull;

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
		Expression expr = (Expression)visit(ctx.expression()); 
		return new Body(expr); 
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
		Expression expr = (Expression)visit(ctx.expression());
		System.out.println(expr.toString());
		return new UnaryExp(expr);
	}

	public AST visitCondExp(CCalcParser.CondExpContext ctx)
	{
		Expression expression1 = (Expression)visit(ctx.getChild(0));
		Expression expression2 = (Expression)visit(ctx.getChild(2));
		Expression expression3 = (Expression)visit(ctx.getChild(4));
		return new CondExp(expression1, expression2, expression3);
	}
}