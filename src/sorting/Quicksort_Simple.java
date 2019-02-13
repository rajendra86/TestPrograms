package sorting;

import java.util.Arrays;

public class Quicksort_Simple {

	/**
	 * Author: Javin Paul Javarevisited
	 */
	public static void main(String[] args) {
		int[] input = { 6, 5, 3, 1, 8, 7, 2, 4 };
		System.out.println("Unsorted array :" + Arrays.toString(input));
		quickSort(0, input.length - 1, input);
		System.out.println("Sorted array :" + Arrays.toString(input));

	}

	public static void quickSort(int low, int high, int[] input) {
		int i = low;
		int j = high; 
		// pivot is middle index
		int pivot = input[low + (high - low) / 2];

		// Divide into two arrays
		while (i <= j) {
			/**
			 * * As shown in above image, In each iteration, we will identify a
			 * * number from left side which is greater then the pivot value,
			 * and * a number from right side which is less then the pivot
			 * value. Once * search is complete, we can swap both numbers.
			 */

			while (input[i] < pivot) {
				i++;
			}

			while (input[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				// move index to next position on both sides
				i++;
				j--;
			}
		}

		// calls quickSort() method recursively

		if (low < j) {
			quickSort(low, j, input);
		}

		if (i < high) {
			quickSort(i, high, input);
		}
	}

}
