import java.util.InputMismatchException;

/**
 * Class: Item
 * 
 * @author Taylor Williams
 * @version 1.0 Course: ITEC 2150 Fall, 2019 Written: 10/22/2019
 * Description: This is the Item class that is inherited by the Book, Music, & Video classes          
 *          
 */
public abstract class Item implements Comparable<Item>
{
	@Override
	public int compareTo(Item item2)
	{
		if ((getName() == item2.getName()) && (getType() == item2.getType()))
		{
			return 0;
		} else if (getName() != item2.getName())
		{
			return getName().compareTo(item2.getName());
		} else
		{
			return getType().compareTo(item2.getType());
		}

	}

	private String name;
	private int number;
	private String type;
	private double cost;

	/**
	 * 
	 */
	public Item()
	{
		this.name = "Not set";
		this.number = 0;
		this.type = "book";
		this.cost = 100;
	}

	/**
	 * @param name
	 * @param number
	 * @param type
	 * @param cost
	 */
	public Item(String name, int number, String type, double cost)
	{
		this.name = name;
		this.number = number;
		this.type = type;
		this.cost = cost;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		if (name.equals(""))
		{
			throw new InputMismatchException();
		} else
		{
			this.name = name;
		}
	}

	/**
	 * @return the number
	 */
	public int getNumber()
	{
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number)
	{
		this.number = number;
	}

	/**
	 * @return the type
	 */
	public String getType()
	{
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type)
	{
		if (type.equalsIgnoreCase("book") || type.equalsIgnoreCase("music") || type.equalsIgnoreCase("video"))
		{
			this.type = type;
		}
	}

	/**
	 * @return the cost
	 */
	public double getCost()
	{
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost)
	{
		if (cost > -1 && cost < 101)
		{
			this.cost = cost;
		}
	}

	public abstract String getMediaType();

	public abstract void setMediaType(String mediaType);

	public abstract String getSource();

	public abstract void setSource(String source);

	@Override
	public String toString()
	{
		return "Item [name=" + name + ", number=" + number + ", type=" + type + ", cost=" + cost + "]";
	}

}
