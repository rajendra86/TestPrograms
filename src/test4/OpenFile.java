package test4;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OpenFile {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// File f = new
		// File("C:\\Users\\prasaraj\\Documents\\Downloads\\Songs\\Hawaa Hawaa.mp3");
		Desktop desk = Desktop.getDesktop();
		// desk.open(f);
		//
		// File f1 = new File(
		// "C:\\Users\\prasaraj\\Documents\\Downloads\\Songs\\Nattil Veettil.mp3");
		// Desktop desk1 = Desktop.getDesktop();
		// desk1.open(f1);

		File[] fnames = new File[5];
		fnames[0] = new File(
				"C:\\Users\\prasaraj\\Documents\\Downloads\\Songs\\Hawaa Hawaa.mp3");
		fnames[1] = new File(
				"C:\\Users\\prasaraj\\Documents\\Downloads\\Songs\\Nattil Veettil.mp3");
		fnames[2] = new File(
				"C:\\Users\\prasaraj\\Documents\\Downloads\\Songs\\Jingu Chikku.mp3");
		fnames[3] = new File(
				"C:\\Users\\prasaraj\\Documents\\Downloads\\Songs\\Poraney Poraney.mp3");
		fnames[4] = new File(
				"C:\\Users\\prasaraj\\Documents\\Downloads\\Songs\\Sara Sara Saara Kathu.mp3");

		for (int i = 0; i < fnames.length; i++) {
			 desk.open(fnames[i]);
		}

		try {

			Process proc = Runtime
					.getRuntime()
					.exec("cmd /c dir \"C:\\Users\\prasaraj\\Documents\\Downloads\\Songs\\Hawaa Hawaa.mp3\" /tc");

			BufferedReader br = new BufferedReader(new InputStreamReader(
					proc.getInputStream()));

			String data = "";

			// it's quite stupid but works
			for (int i = 0; i < 6; i++) {
				data = br.readLine();
				System.out.println(data);
			}

			System.out.println("Extracted value : " + data);

			// split by space
			StringTokenizer st = new StringTokenizer(data);
			String date = st.nextToken();// Get date
			String time = st.nextToken();// Get time

			System.out.println("Creation Date  : " + date);
			System.out.println("Creation Time  : " + time);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
