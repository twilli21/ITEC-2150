import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Class: WriteLifeforms
 * 
 * @author Taylor Williams
 * @version 1.0 Course: ITEC 2150 Fall, 2019
 * Written: 10/1/2019
 * Description: Prints the user inputs in text file
 */
public class WriteLifeforms
{
	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner input = new Scanner(System.in);
		PrintWriter pw = new PrintWriter("Lifeforms2.txt");

		for (int i = 1; i < 4; i++)
		{

			System.out.println("Enter Lifeform " + i);
			System.out.println("Enter Lifeform type:");
			String type = input.nextLine();
			pw.println(type);
			
			/**
			 * adds character data into Human class
			 */
			if (type.equalsIgnoreCase("Human"))
			{

				System.out.println("Enter Lifeform name:");
				String name = input.nextLine();
				pw.println(name);
				System.out.println("Enter hit points:");
				int points = input.nextInt();
				pw.println(points);
				System.out.println("Enter strength:");
				int strength = input.nextInt();
				pw.println(strength);
				System.out.println("Enter weapon:");
				String weapon = input.next();
				pw.println(weapon);
				System.out.println("Enter magic:");
				int magic = input.nextInt();
				pw.println(magic);
				input.nextLine();

			}
			
			/**
			 * adds character data into Dragon class
			 */
			else if (type.equalsIgnoreCase("Dragon"))
			{

				System.out.println("Enter Lifeform name:");
				String name = input.nextLine();
				pw.println(name);
				System.out.println("Enter hit points:");
				int points = input.nextInt();
				pw.println(points);
				System.out.println("Enter strength:");
				int strength = input.nextInt();
				pw.println(strength);
				System.out.println("Enter weapon:");
				String weapon = input.next();
				pw.println(weapon);
				System.out.println("Enter magic:");
				int magic = input.nextInt();
				pw.println(magic);
				input.nextLine();
				
			}
			
			/**
			 * adds character data into Unicorn class
			 */
			else if (type.equalsIgnoreCase("Unicorn"))
			{

				System.out.println("Enter Lifeform name:");
				String name = input.nextLine();
				pw.println(name);
				System.out.println("Enter hit points:");
				int points = input.nextInt();
				pw.println(points);
				System.out.println("Enter strength:");
				int strength = input.nextInt();
				pw.println(strength);
				System.out.println("Enter weapon:");
				String weapon = input.next();
				pw.println(weapon);
				System.out.println("Enter magic:");
				int magic = input.nextInt();
				pw.println(magic);
				input.nextLine();

			}
			
			else
			{
				System.out.println("Unknown lifeform- not added to list");
			}
			
		}
		input.close();
		pw.close();
		System.out.println("File writing complete");
	}
}