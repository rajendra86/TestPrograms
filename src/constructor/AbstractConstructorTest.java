package constructor;

public class AbstractConstructorTest extends AbstractClass {
	AbstractConstructorTest() {
		System.out.println("In Child");
	}

	public static void main(String[] args) {
		AbstractConstructorTest child = new AbstractConstructorTest();
		
	}

}
