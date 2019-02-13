package test1;

public class ClassA {
	int a;

	ClassA(int a) {
		this.a = a;
	}

	public ClassA() {
		a = 0;
	}

	public String noise() {
		return "peep";
	}

	public final int hello(int a) {
		return 0;
	}

	public static void main(String[] args) {
		ClassA p0 = new ClassA();
		ClassB p1 = new ClassB();
		ClassC p2 = new ClassC();
		ClassA p3 = new ClassB();
		ClassA p4 = new ClassC();

		p2 = (ClassC) p4;
		p1 = (ClassB) p3;
		ClassA a0 = new ClassB();
		// ClassC c0 = (ClassC) a0;
		System.out.println(p4.noise());

		Integer i2 = new Integer(25);
		Integer starting;
		starting = i2;
		i2 = i2.intValue();
		if (i2.equals(starting)) {
			System.out.println("yo");
		} else {
			System.out.println("Aiyyo");
		}

	}
}

class ClassB extends ClassA {

	ClassB() {
		a = 5;
		System.out.print(a);
		// super(7);
	}

	ClassB(int b) {
		// super(b);
	}

	public int hello() {
		return 0;
	}

	public String noise() {
		return "Bark";
	}

	public static void main(String[] args) {
		ClassB b = new ClassB();

	}
}

class ClassC extends ClassA {

	public String noise() {
		return "Meow";
	}
}
