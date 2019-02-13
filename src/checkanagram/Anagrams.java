package checkanagram;

public class Anagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] anagram = { "act", "abc", "cat", "meow", "weom" };
		// findAnagram(anagram);
		for (int i = 0; i < anagram.length; i++) {
			for (int j = i + 1; j < anagram.length; j++) {
				System.out.print(anagram[i] + " : " + anagram[j]);
				System.out.println(" Is Anagram : "
						+ isAnagram(anagram[i], anagram[j]));
			}

		}
		// System.out.println("Is Anagram : " + isAnagram("meow", "weom"));

	}

	/**
	 * Efficient Method
	 */
	public static boolean isAnagram(String word, String anagram) {
		if (word.length() != anagram.length()) {
			return false;
		}
		char[] chars = word.toCharArray();
		for (char c : chars) {
			int index = anagram.indexOf(c);
			if (index != -1) {
				anagram = anagram.substring(0, index)
						+ anagram.substring(index + 1, anagram.length());
				// System.out.println(anagram + " " + index);
			} else {
				return false;
			}
		}
		return anagram.isEmpty();
	}

	/**
	 * Not Efficient Method
	 */
	public static void findAnagram(String[] str) {
		boolean isAnagram = true;
		for (int i = 0; i < str.length; i++) {
			isAnagram = true;
			for (int k = i + 1; k < str.length; k++) {
				isAnagram = true;
				if (str[i].length() == str[k].length()) {
					// System.out.println("str[" + i + "] :-> " + str[i]);

					for (int j = 0; j < str[k].length(); j++) {

						if (!(str[i].contains(new StringBuilder().append(
								str[k].charAt(j)).toString()))) {
							isAnagram = false;
							/*
							 * System.out.println("str[" + k + "] :-> " + str[k]
							 * + " str[" + k + "].charAt(" + j + ") :->" +
							 * str[k].charAt(j));
							 */
						}
					}

					if (isAnagram) {
						System.out.println("1st String:-> " + str[i]
								+ " 2nd String:-> " + str[k]);
					}
				}
			}
		}
	}
}
