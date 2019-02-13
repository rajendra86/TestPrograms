package test;

import java.io.IOException;

public class ExceptionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	class SuperClass {
		public void method() throws NullPointerException, IOException{

		}
	}

	class SubClass extends SuperClass {
		public void method() throws IOException {

		}
	}
}
