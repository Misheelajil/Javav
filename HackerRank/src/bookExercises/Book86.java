package bookExercises;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Book86 {
	public static Double[][] readASolution() {
		 Double[][] array = new Double[4][4];
			for (int i =0;i<3;i++) {
		    	  for (int j=0;j<3;j++) {
		    		  array[i][j] = scanner.nextDouble();
		    	  }
		      }
			return array;
	}
	public static void print(Double[][] a, Double[][] b, Double[][] matrix3) {	
		System.out.println("The matrices are added as follows");
		for (int i=0;i<3;i++) {
			System.out.println();
			for (int j=0;j<3;j++) {			
			System.out.print(a[i][j] + " ");
			}
			if (i==1) System.out.print("+ ");
			else System.out.print("  ");
			for (int k=0;k<3;k++) {
			System.out.print(b[i][k] + " ");
			}
			if (i==1) System.out.print("= ");
			else System.out.print("  ");
			for (int m=0;m<3;m++) {
				System.out.print(d.format(matrix3[i][m]) + " ");
				}
			}

	}
	private static DecimalFormat d = new DecimalFormat("#.##");
	public static Double[][] multiplyASolution(Double[][] a, Double[][] b) {
		 Double[][] c = new Double[4][4];
			for (int i =0;i<3;i++) {
		    	  for (int j=0;j<3;j++) {
		    		  c[i][j] = a[i][0] * b[0][j] + a[i][1]*b[1][j] + a[i][2]*b[2][j] ;
		    	  }
		      }
			return c;
	}
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter Matrix1: ");
	    Double[][] a = readASolution();
		System.out.print("Enter Matrix2: ");
	    Double[][] b = readASolution();
	    Double[][] c = multiplyASolution(a,b);
	    print(a,b,c);
		
	    scanner.close();
	}
}
