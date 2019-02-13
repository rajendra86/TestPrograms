package test2;

public class DecToBinRecursive {

	/**
	 * @param args
	 */
	static String strBinary;

	private static String toBinary(int num) {
		if (num < 2) {
			strBinary = "" + num;
			return strBinary;
		} else {
			if (num != 0) {
				toBinary(num / 2);
				strBinary += "" + num % 2;
			}
		}
		return strBinary;
	}

	public static void main(String[] args) {
		System.out.println(toBinary(10));
		System.out.println(strBinary.hashCode());
	}
}
