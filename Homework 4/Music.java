/**
 * Class: Music
 * 
 * @author Taylor Williams
 * @version 1.0 Course: ITEC 2150 Fall, 2019 Written: 10/22/2019
 * Description: This is the class that inherits from the Item class
 * 
 */
public class Music extends Item
{
	private String mediaType;
	private String source;

	/**
	 * 
	 */
	public Music()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param number
	 * @param type
	 * @param cost
	 * @param mediaType
	 * @param source
	 */
	public Music(String name, int number, String type, double cost, String mediaType, String source)
	{
		super(name, number, type, cost);
		this.mediaType = mediaType;
		this.source = source;

		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMediaType()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMediaType(String mediaType)
	{
		if (mediaType.equalsIgnoreCase("mp3") || mediaType.equalsIgnoreCase("cd")
				|| mediaType.equalsIgnoreCase("vinyl"))
		{
			this.mediaType = mediaType;
		}
	}

	@Override
	public String getSource()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSource(String source)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public String toString()
	{
		return super.toString() + " Music [mediaType=" + mediaType + ", source=" + source + "]";
	}

}
