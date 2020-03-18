package bookExercises;

import java.util.Scanner;

public class Book517 {
	private static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = in.nextInt();
		for (int i=0;i<n;i++) {
			for(int j=0;j<n+n;j++) {
				if (i<n-j-1^j>n+i-1) {
					System.out.printf("%-2s", "  ");
				}
				else
					System.out.printf("%-2s", (i+1));
			}
			System.out.println();
		}
	}

}
