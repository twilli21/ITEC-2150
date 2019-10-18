
/**
 * 
 */

/**
 * @author twilli21
 *
 */
public abstract class Movie implements Comparable<Movie>
{
	@Override
	public int compareTo(Movie movie2)
	{
		return getTitle().compareTo(movie2.getTitle());
	}
	
	private String title = "Not set";
	private String genre = "Not set";
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
		setTitle(title);
		setGenre(genre);
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
