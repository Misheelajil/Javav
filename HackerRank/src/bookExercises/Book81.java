package bookExercises;
import java.util.*;

public class Book81 {
	public static Double[][] readASolution() {
		 Double[][] array = new Double[3][4];
			for (int i =0;i<3;i++) {
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
			for (int i=0;i<3;i++) {
				if (i==0) {
					array1[j]=0.0;
				}
				array1[j]+=array[i][j];
			}
		}	
		return array1;
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
		print(array1);
		
	}
}
