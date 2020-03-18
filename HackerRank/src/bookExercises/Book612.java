package bookExercises;

import java.util.Scanner;

/*
 * 6.12 (Display characters) Write a method that prints characters using the following
header:
public static void printChars(char ch1, char ch2, int numberPerLine)
This method prints the characters between ch1 and ch2 with the specified numbers
per line. Write a test program that prints ten characters per line from 1 to Z.
Characters are separated by exactly one space.
 */
public class Book612 {
	public static void c(char ch1, char ch2, int numberPerLine) {
		int num1 = ch1;
		int num2 = ch2;
		int count=0;
		for (int i=num1;i<num2;i++) {
			if (numberPerLine==count) {
				count=0;
				System.out.println();
			}
			char c=(char)i;  
			System.out.print(c + " ");
			count++;
		}
	}
	private final static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		String x = in.next();
		String y = in.next();
		char b=x.charAt(0);
		char d=y.charAt(0);
		int too = in.nextInt();
		c(b,d,too);
	}

}
