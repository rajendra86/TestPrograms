package test4;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckFileDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader y = new BufferedReader(new InputStreamReader(System.in));
		String src = "";
		//String date = "";
		String file_date = "";
		String cmd = "cmd /c dir ";
		Process proc;

		System.out.println("Enter Path:- ");
		src = y.readLine();
		// System.out.println("Enter Date:- ");
		// date = y.readLine();

		File source = new File(src);

		File filelist[] = new File[source.list().length];
		filelist = source.listFiles();

		for (int i = 0; i < filelist.length; i++) {
			if (getExt(filelist[i].toString()).equals("mp3")) {
				String f = filelist[i].toString();

				cmd = cmd + "\"" + f + "\"" + " /tc";
				proc = Runtime.getRuntime().exec(cmd);
				cmd = "cmd /c dir ";

				y = new BufferedReader(new InputStreamReader(
						proc.getInputStream()));

				// get file date data line by line
				for (int j = 0; j < 6; j++) {
					file_date = y.readLine();
				}

				System.out.println(f);

				Date d = new Date(filelist[i].lastModified());
				SimpleDateFormat sdf = new SimpleDateFormat(
						"dd-MM-yyyy hh:mm:ss");
				String dateString = sdf.format(d);

				System.out.println(dateString);

				// split by space
				String split[] = file_date.split(" ");
				String crdate = split[0];
				String crtime = split[2];

				System.out.println("Creation Date  : " + crdate);
				System.out.println("Creation Time  : " + crtime);
			}
		}
	}

	public static String getExt(String filename) {
		int k = filename.lastIndexOf(".");
		String ext = "";

		if (k != -1) {
			ext = filename.substring(k + 1, filename.length());
		}

		return ext;
	}
}
