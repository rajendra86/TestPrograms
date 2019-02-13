package numbermanipulation;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String args[]) {

		// get input till which prime number to be printed
		System.out
				.println("Enter the number till which prime number to be printed: ");
		int limit = new Scanner(System.in).nextInt();

		// printing primer numbers till the limit ( 1 to 100)
		System.out.println("Printing prime numbers from 1 to " + limit);
		for (int number = 2; number <= limit; number++) {
			// print prime numbers only
			// if (isPrime(number)) {
			// System.out.println(number);
			// }
		}

		System.out.println("isPrime=> " + checkPrime(limit, 2));
	}

	/*
	 * Prime number is not divisible by any number other than 1 and itself
	 * 
	 * @return true if number is prime
	 */
	public static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false; // number is divisible so its not prime
			}
		}
		return true; // number is prime now
	}

	/*
	 * 
	 * Prime No with recursion
	 */
	public static boolean checkPrime(int no, int i) {

		if (no == i)
			return true;
		else if (no % i == 0)
			return false;
		else
			i++;
		return checkPrime(no, i);
	}
}
