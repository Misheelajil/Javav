package bookExercises;

import java.util.Arrays;

public class Book83 {
 /** Main method */
 public static void main(String[] args) {
 // Students' answers to the questions
 char[][] answers = {
 {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
 {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
 {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
 {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
 {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
 {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
 {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
 {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

 // Key to the questions
 char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
 int[] grades;
 int[] students;
 grades = new int[8];
 students = new int[8];
 // Grade all answers
 for (int i = 0; i < answers.length; i++) {
 // Grade one student
	 int correctCount = 0;
 for (int j = 0; j < answers[i].length; j++) {
	 if (answers[i][j] == keys[j])
		 correctCount++;
 	}

 	System.out.println("Student " + i + "'s correct count is " +
 			correctCount);
 	
 	grades[i]=correctCount;
 	students[i]=correctCount;
 		}
 for(int i=0; i< answers.length;i++) {
	 System.out.println(grades[i]);
 }
 int duplicate=0;
 Arrays.sort(grades);
 for(int i=0; i< 8;i++) {
	for(int j=0;j<8;j++) {
		if(grades[i]==students[j]) {
			System.out.println("Student " + j + "'s correct count is " + students[j]);
			if (duplicate==students[j]) {
				i++;
			}
			else duplicate=students[j];
		}
	}
	 } 
 	}
 }