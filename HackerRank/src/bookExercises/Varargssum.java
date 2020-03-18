package bookExercises;
import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Add{
    static void add(int...n){
       int sum=0;
       for (int i: n){
           if (i==1){
               System.out.print(i);
           }
           else{
           System.out.print("+" +i);
           }
           sum+=i;
       }
       System.out.print("=" + sum);
       System.out.println();
   }
}

public class Varargssum {
	public static final Scanner CONSOLE = new Scanner(System.in);
    public static void main(String[] args) {
       try{
			int n1=CONSOLE.nextInt(); CONSOLE.nextLine();
			int n2=CONSOLE.nextInt(); CONSOLE.nextLine();
			int n3=CONSOLE.nextInt(); CONSOLE.nextLine();
			int n4=CONSOLE.nextInt(); CONSOLE.nextLine();
			int n5=CONSOLE.nextInt(); CONSOLE.nextLine();
			int n6=CONSOLE.nextInt(); CONSOLE.nextLine();
			Add ob=new Add();
			ob.add(n1,n2);
			ob.add(n1,n2,n3);
			ob.add(n1,n2,n3,n4,n5);	
			ob.add(n1,n2,n3,n4,n5,n6);
			Method[] methods=Add.class.getDeclaredMethods();
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
				e.printStackTrace();
			}
		}

}

