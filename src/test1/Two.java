package test1;

public class Two extends A implements Cloneable {
	static String nm;
	int b = 3;

	public Two() {
		// super(nm);
		// this("hai");
	}

	public Two(int value) {
		// super(nm);
		// System.out.print(a);
	}

	public void addFive() {
		// b += 5;
		System.out.print(b);
	}

	public <U> void inspect(U u) {
		int bb = 10;
		System.out.println("U: " + u.getClass().getName());
	}

	public static void main(String[] args) {
		Two tw = new Two();
		Two tw1 = new Two();
		One th = new One();

		// tw.inspect(3);

		// Pattern.matches("[a-z]", "a");
		// Pattern p = Pattern.compile("^a{3}");
		// Matcher m = p.matcher("aaa");
		// System.out.println(m.matches());
		//
		// String s = "Test A. Test B. Test C.ffgyug.";
		// String[] as = s.split("\\.\\s*");
		// for (int i = 0; i < as.length; i++) {
		// // System.out.println(as[i]);
		// }

		int[] array = new int[2];
		int[][] array1 = new int[3][2];

		for (int x = 0; x < array1.length; x++) {
			for (int y = 0; y < array1[x].length; y++) {
				array1[x][y] = x + y;
			}
		}

		for (int x = 0; x < array1.length; x++) {
			for (int y = 0; y < array1[x].length; y++) {
				System.out.print(array1[x][y] + "\t");
			}
			System.out.println();
		}

		for (int x = 0; x < array1.length; x++) {
			for (int y = 0; y < array1[x].length; y++) {
				array1[x][y] = (x + y) * 2;
			}
		}

		System.out.println();

		for (int x = 0; x < array1.length; x++) {
			for (int y = 0; y < array1[x].length; y++) {
				System.out.print(array1[x][y] + "\t");
			}
			System.out.println();
		}
		
		System.out.println(tw.getClass().getSimpleName());
	}
}
