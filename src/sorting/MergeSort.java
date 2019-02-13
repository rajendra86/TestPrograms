package sorting;

public class MergeSort {

	static int[] ar = { 1, 0, 2, 1, 0, 2, 1, 0 };

	// 54, 13, 24, 19,11, 3, 71, 8
	public static void main(String[] args) {

		System.out.print("Display array before sorting: ");
		for (int i = 0; i < ar.length; i++)
			System.out.print(ar[i] + " ");
		System.out.println();

		int[] ar2 = new int[ar.length];
		mergeSort(ar2, 0, ar.length - 1);

		System.out.print("\nDisplay array after merge sort: ");
		for (int i = 0; i < ar.length; i++)
			System.out.print(ar[i] + " ");

	}

	/*
	 * method performs merge sort.
	 */
	static void mergeSort(int[] ar2, int lower, int upper) {
		System.out.println("lowerbound: " + lower + " upperBound: " + upper);
		if (lower == upper) {
			return; // no need to sort further.
		} else { // finding mid point
			int midPoint = (lower + upper) / 2;
			System.out.println("Midpoint: " + midPoint);
			mergeSort(ar2, lower, midPoint); // sorting low half
			mergeSort(ar2, midPoint + 1, upper); // sort upper half
			merging(ar2, lower, midPoint + 1, upper);// merging them
		}
	}

	static void merging(int[] ar2, int lower, int higher, int upperBound) {
		System.out.println("low: " + lower + " high: " + higher + " upperBound: "
				+ upperBound);
		int midPoint = higher - 1;
		int lowerBound = lower;
		int n = upperBound - lowerBound + 1;
		int i = 0;

		while (lower <= midPoint && higher <= upperBound) {
			if (ar[lower] < ar[higher])
				ar2[i++] = ar[lower++];
			else
				ar2[i++] = ar[higher++];
		}

		while (lower <= midPoint)
			ar2[i++] = ar[lower++];

		while (higher <= upperBound)
			ar2[i++] = ar[higher++];

		for (i = 0; i < n; i++) {
			System.out.println(ar2[i] + " ");
			ar[lowerBound + i] = ar2[i];
		}
	}
}
