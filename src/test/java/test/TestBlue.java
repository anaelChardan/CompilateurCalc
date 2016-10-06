package test;

public class TestBlue extends Test {
	/**
	 * Entry point. Executes all the tests. 
	 * 
	 * @param args
	 */
	public static void main(String[] args){	
		boolean verbose = true;
		String path = "src/test/resources";
		test(verbose, path + "/blue1.calc", "one variable def", "102");
		test(verbose, path + "/blue2.calc", "one variable def and use", "101");
		test(verbose, path + "/blue3.calc", "two variable defs used in expression", "103");
		test(verbose, path + "/blue4.calc", "two variable defs with nested uses", "104");
		test(verbose, path + "/blue5.calc", "variable use without a def", "error");
		test(verbose, path + "/blue6.calc", "variable used before its def", "error");
		test(verbose, path + "/blue7.calc", "redefinition of a variable", "error");
		//FILE NOT FOUND
		//test(verbose, path + "/blue8.calc", "erroneous variable nameblue", "error");
		report();
	}
}
