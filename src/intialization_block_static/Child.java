package intialization_block_static;

public class Child extends Parent {
	static {
		System.out.println("Child!!");
	}

	{
		System.out.println("Instance Child");
	}

	public static void main(String[] args) {
		System.out.println("Hello World from Child!!!");

		Child ch = new Child();
		
		Child ch1 = new Child();

	}

}
