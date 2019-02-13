package test2;

public class MiddleIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int ar[] = { 2, 4, 0, 5, 1, 1 };

		int mid = ar.length / 2;

		int sum_left = 0;

		int sum_right = 0;

		for (int i = 0; i < ar.length; i++) {
			if (i < mid) {
				sum_left += ar[i];
			} else {
				sum_right += ar[i];
			}
		}
		if (sum_left == sum_right) {
			System.out.println("mid=" + mid + " :sum of left=" + sum_left
					+ " :sum of right=" + sum_right);
		}

	}

}
