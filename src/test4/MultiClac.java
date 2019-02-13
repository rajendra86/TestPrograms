package test4;

class SimpleCalc {
	int value;

	public SimpleCalc() {
		value = 1;
	}

	public SimpleCalc(int a) {
		// value = 1;
	}

	public void calculate() {
		System.out.println(value);
		value += 7;
	}
}

public class MultiClac extends SimpleCalc {
	String title;
	int a;
	float[] test = new float[3];

	// int value;

	public MultiClac() {
		// value = 2;
		// super(5);
		title += "World";
	}

	public MultiClac(int value) {
		// this();
		// super(value);
		this.value = value;
		title = "Hello";
	}

	public Inner someOuterMethod() {
		return new Inner();
	}

	public static class Inner {

		public void hello() {
			System.out.println("hello from Inner class");
			foo('a');
		}

		public int methoda() {
			return 0;
		}
	};

	public void calculate(int multiplier) {
		// calculate();
		// super.calculate();
		calculate();
		value *= multiplier;
	}

	static boolean foo(char c) {
		System.out.print(c);
		return true;
	}

	static void modify(int[] a) {
		a[0]++;
	}

	public static void main(String[] args) {
		int i = 10, x = 5, y = 6;
		// for (foo('A'); foo('B') && (i < 2); foo('C')) {
		// i++;
		// foo('D');
		// }

		MultiClac cal = new MultiClac();
		SimpleCalc cl = cal;
		MultiClac.Inner ni = new MultiClac.Inner();

		// calculator.calculate(2);
		// System.out.println("Value is: " + calculator.value);

		// MultiClac m = new MultiClac();
		// Inner mi = m.someOuterMethod();
		// mi.hello();
		// MultiClac.Inner mii = m.new Inner();

		// Float[] test;// = new float[3];
		System.out.println(cal.test[0] + " " + cal.title + " " + cal.a);
		int[] a = new int[1];
		modify(a);
		System.out.println(a[0]);
		System.out.println(cal.toString() + " " + cal.hashCode());
		System.out.println(cal.getClass().getSuperclass().getSimpleName());
		assert (x > y) : "x:" + x;

	}
}
