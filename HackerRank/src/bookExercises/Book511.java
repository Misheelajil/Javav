package bookExercises;
/*(Find numbers divisible by 5 or 6, but not both) Write a program that displays
all the numbers from 100 to 200, ten per line, that are divisible by 5 or 6, but not
both. Numbers are separated by exactly one space.
 */
public class Book511 {

	public static void main(String[] args) {
		int k = 1;
		for (int i = 100; i<201;i++) {
			if (i%5==0 ^ i%6==0) {
				System.out.print(i + " ");	
				if (k%10==0) {
					System.out.println();
				}
				k++;
			}
			
		}
	}

}
