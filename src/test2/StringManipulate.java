package test2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringManipulate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Hello";

		// System.out.print("Enter a string:-> ");
		// Scanner scanner = new Scanner(System.in);
		// str = scanner.nextLine();

		System.out
				.println("First non-repeated character in the entered String:-> "
						+ searchRepeatedChars(str));
		/*
		 * 
		 * for(char i :input.toCharArray()){
		 * if(input.indexOf(i)==input.lastIndexOf(i)){ System.out.println(i);
		 * break; } }
		 */
	}

	public static Character searchRepeatedChars(String str) {

		int i, length;
		char c;

		length = str.length();
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();

		for (i = 0; i < length; i++) {
			c = str.charAt(i);
			if (charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c) + 1);
			} else {
				charCount.put(c, 1);
			}
		}

		for (i = 0; i < length; i++) {
			c = str.charAt(i);
			if (charCount.get(c) == 1)
				return c;
		}
		return null;
	}

}
