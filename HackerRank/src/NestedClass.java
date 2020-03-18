import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.regex.*;
import java.security.*;

 class Inner{
	public class Private{
		public String powerof2(int num){
			return ((num&num-1)==0)?"power of 2":"not a power of 2";
		}
	}
}
public class NestedClass {
	public static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		
		try{
			
			int num = in.nextInt();
			Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private
			Class oby = Inner.class;
			Class[] s = oby.getDeclaredClasses();
			for (Class i: s) {
				System.out.println("Declared Classes:" + i);
			}
        Inner inner = new Inner();
        Inner.Private ob = inner.new Private();
        o=ob;
        System.out.print(num + " is " + ob.powerof2(num));
        System.out.println();
		System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
		
		}//end of try
		
		catch (DoNotTerminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}//end of main

	
}//end of Solution

class DoNotTerminate { //This class prevents exit(0)
	 
    public static class ExitTrappedException extends SecurityException {

		private static final long serialVersionUID = 1L;
    }
 
    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}	
	
