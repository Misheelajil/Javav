package bookExercises;
/*
 * 6.10 (Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the
isPrime(int number) method for testing whether a number is prime. Use this
method to find the number of prime numbers less than 10000.
 */
public class Book610 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=2;i<10000;i++) 
			if (isPrime(i)) 
				System.out.println(i + ":" + "Prime");
		}

	
	 public static boolean isPrime(int number) {
		 for (int divisor = 2; divisor <= number / 2; divisor++) {
		 if (number % divisor == 0) { // If true, number is not prime
		 return false; // Number is not a prime
		 }
		 }
		 return true;
	}
}
