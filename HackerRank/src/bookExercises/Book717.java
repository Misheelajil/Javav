package bookExercises;
/*
 7.17 (Sort students) Write a program that prompts the user to enter the number of students,
the students’ names, and their scores, and prints student names in decreasing
order of their scores.
 */
public class Book717 {

	public static void main(String[] args) {
		int  NumberOfStudent = 3;
		String[]  StudentName = {"BoB", "CAT", "DOG"};
		int [] scores = {10, 25, 45};
		int[] index = {0,1,2};
			max(scores,StudentName, index);
	}
	public static void max(int[]scores, String[]StudentName,int[]index) {
		int max=scores[0];
		for (int i = 0; i < scores.length - 1; i++) {
			 // Find the minimum in the list[i..list.length-1]
			 int currentMin = scores[i];
			 int currentMinIndex = i;
			
			 for (int j = i + 1; j < scores.length; j++) {
			 if (currentMin > scores[j]) {
			 currentMin = scores[j];
			 currentMinIndex = j;
			 }
			 }
			
			 // Swap list[i] with list[currentMinIndex] if necessary
			 if (currentMinIndex != i) {
			 scores[currentMinIndex] = scores[i];
			 scores[i] = currentMin;
			 }
			 }
		
	}

}
