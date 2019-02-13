package test2;

class Prime {
	public static void main(String args[]) {
		int n = 2, f, i, cnt = 0;

		// BufferedReader y = new BufferedReader(new
		// InputStreamReader(System.in));

		System.out.print("First 15 Prime Nos: ");
		while (cnt < 15) {
			i = 2;
			f = 0;
			while (i < n) {
				if (n % i == 0)
					f = 1;
				i++;
				if (f == 1)
					break;
			}
			if (f == 0) {
				System.out.print(n + " ");
				cnt++;
			}
			n++;
		}
	}
}
