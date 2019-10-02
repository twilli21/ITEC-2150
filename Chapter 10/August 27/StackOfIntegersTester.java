/**
 * 
 */

/**
 * @author Taylor Williams
 * @version 1.0
 * Course: ITEC 2150 Fall 2019
 * Written Aug 27, 2019
 *
 * This class will print the set of integers.
 */
import java.util.Scanner;

public class StackOfIntegersTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		StackOfIntegers integers = new StackOfIntegers();
		System.out.println("Please enter 10 numbers:");
		/**
		 * This calls push() & store out the integers.
		 */
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Please enter number #" + (i + 1) + ":");
			int integer = input.nextInt();
			integers.push(integer);
		}
		for (int i = 0; i < 10; i++)
		{
			/**
			 * This calls pop() & prints out the integers in reverse.
			 */
			System.out.println("Your new number #" + (i + 1) + " is:");
			System.out.println(integers.pop());
		}
	}
}
