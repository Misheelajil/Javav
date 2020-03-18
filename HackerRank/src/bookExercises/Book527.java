package bookExercises;

import java.time.*;
import java.time.temporal.ChronoField;
public class Book527 {
	public static void main(String[] args) {
		int j =0;
		for (int i=101;i<=2100;i++) {
		  Year anotherYear = Year.of(i);
		  boolean  isLeap = anotherYear.isLeap();
	      if (isLeap) {
	       System.out.print(anotherYear.get(ChronoField.YEAR) + " ");
	       j++;
	       if (j==10) {
	    	   j=0;
		    	  System.out.println();
		      }
	      }
	     
	}
  }
}
