package fileread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadTest {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException,
			InterruptedException {
		File file = new File("C:\\plainfile.txt");
		FileInputStream fis = new FileInputStream(file);

		char c;

		FileReader fr = new FileReader(file);
		FileWriter fo = new FileWriter(new File("C:\\newfile.txt"));
		while ((c = (char) fr.read()) != -1) {
			System.out.print((char) c);
			fo.write(c);
		}
		fo.flush();
		fr.close();
		fo.close();

		BufferedReader inputStream = null;
		BufferedWriter outputStream = null;

		inputStream = new BufferedReader(new FileReader(file));
		outputStream = new BufferedWriter(new FileWriter("C:\\newfile1.txt"));

		String l = null;
		while (null != (l = inputStream.readLine())) {			
			outputStream.write(l);
			outputStream.newLine();
		}

		outputStream.close();

	}
}
