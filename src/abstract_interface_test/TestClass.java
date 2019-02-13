package abstract_interface_test;

public class TestClass extends AbstractClassB implements InterfaceA {

	public static void main(String[] args) {

		new TestClass().someMethod();
	}

//	@Override
//	public void someMethod() {
//		System.out.println("In TestClass");
//
//	}

}
