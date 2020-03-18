package bookExercises;

import java.util.Arrays;
import java.util.Scanner;

public class Book424 {
	public static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] toppings = new String[3];
		System.out.println("Enter the first city: ");
		toppings [0]=in.nextLine();
		System.out.println("Enter the second city: ");
		toppings [1]=in.nextLine();
		System.out.println("Enter the third city: ");
		toppings [2]=in.nextLine();
		Arrays.sort(toppings);
		System.out.print("The three cities in alphabetical order are ");
		for (int i=0; i<3;i++) {
			System.out.print(toppings[i] + " ");
		}
	}

}
