package bookExercises;

import java.util.Scanner;

public class Book613 {
	private final static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		sum(in.nextInt());
		
	}
	public static void sum(int i) {
		double sum = 0.0;
		for (double j=1.0;j<=i;j++) {
			sum+=j/(j+1.0);
			System.out.println(j + "  " + sum);
		}
	}

}
