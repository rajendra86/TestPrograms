package matrix_programs;

public class RotateMatrix {
	private static int[][] matrix;
	private static int[][] matrix1;

	public static void main(String[] args) {

		matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		matrix1 = new int[3][3];
		System.out.println("Display Matrix");
		displayMatrix(matrix);

		System.out.println("Rotate Matrix by 90 degree");
		rotateMatrix(matrix, matrix1);

		System.out.println("Display Rotated Matrix");
		displayMatrix(matrix1);
		
		System.out.println("Rotate Matrix by 90 degree - Anti clock wise");
		rotateMatrixNoExtraSpace(matrix1);
		
		System.out.println("Display Rotated Matrix");
		displayMatrix(matrix1);
		
	}

	private static void displayMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void rotateMatrix(int[][] arr, int[][] arr1) {
		int m = arr1.length;
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr1[k][m - i - 1] = arr[i][j];
				k++;
				if (k == arr[i].length) {
					k = 0;
					break;
				}
			}
		}
	}

	private static void rotateMatrixNoExtraSpace(int[][] arr) {
		int N = arr.length;
		int temp = 0;
		for (int i = 0; i < (N / 2); i++) {
			for (int j = i; j < (N - 1 - i); j++) {
				// store current cell in temp variable
				temp = arr[i][j];

				// moving right elements to top
				arr[i][j] = arr[j][N - 1 - i];

				// moving bottom elements to right
				arr[j][N - 1 - i] = arr[N - 1 - i][N - 1 - j];

				// moving left elements to bottom
				arr[N - 1 - i][N - 1 - j] = arr[N - 1 - j][i];

				// moving top elements to left
				arr[N - 1 - j][i] = temp;
			}
		}
	}
}
