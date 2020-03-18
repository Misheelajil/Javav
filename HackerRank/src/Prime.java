import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prime {
    private static final Scanner scanner = new Scanner(System.in);
    private static List<Integer> findPrimeNumbers(int n) {
        // initialize the array with "true", index denotes the numbers from 0 to n.
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        
        //loop from 2 to x until x*x becomes greater than n
        for (int i = 2; i * i < n; i++) {
            // process if the number is not already marked
            if (primes[i]) {
                // find the multiples and mark them as false
                for (int j = i * i; j <= n; j += i)
                    primes[j] = false;
            }
        }

        // populate the list of prime numbers from the array and return it
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (primes[i])
                primeNumbers.add(i);
        }
        return primeNumbers;
    }
    private static boolean checkPrime(int num) {
        // get the prime numbers from 2 to square root of num.
        List<Integer> primes = findPrimeNumbers(Double.valueOf(Math.sqrt(num)).intValue());
        for (int i : primes) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
       int n = scanner.nextInt();
        int [] prime = new int [n]; 
        for (int i=0;i<n;i++){
            prime[i]=scanner.nextInt();
        }
        for (int i=0;i<n;i++){
            if (checkPrime(prime[i])){
            	if(prime[i]==1||prime[i]==0){
                    System.out.println("Not prime");
                }
            	else System.out.println("Prime");
            }
            else {
                System.out.println("Not prime");
            }
        }
    }
}

