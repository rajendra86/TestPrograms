package test1;

import java.io.IOException;
import java.util.Scanner;

public class TestException {

	public void test1() throws IOException {
		System.out.println("Test1");

		// try {
		throw new IOException();
		// } catch (IOException e) {
		// e.printStackTrace();
		// System.out.println("Exception ");
		// }
	}

	public void test2() {
		System.out.println("Test2");
		try {
			new TestException().test1();
		} catch (IOException e) {
			System.out.println("Exception ");
			e.printStackTrace();
		}
	}

	int i = 0;

	public int addOne() {
		return ++i;
	}

	public static void main(String[] args) throws IOException {
		// System.out.println("Main");

		// new TestException().test2();
		System.out.print(new TestException().addOne());
		
		String test = "Sue,5,true,3";// "Test A. Test B. Test C.";//"a1b2c3";
		String[] tokens = test.split("\\.\\s*");

		// for (int i = 0; i < tokens.length; i++) {
		// System.out.println(tokens[i]);
		// }
		// System.out.println(tokens.length);
		Scanner s = new Scanner(test);
		s.useDelimiter(",");

	}
}
