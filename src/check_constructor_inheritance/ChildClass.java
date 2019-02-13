package check_constructor_inheritance;

public class ChildClass extends ParentClass {

	ChildClass() {
		super(10);

	}

	public Integer someParent(Number n) {
		return new Integer(10);
	}

	public static void main(String[] args) {

		ParentClass ch = new ChildClass();
		ParentClass pa = new ParentClass(100);
		System.out.println(ch.someParent(200));
		// System.out.println(5 ^ 5 ^ 3 ^ 6 ^ 6 ^ 9 ^ 2 ^ 9 ^ 3);

	}
}
