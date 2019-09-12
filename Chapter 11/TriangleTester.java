/**
 * 
 */

/**
 * @author Taylor Williams
 * @version 1.0
 * Course: ITEC 2150 Fall 2019
 * Written Sept 5, 2019
 * 
 * This class creates a default triangle object and prints
 * it's description and its area and perimeter.
 */

public class TriangleTester {

	public static void main(String[] args) {
		
		Triangle triangle1 = new Triangle();
		Triangle triangle2 = new Triangle(5,4,10);
		System.out.println(triangle1.toString());
		System.out.println("Triangle has perimeter = " + triangle1.getPerimeter());
		System.out.println("Triangle has area = " + triangle1.getArea());
		System.out.println(triangle2.toString());
		System.out.println("Triangle has perimeter = " + triangle2.getPerimeter());
		System.out.println("Triangle has area = " + triangle2.getArea());
		
		
	}
	
}
