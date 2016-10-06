package test;

import ccalc.CCalc;

public class TestSyntax {
	static int count = 0;
	static int success = 0;
	
	public static void report(){
		System.out.println(success + " successful tests out of " + count);
	}

	public static void test(String filename, boolean wellFormed){
		String[] args0 = new String[1];
		args0[0] = filename;
		System.out.println("====: " + filename);
		try {		
			count++;
			CCalc.main(args0);
			if (wellFormed) success++;
			else System.err.println("FAILURE");
		} catch(Exception e){
			if (!wellFormed) success++;
			else System.err.println("FAILURE");
			e.printStackTrace();
		}		
	}
	public static void main(String[] args){
		String path = "src/test/resources";

		//test( path + "/green1.calc", true);
		//test( path + "/green2.calc", true);
		//test( path + "/green3.calc", true);
		//test( path + "/green4.calc", true);
		//test( path + "/green5.calc", true);
		//test( path + "/green6.calc", true);
		//test( path + "/green7.calc", true);
		//test( path + "/green8.calc", true);
		//test( path + "/green9.calc", true);
		//test( path + "/green10.calc", true);
		//test( path + "/green11.calc", true);
		//test( path + "/green12.calc", true);
		//test( path + "/green13.calc", true);
		//test( path + "/green14.calc", true);
		//test( path + "/green15.calc", true);
		//test( path + "/green16.calc", true);
		//test( path + "/green17.calc", true);
		//test( path + "/green18.calc", true);
		//test( path + "/green19.calc", true);
		//test( path + "/green21.calc", false);
		//test( path + "/green22.calc", false);
		//test( path + "/green23.calc", false);
		//test( path + "/green24.calc", false);
		//test( path + "/green25.calc", true);
		//test( path + "/green26.calc", true);
		//test( path + "/green27.calc", false);
		
		//test(path + "/blue1.calc", true);
		//test(path + "/blue2.calc", true);
		//test(path + "/blue3.calc", true);
		//test(path + "/blue4.calc", true);
		//test(path + "/blue5.calc", true);
		//test(path + "/blue6.calc", true);
		//test(path + "/blue7.calc", true);
		//test(path + "/blue8.calc", false);
		
		//test("test/red1.calc", true);
		//test("test/red2.calc", true);
		//test("test/red3.calc", true);
		//test("test/red4.calc", true);
		//test("test/red5.calc", true);
		//test("test/red6.calc", true);
		//test("test/red10.calc", true);
		report();
	}
}

