package bookExercises;

import java.util.Scanner;

public class Book48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter an ASCII code:");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		input.close();
		char c = (char) a;
		System.out.println("The character for ASCII code " + a + " is " +  c);
	}

}
