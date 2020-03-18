package bookExercises;

import java.util.Scanner;

public class Book44 {
	public static final Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the side: ");
		double side = input.nextDouble();
		double Area = (6 * side * side)/(4 * Math.tan(Math.PI/6));
		System.out.println("The area of the hexagon is " + Area);
	}

}
