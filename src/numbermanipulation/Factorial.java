package numbermanipulation;

import java.io.IOException;
import java.util.Scanner;

public class Factorial {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("Enter a number--> ");
		int number = new Scanner(System.in).nextInt();
		System.out.println("Factorial of entered Number--> "
				+ factorial(number));

		System.out.println("Factorial of entered Number--> " + fact(number));
	}

	/**
	 * This is recursive method
	 * 
	 * @param number
	 * @return
	 */
	public static int factorial(int number) {
		if (number == 1) {
			return 1;
		} else
			return number * factorial(number - 1);
	}

	public static int fact(int number) {
		int factorial = 1;
		for (int k = number; k >= 1; k--) {
			factorial = factorial * k;
		}

		return factorial;
	}
}
