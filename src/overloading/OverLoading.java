package overloading;

public class OverLoading {

	public static void main(String[] args) {
		// new OverLoading().someMethod("1");

		Integer n = new Integer(10);

		new OverLoading().someMethod(n);

	}

	public void someMethod(Integer a, Integer b) {
		System.out.println("Number");
		//return 1;
	}
		
	public void someMethod(Integer d) {
		System.out.println("Integer");
		// return null;
	}

	public void someMethod(String s) {
		System.out.println("String");
		// return null;
	}

	public float someMethod(float a, float b) {
		return 1;
	}
}
