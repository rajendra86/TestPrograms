package innerclass_test;

public class HigherClass {

	protected static class Inner {

	}

	public static void main(String[] args) {
		HigherClass high = new HigherClass();
		Inner in = new HigherClass.Inner();
		
		
	}
}
