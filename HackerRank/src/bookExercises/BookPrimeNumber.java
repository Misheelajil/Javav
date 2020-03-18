package bookExercises;

import java.util.Scanner;

public class BookPrimeNumber {
	private static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int count = 0;
		int too = in.nextInt();
	
			while (count<too) {
			if (isPrimeNumber(count+2)) {
				System.out.println("Prime Number: " + (count+2));
			}
			else {
				System.out.println("Not Prime Number: " + (count+2));
			}
			count++;
			}
		

	}
	private static boolean isPrimeNumber(int n) {
		for (int i =2; i<=n/2;i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
}
