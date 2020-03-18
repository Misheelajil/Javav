package bookExercises;

import java.util.Scanner;

/*
 **5.22 (Financial application: loan amortization schedule) The monthly payment for a
given loan pays the principal and the interest. The monthly interest is computed
by multiplying the monthly interest rate and the balance (the remaining principal).
The principal paid for the month is therefore the monthly payment minus
the monthly interest. Write a program that lets the user enter the loan amount
number of years, and interest rate and displays the amortization schedule for the
loan. Here is a sample run:
 */
public class Book522 {
	private final static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// Enter loan amount
		System.out.print("Enter loan amount, e.g., 120000.95: ");
		double loanAmount = input.nextDouble();
		
		// Enter number of years
		System.out.print("Enter number of years as an integer, e.g., 5: ");
		int numberOfYears = input.nextInt();
		
		System.out.print("Enter annual interest rate, e.g., 7.25%: ");
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		System.out.println();
		double balance = loanAmount;
		for (int i = 1; i <= numberOfYears * 12; i++) {
			double interest = monthlyInterestRate * balance;
			double principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.println(i + "\t\t" + interest
			+ "\t\t" + principal + "\t\t" + balance);
			}
	}

}
