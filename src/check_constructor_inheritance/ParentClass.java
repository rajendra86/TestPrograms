package check_constructor_inheritance;

public class ParentClass {

	ParentClass(int a) {
		System.out.println("In Parent");
	}

	public Number someParent(Number n) {
		return new Integer(200);
	}
}
