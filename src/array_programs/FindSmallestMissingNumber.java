package array_programs;

import java.util.Arrays;

public class FindSmallestMissingNumber {

	public static void main(String[] args) {
		// Elements in the array will be between 0 to m-1
		// Array should be sorted
		// n = no of elements in the array
		// n = 6
		// if m = 9
		// elements will be 0-8
		int[] arr = new int[] { 0, 1, 2, 3, 5, 6 };
		findSmallestMissing(arr, 9);
	}

	public static void findSmallestMissing(int[] arr, int m) {
		int i = 0, index = 0;
		for (i = 0; i < m; i++) {
			index = Arrays.binarySearch(arr, i);
			System.out.println(index);
			if ((index) < 0) {
				
				System.out.println("Missing Element = " + (Math.abs(index) - 1));
				break;
			}
		}
	}

}
