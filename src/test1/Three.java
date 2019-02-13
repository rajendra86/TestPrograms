package test1;

import java.io.File;

public class Three extends Two {
	static int a;
	int b = 8;

//	public Three() {
//		//super(a);
//		// System.out.print(4);
//	}

//	public Three(int a) {
//		System.out.print(a);
//	}

	public void addFive() {
		// this.b += 5;
		System.out.print(b);
	}

	public static void main(String[] args) {
		//Two tw = new Two();
		Three th = new Three();
		Two tw1 = new Three();

		//tw.addFive();
		th.addFive();
		tw1.addFive();
		//System.out.print(tw.b + " " + th.b + " " + tw1.b);

			
	}
}
