import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class: Driver
 * 
 * @author Taylor Williams
 * @version 1.0 Course: ITEC 2150 Fall, 2019
 * Written: 9/17/2019
 * Description: Contains main method of Homework 2 which prints the character stats for 3 types of characters
 */
public class Homework2
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		ArrayList<LifeForm> charData = new ArrayList<LifeForm>();

		for (int i = 1; i < 4; i++)
		{
			System.out.println("Enter Lifeform " + i);
			System.out.println("Enter Lifeform type:");
			String type = input.nextLine();
			
			/**
			 * adds character data into Human class
			 */
			if (type.equalsIgnoreCase("Human"))
			{
				Human humanChar = new Human();

				humanChar.setType(type);
				System.out.println("Enter Lifeform name:");
				String name = input.nextLine();
				humanChar.setName(name);
				System.out.println("Enter hit points:");
				int points = input.nextInt();
				humanChar.setHitPoints(points);
				System.out.println("Enter strength:");
				int strength = input.nextInt();
				humanChar.setStrength(strength);
				System.out.println("Enter weapon:");
				String weapon = input.next();
				humanChar.setWeapon(weapon);
				System.out.println("Enter magic:");
				int magic = input.nextInt();
				humanChar.setMagic(magic);
				input.nextLine();
				charData.add(humanChar);
			}
			
			/**
			 * adds character data into Dragon class
			 */
			else if (type.equalsIgnoreCase("Dragon"))
			{
				Dragon dragonChar = new Dragon();

				dragonChar.setType(type);
				System.out.println("Enter Lifeform name:");
				String name = input.nextLine();
				dragonChar.setName(name);
				System.out.println("Enter hit points:");
				int points = input.nextInt();
				dragonChar.setHitPoints(points);
				System.out.println("Enter strength:");
				int strength = input.nextInt();
				dragonChar.setStrength(strength);
				System.out.println("Enter weapon:");
				String weapon = input.next();
				dragonChar.setWeapon(weapon);
				System.out.println("Enter magic:");
				int magic = input.nextInt();
				dragonChar.setMagic(magic);
				input.nextLine();
				charData.add(dragonChar);
			}
			
			/**
			 * adds character data into Unicorn class
			 */
			else if (type.equalsIgnoreCase("Unicorn"))
			{
				Unicorn unicornChar = new Unicorn();

				unicornChar.setType(type);
				System.out.println("Enter Lifeform name:");
				String name = input.nextLine();
				unicornChar.setName(name);
				System.out.println("Enter hit points:");
				int points = input.nextInt();
				unicornChar.setHitPoints(points);
				System.out.println("Enter strength:");
				int strength = input.nextInt();
				unicornChar.setStrength(strength);
				System.out.println("Enter weapon:");
				String weapon = input.next();
				unicornChar.setWeapon(weapon);
				System.out.println("Enter magic:");
				int magic = input.nextInt();
				unicornChar.setMagic(magic);
				input.nextLine();
				charData.add(unicornChar);
			}
			
			else
			{
				System.out.println("Unknown lifeform- not added to list");
			}
			
		}

		System.out.println("The available life forms are: ");

		for (int i = 0; i < charData.size(); i++)
		{
			LifeForm character = charData.get(i);
			System.out.println(character.toString());
		}
	}
}
