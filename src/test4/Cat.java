package test4;

public class Cat extends Animal {
	/**
	 * @param args
	 */

	public static void testClassMethod() {
		System.out.println("The class method" + " in Cat.");
	}

	public void testInstanceMethod() {
		// super.testInstanceMethod();
		System.out.println("The instance method" + " in Cat.");
	}

	public static void main(String[] args) {
		Animal myAnimal1 = new Animal();
		Animal myAnimal = new Cat();
		Cat cat =  (Cat) myAnimal;

		myAnimal1.testInstanceMethod();
		Animal.testClassMethod();

		myAnimal.testInstanceMethod();
		Animal.testClassMethod();
		cat.testInstanceMethod();
		// Cat.test1ClassMethod();
		// Cat.testClassMethod();
	}
}
