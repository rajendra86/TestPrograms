package sorting;

public class SelectionSort {
	/**
	 * @param args
	 */
	private static int[] arr = { 12, 45, 9, 33, 8, 99, 27 };

	public static void main(String[] args) {
		int i, j, k;
		System.out.print("Before Sorting:");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		/**
		 * In each iteration of inner loop, smallest element will be moved to left
		 */
		for (i = 0; i < arr.length - 1; i++) {
			k = i;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[k]) {
					int temp = arr[k];
					arr[k] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.print("\nAfter Sorting:");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
