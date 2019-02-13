package array_programs;

public class ArrayRotation {

	public static void main(String[] args) {
		int[] ar = new int[] { 99, 201, 3, -4, 85, 76, };

		printArray(ar);
		ar = rotateArray(ar, ar.length, 2);
		System.out.println();
		printArray(ar);
	}

	public static void printArray(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}

	// This method uses temp array
	public static int[] rotateArray(int[] ar, int length, int offset) {
		int i, k = 0;
		int[] temp = new int[offset];
		// Copy elements to be shifted to temp array
		for (i = 0; i < offset; i++) {
			temp[k] = ar[i];
			k++;
		}
		// Rewrite the array
		k = 0;
		for (i = offset; i < ar.length; i++) {
			ar[k] = ar[i];
			k++;
		}
		// Add elements from temp to end of original array
		for (i = 0; i < offset; i++) {
			ar[k] = temp[i];
			k++;
		}
		return ar;
	}
}
