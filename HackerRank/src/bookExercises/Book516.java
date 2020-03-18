package bookExercises;

import java.util.Scanner;

public class Book516 {
	private final static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int too =in.nextInt();
		double zoo =(double) too;
		for (int i=2;i<Math.sqrt(zoo);i++){
			if (too%i==0) {
				while(too%i==0) {
					System.out.println(i + " ");
					too=too/i;
				}
			}
		}
	}

}
