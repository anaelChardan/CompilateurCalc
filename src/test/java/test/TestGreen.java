package test;

public class TestGreen extends Test {
	/**
	 * Entry point. Executes all the tests. 
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		boolean verbose = true;

		String path = "src/test/resources";


		test(verbose, path + "/green1.calc", "number", "1234567890");
		test(verbose, path + "/green2.calc", "addition", "2");
		test(verbose, path + "/green3.calc", "arithmetic expression with priority", "7");
		test(verbose, path + "/green4.calc", "unary minus", "-4");
		test(verbose, path + "/green5.calc", "boolean", "0");
		test(verbose, path + "/green6.calc", "boolean expression", "1");
		test(verbose, path + "/green7.calc", "boolean expression with priority", "1");
		test(verbose, path + "/green8.calc", "boolean expression with explicit priority", "0");
		test(verbose, path + "/green9.calc", "unary not", "1");
		test(verbose, path + "/green10.calc", "conditional", "12");
		test(verbose, path + "/green11.calc", "conditional", "21");
		test(verbose, path + "/green12.calc", "comparison", "1");
		test(verbose, path + "/green13.calc", "nested conditionals", "2");
		test(verbose, path + "/green14.calc", "unequality", "1");
		test(verbose, path + "/green15.calc", "equality", "0");
		test(verbose, path + "/green16.calc", "equality", "error");
		test(verbose, path + "/green17.calc", "nested divisisons", "1");
		test(verbose, path + "/green18.calc", "minus mix", "2");
		test(verbose, path + "/green19.calc", "parenthesized number", "2");
		test(verbose, path + "/green20.calc", "erroneous expression", "error");
		test(verbose, path + "/green21.calc", "garbage", "error");
		test(verbose, path + "/green22.calc", "garbage", "error");
		test(verbose, path + "/green23.calc", "erroneous conditional", "error");
		test(verbose, path + "/green24.calc", "erroneous conditional/garbage", "error");
		test(verbose, path + "/green25.calc", "division by zero", "error");
		test(verbose, path + "/green26.calc", "division by zero", "error");
		test(verbose, path + "/green27.calc", "erroneous number", "error");
		report();
	}
}
