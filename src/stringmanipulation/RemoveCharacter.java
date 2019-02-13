package stringmanipulation;

public class RemoveCharacter {
	/*
	 * Program to remove special characters from a String
	 */
	public static void main(String[] args) {
		int index = 0;
		String s1 = "hai%hello@&";
		char[] ch = { '%', '@', '&' };

		for (char c : ch) {
			if (s1.indexOf(c) != -1) {
				index = s1.indexOf(c);
				s1 = s1.substring(0, index)
						+ s1.substring(index + 1, s1.length());
			}
		}

		System.out.println(s1);
	}
}
