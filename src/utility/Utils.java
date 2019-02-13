package utility;

import varargs.TestVarArgs;

class DummyBean {
	private String dummy;

	public DummyBean() {

	}

	public DummyBean(DummyBean another) {
		this.dummy = another.dummy; // you can access
	}

	public void setDummy(String dummy) {
		this.dummy = dummy;
	}

	public String getDummy() {
		return this.dummy;
	}
}

public class Utils {
	public static final int aa;

	// public Utils() {
	// aa = 4;
	// }

	static {
		System.out.println("Initializer");
		aa = 8;
	}

	public static void main(String[] args) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		
		
		
		DummyBean one = new DummyBean();
		one.setDummy("Manish");
		DummyBean two = new DummyBean(one);
		System.out.println(one.getDummy() + " " + two.getDummy());
		one.setDummy("Raj");
		System.out.println(one.getDummy() + " " + two.getDummy());

		int a = 2, b = 4;
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a + " " + b);
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println(a + " " + b);

		// Reflection
		// Class<?> dummyBean = Class.forName("utility.DummyBean");
		// Field[] field = dummyBean.getDeclaredFields();
		// System.out.println(field[0]);
		String s = "vgfjj";
		char[] revc = s.toCharArray();
		char[] rever = new char[s.length()];
		int count = 0;
		for (int i = revc.length - 1; i >= 0; i--) {
			// System.out.print(revc[i]);
			rever[count] = revc[i];
			count++;
		}

		System.out.println(s.equals(new String(rever)));

		//Utils ut = (Utils) Class.forName("utility").newInstance();
		// System.out.println(System.getProperty("java.class.path"));
		// System.out.println(Class.forName("varargs.TestVarArgs").newInstance());
		System.out.println(TestVarArgs.class.getClass());
		System.out.println(TestVarArgs.class);

		System.out.println(System.getProperty("java.home"));

		System.out.println("\n" + System.getProperty("java.vendor"));

		String s1 = "abc";
		String s2 = new String(s1);

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2) + " hashcode " + s1.hashCode() + " "
				+ s2.hashCode());

		
			
	}
	

}
