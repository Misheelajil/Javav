package bookExercises;

import java.util.Random;
import java.util.Scanner;

/*
 *6.17 (Display matrix of 0s and 1s) Write a method that displays an n-by-n matrix using
the following header:
public static void printMatrix(int n)
Each element is 0 or 1, which is generated randomly. Write a test program that
prompts the user to enter n and displays an n-by-n matrix. Here is a sample run:
 */
public class Book617 {
	public static void printMatrix(int n) {
		Random rand = new Random();
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				
				int randy = rand.nextInt(2);
			System.out.print(randy + " ");
			}
			System.out.println();
		}
	}
	private final static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix = in.nextInt();
		printMatrix(matrix);
	}

}
