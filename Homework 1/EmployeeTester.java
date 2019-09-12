/**
 * 
 */

/**
 * @author Taylor Williams
 * @version 1.0
 * Course: ITEC 2150 Fall 2019
 * Written Aug 22, 2019
 *
 * This class will print the information of the employees.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class EmployeeTester
{
	/**
	 * This makes an array of the employees.
	 */
	public static void main(String[] args)
	{
		DecimalFormat moneyFormat = new DecimalFormat("#.##");
		Scanner input = new Scanner(System.in);
		Employee[] employees = new Employee[3];
		for (int i = 0; i < employees.length; i++)
		{
			System.out.println("Please enter employee " + (i + 1) + " name: ");
			String firstName = input.nextLine();
			System.out.println("Enter employee " + (i + 1) + " hourly rate: ");
			double hourlyRate = input.nextDouble();
			System.out.println("Enter employee " + (i + 1) + " hours worked: ");
			int hoursWorked = input.nextInt();
			input.nextLine();
			employees[i] = new Employee(firstName, hourlyRate, hoursWorked);
		}
		/**
		 * This prints the gross pay of the employees.
		 */
		for (int i = 0; i < employees.length; i++)
		{
			System.out.println("Gross pay for " + employees[i].getFirstName() + ": $" + moneyFormat.format(employees[i].getGrossPay()));
		}
	}
}
