package bookExercises;

import java.util.Scanner;

public class Book521 {
	public static void main(String[] args) {
// Create a Scanner
		Scanner input = new Scanner(System.in);

// Enter annual interest rate in percentage, e.g., 7.25%
		System.out.print("Enter annual interest rate, e.g., 7.25%: ");
		double annualInterestRate = input.nextDouble();

	

		// Enter number of years
		System.out.print("Enter number of years as an integer, e.g., 5: ");
		int numberOfYears = input.nextInt();

		// Enter loan amount
		System.out.print("Enter loan amount, e.g., 120000.95: ");
		double loanAmount = input.nextDouble();

		// Calculate payment
		

		// Display results
		System.out.println("Interest Rate    ");
		System.out.print("Monthly Paynment   ") ;
		System.out.print("Total Payment   ");
		for (int i=0; i<25;i++) {
			// Obtain monthly interest rate
			double monthlyInterestRate = annualInterestRate / 1200;
			double monthlyPayment = loanAmount * monthlyInterestRate
					/ (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
			double totalPayment = monthlyPayment * numberOfYears * 12;
			System.out.println();
		System.out.print(annualInterestRate + "       ");
		System.out.print((int) (monthlyPayment * 100) / 100.0 + "    "); 
		System.out.print((int) (totalPayment * 100) / 100.0);
		annualInterestRate+=0.125;
		}
		}
}