package access_modifiers_2;

import access_modifiers_1.Parent;

public class Child extends Parent {

	public static void main(String[] args) throws CloneNotSupportedException {
		Parent parent = new Parent();
		Child child = new Child();

		child.print();
		//parent.print();//compilation error
		System.out.println(child.str);
		
		
	}
}
