package overriding;

public class Child extends Parent {

	public static void someMethod() {
		System.out.println("In Child Static method");
	}

	public void cal(String c) {
		System.out.println("In Child Method!");
		
	}

	public void cal2(String b, String p) {
		System.out.println("cal2");
	}
	
	protected void getLastSal() {
		System.out.println("last sal");
	}

	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		p.getSal();

		Object b = new String("Hai");
		p.cal((String) b);

		p.someMethod();
		c.someMethod();

	}

}
