package numbermanipulation;

public class SumOfDigits {

	public static void main(String[] args) {
		int no = Integer.MAX_VALUE;

		System.out.println("Sum of Digits = " + sumOfDigits(444));
		System.out.println("Sum of Digits = " + sumDigits(444));

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Math.abs(-2147483648));
	}

	/*
	 * This method will calculate the sum of digits of no
	 */
	public static int sumOfDigits(int no) {
		return no == 0 ? 0 : no % 10 + sumOfDigits(no / 10);
	}

	/*
	 * This method will calculate the sum of digits till sum becomes single
	 * digit number
	 */
	public static int sumDigits(int no) {
		int sum = 0;
		while (no != 0) {
			sum += no % 10;
			no = no / 10;
			if (no == 0 && sum >= 10) {
				no = sum;
				sum = 0;
			}
		}
		return sum;

	}
}
