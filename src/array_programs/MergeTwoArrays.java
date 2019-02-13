package array_programs;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int[] bigArray = new int[] { 0, 2, 3, 0, 0, 6 };
		int[] smallArray = new int[] { 1, 4, 5 };

		int big_len = bigArray.length;
		int small_len = smallArray.length;

		moveEnd(bigArray, big_len);
		for (int i = 0; i < bigArray.length; i++) {
			System.out.print(bigArray[i] + " ");
		}

	}

	public static void moveEnd(int[] bigArray, int big_len) {
		int i = 0, j = big_len - 1;
		for (i = big_len - 1; i >= 0; i--) {
			if (bigArray[i] != 0) {
				bigArray[j] = bigArray[i];
				j--;
			}
		}
	}

	public static void mergeArrays(int[] bigArray, int[] smallArray,
			int big_len, int small_len) {

	}

}
