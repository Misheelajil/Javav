package bookExercises;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * (Analyze scores) Write a program that reads an unspecified number of scores and
determines how many scores are above or equal to the average and how many
scores are below the average. Enter a negative number to signify the end of the
input. Assume that the maximum number of scores is 100.
 */
public class Book704 {
	private static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int n = in.nextInt();
		int a[]= new int[n];
		int above=0;
		int below=0;
		int sum =0;
		int avg =0;
		int equal=0;
		for (int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		for (int i =0;i<n;i++) {
			sum+=a[i];
		}
		avg=sum/n;
		for (int i =0;i<n;i++) {
			if (a[i]>avg) {
				above++;
			}
			else if (a[i]==avg) {
				equal++;
			}
			else if (a[i]<0){
				break;
			}
			else {
				below++;
			}
		}
		System.out.println("Above:" + above);
		System.out.println("Below:" + below);
		System.out.println("Equal:" + equal);
	}

}
