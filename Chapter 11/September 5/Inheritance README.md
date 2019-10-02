Attached is the file GeometricObject.java.  Include this in your project, but do not change.

Create a class named Triangle that extends GeometricObject.  The class contains:

Three double fields named side1, side2, and side3 with default values = 1.0.  These denote the three sides of the triangle
A no-arg constructor that creates a default triangle
A constructor that creates a triangle with parameters specified for side1, side2, and side3.
An accessor method for each side.  (No mutator methods for the sides)
A method named getArea() that returns the area of the triangle.
A method named getPerimeter() that returns the circumference of the triangle
A method named toString() that returns a string description of the triangle
Create a TriangleTester class with a main method that creates a default triangle object and prints it's description and its area and perimeter.  It should also create a second triangle object with side1 = 5, side 2 = 4 and side 3 =10.  Print it's description, area and perimeter.

Formula for area of a triangle requires two steps:

double s = (side1 + side2 + side3)/2;

double area = Math.sqrt(s * Math.abs(s-side1) * Math.abs(s-side2) * Math.abs(s-side3));

Perimeter is the sum of the three sides.
