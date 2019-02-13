package test4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Try {

	/**
	 * @param args
	 * @throws IOException
	 * @throws Exception
	 */
	public static void main(String[] args) throws IOException {

		File source = new File("C:/Hello/1/2/3/4");

		// SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		// String date = sdf.format(source.lastModified());

		// System.out.println(source.length());
		// System.out.println(source.getFreeSpace());
		// System.out.println(source.getUsableSpace());
		// System.out.println(source.getTotalSpace());

		// String b = new String("za");
		// String c = new String("b");
		// String ss = c;

		// int a = b.charAt(0);
		// System.out.println(a);

		// byte[] b1 = b.getBytes();
		// System.out.println(b1.length);
		// System.out.println(b1[1]);

		int aa = 10, bb = 20;
		bb = ++aa + aa++ * aa;
		// System.out.println(bb + " " + aa);

		// Alpha al = new Alpha();
		// System.out.println(aa + " " + bb + " " + b);
		// al.hello(aa, bb, b);
		// al = null;

		// System.gc();

		// System.out.println(aa + " " + bb + " " + b);

		// System.out.println(String.valueOf(a));
		// if (ss == c) {
		// System.out.println("hai");
		// }
		//
		// System.out.println(b.compareTo(c));
		// System.out.print((int)c.charAt(2));
		// int a;
		// a = 2147483647;
		// System.out.println(a);
		// File[] f = new File[100000000];
		// System.out.println(f.length);

		// source.mkdirs();

		// if (!s.isDirectory()) {
		// System.out.println("hai");
		// }
		// System.gc();

		// File src = new File(
		// "C:/Users/prasaraj/Documents/Downloads/Songs/Nattil Veettil.mp3");
		// float kilobytes = (float) src.length() / 1024;
		// if (kilobytes > 1024) {
		// float megabytes = kilobytes / 1024;
		// System.out.println("Size: - " + fileSize(megabytes) + "MB");
		// } else {
		// System.out.println("Size: - " + fileSize(kilobytes) + "KB");
		// }

		// int[][] array = new int[3][1];
		// System.out.println(array.length);

		String filename = new String(
				"C:\\Users\\prasaraj\\workspace\\XMLExamples\\NewFile.xml");
		BufferedReader br = new BufferedReader(new FileReader(
				new File(filename)));
		String line;
		StringBuilder sb = new StringBuilder();

		while ((line = br.readLine()) != null) {
			sb.append(line.trim());
		}
		System.out.println(sb);
		
		
	}

	static String fileSize(float kilobytes) {
		String str1 = "", str2 = "";
		String size = Float.toString(kilobytes);
		int index = size.indexOf(".");
		int length = size.length();

		if (index != -1) {
			str1 = size.substring(0, index);
			str2 = size.substring(index + 1, length);

			if (str2.length() > 2) {
				str1 = str1 + "." + str2.substring(0, 2);
			} else {
				str1 = size;
			}
		}

		return str1;
	}
}
