package bookExercises;

import java.time.ZonedDateTime;

public class Book626 {
	public static boolean isPalindrome(int num){
		int r,sum=0,temp;
		
		temp=num;    
		  while(num>0){    
		   r=num%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   num=num/10;    
		  }    
		  if(temp==sum) {    
		   return true;
		   }
		  else {    
		  return false;
		  }   
	}
	public static boolean isPrime(int num) {
	        boolean flag = false;
	        for(int i = 2; i <= num/2; ++i)
	        {
	            if(num % i == 0)
	            {
	                flag = true;
	                break;
	            }
	        }

	        if (!flag) {
	            if(isPalindrome(num)) {
	            return true;
	            }
	            else return false;
	        }
	        else return false;
	    }
	public static void main(String[] args) {
		 System.out.println("Getting time in milliseconds in Java 8: " + 
			      ZonedDateTime.now().toInstant().toEpochMilli());
		int num=0;
		int number=1;
		while (num<100) {
		number++;
		if(isPrime(number)) {
			System.out.println(number + " is PalindromePrime");
			num++;
		}
		}
		 System.out.println("Getting time in milliseconds in Java 8: " + 
			      ZonedDateTime.now().toInstant().toEpochMilli());
	}

}
