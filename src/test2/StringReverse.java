package test2;

public class StringReverse {

	/**
	 * @param args
	 */
	String rev = "";

	public static void main(String[] args) {
		
		String original = "Hello";
		
		System.out.println("REversed String:-> " + new
				 StringBuilder(original).reverse().toString());
		
		char[] reverse = new char[original.length()];
		int count = 0;

		for (int i = original.length() - 1; i >= 0; i--) {
			reverse[count] = original.charAt(i);
			count++;
		}

		for (int i = 0; i < reverse.length; i++) {
			System.out.print(reverse[i]);
		}
	}
	
	//Recursive Method
	public String reverseString(String str) {

		if (str.length() == 1) {
			return str;
		} else {
			rev += str.charAt(str.length() - 1)
					+ reverseString(str.substring(0, str.length() - 1));
			return rev;
		}
	}
}
