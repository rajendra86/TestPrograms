package serialization;

import java.io.Serializable;

public class Song implements Serializable {

	private static final long serialVersionUID = 1L;
	private int songID;
	private String songName;
	private String artist;
	private String director;

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Song(int songID, String songName, String artist) {
		super();
		this.songID = songID;
		this.songName = songName;
		this.artist = artist;
	}

	/**
	 * @return the songID
	 */
	public int getSongID() {
		return songID;
	}

	/**
	 * @param songID
	 *            the songID to set
	 */
	public void setSongID(int songID) {
		this.songID = songID;
	}

	/**
	 * @return the songName
	 */
	public String getSongName() {
		return songName;
	}

	/**
	 * @param songName
	 *            the songName to set
	 */
	public void setSongName(String songName) {
		this.songName = songName;
	}

	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * @param artist
	 *            the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Song ID = " + songID + ", songName=" + songName + ", artist="
				+ artist;
	}

	// protected Object readResolve() {
	// return new Object();
	// }
}
