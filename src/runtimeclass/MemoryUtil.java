package runtimeclass;

import java.util.ArrayList;

class Inner {
	protected void finalize() throws Throwable {
		System.out.println("Finalizer called!");
	}
}

public class MemoryUtil {

	private static final int MegaBytes = 1048576;

	public static void main(String args[]) {

		long freeMemory = Runtime.getRuntime().freeMemory() / MegaBytes;
		long totalMemory = Runtime.getRuntime().totalMemory() / MegaBytes;
		long maxMemory = Runtime.getRuntime().maxMemory() / MegaBytes;

		System.out.println("JVM freeMemory: " + freeMemory + " MB");
		System.out
				.println("JVM totalMemory also equals to initial heap size of JVM : "
						+ totalMemory + " MB");
		System.out
				.println("JVM maxMemory also equals to maximum heap size of JVM: "
						+ maxMemory + " MB");

		ArrayList<Inner> objects = new ArrayList<Inner>();

		for (int i = 0; i < 10000000; i++) {
			//objects.add(("" + 10 * 2710));
			objects.add(new Inner());
		}
		System.out.println("****************************");
		freeMemory = Runtime.getRuntime().freeMemory() / MegaBytes;
		totalMemory = Runtime.getRuntime().totalMemory() / MegaBytes;
		maxMemory = Runtime.getRuntime().maxMemory() / MegaBytes;

		System.out.println("Used Memory in JVM: " + (maxMemory - freeMemory)
				+ " MB");
		System.out.println("freeMemory in JVM: " + freeMemory + " MB");
		System.out
				.println("totalMemory in JVM shows current size of java heap : "
						+ totalMemory + " MB");
		System.out.println("maxMemory in JVM: " + maxMemory + "MB");
		System.out.println("****************************");

		objects = null;
		System.gc();
		freeMemory = Runtime.getRuntime().freeMemory() / MegaBytes;
		totalMemory = Runtime.getRuntime().totalMemory() / MegaBytes;
		maxMemory = Runtime.getRuntime().maxMemory() / MegaBytes;

		System.out.println("Used Memory in JVM: " + (maxMemory - freeMemory)
				+ " MB");
		System.out.println("freeMemory in JVM: " + freeMemory + " MB");
		System.out
				.println("totalMemory in JVM shows current size of java heap : "
						+ totalMemory + " MB");
		System.out.println("maxMemory in JVM: " + maxMemory + "MB");
		System.out.println("****************************");
	}
}
