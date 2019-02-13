package inheritancemethodoverriding;

public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A aa = new A();
		B bb = new B();
		C cc = new C();
		
		cc.someOtherMethod();
		bb.someMethod();

	}

}
