import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Class: ItemDriver
 * 
 * @author Taylor Williams
 * @version 1.0
 * Course: ITEC 2150 Fall, 2019
 * Written: 10/22/2019
 * Description: Class that sorts and prints 3 books, 3 music items, and 3 video items
 * 
 */
public class ItemDriver
{
	// Sorts the item names in alphabetical order
	public static <T extends Comparable<T>> void selectionSort(T[] list)
	{
		for (int i = 0; i < list.length - 1; i++)
		{
			// Find the minimum in the list[i..list.length-1]
			T currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++)
			{
				if (currentMin.compareTo(list[j]) > 0)
				{
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

			// Swap list[i] with list[currentMinIndex] if necessary;
			if (currentMinIndex != i)
			{
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}

	public static void main(String[] args)
	{
		File file = null;
		FileReader fr = null;
		Scanner inFile = null;
		ArrayList<Item> items = new ArrayList<Item>();
		try
		{
			file = new File("items.txt");
			fr = new FileReader(file);
			inFile = new Scanner(fr);
			
			// Read text from the file
			while (inFile.hasNext())
			{
				String type = inFile.nextLine();
				String name = inFile.nextLine();
				int number = inFile.nextInt();
				double cost = inFile.nextDouble();
				inFile.nextLine();
				String mediaType = inFile.nextLine();
				String source = inFile.nextLine();
				
				// Creates new objects for each class & adds them to the array list
				Item newObject;
				if (type.equalsIgnoreCase("book"))
				{
					newObject = new Book(name, number, type, cost, mediaType, source);
					items.add(newObject);
				}
				else if (type.equalsIgnoreCase("music"))
				{
					newObject = new Music(name, number, type, cost, mediaType, source);
					items.add(newObject);
				}
				else if (type.equalsIgnoreCase("video"))
				{
					newObject = new Video(name, number, type, cost, mediaType, source);
					items.add(newObject);
				}
				else
				{
					System.out.println("Unknown item type- not added to list");
				}
				
			}
			
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("Can't find file.");
			ex.printStackTrace();
		}
		// closes Scanner
		finally
		{
			inFile.close();
		}
		
		// Converts the array list into an array & sorts the items
		Item[] list = items.toArray(new Item[items.size()]);
		selectionSort(list);

		// Prints the newly sorted items from the newly converted array
		for (int i = 0; i < list.length; i++)
		{
			System.out.println(list[i]);
		}
	}
}