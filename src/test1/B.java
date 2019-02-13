package test1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class B extends A {
	static int AAA = 10;
	int silly = 0;

	public B() {
		System.out.println("Child");
		start();
		silly = 20;

		AAA = 10;
	}

	public ArrayList<String> start() {

		System.out.println("TestB");
		return null;

	}

	public enum Color {
		RED(0xff0000), GREEN(0x00ff00), BLUE(0x0000ff);

		Color(int rgb) {
			this.rgb = rgb;
		}

		private final int rgb;

		public int getRGB() {
			return rgb;
		}
	}

	// public String sayHello(String name) throws One {
	//
	// if (name == null) {
	// throw new One();
	// }
	//
	// return "Hello " + name;
	// }

	public void process() {
		// int count = AAA +1;
		// System.out.println("B," + count);
		// throw new RuntimeException();

		System.out.println("In Child Class");
	}

	public static void sayHello() {
		System.out.println("Hello ");
	}

	public static void main(String[] args) throws Exception {
		B bbb = new B();
		A a1 = bbb;
		a1.process();

		//
		// // ((A)new B()).start();
		// Color treeColor = Color.GREEN;

		// new Three();
		// B b = new B();
		// System.out.println(b.sayHello("John"));

		// A aa = new B();
		// new B().process();
		// aa.process();
		int a = 10;
		try {
			// ((A) new B()).process();
			// int b = a / 0;
			// System.out.println("hello");
			A aa = new A();
			B b = new B();
			A aaa = new B();

			aa.start();
			b.start();
			aaa.start();
		} catch (Exception e) {
			System.out.println("Exception");
		}

		// String[] aaa;
		// aaa = null; // null reference
		// aaa[0] = "hai"; //null reference
		// System.out.println(aaa[0]);

		// try{
		// args = null;
		// args[0] = "test";
		// System.out.println(args[0]);
		// }catch(NullPointerException npe){
		//
		// }catch(Exception e){
		//
		// }

		int ii = 10;
		// Integer ii = new Integer(10);
		Integer iI = new Integer(10);

		if (iI == ii) {
			System.out.println("Both are equal!!!");
		} else {
			System.out.println("Both are not equal!!!");
		}

		String ss = new String("NS");
		ss.intern();

		StringTokenizer strToken = new StringTokenizer("Hello/how/are/you");
		System.out.println(strToken.nextToken("/"));

		String s1 = new String("Hai");
		String s2 = new String("Hai");

		if (s1.equals(s2)) {
			System.out.println("Both are equal!!!");
			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());
		} else {
			System.out.println("Both are not equal!!!");

			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());
		}

		ArrayList<String> strList = new ArrayList<String>();
		Iterator<String> it = strList.iterator();

	}
}
