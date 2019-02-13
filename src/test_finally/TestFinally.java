package test_finally;

import java.io.IOException;

public class TestFinally {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		System.out.println(testMethod());
	}

	public static int testMethod() throws IOException {
		try {
			System.out.print("hai");
			int i=10/0;
		} finally {
			System.out.print("hello");
		}

		return 1;
	}

}
