package searching;

/**
 * Binary Search
 */
public class BinarySearch {
	static int[] arr = new int[] { 23, 45, 67, 89, 90 };

	public static void main(String[] args) {
		int low = 0;
		int high = arr.length - 1;
		int key = 89;
		// binarySearch(low, high, key);
		binaryRecursive(low, high, key);

	}

	public static int binarySearch(int low, int high, int key) {
		int mid = 0;

		while (true) {
			mid = (low + high) / 2;
			if (low > high) {
				System.out.println("Element not found!");
				return -1;
			} else if (arr[mid] == key) {
				System.out.println("Element " + key + " found at position "
						+ mid);
				return mid;
			} else if (key > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
	}

	public static int binaryRecursive(int low, int high, int key) {
		int mid = 0;
		mid = (low + high) / 2;

		if (low > high) {
			System.out.println("Element not found!");
			return -1;
		} else if (arr[mid] == key) {
			System.out.println("Element " + key + " found at position " + mid);
			return mid;
		} else if (key > arr[mid]) {
			low = mid + 1;
			return binaryRecursive(low, high, key);
		} else {
			high = mid - 1;
			return binaryRecursive(low, high, key);
		}

	}
}
