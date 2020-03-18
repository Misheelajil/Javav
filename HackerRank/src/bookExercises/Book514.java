package bookExercises;

import java.util.Scanner;

/*
	 * (Compute the greatest common divisor) Another solution for Listing 5.9 to find
	the greatest common divisor of two integers n1 and n2 is as follows: First find d
	to be the minimum of n1 and n2, then check whether d, d-1, d-2, . . . , 2, or 1 is
	a divisor for both n1 and n2 in this order. The first such common divisor is the
	greatest common divisor for n1 and n2. Write a program that prompts the user to
	enter two positive integers and displays the gcd.
	LISTING 5.9 GreatestCommonDivisor.java
import java.util.Scanner;

public class GreatestCommonDivisor {
/** Main method */
/*
public static void main(String[] args) {
// Create a Scanner
Scanner input = new Scanner(System.in);

// Prompt the user to enter two integers
 System.out.print("Enter first integer: ");
 int n1 = input.nextInt();
 System.out.print("Enter second integer: ");
 int n2 = input.nextInt();

 int gcd = 1; // Initial gcd is 1
 int k = 2; // Possible gcd
 while (k <= n1 && k <= n2) {
 if (n1 % k == 0 && n2 % k == 0)
 gcd = k; // Update gcd
 k++;
 }

 System.out.println("The greatest common divisor for " + n1 +
 " and " + n2 + " is " + gcd);
 }
 }
*/
public class Book514 {
	private static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int a =in.nextInt();
		int b =in.nextInt();
		int d = 0;
		if (a>b) {
			d = b;
			
		}
		else {
			d = a;
		}
		for (int i = 0; i<d;i++) {
			if (a%(d-i)==0&&b%(d-i)==0) {
				System.out.println("Greatest common divisor : " + (d-i));
				break;
			}
		}
	}

}
