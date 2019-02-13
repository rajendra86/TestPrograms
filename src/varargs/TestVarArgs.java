package varargs;

import java.util.Arrays;

public class TestVarArgs {

	public TestVarArgs() {
		System.out.println("In Constructor");
	}
	public static void main(String... args) {
		TestVarArgs test = new TestVarArgs();
		test.getSessionContext();
	}

	protected void getSessionContext(String... str) {

		System.out.println("Inside method!!!!");

		try {
			testMethod();
		} catch (Exception exe) {
			String trace = Arrays.toString(Thread.currentThread()
					.getStackTrace());
			System.out.println(trace);
		}

	}

	public static void testMethod() throws Exception {

		
		//throw new NullPointerException("Nullpointer");
		Thread.currentThread();
		Thread.dumpStack();
	}

}
