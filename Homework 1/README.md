Homework 1 – ITEC 2150, Fall 2019

Due Date: Friday, August 30, 2019 by 11:59 PM

Watch D2L as I will not extend deadline if D2L has maintenance.  Early submission is encouraged.

Late submissions will lose 10 % for every day late including weekends.

This is a review of material from ITEC 2140.  You should have the knowledge to begin on this homework immediately.

Write a compilable Java program that computes gross pay for a group of employees.  The program must use object-oriented principles.

Create a Java class to hold information for one employee.Each employee has class variables (attributes) for a name, an hourly rate, and number of hours worked that week.  The employee class should have mutator (setter) and accessor (getter) methods for each of the three class variables (a total of six methods).  In addition, there should be a method with the method header:   public double getGrossPay()
The getGrossPay method will use the class variables to compute the gross pay of the employee.  The formula for gross pay is different depending upon whether the employee worked  greater than or less than 40 hours.  For <= 40 hours, the formula is hourlyRate * hoursWorked. For > 40 hours, the formula is (hourlyRate * 40) + (hoursWork-40)* (hourlyRate * 1.5).
The main method for the program should be in a separate Java file from the Employee class file.  The main method will create an array of 3 Employee class objects.   Then the program should use an appropriate loop to read in the information of the three employees (name, hours worked, hourly rate) from the user and create an Employee object with that information and place it in the array.

Next, a second appropriate loop will call the getGrossPay() method of each object in the array and print the employee name and gross pay in a readable format for the user.  (It is appropriate to use $ when printing money).

Example output: (user input shown as Italics)

Please enter employee 1 name:  Joe 

Enter employee 1 hourly rate:  8.25

Enter employee 1 hours worked:  10

Please enter employee 2 name:  Sue

Enter employee 2 hourly rate:  8.25

Enter employee 2 hours worked:  50

Please enter employee 3 name:  Boss

Enter employee 3 hourly rate:  15

Enter employee 3 hours worked:  40

Gross pay for Joe:  $82.50

Gross pay for Sue: $453.75

Gross pay for Boss: $600
