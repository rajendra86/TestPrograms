package stringmanipulation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PalindromicPartition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s = "nitin";
		// ArrayList<ArrayList<String>> result = par.partition(s);
		//
		// for (Iterator<ArrayList<String>> iterator = result.iterator();
		// iterator
		// .hasNext();) {
		// ArrayList<String> list = (ArrayList<String>) iterator.next();
		// for (Iterator<String> iterator2 = list.iterator(); iterator2
		// .hasNext();) {
		// String s1 = (String) iterator2.next();
		// System.out.println(s1);
		// }
		// }

		List<String> result2 = palindromePartitioning(s);
		for (Iterator<String> iterator = result2.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}

	public ArrayList<ArrayList<String>> partition(String s) {
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();

		if (s == null || s.length() == 0) {
			return result;
		}

		// track each possible partition
		ArrayList<String> partition = new ArrayList<String>();
		addPalindrome(s, 0, partition, result);
		return result;
	}

	private void addPalindrome(String s, int start,
			ArrayList<String> partition, ArrayList<ArrayList<String>> result) {
		// stop condition
		if (start == s.length()) {
			ArrayList<String> temp = new ArrayList<String>(partition);
			result.add(temp);
			return;
		}

		for (int i = start + 1; i <= s.length(); i++) {
			String str = s.substring(start, i);
			if (isPalindrome(str)) {
				partition.add(str);
				addPalindrome(s, i, partition, result);
				partition.remove(partition.size() - 1);
			}
		}
	}

	private boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}

			left++;
			right--;
		}
		return true;
	}

	/**
	 * Method using Dynamic Programming
	 */
	public static List<String> palindromePartitioning(String s) {

		List<String> result = new ArrayList<String>();

		if (s == null)
			return result;

		if (s.length() <= 1) {
			result.add(s);
			return result;
		}

		int length = s.length();

		int[][] table = new int[length][length];

		// l is length, i is index of left boundary, j is index of right
		// boundary
		for (int l = 1; l <= length; l++) {
			for (int i = 0; i <= length - l; i++) {
				int j = i + l - 1;
				if (s.charAt(i) == s.charAt(j)) {
					if (l == 1 || l == 2) {
						table[i][j] = 1;
					} else {
						table[i][j] = table[i + 1][j - 1];
					}
					if (table[i][j] == 1) {
						result.add(s.substring(i, j + 1));
					}
				} else {
					table[i][j] = 0;
				}
			}
		}
		return result;
	}
}
