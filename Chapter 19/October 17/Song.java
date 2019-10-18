import java.util.InputMismatchException;

/**
 * Class: Song Represents information on one song in an album Used for Chapter
 *12 Quiz
 * 
 * @author cjohns25
 *
 */
public class Song implements Comparable<Song> {

	@Override
	public int compareTo(Song song2)
	{
		if ((getTitle() == song2.getTitle()) && (getArtist() == song2.getArtist()))
		{
			return 0;
		}
		else if (getTitle() != song2.getTitle())
		{	
			return getTitle().compareTo(song2.getTitle()); 
		}
		else
		{
			return getArtist().compareTo(song2.getArtist());
		}
		
	}
	
	// class attributes
	private String title;
	private String artist;


	/*
	 * default constructor
	 */
	public Song() {
		title = "none";
		artist = "none";
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist  + "]";
	}

	/**
	 * @param title
	 * @param artist
	 */
	public Song(String title, String artist)
	{
	
		this.title = title;
		this.artist = artist;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		if (title.equals("")) {
			throw new InputMismatchException();
		} else {
			this.title = title;
		}
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
		if (artist.equals("")) {
			throw new InputMismatchException();
		} else {
			this.artist = artist;
		}
	}


}
