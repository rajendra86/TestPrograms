package test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalToBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		int no, rem = 0;
		StringBuilder str = new StringBuilder();
		BufferedReader y = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a no:-> ");
		no = Integer.parseInt(y.readLine());
		System.out.println("Number in Decimal format:-> " + no);

		do {
			rem = no % 2;
			no = no / 2;
			str = str.append(rem);
		} while (no / 2 != 0);

		str = str.append(no);
		System.out.println("Number in Binary format:-> "
				+ str.reverse().toString());
	}
}
