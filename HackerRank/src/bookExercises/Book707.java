package bookExercises;

public class Book707 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int[100];
		int [] b = new int [10];
		for (int i=0;i<100;i++) {
			a[i]=getRandomNumberInRange(0,9);
			System.out.println(i + ":" +a[i]);
			whichnumber(a[i],b);
		}
		for (int i=0;i<10;i++) {
			System.out.println(b[i]);
		}
	}
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		return (int)(Math.random() * ((max - min) + 1)) + min;
	}
	private static void whichnumber(int number,int b[]) {
		b[number]++;
	}
}
