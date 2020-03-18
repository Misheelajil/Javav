package bookExercises;

import java.util.Scanner;

public class Book62 {
	public static int sumDigits(long n) {
		int sum =0;
		while (n>0) {
			sum+=n%10;
			n=n/10;
		}
		return sum;
	}
	private final static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
			System.out.println(sumDigits(in.nextLong()));
	}

}
