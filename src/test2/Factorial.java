package test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TO find the factorial of a number
		int n, i;
		BufferedReader y = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a no:-> ");
		n = Integer.parseInt(y.readLine());

		for (i = n, n = 1; i > 0; i--) {
			n = n * i;
		}
		System.out.println("Factorial:-> " + n);
	}
}
