/**
 * 
 */
package test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author prasaraj
 * 
 */
public class TryCatchReturn {

	/**
	 * @param args
	 */
	public static void returnMethod() {
		int a = 0;
		try {
			System.out.println("Hello inside try block");
			BufferedReader y = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.print("Enter a no: ");
			a = Integer.parseInt(y.readLine());
			System.out.println("Entered No: " + a);
			//System.exit(0);
			System.out.println(Runtime.getRuntime().freeMemory());
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		returnMethod();
	}

}
