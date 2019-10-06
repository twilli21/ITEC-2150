import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

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
	public static void main(String[] args) throws FileNotFoundException
	{
		
		File inFile = new File("CarlAndTheCottonGin.txt");
		PrintWriter pw = new PrintWriter("stats.txt");
		FileReader fr = new FileReader(inFile);
		Scanner input = new Scanner(fr);
		input.useDelimiter("[^a-zA-Z]+");
		int wordCount = 0;
		int the = 0;
		int aOrAn = 0;
		
		/**
		 * Counts words
		 */
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
		
		/**
		 * Closes PrintWriter
		 */
		input.close();
		pw.close();
		System.out.println("Stats are written on a file called \"stats.txt\"");
	}
}
