package bookExercises;
import java.util.Scanner;
/*
 (Find the two highest scores) Write a program that prompts the user to enter the
number of students and each student’s name and score, and finally displays the
student with the highest score and the student with the second-highest score.
5.10
 */
public class Book59 {
	public static final Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int N = input.nextInt();
		String [] students = new String[N];
		int [] scores = new int[N];
		for (int i=0;i<N;i++) {
			students[i]=input.next();
			scores[i]=input.nextInt();
		}
		int max = scores[0];
		int index=0;
		int second=0;
		for (int i = 0;i<N;i++) {
			if (max<scores[i]) {
				max =scores[i];
				second = index;
				index = i;
			}
			else if (scores[second]<scores[i]) {
				second = i;
			}
		}
		System.out.println("Highest Score Student: " + students[index] + " " + scores[index]);
		System.out.println("Second Highest Score Student: " + students[second] + " " + scores[second]);
	}

}
