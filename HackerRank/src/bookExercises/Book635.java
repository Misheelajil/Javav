package bookExercises;

import java.util.Scanner;

public class Book635 {
	public static double area(double side) {
		return (5* side * side )/( 4 * Math.tan(Math.PI/5));
	}
	private final static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the side: ");
		double side = in.nextDouble();
		System.out.println(area(side));
	}

}
