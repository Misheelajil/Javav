package bookExercises;
/*
 7.13 (Random number chooser) Write a method that returns a random number between
1 and 54, excluding the numbers passed in the argument. The method header is
specified as follows:
public static int getRandom(int... numbers)
 */
public class Book713 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int []numbers =	new int [54];
	for(int i =0;i<54;i++) {
		numbers[i]=i+1;
	}
	System.out.println(getRandom(numbers));
	}
	public static int getRandom(int... numbers) {
		
		return getRandomNumberInRange(numbers[0],numbers[53]);
	}
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		return (int)(Math.random() * ((max - min) + 1)) + min;
	}
}
