package array_programs;

public class FindOnlyNonDuplicate {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 3, 1, 4, 3, 5, 5, 4, 8 };
		int nondup = a[0];
		
		for (int i = 1; i < a.length; i++) {
			nondup = nondup ^ a[i]; // XOR operation
		}

		System.out.println("Nondup element:- " + nondup);		
	}
}
