package test4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ChangeFileLocation {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) {

		try {
			File src = new File(
					"C:\\Users\\prasaraj\\Documents\\Downloads\\Songs\\Jingu Chikku.mp3");
			File dst = new File("C:\\Jingu Chikku.mp3");
			FileInputStream fis = new FileInputStream(src);
			FileOutputStream fos = new FileOutputStream(dst);
			byte[] buf = new byte[1024];
			int len = 0;

			while ((len = fis.read(buf)) > 0) {
				fos.write(buf, 0, len);
			}

			fis.close();
			fos.close();
			System.out.println("File copied");
			src.delete();
			System.out.println("Source File deleted");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
