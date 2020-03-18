package bookExercises;
/*
 (Financial application: find the sales amount) You have just started a sales job
in a department store. Your pay consists of a base salary and a commission. The
base salary is $5,000. The scheme shown below is used to determine the commission
rate.
Enter the initial deposit amount: 10000
Enter annual percentage yield: 5.75
Enter maturity period (number of months): 18
Month CD Value
1 10047.92
2 10096.06
...
17 10846.57
18 10898.54
Sales Amount Commission Rate
$0.01–$5,000 8 percent
$5,000.01–$10,000 10 percent
$10,000.01 and above 12 percent
Note that this is a graduated rate. The rate for the first $5,000 is at 8%, the next
$5000 is at 10%, and the rest is at 12%. If the sales amount is 25,000, the commission
is 5,000 * 8% + 5,000 * 10% + 15,000 * 12% = 2,700.
 */
public class Book611 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sales Amount_____Commision");
		for (int i =0;i<20;i++) {
			double commision = computeCommission(i*5000+5000);
			System.out.println((i*5000+5000) + "   " + commision);
		}
		
	}
	public static double computeCommission(double salesAmount) {
		Double sum = 0.0;
		if (salesAmount>5000) {
			sum = 5000*0.08;
		}
		else {return sum*0.08;}
		if (salesAmount>10000) {
			return sum += 5000*0.1 + (salesAmount-10000)*0.12;
		}
		else {
			return sum +=(salesAmount-5000)*0.1;
		}
	}
}
