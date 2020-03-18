package bookExercises;

import java.util.Scanner;

/*
 * 7.1 (Assign grades) Write a program that reads student scores, gets the best score,
and then assigns grades based on the following scheme:
Grade is A if score is Ú best - 10
Grade is B if score is Ú best - 20;
Grade is C if score is Ú best - 30;
Grade is D if score is Ú best - 40;
Grade is F otherwise.
The program prompts the user to enter the total number of students, then prompts
the user to enter all of the scores, and concludes by displaying the grades. Here
is a sample run:
 */
public class Book701 {
	public static int Best(int a[]) {
		int Best = a[0];
		for (int k:a) {
			if (k>Best) {
				Best = k;
			}
		}
		return Best;
	}
	public static  void gradeIs(int a[], char b[]) {
		int d = 0;
		int best = Best(a);
		for(int i = 0; i<a.length;i++) {
			if (a[i] >= best-10) {
				d = 0;
			}
			else if (a[i] >= best-20) {
				d=1;
			}
			else if (a[i] >= best-30) {
				d=2;
			}
			else if (a[i] >= best-40) {
				d=3;
			}
			else {
				d=4;
			}
			System.out.println("Student " + i + " score is " + a[i] + " and grade is " + b[d]);
			}
	}
	private static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number of students: ");
		int number = in.nextInt();
		System.out.println("Enter " + number + " scores:");
		int a[]= new int[number];
		for (int i=0;i<number;i++) {
			a[i]=in.nextInt();
		}
		char b[] = {'A','B','C','D','F'};
		gradeIs(a, b);
	}

}
