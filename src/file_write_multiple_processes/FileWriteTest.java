package file_write_multiple_processes;

import java.io.IOException;

public class FileWriteTest {
	public static void main(String[] args) throws IOException,
			InterruptedException, ClassNotFoundException {
		FileWriteSingleton fileWriter = FileWriteSingleton.getInstance();
		fileWriter.writeToFile();
		System.out.println("HashCode == " + fileWriter.hashCode());
		System.out.println("Program ends!!!");

	}
}
