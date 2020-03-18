package bookExercises;
/*
 (Demonstrate cancellation errors) A cancellation error occurs when you are
manipulating a very large number with a very small number. The large number
may cancel out the smaller number. For example, the result of 100000000.0 +
0.000000001 is equal to 100000000.0. To avoid cancellation errors and obtain
more accurate results, carefully select the order of computation. For example, in
computing the following series, you will obtain more accurate results by computing
from right to left rather than from left to right:
1 + 1 + 1  + ... + 1
    2   3          n

Write a program that compares the results of the summation of the preceding
series, computing from left to right and from right to left with n = 50000.

 */
public class Book523 {

	public static void main(String[] args) {
		
		double RightToLeft = 0.0;
		for (int i = 5000; i >=1; i--) {
			RightToLeft += 1.0/i;
			
		}
		System.out.println(RightToLeft);
		System.out.println("---------------------");
		double LeftToRight= 0.0;
		for (int i=1; i<=5000; i++) {
			LeftToRight += 1.0/i;
			
		}
		System.out.println(LeftToRight);
	}

}
