package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class One {
	String name = "No name";

	public enum Direction {
		// NORTH, SOUTH, EAST, WEST;
		RED(0xff0000), GREEN(0x00ff00), BLUE(0x0000ff);
		private final int rgb;

		Direction(int rgb) {
			this.rgb = rgb;
		}

		public int getRGB() {
			return rgb;
		}
	};

	public One() {
	}

	public One(String nm) {
		name = nm;
		System.out.print(1);
	}

	public static void main(String[] args) throws IOException {
		String s = new String("hai");
		String s1 = "hai";
		Integer a = new Integer(10);
		int b = 10;
		System.out.println("s1 + a == " + (s1+a));
		if (s == s1) {
			System.out.println("Object: We are Equal");	
		}
		if (a == b) {
			System.out.println("Content: We are Equal");	
		}
		
		BufferedReader y = new BufferedReader(new InputStreamReader(System.in));
		/*System.out.println("Enter a number: ");
		int aa = Integer.parseInt(y.readLine());
		System.out.println("Entered Number: " + aa);*/
		
		int[] array = new int[5];
		int[] array1 = array;
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		System.out.println("Array Length:-> " +array.length + " Object:-> " + array.toString() + " 2nd Object:-> " + array1.toString());
		System.out.println(array[-1]);
		
		
	}
}
