package inheritancemethodoverriding;

public class B extends A {
	
	public void someMethod() {
		System.out.println("In Class B - someMethod()");
	}
	
	public static void main (String... args) {
		A aa = new A() {
			public void someMethod(){
				System.out.println("In Class B Inner - someMethod()");
			}
		};
		aa.someMethod();
	}
}
