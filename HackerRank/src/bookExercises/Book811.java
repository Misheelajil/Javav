package bookExercises;

import java.util.Scanner;

public class Book811 {
	public static int[][] readASolution(int a[][],int n,int k) {
		
		System.out.println("Enter a binary numbers");
		for (int i=0;i<n;i++) {
			for (int j=0;j<k;j++) {
				a[i][j]=scanner.nextInt();
			}
		}
		return a;
		
	}
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter how many matrix you enter");
		int n = scanner.nextInt();
		System.out.println("Enter how large you want your matrix between N * N =");
		int k = scanner.nextInt();
        int [][] a=new int [n][k];
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		readASolution(a,n,k);
        for (int i = 0;i<n;i++) {
        	for (int j =0;j<k;i++) {
        		System.out.print(a[i][j] + " ");		
        	}
        }
	}
}
