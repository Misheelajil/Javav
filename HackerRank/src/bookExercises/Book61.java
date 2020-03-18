package bookExercises;

public class Book61 {
	public static int getPentagonalNumber(int n) {
		return n*(n*3-1)/2;
		
	}
	public static void main(String[] args) {

		for (int i=1;i<=100;i++) {
			System.out.print(getPentagonalNumber(i) + " ");
			if (i%10==0) {
				System.out.println();
			}
		}
	}

}
