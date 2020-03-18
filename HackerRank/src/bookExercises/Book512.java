package bookExercises;
/*
 * (Find the smallest n such that n2 > 12,000) Use a while loop to find the smallest
integer n such that n2 is greater than 12,000.
 */
public class Book512 {

	public static void main(String[] args) {
		int n = 0;
		while (n*n<12000) {
			n++;
		}
		System.out.println(n);
	}

}
