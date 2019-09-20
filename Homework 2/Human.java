/**
 * Class: Human
 * 
 * 
 * @author Taylor Williams
 * @version 1.0 Course: ITEC 2150 Fall, 2019
 * Written: 9/17/2019
 * Description: Holds the information of a human's name, weapon, and magic
 * 
 */
public class Human extends LifeForm
{
	private String name;
	private String weapon;
	private int magic;

	/**
	 * 
	 */
	public Human()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param weapon
	 * @param magic
	 */
	public Human(String name, String weapon, int magic)
	{
		this.name = name;
		this.weapon = weapon;
		this.magic = magic;
	}

	/**
	 * @param hitPoints
	 * @param strength
	 * @param type
	 */
	public Human(int hitPoints, int strength, String type)
	{
		super(hitPoints, strength, type);
		// TODO Auto-generated constructor stub
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
		this.name = name;
	}

	/**
	 * @return the weapon
	 */
	public String getWeapon()
	{
		return weapon;
	}

	/**
	 * @param weapon the weapon to set
	 */
	public void setWeapon(String weapon)
	{
		if (weapon.equalsIgnoreCase("Sword") || weapon.equalsIgnoreCase("Dagger"))
		{
			this.weapon = weapon;
		}
	}

	/**
	 * @return the magic
	 */
	public int getMagic()
	{
		return magic;
	}

	/**
	 * @param magic the magic to set
	 */
	public void setMagic(int magic)
	{
		if (magic > -1 && magic < 51)
		{
			this.magic = magic;
		}
	}

	@Override
	public String toString()
	{
		return super.toString() + "Human [name=" + name + ", weapon=" + weapon + ", magic=" + magic + "]";
	}

}
