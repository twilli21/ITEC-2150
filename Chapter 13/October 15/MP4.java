/**
 * 
 */

/**
 * @author twilli21
 *
 */
public class MP4 extends Movie
{
	private int minutes;
	
	/**
	 * 
	 */
	public MP4()
	{
		// TODO Auto-generated constructor stub
	}
	
	public MP4(String title, String genre, int minutes)
	{
		super(title, genre);
		this.minutes = minutes;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMedia()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMinutes()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setMinutes(int minutes)
	{
		if (minutes > 0)
		{
			this.minutes = minutes;
		}
	}

	@Override
	public String toString()
	{
		return super.toString() + " MP4 [minutes=" + minutes + "]";
	}
}
