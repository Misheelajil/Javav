package bookExercises;

import java.util.Scanner;
import java.util.*; 
/*
 * (Sort three numbers) Write a method with the following header to display three
numbers in increasing order:

Write a test program that prompts the user to enter three numbers and invokes the
method to display them in increasing order.
 */
public class Book65 {
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		/*if (num1>num2) {
			if (num1>num3) {
				if (num2>num3) {
					System.out.println(num1 + " " + num2 + " " + num3);
				}
				else
				System.out.println(num1 + " " + num3 + " " + num2);
			}
			else
				System.out.println(num3 + " " + num2 + " " + num1);
		}
		else if (num1<num2) {
			if (num2>num3) {
				System.out.println(num2 + " " + num3 + num1);
			}
		}
		else {
			System.out.println("");
		}*/
		double[] num = {num1,num2,num3};
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
	}
	private final static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displaySortedNumbers(in.nextDouble(), in.nextDouble(), in.nextDouble());
		
	}

}
