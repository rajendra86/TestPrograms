package test2;

import java.io.UnsupportedEncodingException;

public class TestClass {
	/**
	 * @param args
	 * @throws UnsupportedEncodingException
	 * @throws ClassNotFoundException
	 * @throws CloneNotSupportedException
	 */

	// Initializer Blocks
	public int count = initializeVar();
	private static int scount;

	// {
	// count = 10;
	// }

	static {
		scount = 20;
	}

	public final int initializeVar() {
		return 10;
	}

	//Inner Class
	public class Inner {
		int count1 = 11;
		
		public void calculate() {
			System.out.println(count + count1);
		}
	}
	
	public static class InnerStat {
		TestClass ts = new TestClass();		
		public static void cal() {
			System.out.println(scount);			
		}
		
		public void cala() {
			System.out.println(scount);			
		}
	}

	//A Static Method
	public static void hello(int a){
		System.out.println("Hello");
	}
	
	public static int hello(int a,int b){
		System.out.println("Hello " + a);
		return a;
	}
	
	public static void main(String[] args) throws UnsupportedEncodingException,
			ClassNotFoundException {
				
	System.out.println(Integer.toHexString(16) + " " + Integer.MAX_VALUE);
		
		//Testing Inner Classes  - Static and NonStatic - Start
		TestClass test = new TestClass();
		System.out.println("Count-->  " + test.count + " Static Count--> "
				+ TestClass.scount);
		Inner inn = test.new Inner();
		inn.calculate();
		InnerStat inns = new InnerStat();
		inns.cala();
		TestClass.InnerStat.cal();
		//Testing Inner Classes  - Static and NonStatic - Start
		
//		// Testing String pool - Start
//		String a = "abcefg";
//		String b = "act";
//		System.out.println("is a==b " + (a == b) + " a--> " + a.hashCode()
//				+ " b--> " + b.hashCode());
//		System.out.println(" a--> " + a.hashCode() + " b--> " + b.hashCode());
//		// Testing String pool - End
//		Integer aa = new Integer(10);
//		Integer vv = new Integer(11);
//		System.out.println("is aa==vv " + (aa == vv) + " aa--> "
//				+ aa.hashCode() + " vv--> " + vv.hashCode());
//
//		char ch = 'b';
//		System.out.println(b
//				.contains(new StringBuilder().append(ch).toString()));
//		System.out.println(System.getProperty("java.class.path"));
//
//		System.out.println(14 >>> 2);
//		System.out.println(14 >> 2);
		// varargs method call
		// calculate(10,12);
	}

	// varargs method declaration
	static void calculate(int... str) {
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
