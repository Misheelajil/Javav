package bookExercises;

import java.util.Scanner;

/*
 * Process string) Write a program that prompts the user to enter a string and displays
the characters at odd positions. Here is a sample run:
Enter a string: Beijing Chicago
BiigCiao
 */
public class Book548 {
	private final static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		String s = input.nextLine();
		for (int i=0;i<s.length();i++) {
			if (i%2==0||i==0) {
				System.out.print(s.substring(i,i+1));		
			}
		}
	}

}
