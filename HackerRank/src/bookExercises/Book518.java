package bookExercises;

import java.util.Scanner;

public class Book518 {
	private static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = in.nextInt();
		//patern A
		for (int i=0;i<n;i++) {
			int k=1;
			for (int j=0;j<n;j++) {
				
				if(j<i+1) {
					System.out.printf("%-2s", k);
					k++;
				}
				else {
					System.out.printf("%-2s", " ");
				}
				
			}
			System.out.println();
		}
	System.out.println("-----------------");
	//patern B
	   for (int i=0;i<n;i++) {
		   int d=1;
		   for (int j=0;j<n;j++) {
			   if (i<n-j) {
				  System.out.printf("%-2s", d);
				  d++;
			   }
			   else {
				   System.out.printf("%-2s", " ");
			   }
		   }
		   System.out.println();
	   }
	   System.out.println("-------------");
	   //patern C
	   for(int i=0;i<n;i++) {
		   for(int j=0;j<n;j++) {
			   if (j+1>=n-i) {
				   System.out.printf("%-2s",(n-j));
			   }
			   else {
				   System.out.printf("%-2s", " ");
			   }
		   }
		   System.out.println();
	   }
	   System.out.println("------------");
	   //patern D
	  for (int i = 0;i<n;i++) {
		  int c=1;
		  for (int j=0;j<n;j++) {
			  if (j>=i) {
				  System.out.printf("%-2s", c);
				  c++;
			  }
			  else {
				  System.out.printf("%-2s", " ");
			  }
		  }
		  System.out.println();
	  }
	}
}
