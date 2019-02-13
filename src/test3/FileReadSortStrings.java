package test3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class FileReadSortStrings {

	/**
	 * @param args
	 */

	File input = new File("C:/input.txt");
	List<String> songs = new ArrayList<String>();
	Set<String> songsSet = new TreeSet<String>();
	String[] songName = null;

	public void readFile() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(input));

		String currentLine;
		while ((currentLine = br.readLine()) != null) {
			// System.out.println(currentLine);
			songName = currentLine.split("/");
			songs.add(songName[0]);
			songsSet.add(songName[0]);
		}
		
		//System.out.println(songsSet);
		System.out.println(songs + " " + songs.hashCode());
		Collections.sort(songs);
		System.out.println(songs + " " + songs.hashCode());
	}

	
	public void readTxt() throws IOException{
		File input1 = new File("C:/input1.txt");
		FileInputStream fis = new FileInputStream(input1);
		System.out.println(input1.length());
		int len;
		
		while((len = fis.read(new byte[1024])) != -1 ){
			System.out.println(" " + len);
		}
		
	}
	public static void main(String[] args) {
		FileReadSortStrings frs = new FileReadSortStrings();
		try {
			frs.readFile();
			//frs.readTxt();
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}

	}
}
