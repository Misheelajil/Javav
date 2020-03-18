package bookExercises;

import java.util.Scanner;

public class Book418 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two characters: ");
		String s = input.nextLine();
		String m = s.substring(0, 1);
		String k = s.substring(1,2);
		String M = "Mathematics";
		String C = "Computer Science";
		String I = "Information Technology";
		int result = Integer.parseInt(k);	
		if (m.equals(M.substring(0,1))) {
			System.out.print(M);
		}
		else if (m.equals(C.substring(0,1))) {
			System.out.print(C);
		}
		else if (m.equals(I.substring(0,1))) {
			System.out.print(I);
		}
		else {
			System.out.println("Invalid input");
			result +=4;
		}
		if(result==1) {
			System.out.print(" Freshman");
		}
		else if (result==2) {
			System.out.println(" Sophomore");
		}
		else if (result==3) {
			System.out.println(" Junior");
		}
		else if (result==4) {
			System.out.println(" Senior");
		}
		
	}

}
