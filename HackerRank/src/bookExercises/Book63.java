package bookExercises;

import java.util.Scanner;

public class Book63 {
	public static int reverse(int number) {
		int sum = 0;
		while (number>0) {
			sum+=number % 10;
			number=number/10;
			if (sum>0 && number >0) {
				sum=sum*10;
			}
			
		}
		return sum;
	}
	public static boolean isPalindrome(int number) {
		if (number==reverse(number)) {
		return true;
		}
		else return false;
	}
	private final static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(isPalindrome(in.nextInt())) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
