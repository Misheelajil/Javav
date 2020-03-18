package bookExercises;

import java.util.Scanner;

/*
 *(Find the index of the smallest element) Write a method that returns the index of
the smallest element in an array of integers. If the number of such elements is
greater than 1, return the smallest index. Use the following header:
public static int indexOfSmallestElement(double[] array)
Write a test program that prompts the user to enter ten numbers, invokes this
method to return the index of the smallest element, and displays the index.
 */
public class Book710 {

	private static final Scanner in = new Scanner(System.in);
	public static int indexOfSmallestElement(double[] array) {
		double min =array[0];
		int number =0;
		for (int i=1;i<array.length;i++) {
			if(min>array[i]) {
				min=array[i];
				number=i;
			}
		}
		
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] array= new double[10];
		for(int i=0;i<10;i++) {
			array[i]= in.nextDouble();
		}
		System.out.println(indexOfSmallestElement(array));
	}

}
