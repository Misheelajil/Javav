package bookExercises;

import java.util.HashSet;
import java.util.Scanner;
public class Book705 {
private static final Scanner in = new Scanner(System.in);
public static void main(String[] args) {
	int n = 10;
	int [] a = new int[n];
	int [] b = new int[n];
	int k=0;
	for (int i =0;i<n;i++) {
		a[i]=in.nextInt();
		}
	/*
	HashSet<Integer> h = new HashSet<Integer>();
	for (int i=0;i<n;i++) {
		h.add(a[i]);
	}
	System.out.println(h);
	System.out.println(h.size());*/
	for (int i=0;i<n;i++) {

		int distinct = 0;
		for (int j=i;j<n;j++) {
			if(a[i]==a[j]) {
				distinct++;
			}
		}
		if(distinct==1) {
			b[k]=a[i];
			k++;
		}
	}
	System.out.println(k);
	for(int i=0;i<k;i++) {
		System.out.println(b[i]);
	}
	
}

}
