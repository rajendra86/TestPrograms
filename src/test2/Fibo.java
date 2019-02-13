package test2;

class Fibo {
	public static void main(String args[]) {

		int a[] = new int[15];
		int i;
		a[0] = 0;
		a[1] = 1;
		System.out.print("First 15 Fibonacci Nos:-> " + a[0] + " " + a[1] + " ");
		for (i = 2; i < 15; i++) {
			a[i] = a[i - 2] + a[i - 1];
			System.out.print(a[i] + " ");
		}		
	}
}
