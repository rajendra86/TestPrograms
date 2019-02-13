package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.List;

public class DeserializeSong {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		InputStream fin = null;
		ObjectInput oin = null;

		List<Song> songList = null;
		try {
			fin = new FileInputStream("song.txt");
			oin = new ObjectInputStream(fin);
			System.out
					.println("DeSerialization process has started, displaying deSerialized employee objects...");

			songList = (List<Song>) oin.readObject();
			for (Iterator<Song> iterator = songList.iterator(); iterator
					.hasNext();) {
				Song song = iterator.next();
				System.out.println(song);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				oin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
