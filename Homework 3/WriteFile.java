import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 * Class: WriteFile
 * 
 * @author Taylor Williams
 * @version 1.0
 * Course: ITEC 2150 Fall, 2019
 * Written: 10/3/2019
 * Description: Reads "CarlAndTheCottonGin.txt" and writes the stats
 * 				in a separate file called "stats.txt" 
 */

public class WriteFile
{
	public static void main(String[] args)
	{
		File inFile = null;
		PrintWriter pw = null;
		FileReader fr = null;
		Scanner input = null;
		JFileChooser fileChooser = null;
		
		int wordCount = 0;
		int the = 0;
		int aOrAn = 0;
		
		try
		{
			fileChooser = new JFileChooser();
		    if (fileChooser.showOpenDialog(null)
		        == JFileChooser.APPROVE_OPTION)
		    {
		      // Get the selected file
		      inFile = fileChooser.getSelectedFile();
		      pw = new PrintWriter("stats.txt");
		      fr = new FileReader(inFile);
		      input = new Scanner(fr);
		      input.useDelimiter("[^a-zA-Z]+");

		      // Read text from the file & count the words
		      while (input.hasNext())
		      {
		    	  String aWord = input.next();
		    	  // convert to lower case
		    	  aWord = aWord.toLowerCase();
		    	  // process the word
		    	  wordCount++;
		    	  // counts how many times the word "the" appears
		    	  if (aWord.equals("the"))
		    	  {
		    		  the++;
		    	  }
		    	  // counts how many times the word "a" appears
		    	  if (aWord.equals("a"))
		    	  {
		    		  aOrAn++;
		    	  }
		    	  // counts how many times the word "an" appears
		    	  if (aWord.equals("an"))
		    	  {
		    		  aOrAn++;
		    	  }
		      }
		      /**
		       * Prints the file name
		       */
		      pw.println("The file name is: " + inFile.getName());
				
		      /**
		       * Prints the total number of words
		       */
		      pw.println("The total number of words is: " + wordCount);
				
		      /**
		       * Prints the total number of "the"
		       */
		      pw.println("The total number of \"the\" is: " + the);
				
		      /**
		       * Prints the total number of "a" or "an"
		       */
		      pw.println("The total number of \"a\" or \"an\" is: " + aOrAn);
		    }
		}
		catch (IOException ex)
		{
			System.out.println("Error reading file");
			ex.printStackTrace();
		}
		/**
		 * Closes PrintWriter
		 */
		finally
		{
			pw.close();
			input.close();
		}
		System.out.println("Stats are written on a file called \"stats.txt\"");
	}
}