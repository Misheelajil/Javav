package bookExercises;

import java.util.Scanner;

public class Book423 {
	public static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter employee's name:");
		String name=in.next();
		System.out.println("Enter number of hours worked in a week:");
		int work=in.nextInt();
		in.nextLine();
		System.out.println("Enter hourly pay rate:");
		double pay=in.nextDouble();
		System.out.println("Enter federal tax withholding rate:");
		double fedtax=in.nextDouble();
		System.out.println("Enter state tax withholding rate:");
		double statetax=in.nextDouble();
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + (double)work);
		System.out.println("Pay Rate: $" + pay);
		System.out.println("Gross Pay: $" + (pay*work));
		System.out.println("Deductions:");
		System.out.println("  Federal Withholding (20.0%): " + ((pay*work)*20.0)/100);
		System.out.println("  State Withholding (9.0%): " + ((pay*work)*9.0)/100);
		System.out.println("  Total Deduction: " + (((pay*work)*20.0)/100 + ((pay*work)*9.0)/100 ));
		System.out.println("Net Pay: " + ((pay*work) - (((pay*work)*20.0)/100 + ((pay*work)*9.0)/100 )));
	}

}
