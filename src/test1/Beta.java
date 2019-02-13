package test1;

public class Beta {

	/**
	 * @param args
	 */
	static int c;	
	int aa = 10;
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		c = 30;
		System.out.println(c);
		Beta be = new Beta();
		be.main(a, b);
		System.out.println(c);
		System.out.println(a);
	}

	public void main(int a, int b) {
		a = a + b;
		System.out.println(a);
		c = 40;
		System.out.println(c);
	}

	public static void hai() {
			
		System.out.println("hai");
	}
}
