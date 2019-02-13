package collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArraysAsListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		List<int[]> list = Arrays.asList(arr);
		for (Iterator<int[]> iterator = list.iterator(); iterator.hasNext();) {
			int[] is = (int[]) iterator.next();
			System.out.println(is.length);
			for (int i = 0; i < is.length; i++) {
				System.out.print(is[i] + " ");
			}
		}
		// UnsortedOperation
		list.add(new int[2]);

		arr[1] = 300;
		arr[3] = 100;
		for (Iterator<int[]> iterator = list.iterator(); iterator.hasNext();) {
			int[] is = (int[]) iterator.next();
			System.out.println("\n" + is.length);
			for (int i = 0; i < is.length; i++) {
				System.out.print(is[i] + " ");
			}
		}

	}

}
