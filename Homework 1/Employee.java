/**
 * 
 */

/**
 * @author Taylor Williams
 * @version 1.0
 * Course: ITEC 2150 Fall 2019
 * Written Aug 22, 2019
 * 
 * This class holds information for the employees.
 */

public class Employee
{
	private String firstName;
	private double hourlyRate;
	private int hoursWorked;
	
	/**
	 * @param firstName
	 * @param hourlyRate
	 * @param hoursWorked
	 */
	public Employee(String firstName, double hourlyRate, int hoursWorked)
	{
		this.firstName = firstName;
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	/**
	 * @return the hourlyRate
	 */
	public double getHourlyRate()
	{
		return hourlyRate;
	}
	/**
	 * @param hourlyRate the hourlyRate to set
	 */
	public void setHourlyRate(double hourlyRate)
	{
		this.hourlyRate = hourlyRate;
	}
	/**
	 * @return the hoursWorked
	 */
	public int getHoursWorked()
	{
		return hoursWorked;
	}
	/**
	 * @param hoursWorked the hoursWorked to set
	 */
	public void setHoursWorked(int hoursWorked)
	{
		this.hoursWorked = hoursWorked;
	}
	/**
	 * @return the grossPay
	 */
	public double getGrossPay()
	{
		double grossPay;
		if (this.hoursWorked > 40)
		{
			grossPay = (this.hourlyRate * 40) + (this.hoursWorked-40)* (this.hourlyRate * 1.5);
		}
		else
		{
			grossPay = this.hourlyRate * this.hoursWorked;
		}
		return grossPay;
	}
	@Override
	public String toString()
	{
		return "Gross pay for " + firstName + ": $" + getGrossPay();
	}
}
