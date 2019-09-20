/**
 * Class: LifeForm
 * 
 * 
 * @author Taylor Williams
 * @version 1.0 Course: ITEC 2150 Fall, 2019
 * Written: 9/17/2019
 * Description: Holds the information of a character's strength, hit points, and type
 * 
 */
public class LifeForm
{
	private int hitPoints;
	private int strength;
	private String type;

	public LifeForm()
	{
		this.strength = 15;
		this.hitPoints = 100;
	}

	/**
	 * @param hitPoints
	 * @param strength
	 */
	public LifeForm(int hitPoints, int strength, String type)
	{
		this.hitPoints = hitPoints;
		this.strength = strength;
		this.type = type;
	}

	/**
	 * @return the hitPoints
	 */
	public int getHitPoints()
	{
		return hitPoints;
	}

	/**
	 * @param hitPoints the hitPoints to set
	 */
	public void setHitPoints(int hitPoints)
	{
		if (hitPoints > -1 && hitPoints < 19)
		{
			this.hitPoints = hitPoints;
		}
	}

	/**
	 * @return the strength
	 */
	public int getStrength()
	{
		return strength;
	}

	/**
	 * @param strength the strength to set
	 */
	public void setStrength(int strength)
	{
		if (strength > -1 && strength < 101)
		{
			this.strength = strength;
		}
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
		if (type.equalsIgnoreCase("Human") || type.equalsIgnoreCase("Dragon") || type.equalsIgnoreCase("Unicorn"))
		{
			this.type = type;
		}
	}

	@Override
	public String toString()
	{
		return "Lifeform [hitPoints=" + hitPoints + ", strength=" + strength + ", type=" + type + "]";
	}

}
