package test1;

import java.io.IOException;

public class TestDeclare implements DeclareStuff {

	public void doStuff(int t) {
		// // TODO Auto-generated method stub
		t += EASY + ++t;
		System.out.println("t" + t);
	}

	public final int d = 10;
	private int weight;

	public TestDeclare(int wt) {
		weight = wt;
	}

	public void setWeight(int w) {
		weight = w;
	}

	public String toString() {
		return Integer.toString(weight);
	}

	public void soundOff() {
		System.out.println("TestDeclare");
	}

	public static void main(String[] args) {
		int x = 5;
		String s = "";
		System.out.print(s);

		// new TestDeclare().doStuff(++x);
		String[] a = { "1", "2", "3", "4" };
		// {"java" ,"Counter", "one" ,"fred", "42"};
		// System.out.println(a.length + a[1]);
		// TestDeclare tc = new TestDeclare();
		int i = 0, j = 5, min = 5;

		// do {
		// System.out.print(i++);
		// } while (i < max);

	}
}

class TestPayload implements DeclareStuff {
	static void changePayload(TestDeclare tc) {
		tc = new TestDeclare(420);
		tc.setWeight(420);
	}

	public String testIt() {
		return "Tested";
	}

	public void soundOff() {
		System.out.println("Testpayload");
	}

	public static void main(String[] args) {
		TestDeclare tc = new TestDeclare(1024);
		tc.setWeight(104);
		changePayload(tc);
		System.out.println("The value of p is " + tc.toString());
	}
}

class Main1 {
	static DeclareStuff getIt() {
		return new TestPayload();
	}

	static DeclareStuff get(String choice) {
		if (choice.equalsIgnoreCase("meat eater")) {
			return new TestDeclare(3);
		} else {
			return new TestPayload();
		}
	}

	public static void main(String[] args) throws IOException {
		DeclareStuff dc = getIt();
		Main1.get("meat eater").soundOff();

		// System.out.print(dc.testIt());
	}
}
