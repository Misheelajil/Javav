package bookExercises;

import java.util.Scanner;

/*
 *  (Find the smallest element) Write a method that finds the smallest element in an
array of double values using the following header:
public static double min(double[] array)
Write a test program that prompts the user to enter ten numbers, invokes this
method to return the minimum value, and displays the minimum value. Here is a
sample run of the program:
 */
public class Book709 {

	private static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] a = new double[10];
		for (int i=0;i<10;i++) {
			a[i]=in.nextDouble();
		}
		System.out.println(min(a));
	}
	public static double min(double[] array) {
		double min = array[0];
		for (int j=1;j<array.length;j++) {
			if (min>array[j]) {
				min=array[j];
			}
		}
		return min;
	}
}
