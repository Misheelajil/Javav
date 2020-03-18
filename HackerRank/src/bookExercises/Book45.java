package bookExercises;

import java.util.Scanner;

public class Book45 {
	public static final Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of sides: ");
		double number = input.nextDouble();
		System.out.println("Enter the side: ");
		double side = input.nextDouble();
		double polygon = (number*side*side)/(4*Math.tan(Math.PI/number));
		System.out.println("The area of the polygon is " + polygon);
		
	}

}
