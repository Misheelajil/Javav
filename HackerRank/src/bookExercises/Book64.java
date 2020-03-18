package bookExercises;

import java.util.Scanner;

public class Book64 {
	public static void reverse(int number) {
		int sum = 0;
		while (number>0) {
			sum+=number % 10;
			number=number/10;
			if (sum>0 && number >0) {
				sum=sum*10;
			}
			
		}
		System.out.println(sum);
	}
	private final static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse(in.nextInt());
	}

}
