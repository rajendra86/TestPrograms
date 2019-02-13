package access_modifiers_1;

import access_modifiers_2.Child2;

public class Parent {
	protected String str = "Hello";

	protected void print() throws CloneNotSupportedException {
		//super.clone();
		
		System.out.println("In Parent " + str);
		
	}
}
