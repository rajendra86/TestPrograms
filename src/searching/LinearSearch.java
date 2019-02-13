package searching;

public class LinearSearch {

	public static void main(String[] args) {

		int[] arr = new int[] { 12, 3, 5, 6, 7, 66, 88 };
		int key = 7;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println("Element " + key + " found in position - "
						+ (i+1));
			}
		}

	}
}
