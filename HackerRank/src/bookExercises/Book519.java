package bookExercises;

import java.util.Scanner;

public class Book519 {

	private static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = in.nextInt();
		for (int i=0;i<n;i++) {
			int k=0;
			for(int j=0;j<n+n;j++) {
				if (i<n-j-1^j>n+i-1) {
					System.out.printf("%-5s", " ");
				}
				else
				{
					double d=Math.pow(2, k);
					int a = (int)d;
					System.out.printf("%-5s", a);
					if (j<n-1) {
						k++;
					}
					else if (j+1>=n) {
						k--;
					}
					
				}
					
			}
			System.out.println();
		}
	}

}
