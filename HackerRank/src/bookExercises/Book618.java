package bookExercises;
import java.util.regex.*;
import java.util.Scanner;

/*
 * **6.18 (Check password) Some websites impose certain rules for passwords. Write a
method that checks whether a string is a valid password. Suppose the password
rules are as follows:
■ A password must have at least eight characters.
■ A password consists of only letters and digits.
■ A password must contain at least two digits.
Write a program that prompts the user to enter a password and displays Valid
Password if the rules are followed or Invalid Password otherwise.
 */
public class Book618 {
	public static boolean check(String password) {
		if (Pattern.matches("[a-z]{8,}[0-9]{2,}", password)) {
		return true;
		}
		else {
			return false;
		}
		
	}
	private final static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = in.nextLine();
		if(check(password)) {
			System.out.println("True");
		}
		else {
		System.out.println("False");
		}
	}

}
