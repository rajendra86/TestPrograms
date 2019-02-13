package numbermanipulation;

import java.util.Scanner;

public class CheckNumberPowerOfTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out
				.print("Enter a number to check whether it is power of Two:- ");
		int number = scanner.nextInt();
		System.out.println("Is number power of two--> " + isPowerOfTwo(number));
		System.out.println("Is number power of two--> " + powerOfTwo(11));
		scanner.close();
	}

	/*
	 * checking if number is power of 2 using bit shift operator in java e.g. 4
	 * in binary format is "0000 0000 0000 0000 0000 0000 0000 0100"; and -4 is
	 * "1111 1111 1111 1111 1111 1111 1111 1100"; and 4&-4 will be
	 * "0000 0000 0000 0000 0000 0000 0000 0100"
	 */

	private static boolean isPowerOfTwo(int number) {
		if (number < 0) {
			throw new IllegalArgumentException("number: " + number);
		}
		if ((number & -number) == number) {
			return true;
		}
		return false;
	}

	/*
	 * checking if number is power of 2 using brute force starts with 1,
	 * multiplying with 2 it will eventually be same as original number
	 */
	private static boolean powerOfTwo(int number) {
		int square = 1;
		while (number >= square) {
			if (number == square) {
				return true;
			}
			square = square * 2;
		}
		return false;
	}
}
