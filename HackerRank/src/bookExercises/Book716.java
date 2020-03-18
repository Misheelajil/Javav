package bookExercises;
/*
 * 7.16 (Execution time) Write a program that randomly generates an array of 100,000
integers and a key. Estimate the execution time of invoking the linearSearch
method in Listing 7.6. Sort the array and estimate the execution time of invoking
the binarySearch method in Listing 7.7. You can use the following code
template to obtain the execution time:
long startTime = System.currentTimeMillis();
perform the task;
long endTime = System.currentTimeMillis();
long executionTime = endTime - startTime;
 */
public class Book716 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []numbers =	new int [100000];
		for(int m =0;m<100000;m++) {
			numbers[m]=getRandom();
		}
		long startTime = System.currentTimeMillis();
		int i = linearSearch(numbers, 4);
		int j = linearSearch(numbers, -4);
		int k = linearSearch(numbers, -3);
		System.out.println(i + " " + j + " " + k);
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println(executionTime);
		startTime = System.currentTimeMillis();
		 int i1 = binarySearch(numbers, 4);
		 int j1 = binarySearch(numbers, -4);
		 int k1 = binarySearch(numbers, -3);
		System.out.println(i1 + " " + j1 + " " + k1);
		 endTime = System.currentTimeMillis();
		 executionTime = endTime - startTime;
		System.out.println(executionTime);
		int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
		 i = binarySearch(list, 2); // Returns 0
		 j = binarySearch(list, 11); // Returns 4
		 k = binarySearch(list, 12); // Returns –6
		int l = binarySearch(list, 1); // Returns –1
		int m = binarySearch(list, 3); // Returns –2
		System.out.println(i + " " + j + " " + k + " " + l + " " + m);
}
		

	
public static int getRandom() {
	return getRandomNumberInRange(1,100000);
}
private static int getRandomNumberInRange(int min, int max) {

	if (min >= max) {
		throw new IllegalArgumentException("max must be greater than min");
	}

	return (int)(Math.random() * ((max - min) + 1)) + min;
}
	public static int linearSearch(int[] list, int key) {
		 for (int i = 0; i < list.length; i++) {
		 if (key == list[i])
		 return i;
		 }
		 return -1;
		}
	public static int binarySearch(int[] list, int key) {
		 int low = 0;
		 int high = list.length - 1;
		
		 while (high >= low) {
		 int mid = (low + high) / 2;
		 if (key < list[mid])
		 high = mid - 1;
		 else if (key == list[mid])
		 return mid;
		 else
		 low = mid + 1;
		 }
		
		 return -low - 1; // Now high < low, key not found
		 }
}
