package bookExercises;
public class BookArrays {

	public static class RandomCharacter {
		 /** Generate a random character between ch1 and ch2 */
		 public static char getRandomCharacter(char ch1, char ch2) {
		 return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
		 }
		
		 /** Generate a random lowercase letter */
		 public static char getRandomLowerCaseLetter() {
		 return getRandomCharacter('a', 'z');
		 }
		
	 /** Generate a random uppercase letter */
		 public static char getRandomUpperCaseLetter() {
		 return getRandomCharacter('A', 'Z');
		 }
		
		 /** Generate a random digit character */
		 public static char getRandomDigitCharacter() {
		 return getRandomCharacter('0', '9');
		 }
		
		 /** Generate a random character */
		 public static char getRandomCharacter() {
		 return getRandomCharacter('\u0000', '\uFFFF');
		 }
		 }
	
	public static void main(String[] args) {
		char[] chars = createArray();
		System.out.println("The lowercase letters are:");
		displayArray(chars);
		int[] counts = countLetters(chars);
		
		// Display counts
		System.out.println();
		System.out.println("The occurences of each letter are:");
		displayCounts(counts);
	}
	public static char[] createArray() {
		char[] chars = new char[100];
		// Create lowercase letters randomly and assign them to the array
		for(int i =0; i < chars.length;i++)
			chars[i]=RandomCharacter.getRandomLowerCaseLetter();
		return chars;
	}
	public static void displayArray(char[] chars) {
		for (int i=0; i < chars.length; i++) {
			if((i+1) % 20 ==0)
				System.out.print(chars[i]);
			else
				System.out.print(chars[i] + " ");
		}
	}
	public static int[] countLetters(char[] chars) {
		int[] counts = new int[26];
		for (int i = 0; i < chars.length; i++)
			counts[chars[i] - 'a']++;
		return counts;
		
	}
	public static void displayCounts(int [] counts) {
		for (int i=0;i<counts.length; i++) {
			if ((i+1) % 10 == 0)
				System.out.print(counts[i] + " " + (char)(i+'a'));
			else
				System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
		}
	}
}
