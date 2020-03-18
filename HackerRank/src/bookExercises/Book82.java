package bookExercises;
import java.util.*;

public class Book82 {
	public static Double[][] readASolution() {
		 Double[][] array = new Double[4][4];
			for (int i =0;i<4;i++) {
		    	  for (int j=0;j<4;j++) {
		    		  array[i][j] = scanner.nextDouble();
		    	  }
		      }
			scanner.close();
			return array;
	}
	public static Double[] increment(Double[][] array) {
		Double [] array1 = new Double[4];
		for (int j=0;j<4;j++) {
			for (int i=0;i<4;i++) {
				if (i==0) {
					array1[j]=0.0;
				}
				array1[j]+=array[i][j];
			}
		}	
		return array1;
	}
	public static double sumMajorDiagonal(Double[][] array) {
		Double sum = 0.0;
		for (int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if (i==j) {
					sum +=array[i][j];
				}
			}
		}
		return sum;
	}
	public static void print(Double[] array1) {
		for (int j=0;j<4;j++) {
			System.out.println("Sum of the elements at column " + j + " is " + array1[j]);
		}
	}
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	    Double[][] array = readASolution();	
		Double [] array1 = increment(array);
		Double sumDiagonal =sumMajorDiagonal(array);
		print(array1);
		System.out.println("Sum of the elements in the major diagonal is "+ sumDiagonal);
		
	}
}
