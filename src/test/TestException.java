package test;

public class TestException {

	/**
	 * @param args
	 */
	
	
	public void testMEthod(ChildException cex) {
		
		System.out.println(cex.getMessage());
	}
	
	public static void main(String[] args) {
		TestException test = new TestException();
		ChildChildException cex = new ChildChildException();
		Exception ex = new Exception();
		test.testMEthod(cex);
	}

}
