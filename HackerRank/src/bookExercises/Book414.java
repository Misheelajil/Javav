package bookExercises;

import java.util.Scanner;

public class Book414 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = new String[] {"A","B","C","D","F"};
		System.out.println("Enter a letter grade: ");
		Scanner input = new Scanner(System.in);
		String E =  input.nextLine();
		input.close();
		for (int i = 0; i<str.length;i++) {
			if(E.equals(str)) {
				System.out.println("The numeric value for grade " + (String)E + " is " + str[i]);
				
			}
			else {
				System.out.println(E + " is an invalid grade");
			}
		}
		}

}
