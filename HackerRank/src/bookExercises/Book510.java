package bookExercises;
/*
 (Find numbers divisible by 5 and 6) Write a program that displays all the numbers
from 100 to 1,000, ten per line, that are divisible by 5 and 6. Numbers are
separated by exactly one space.
 */
public class Book510 {

	public static void main(String[] args) {
		int k = 1;
		for (int i = 100; i<1001;i++) {
			if (i%5==0 && i%6==0) {
				System.out.print(i + " ");	
				if (k%10==0) {
					System.out.println();
				}
				k++;
			}
			
		}
	}

}
