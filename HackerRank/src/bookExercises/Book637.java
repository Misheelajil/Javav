package bookExercises;

import java.util.Scanner;

public class Book637 {
	public static String format(int number, int width) {
		String num = number + "";
		if(num.length() < width) {
			for (int i = width - num.length(); i>0;i--) {
				num=0 + num;
			}
		}
		return num;
	}
	private final static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
	int number= in.nextInt();
	int width = in.nextInt();
	System.out.println(format(number,width));
	}

}
