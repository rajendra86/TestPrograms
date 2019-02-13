package abstract_interface_test;

import java.util.List;

public class TestClass2 implements InterfaceA, InterfaceC {

	@Override
	public void someMethod() {

	}

	public static void main(String[] args) {
		List<Integer> list;
		
		InterfaceC test = new InterfaceC() {

			@Override
			public void someMethod() {
				System.out.println("In Anonymous class");

			}
		};
	}

}
