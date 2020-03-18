package bookExercises;
/*
 * 
 * (Occurrences of a specified character) Write a method that finds the number of
occurrences of a specified character in a string using the following header:
public static int count(String str, char a)
For example, count("Welcome", 'e') returns 2. Write a test program that
prompts the user to enter a string followed by a character and displays the number
of occurrences of the character in the string.
 */
public class Book623 {
	public static int count(String str, char a) {
	int count =0;
		for (int i = 0; i<str.length();i++) {
			if (str.charAt(i)==a) {
				count ++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count("EEE", 'e'));
	}

}
