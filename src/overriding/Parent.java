package overriding;

public class Parent {

	public static void someMethod() {
		System.out.println("In Parent Static method");
	}

	public void cal(String p) {
		System.out.println("cal");
	}

	public void cal2(String p, String b) {
		System.out.println("cal2");
	}
	
	protected void getSal() {
		System.out.println("sal");
	}

	public static void main(String[] args) {
		Parent p = new Child();

		p.getSal();

		// p.cal();
	}
}
