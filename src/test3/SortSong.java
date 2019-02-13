package test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class SortSong {
	SongComparator songCompare = new SongComparator();
	List<Song> songList = new ArrayList<Song>();

	public static void main(String... args) throws InterruptedException {
		System.out.println("Starting...");
		//System.out.println(Thread.currentThread().getName());
		//Thread.sleep(5000);
		new SortSong().sortSongs();
		System.out.println("Finished...");
	}

	public void sortSongs() {
		Song s1 = new Song("Fine Without You", "Armin");
		Song s2 = new Song("This light between Us", "Chris Burns");
		Song s3 = new Song("Intense", "Miri Ben");
		Song s4 = new Song("Sky Falls Down", "Dash Berlin");

		songList.add(s1);		
		songList.add(s3);
		songList.add(s2);
		songList.add(s4);

		Iterator<Song> it = songList.iterator();
		while (it.hasNext()) {
			it.next();
		}

		songList.add(0, new Song("Nillu Nillu", "Ankit Tiwari"));
		System.out.println(songList);
		//Collections.sort(songList);
		//System.out.println(songList);

		Collections.sort(songList, songCompare);
		System.out.println(songList);

		//Collections.reverse(songList);
		//System.out.println(songList);
	}

	class SongComparator implements Comparator<Song> {

		@Override
		public int compare(Song s1, Song s2) {
			// TODO Auto-generated method stub
			return s1.getArtist().compareTo(s2.getArtist());

		}
	}
}
