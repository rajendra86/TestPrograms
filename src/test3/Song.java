package test3;

public class Song { //implements Comparable<Song>{

	private String songName;
	private String artist;
		
	public Song(String songName, String artist) {
		super();
		this.songName = songName;
		this.artist = artist;
	}
	/**
	 * @return the songName
	 */
	public String getSongName() {
		return songName;
	}
	/**
	 * @param songName the songName to set
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
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "songName=" + songName + ", artist=" + artist;
	}
	
//	@Override
//	public int compareTo(Song s) {
//		// TODO Auto-generated method stub
//		return getSongName().compareTo(s.getSongName());
//		
//	}	
}
