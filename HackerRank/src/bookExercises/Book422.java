package bookExercises;

import java.util.Scanner;

public class Book422 {
	public static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Enter string s1:");
	String s1 = in.next();
	in.nextLine();
	System.out.println("Enter string s1:");
	String s2 = in.next();
	Boolean resulty = false;
	for (int i = 0; i<s1.length()-s2.length()+1;i++) {
		Boolean result=s2.equals(s1.substring(i, s2.length()+i));
		if (result) {
			resulty = true;
		}
	}
	if (resulty) {
		System.out.println(s2 + " is a substring of " + s1);
	}
	else {
		System.out.println(s2 + " is not a substring of " + s1);
	}
	}

}
