import java.util.InputMismatchException;
/**
 * 
 */

/**
 * @author Taylor Williams
 *
 */
public abstract class Movie implements Comparable<Movie>
{
	@Override
	public int compareTo(Movie movie2)
	{
		if (getTitle().equals(movie2.getTitle()) && (getTitle() == movie2.getTitle()))
		{
			return 0;
		}
		else
		{
			return getTitle().compareTo(movie2.getTitle());
		}
	}
	
	private String title;
	private String genre;
	/**
	 * 
	 */
	public Movie()
	{
		title = "Not set";
		genre = "Not set";
	}
	/**
	 * @param title
	 * @param genre
	 */
	public Movie(String title, String genre)
	{
		this.title = title;
		this.genre = genre;
	}
	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title)
	{
		if (title.equals("")) {
			throw new InputMismatchException();
		} else {
			this.title = title;
		}
	}
	/**
	 * @return the genre
	 */
	public String getGenre()
	{
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre)
	{
		if (genre.equals("")) {
			throw new InputMismatchException();
		} else {
			this.genre = genre;
		}
	}
	
	public abstract String getMedia();
	
	public abstract int getMinutes();
	
	public abstract void setMinutes(int minutes);
	
	@Override
	public String toString()
	{
		return "Movie [title=" + title + ", genre=" + genre + "]";
	}
	
	
}
