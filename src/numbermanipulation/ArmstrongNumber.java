package numbermanipulation;

import java.util.Scanner;

/**
 * Program to find an Armstrong number - A number is Armstrong if the sum of
 * cube of its digits is equal to number itself.
 * 
 * @author prasaraj
 * 
 */
public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.print("Enter a 3 digit number:- ");
		int number = new Scanner(System.in).nextInt();
		if (number < 100) {
			System.out.println("Entered number is not Armstrong!");
		} else {
			System.out.println("Is number Armstrong:- "
					+ (number == findArmstrong(number)));
		}

	}

	public static int findArmstrong(int number) {
		int armstrong = 0, mod;
		while (number != 0) {
			mod = number % 10;
			number = number / 10;
			armstrong = armstrong + (mod * mod * mod);
		}		
		return armstrong;
	}
}
