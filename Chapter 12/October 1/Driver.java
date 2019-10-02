import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class: Driver
 * 
 * @author Taylor Williams
 * @version 1.0 Course: ITEC 2150 Fall, 2019 Written: 9/17/2019 Description:
 *          Contains main method of Homework 2 which prints the character stats
 *          for 3 types of characters
 */
public class Driver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ArrayList<LifeForm> charData = new ArrayList<LifeForm>();

		File inFile = new File("Lifeforms.txt");
		Scanner input = null;
		// looks in eclipse project directory for file - NOT src directory
		try
		{
			FileReader fr = new FileReader(inFile);
			input = new Scanner(fr);

			while (input.hasNext())
			{
				// System.out.println("Enter Lifeform " + i);
				// System.out.println("Enter Lifeform type:");
				String type = input.nextLine();
				if (!(type.equalsIgnoreCase("human") || type.equalsIgnoreCase("dragon")
						|| type.equalsIgnoreCase("unicorn"))) {
					System.out.println("Unknown lifeform- not added to list");
					break;
				}
				// System.out.println("Enter Lifeform name:");
				String name = input.nextLine();
				// System.out.println("Enter hit points:");
				int hitPoints = input.nextInt();
				// System.out.println("Enter strength:");
				int strength = input.nextInt();
				// read extra character generated when going from reading number to
				// string
				input.nextLine();
				// System.out.println("Enter weapon:");
				String weapon = input.nextLine();
				// System.out.println("Enter magic:");
				int magic = input.nextInt();
				// read extra character generated when going from reading number to
				// string
				input.nextLine();

				// determine which class to instantiate
				LifeForm newObject;
				if (type.equalsIgnoreCase("human"))
				{
					newObject = new Human(hitPoints, strength, type, name, weapon, magic);
					charData.add(newObject);
				} else if (type.equalsIgnoreCase("unicorn"))
				{
					newObject = new Unicorn(hitPoints, strength, type, name, weapon, magic);
					charData.add(newObject);
				} else if (type.equalsIgnoreCase("dragon"))
				{
					newObject = new Dragon(hitPoints, strength, type, name, weapon, magic);
					charData.add(newObject);
				} else
				{
					System.out.println("Unknown lifeform- not added to list");
				}
			}
		} catch (IOException ex)
		{
			ex.printStackTrace();
		} finally
		{
			input.close();
		}

		System.out.println("The available life forms are: ");

		for (int i = 0; i < charData.size(); i++)
		{
			System.out.println(charData.get(i));
		}
	}
}