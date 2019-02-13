package printstructures;

import java.util.Scanner;

/**
 * Program to print following structure 
 --Start--
 * 
 *** 
 ***** 
 ******* 
 ***** 
 *** 
 * 
 --End--
 * @author prasaraj 
 */
public class Printstars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int k = 0;
		System.out.println("Enter a number :-> ");
		int number = new Scanner(System.in).nextInt();

		for (k = 1; k <= number; k = k + 2) {
			print(k);
			System.out.println();
		}

		for (k = number - 2; k > 0; k = k - 2) {
			print(k);
			System.out.println();
		}
	}

	public static void print(int no) {
		for (int j = 1; j <= no; j++) {
			System.out.print("*");
		}
	}
}
