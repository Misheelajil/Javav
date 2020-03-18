package bookExercises;

import java.util.Scanner;

public class Book41 {
	public static final Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the length from the center to a vertex: ");
		double length = input.nextDouble();
		input.close();
		double s = 2 * length * Math.sin(Math.PI/5);
		double Area = (5 * s * s) / (4 * Math.tan(Math.PI/5));
		System.out.println("The area of the pentagon is " + Area);
	}

}
