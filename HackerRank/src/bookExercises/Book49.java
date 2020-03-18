package bookExercises;

import java.util.Scanner;

public class Book49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a character: ");
		Scanner input = new Scanner(System.in);
		String a = input.next();
		input.close();
		char b = a.charAt(0);
		int c = (int) b;
		System.out.println("The Unicode for the character " + b + " is " + c);
	}

}
