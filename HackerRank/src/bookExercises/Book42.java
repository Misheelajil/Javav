package bookExercises;

import java.util.Scanner;

public class Book42 {
	public static final Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
		double x1 = input.nextDouble();
		double x11 = Math.toRadians(x1);
		double y1 = input.nextDouble();
		double y11 = Math.toRadians(y1);
		System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
		double x2 = input.nextDouble();
		double x22 = Math.toRadians(x2);
		double y2 = input.nextDouble();
		double y22 = Math.toRadians(y2);
		double radius = 6371.01;
		double d = radius * Math.acos((Math.sin(x11) * Math.sin(x22)) + (Math.cos(x11) * Math.cos(x22) * Math.cos(y11-y22)));
		System.out.println("The distance between the two points is " + d + " km");
	}

}
