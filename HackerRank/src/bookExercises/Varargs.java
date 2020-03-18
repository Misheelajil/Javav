package bookExercises;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in;
class Prime{
    static void checkPrime(int...n){
        for (int i: n) {
            if (isPrime(i)){
                System.out.print(i + " ");
          }
        }
        System.out.println();
    }
    static boolean isPrime(int n){
        if (n <= 1) 
            return false; 
        if (n <= 3) 
            return true; 
        if (n % 2 == 0 || n % 3 == 0) 
            return false; 
        for (int i = 5; i * i <= n; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
                return false; 
        return true; 
    } 
}
public class Varargs {
	public static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		try{
		int n1=in.nextInt();
		in.nextLine();
		int n2=in.nextInt();
		in.nextLine();
		int n3=in.nextInt();
		in.nextLine();
		int n4=in.nextInt();
		in.nextLine();
		int n5=in.nextInt();
		in.nextLine();
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);	
		Method[] methods=Prime.class.getDeclaredMethods();
		Set<String> set=new HashSet<>();
		boolean overload=false;
		for(int i=0;i<methods.length;i++)
		{
			if(set.contains(methods[i].getName()))
			{
				overload=true;
				break;
			}
			set.add(methods[i].getName());
			
		}
		if(overload)
		{
			throw new Exception("Overloading not allowed");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}

