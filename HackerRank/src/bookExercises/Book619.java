package bookExercises;

import java.util.Scanner;

/*
*6.19 (The MyTriangle class) Create a class named MyTriangle that contains the
following two methods:
/** Return true if the sum of any two sides is
* greater than the third side.
public static boolean isValid(
double side1, double side2, double side3)
 Return the area of the triangle. 
public static double area(
double side1, double side2, double side3)
Write a test program that reads three sides for a triangle and computes the area if
the input is valid. Otherwise, it displays that the input is invalid. The formula for
computing the area of a triangle is given in Programming Exercise 2.19.
 */
public class Book619 {
	public static boolean isValid(double side1, double side2, double side3) {
		if (((side1+side2)>side3)&&((side1+side3)>side2)&&((side2+side3)>side1)){
			return true;
		}
		return false;
	}
	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3)/2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		
		return area;
	}
	private final static  Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		double side1 = in.nextDouble(), side2 = in.nextDouble(), side3 = in.nextDouble();
		if(isValid(side1, side2, side3)) {
			System.out.println(area(side1, side2, side3));
		}
		
	}

}
