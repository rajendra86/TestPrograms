package numbermanipulation;

public class ReverseNumber {

	public static void main(String[] args) {
		int original = 44332211;

		int reverse = reverseNumber(original);
		System.out
				.println("Original--> " + original + " Reverse--> " + reverse);
		System.out.println(new StringBuilder("44332211").reverse());

	}

	public static int reverseNumber(int original) {
		if (original < 10) {
			return original;
		} else {
			int reverse = 0;
			int mod;

			while (original > 0) {
				mod = original % 10;
				original = original / 10;
				reverse = reverse * 10 + mod;
			}
			return reverse;
		}
	}
}
