package numbermanipulation;

public class SwapNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		System.out.println("Numbers --> " + a + " " + b);
//		a = a + b;
//		b = a - b;
//		a = a - b;
		//System.out.println("Numbers --> " + a + " " + b);
		a = (a ^ b);
		
		b = (a ^ b);
		
		a = (a ^ b);
		
		System.out.println("Numbers --> " + a + " " + b);
	}

}
