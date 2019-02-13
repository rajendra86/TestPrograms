package numbermanipulation;

import java.util.Scanner;

public class FibonaciSeries {

	public static void main(String[] args) {
		System.out.print("Enter a number:--> ");
		int number = new Scanner(System.in).nextInt();
		System.out.println();

//		for (int t = 1; t <= number; t++) {
//			System.out.print(fibonacci(t) + " ");
//		}
//		
		for (int t = 1; t <= number; t++) {
			System.out.print(fibonacci2(t) + " ");
		}
	}
/**
 * Iterative Method
 * @param number
 * @return fibonacci
 */
	public static int fibonacci(int number) {
		if (number == 1 || number == 2) {
			return 1;
		} else {
			int fibo1 = 1, fibo2 = 1;
			int fibonacci = 1;
			for (int k = 3; k <= number; k++) {
				fibonacci = fibo1 + fibo2;
				fibo1 = fibo2;
				fibo2 = fibonacci;
			}

			return fibonacci;
		}
	}

	/**
	 * This method uses recursion
	 * 
	 * @param number
	 * @return
	 */
	public static int fibonacci2(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}

		return fibonacci(number - 1) + fibonacci(number - 2); // tail recursion
	}
}
