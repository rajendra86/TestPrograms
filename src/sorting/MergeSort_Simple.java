package sorting;

import java.util.Arrays;

public class MergeSort_Simple {

	/**
	 * @param args
	 */
	private int[] numbers;
	private int[] helper;
	private int len;

	public void sort(int[] values) {
		this.numbers = values;
		len = values.length;
		this.helper = new int[len];
		mergesort(0, len - 1);
	}

	public static void main(String[] args) {
		int[] values = new int[] { 4, 3, 2 };
		// System.out.println(Arrays.toString(values));
		new MergeSort_Simple().sort(values);

		System.out.println(Arrays.toString(values));
	}

	private void mergesort(int low, int high) {
		System.out.println("In Mergesort - " + low + " " + high);
		// check if low is smaller then high, if not then the array is sorted
		if (low < high) {
			// Get the index of the element which is in the middle
			int middle = low + (high - low) / 2;
			System.out.println("Middle - " + middle);
			// Sort the left side of the array
			mergesort(low, middle);
			// Sort the right side of the array
			mergesort(middle + 1, high);
			// Combine them both
			merge(low, middle, high);
		}
	}

	private void merge(int low, int middle, int high) {
		System.out.println("Merge - " + low + " " + middle + " " + high);
		System.out.println("Original Array " + Arrays.toString(numbers));
		// Copy both parts into the helper array
		for (int i = low; i <= high; i++) {
			helper[i] = numbers[i];
		}

		int i = low;
		int j = middle + 1;
		int k = low;
		// Copy the smallest values from either the left or the right side back
		// to the original array
		while (i <= middle && j <= high) {
			if (helper[i] <= helper[j]) {
				numbers[k] = helper[i];
				i++;
			} else {
				numbers[k] = helper[j];
				j++;
			}
			k++;
		}
		// Copy the rest of the left side of the array into the target array
		System.out.println("Original Array " + Arrays.toString(numbers));
		while (i <= middle) {
			numbers[k] = helper[i];
			k++;
			i++;
		}
		System.out.println("Original Array " + Arrays.toString(numbers));
	}
}
