package test1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleFileRead {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\prasaraj\\Documents\\Printer IP.txt");
//		if (f.isFile()) {
//			System.out.println("Its a file");
//		}
		int ch;
		FileInputStream fis = new FileInputStream(f);
		while((ch=fis.read()) != -1) {
			//System.out.print((char)ch);
		}
		fis.close();				
	}

}
