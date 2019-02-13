package intialization_block_static;

public class Parent {
	static {

		System.out.println("In Parent!!!");
	}
	
	{
		System.out.println("Parent instance block");
	}
}
