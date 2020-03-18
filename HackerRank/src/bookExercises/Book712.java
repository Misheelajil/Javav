package bookExercises;
/*
 7.12 (Reverse an array) The reverse method in Section 7.7 reverses an array by
copying it to a new array. Rewrite the method that reverses the array passed in
the argument and returns this array. Write a test program that prompts the user to
enter ten numbers, invokes the method to reverse the numbers, and displays the
numbers.
 */
public class Book712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] list = {10,9,8,7,6,6,5,4,3,2,1};
		int [] list2=reverse(list);
		for(int i=0; i<list.length;i++) {
			System.out.println(list2[i]);	
		}
	}
	 public static int[] reverse(int[] list) {
		 int[] result = new int[list.length];
		
		 for (int i = 0, j = result.length - 1;
		 i < list.length; i++, j--) {
		 result[j] = list[i];
		 }
		
		 return result;
	 }
}
