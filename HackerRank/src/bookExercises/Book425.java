package bookExercises;

import java.util.Random;

public class Book425 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		char a = Character.toUpperCase((char)(r.nextInt(26) + 'a'));
		char b = Character.toUpperCase((char)(r.nextInt(26) + 'a'));
		char c = Character.toUpperCase((char)(r.nextInt(26) + 'a'));
		int d = (int) ((Math.random() * ((9999 - 1000) + 1)) + 1000);
		System.out.print(a);
		System.out.print(b);
		System.out.print(c);
		System.out.print(d);
	}

}
