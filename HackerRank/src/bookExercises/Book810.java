package bookExercises;
import java.util.Arrays;

public class Book810 {
	public static void print(int matrix[][]) {
		for (int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
	static int randomWithRange(int min, int max)
	{
	   int range = (max - min) + 1;     
	   return (int)(Math.random() * range) + min;
	}
	static int largestRow(int[][] matrix, int[] matrix1)
	{
		for (int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				matrix1[i]+=matrix[i][j];
			}
		}
		int max = Arrays.stream(matrix1).max().getAsInt();
		int max2=0;
		for (int i=0;i<4;i++) {
			if (matrix1[i]==max) {
				max2=i;
			}
		}
		return max2;
		
	}
	static int largestColumn(int[][] matrix, int[] matrix2)
	{
		for (int j=0;j<4;j++){
			for (int i=0;i<4;i++) {
				matrix2[j]+=matrix[i][j];
			}
		}
		int max1 = Arrays.stream(matrix2).max().getAsInt();
		int max3 = 0;
		for (int i=0;i<4;i++) {
			if (matrix2[i]==max1) {
				max3=i;
			}
		}
		return max3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[4][4];
		int[] matrix1 =new int[4];
		int[] matrix2 =new int[4];
		for (int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				matrix[i][j]= randomWithRange(0,1);
			}
		}
		print(matrix);
		System.out.println("The largest row index: " + largestRow(matrix,matrix1));
		System.out.println("The largest row column: " + largestColumn(matrix,matrix2));
		
	}

}
