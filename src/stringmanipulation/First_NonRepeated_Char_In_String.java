package stringmanipulation;

public class First_NonRepeated_Char_In_String {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "abca";

		for (char i : input.toCharArray()) {
			System.out.println("Index--> " + input.indexOf(i)
					+ " Last Index--> " + input.lastIndexOf(i));
			if (input.indexOf(i) == input.lastIndexOf(i)) {
				System.out.println(i);
				break;
			}
		}

	}

}
