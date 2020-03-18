package bookExercises;

import java.util.Scanner;

/* (Average an array) Write two overloaded methods that return the average of an
array with the following headers:
public static int average(int[] array)
public static double average(double[] array)
Write a test program that prompts the user to enter ten double values, invokes this
method, and displays the average value.
 */
public class Book708 {
	private static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] array=new double[10];
		for (int j=0;j<10;j++) {
			array[j]=in.nextDouble();
		}
	System.out.println(average(array));
	}

public static int average(int[] array) {
	int sum=0;
	for (int i=0;i<array.length;i++) {
		sum+=array[i];
	}
	return sum/array.length;
}
public static double average(double[] array){
	double sum=0;
	for (int i=0;i<array.length;i++) {
		sum+=array[i];
	}
	return sum/array.length;
  }
}
