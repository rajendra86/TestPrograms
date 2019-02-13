package stringmanipulation;

public class StringManipulation {

	public static void main(String[] args) {
		StringManipulation str = new StringManipulation();

		System.out.println(str.replace("Hello How Are you?", 'H'));
		String s = "Hello";
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i) + " ");
		}
		System.out.println();

		reverseWordsInSentence("How are you");

		// removeSpaces("Haw are yoa");

		removeCharacters("a", "b");
	}

	public String replace(String str, char ch) {
		if (str.isEmpty() || null == str) {
			return "";
		}
		return str.replace(ch, 'A');
	}

	/**
	 * Recursive method to reverse a string
	 * 
	 * @param str
	 * @return
	 */
	public static String reverseRecursively(String str) {
		// base case to handle one char string and empty string
		if (str.length() < 2) {
			return str;
		}
		return reverseRecursively(str.substring(1)) + str.charAt(0);
	}

	/**
	 * Reverse words in a sentence
	 */
	public static void reverseWordsInSentence(String ss) {

		for (String s1 : ss.split(" ")) {
			System.out.println(reverseRecursively(s1));
		}
	}

	/**
	 * Method to remove spaces from String
	 */

	public static void removeSpaces(String ss) {
		System.out.println(ss);
		System.out.println(ss.replaceAll("a", ""));
	}

	/**
	 * Method to remove characters from first string which are present in second
	 * string
	 */

	public static void removeCharacters(String s1, String s2) {
		s1 = "aAbBcC dDeE 1a23";
		s2 = "abcde";
		System.out.println("First String: " + s1 + " \nSecond String: " + s2);

		int index = 0;
		String temp = null;
		char[] ch = s2.toCharArray();
		for (char c : ch) {
			index = s1.indexOf(c);

			if (index != -1) {
				temp = String.valueOf(c);
				s1 = s1.replaceAll(temp, "");
			}
		}
		System.out.println("First String after modification: " + s1);
	}
	
	
}
