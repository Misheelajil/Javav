package bookExercises;

import java.util.Scanner;

public class Book85 {
	public static Double[][] readASolution() {
		 Double[][] array = new Double[4][4];
			for (int i =0;i<3;i++) {
		    	  for (int j=0;j<3;j++) {
		    		  array[i][j] = scanner.nextDouble();
		    	  }
		      }
			return array;
	}
	public static void print(Double[][] matrix1, Double[][] matrix2, Double[][] matrix3) {	
		System.out.println("The matrices are added as follows");
		for (int i=0;i<3;i++) {
			System.out.println();
			for (int j=0;j<3;j++) {			
			System.out.print(matrix1[i][j] + " ");
			}
			if (i==1) System.out.print("+ ");
			else System.out.print("  ");
			for (int k=0;k<3;k++) {
			System.out.print(matrix2[i][k] + " ");
			}
			if (i==1) System.out.print("= ");
			else System.out.print("  ");
			for (int m=0;m<3;m++) {
				System.out.print(matrix3[i][m] + " ");
				}
			}

	}
	public static Double[][] sumASolution(Double[][] matrix1, Double[][] matrix2) {
		 Double[][] matrix3 = new Double[4][4];
			for (int i =0;i<3;i++) {
		    	  for (int j=0;j<3;j++) {
		    		  matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
		    	  }
		      }
			return matrix3;
	}
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter Matrix1: ");
	    Double[][] matrix1 = readASolution();
		System.out.print("Enter Matrix2: ");
	    Double[][] matrix2 = readASolution();
	    Double[][] matrix3 = sumASolution(matrix1,matrix2);
	    print(matrix1,matrix2,matrix3);
		
	    scanner.close();
	}
}
