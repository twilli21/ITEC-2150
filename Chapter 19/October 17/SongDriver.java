import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
/**
 * 
 */
import java.util.Scanner;

/**
 * @author twilli21
 *
 */
public class SongDriver
{
	/** Bubble sort method */
	  public static <T extends Comparable> void bubbleSort(T[] list) {
	    boolean needNextPass = true;
	    
	    for (int k = 1; k < list.length && needNextPass; k++) {
	      // Array may be sorted and next pass not needed
	      needNextPass = false;
	      for (int i = 0; i < list.length - k; i++) {
	        if (list[i].compareTo (list[i + 1]) >0) {
	          // Swap list[i] with list[i + 1]
	          T temp = list[i];
	          list[i] = list[i + 1];
	          list[i + 1] = temp;
	          
	          needNextPass = true; // Next pass still needed
	        }
	      }
	    }
	  }

	public static void main(String[] args)
	{
		File file = null;
		FileReader fr = null;
		Scanner inFile = null;
		ArrayList<Song> song = new ArrayList<Song>();
		try
		{
			file = new File("songs.txt");
			fr = new FileReader(file);
			inFile = new Scanner(fr);
			
			while (inFile.hasNext())
			{
				String title = inFile.nextLine();				
				String artist = inFile.nextLine();
				Song newSong = new Song(title, artist);
				song.add(newSong);
				
			}
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("Can't find file.");
			ex.printStackTrace();
		}
		finally
		{
			inFile.close();
		}
		
		Song[] list = song.toArray(new Song[song.size()] );
		bubbleSort(list);
		
		for (int i = 0; i < list.length; i++)
		{
			System.out.println(list[i] + " ");
		}
	}
}
