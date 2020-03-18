package bookExercises;

import java.util.Scanner;

public class Book411 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a decimal value (0 to 15): ");
		Scanner input = new Scanner(System.in);
		int dec = input.nextInt();
		input.close();
		if (dec<16 && dec>=0) {
		System.out.println(Integer.toHexString(dec));
		}
		else { 
			System.out.println(dec + " is an invalid input");
		}
	}

}
