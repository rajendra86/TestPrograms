package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeSong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Song s1 = new Song(12, "Kunidu Kunidu", "Udit");
		Song s2 = new Song(15, "Ee Sanje", "Sonu");

		List<Song> songList = new ArrayList<Song>();
		songList.add(s1);
		songList.add(s2);

		try {
			FileOutputStream fout = new FileOutputStream("song.txt");
			ObjectOutputStream oout = new ObjectOutputStream(fout);

			System.out
					.println("Serialization process has started, serializing employee objects...");
			oout.writeObject(songList);
			oout.close();
			System.out.println("Object Serialization completed.");
		} catch (FileNotFoundException ioe) {
			ioe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
