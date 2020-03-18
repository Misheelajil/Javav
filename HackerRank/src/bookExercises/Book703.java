package bookExercises;

import java.util.Scanner;

public class Book703 {
	private static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int a[];
		a = new int[100];
		for (int i=0;i<10;i++) {
			a[i]=in.nextInt();
		}
		for (int i=0;i<10;i++) {
			int count=0;
			for (int j=i;j<10;j++) {
				if (a[i]==a[j]) {
					count++;
				}
			}
			System.out.println(a[i] + "occurs" + count + "times");
		}
	}

}
