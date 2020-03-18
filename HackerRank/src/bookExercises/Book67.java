package bookExercises;

import java.util.Scanner;

public class Book67 {
	public static double futureInvestmentValue(
			double investmentAmount, double monthlyInterestRate, int years) {
        double futureInvestmentValue = investmentAmount *
                Math.pow((1 + monthlyInterestRate/1200), (years * 12));
		return futureInvestmentValue;
	}
	private final static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double first = in.nextDouble();
		double second = in.nextDouble();
	for (int i=1;i<=30;i++) {
		System.out.println(i+ " " + futureInvestmentValue(first, second, i));
	}
	
	}

}
