package test1;

import java.util.Arrays;
import java.util.Locale;

public class HelloThread implements Runnable {
	Thread t;

	public HelloThread() {
		// TODO Auto-generated constructor stub
		// t = new Thread(this);
		// t.start();
	}

	public void run() {
		System.out.println("Hello from a thread!");
	}

	public static void main(String[] args) {
		// (new Thread(new HelloThread())).start();
		// HelloThread hello = new HelloThread();

		//boolean b1 = true;
		//boolean b2 = false;
		//if (b2 = true) {
			// System.out.print("hai");
		//}

		Locale loc = Locale.getDefault();
		System.out.print(loc.getDisplayCountry());

		Object[] obj = { new Integer(12), new Integer(new String("10")) };
		Arrays.sort(obj);

	}
}
