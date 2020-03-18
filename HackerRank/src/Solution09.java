import java.io.*;
import java.util.*;

public class Solution09 {

    // Complete the factorial function below.
	private static boolean isPalindrom(String str) {
        if (str.length() == 0 || str.length() == 1){
            return true;
        } else {
            if (str.charAt(0) != str.charAt(str.length() - 1)){
                return false;
            } else {
                return isPalindrom(str.substring(1, str.length()-1));
            }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        while(scanner.hasNext()){
        	String s = scanner.next();
        	Boolean What = isPalindrom(s);
        	if (What==true) {
            	System.out.println("True");
            }
            else System.out.println("False");
        }
        
        scanner.close();
    }
}
