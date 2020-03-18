package bookExercises;

import java.util.Arrays;

public class Book84 {
	public static void main(String[] args) {
		int [][] hours = { 
		    {2, 4, 3, 4, 5, 8, 8},
		    {7, 3, 4, 3, 3, 4, 4},
			{3, 3, 4, 3, 3, 2, 2},
			{9, 3, 4, 7, 3, 4, 1},
			{3, 5, 4, 3, 6, 3, 8},
			{3, 4, 4, 6, 3, 4, 4},
			{3, 7, 4, 8, 3, 8, 4},
			{6, 3, 5, 9, 2, 7, 9}};
		int[] totalHours;
		int[] students;
		totalHours = new int[8];
		 students = new int[8];
		for (int i = 0; i < hours.length; i++) {
		
			 for (int j = 0; j < hours[i].length; j++) {
				 totalHours[i] += (hours[i][j]*(-1));
				 students[i] +=hours[i][j];
			 	}
		}
		
		int duplicate=0;
		 Arrays.sort(totalHours);
		 for(int i=0; i< 8;i++) {
			for(int j=0;j<8;j++) {
				if((totalHours[i]*(-1))==students[j]) {
					System.out.println("Employee " + j + " worked for " + students[j] + " hours.");
					if (duplicate==students[j]) {
						i++;
					}
					else duplicate=students[j];
				}
			}
		 } 
	}
}
