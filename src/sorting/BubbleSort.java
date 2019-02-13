package sorting;

public class BubbleSort {

	private static int[] arr = { 8, 7, 6, 5, 4, 3, 2, 1 };

	// { 12, 45, 9, 33, 8, 99, 27 };

	public static void main(String[] args) {
		System.out.print("Before Sorting: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// bubbleSortVer1();
		bubbleSortVer2();
		print();
	}

	/**
	 * Performance of this implementation is O(n2) for Best, Worst, Avg case.
	 */
	public static void bubbleSortVer1() {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	/**
	 * Performance of this implementation is O(n2) for Worst, Avg case. O(n) for
	 * best case.
	 */
	public static void bubbleSortVer2() {
		boolean noSwapped = false;
		do {
			noSwapped = false;
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					noSwapped = true;
				}
			}
		} while (noSwapped);
	}

	public static void print() {
		System.out.print("\nAfter sorting: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
