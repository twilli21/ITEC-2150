import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author twilli21
 *
 */
public class MovieDriver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ArrayList<Movie> movie = new ArrayList<Movie>();
		String response = "";
		Scanner input = new Scanner(System.in);
		do
		{
			System.out.println("Do you want to create a BluRay or MP4 object?");
			String type = input.nextLine();
			System.out.println("Enter movie title:");
			String title = input.nextLine();
			System.out.println("Enter movie genre:");
			String genre = input.nextLine();
			System.out.println("Enter movie minutes:");
			int minutes = input.nextInt();
			input.nextLine();
			
			Movie newObject;
			if (type.equalsIgnoreCase("bluray"))
			{
				newObject = new BluRay(title, genre, minutes);
				movie.add(newObject);
			}
			else if (type.equalsIgnoreCase("mp4"))
			{
				newObject = new MP4(title, genre, minutes);
				movie.add(newObject);
			}
			else
			{
				System.out.println("Unknown movie type- not added to list");
			}
			System.out.println("Do you want to add another?");
			response = input.nextLine();
		}
		while (response.equalsIgnoreCase("Yes"));
				
		for (int i = 0; i < movie.size(); i++)
		{
			System.out.println(movie.get(i));
		}
	}
}
