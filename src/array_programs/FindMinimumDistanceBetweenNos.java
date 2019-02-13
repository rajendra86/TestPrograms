package array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinimumDistanceBetweenNos {

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3 };
		int x, y;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter x : ");
		x = scanner.nextInt();
		System.out.print("\nEnter y : ");
		y = scanner.nextInt();

		System.out.println("\nMinimum Distance between " + x + " and " + y
				+ " is " + findMinDistance(arr, arr.length, x, y));

		System.out.println("\nMin Distance between " + x + " and " + y + " is "
				+ findMinDist(arr, arr.length, x, y));

		// Method to print smallest distance between 2 adjacent nos in an array
		// findDistanceBetweenAdjacentNos(arr);
	}

	// Method to find the minimum distance between given 2 nos in an array
	public static int findMinDistance(int arr[], int n, int x, int y) {
		int i = 0, prev = 0;
		int min_dist = Integer.MAX_VALUE;

		// Find the first occurence of any of the two numbers (x or y)
		// and store the index of this occurence in prev
		for (i = 0; i < n; i++) {
			if (arr[i] == x || arr[i] == y) {
				prev = i;
				break;
			}
		}

		// Traverse after the first occurence
		for (; i < n; i++) {
			if (arr[i] == x || arr[i] == y) {
				// If the current element matches with any of the two then
				// check if current element and prev element are different
				// Also check if this value is smaller than minimm distance so
				// far
				if (arr[prev] != arr[i] && (i - prev) < min_dist) {
					min_dist = i - prev;
					prev = i;
				} else
					prev = i;
			}
		}
		return min_dist;
	}

	// Method to find the minimum distance between given 2 nos in an array
	public static int findMinDist(int arr[], int n, int x, int y) {
		int i, j;
		int min_dist = Integer.MAX_VALUE;
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if ((x == arr[i] && y == arr[j] || y == arr[i] && x == arr[j])
						&& min_dist > Math.abs(i - j)) {
					min_dist = Math.abs(i - j);
				}
			}
		}
		return min_dist;
	}

	// Method to print smallest distance between 2 adjacent nos in an array
	public static void findDistanceBetweenAdjacentNos(int[] ar) {
		Arrays.sort(ar);
		int min_dist = Integer.MAX_VALUE;
		for (int i = 0; i < ar.length - 1; i++) {
			if (Math.abs(ar[i + 1] - ar[i]) < min_dist) {
				min_dist = Math.abs(ar[i + 1] - ar[i]);
			}
		}
		System.out.println("Min Dist " + min_dist);
	}
}
