package bookExercises;

import java.util.Scanner;

/*
 * *6.16 (Number of days in a year) Write a method that returns the number of days in a
year using the following header:
public static int numberOfDaysInAYear(int year)
Write a test program that displays the number of days in year from 2000 to 2020.
 */
public class Book616 {
	public static int numberOfDaysInAYear(int year) {
		
		int day = year * 365;
		return day;
	}
	private static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i =2000;i<2021;i++) {
			System.out.println(numberOfDaysInAYear(i));
		}
	}

}
