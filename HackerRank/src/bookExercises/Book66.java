package bookExercises;

import java.util.Scanner;

public class Book66 {
	public static void displayPattern(int n) {
		for(int i=0;i<n;i++){
			int k =i+2;
			for (int j=0;j<n;j++) {
				
				if (j>=n-i-1) {
					k--;
					System.out.print(k);
				}
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	private final static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayPattern(in.nextInt());
	}

}
