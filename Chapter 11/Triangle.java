/**
 * 
 */

/**
 * @author Taylor Williams
 * @version 1.0
 * Course: ITEC 2150 Fall 2019
 * Written Sept 5, 2019
 * 
 * This class holds information for a triangle
 * that extends GeometricObject.
 */

public class Triangle extends GeometricObject {

	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() {
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}
	
	/**
	 * @param side1
	 * @param side2
	 * @param side3
	 */
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	/**
	 * @return the side1
	 */
	public double getSide1() {
		return side1;
	}
	/**
	 * @return the side2
	 */
	public double getSide2() {
		return side2;
	}
	/**
	 * @return the side3
	 */
	public double getSide3() {
		return side3;
	}

	@Override
	public double getArea() {
		double s = (side1 + side2 + side3)/2;
		double area = Math.sqrt(s * Math.abs(s-side1) * Math.abs(s-side2) * Math.abs(s-side3));
		return area;
	}

	@Override
	public double getPerimeter() {
		double sum = side1 +side2 + side3;
		return sum;
	}

	@Override
	public String toString() {
		return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]";
	}
	
}
