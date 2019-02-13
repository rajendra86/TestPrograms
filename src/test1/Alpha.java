package test1;

public class Alpha {

	public void hello(int aa, int bb, String s) {
		s = s + "hai";
		System.out.println((aa + 1) + " " + (bb + 1) + " " + s);		
	}

	protected void finalize() throws Throwable {
		System.out.println("I am dead");
		super.finalize();
	}

	public static void main(String[] args) {
		Beta b = new Beta();
		String[] s = new String[2];		
		Beta.main(s);
		b.main(10, 20);
		Beta.c = 50;
	}
}
