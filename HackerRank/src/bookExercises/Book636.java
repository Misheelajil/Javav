package bookExercises;

import java.util.Scanner;

public class Book636 {
	public static double area(int n, double side) {
		return (n * side * side)/(4*Math.tan(Math.PI/n));
	}
	private final static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number of sides: ");
		int n = in.nextInt();
		System.out.println("Enter the side ");
		double side = in.nextDouble();
		System.out.println(area(n, side));
	}

}
