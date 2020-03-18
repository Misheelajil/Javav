package bookExercises;
import java.util.*;
public class Book51 {
	public static final Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int n=1;
		int positive = 0;
		int negative = 0;
		int sum = 0;
		System.out.println("Enter an integer, the input ends if it is 0:");
		while(n!=0) {
			int m = input.nextInt();
			if (m==0) {
				n=m;
			}
			else if (m>0) {
				positive++;
			}
			else {
				negative++;
			}
			sum+=m;
		}
		input.close();
		float result = (float)sum / (positive+negative);
		System.out.println("The number of positives is "+ positive);
		System.out.println("The number of negative is "+ negative);
		System.out.println("The total is " + sum);
		System.out.println("The average is " + result);
		
	}
}
