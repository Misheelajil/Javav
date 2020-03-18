package bookExercises;

import java.util.HashSet;

public class Book715 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> a = new HashSet<Integer>();
		int[]b = {1,2,4,4,5,5,7,8,9,10};
		for(int i=0;i<b.length;i++) {
			a.add(b[i]);
		}
		System.out.println(a);
	}

}
