package inheritancemethodoverriding;

public class C extends A {
	
	public void someOtherMethod() {
		super.someOtherMethod();
		System.out.println("In Class C - someOtherMethod()");
	}
}
