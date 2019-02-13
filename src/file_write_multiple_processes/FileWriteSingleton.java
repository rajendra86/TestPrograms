package file_write_multiple_processes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

/**
 * This is Singleton Class
 * 
 * @author prasaraj
 * 
 */
public class FileWriteSingleton {
	private FileWriter writer;
	private File file;
	private Calendar cal = Calendar.getInstance();

	private FileWriteSingleton() throws IOException {
		file = new File("c:\\testfile.log");
		writer = new FileWriter(file);
	}

	private static FileWriteSingleton instance = null;

	public static FileWriteSingleton getInstance() throws IOException {
		if (instance == null) {
			synchronized (FileWriteSingleton.class) {
				if (instance == null)
					instance = new FileWriteSingleton();
			}
		}
		return instance;
	}

	public void writeToFile() throws InterruptedException, IOException {

		for (int i = 0; i < 100; i++) {
			Thread.sleep(100);

			String log = Thread.currentThread().getName() + " :: "
					+ this.getClass().getSimpleName() + " ::"
					+ " FileWriter writing :: " + cal.getTime()
					+ " :: version :: " + System.getProperty("java.version")
					+ "\n";
			writer.write(log);
			writer.flush();

		}
		writer.close();
	}
}
