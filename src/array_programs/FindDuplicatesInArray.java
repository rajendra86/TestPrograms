package array_programs;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		// Array element should contain element only between 0 to n-1
		int[] arr = new int[] { 1, 2, 3, 1, 3, 6, 6 };

		findDuplicate(arr);
	}

	public static int findDuplicate(int[] arr) {
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			if (arr[Math.abs(arr[i])] >= 0) {
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			} else {
				System.out.println("Duplicate Element: " + Math.abs(arr[i]));
			}
		}
		return 0;
	}
}
