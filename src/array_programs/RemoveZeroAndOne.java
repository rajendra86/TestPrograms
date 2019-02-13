package array_programs;

import java.util.Arrays;

public class RemoveZeroAndOne {

	public static void main(String[] args) {
		int[] ar = new int[] { 0, 1, 1, 1, 0, 0, 0, 1 };
		
		// Using Sorting
		// usingArraySort(ar);
		// displayArray(ar);
		// Counting 0's and 1's
		/*
		 * System.out.println(); usingCounting(ar); displayArray(ar);
		 */
		// Segrating 0's and 1's
		System.out.println();
		segrateZeroOne(ar);
		displayArray(ar);
		System.out.println();

		//
		int[] arr = new int[] { 1, 1, 1, 2, 2, 2, 0, 0, 0 };
		sortArrayWithThreeElementTypes(arr);
	}

	// Method 1
	public static void usingArraySort(int[] ar) {
		Arrays.sort(ar);
	}

	// Method 2
	public static void usingCounting(int[] ar) {
		int zerocount = 0;
		int i = 0;
		for (i = 0; i < ar.length; i++) {
			if (ar[i] == 0)
				zerocount++;
		}
		System.out.println(zerocount + " " + (ar.length - zerocount));
		for (i = 0; i < zerocount; i++)
			ar[i] = 0;

		for (int k = i; k < ar.length; k++)
			ar[k] = 1;
	}

	// Method 3
	public static void segrateZeroOne(int[] ar) {
		int left = 0, right = ar.length - 1;

		while (left < right) {
			/* Increment left index while we see 0 at left */
			while (left < right && ar[left] == 0)
				left++;
			/* Decrement right index while we see 1 at right */
			while (left < right && ar[right] == 1)
				right--;
			/*
			 * If left is smaller than right then there is a 1 at left and a 0
			 * at right. Exchange ar[left] and ar[right]
			 */
			if (left < right) {
				ar[left] = 0;
				ar[right] = 1;
				left++;
				right--;
			}
		}
	}

	public static void sortArrayWithThreeElementTypes(int[] arr) {
		int zerocnt = 0, onecnt = 0, twocnt = 0;
		int k = 0, i = 0;
		for (k = 0; k < arr.length; k++) {
			if (arr[k] == 0)
				zerocnt++;
			else if (arr[k] == 1)
				onecnt++;
			else if (arr[k] == 2)
				twocnt++;
		}
		k = 0;
		while (i < zerocnt) {
			arr[k] = 0;
			k++;
			i++;
		}
		i = 0;
		while (i < onecnt) {
			arr[k] = 1;
			k++;
			i++;
		}
		i = 0;
		while (i < twocnt) {
			arr[k] = 2;
			k++;
			i++;
		}

		for (k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}

	public static void displayArray(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}
}
