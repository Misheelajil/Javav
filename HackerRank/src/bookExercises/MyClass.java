package bookExercises;
import java.util.ArrayList;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> myList = new ArrayList<Integer>(5);
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.add(6);
		myList.add(7);
		myList.add(8);
		myList.add(9);
		myList.add(10);
		myList.add(11);
		for(Integer x : myList) {
		System.out.println(x);
		}
		System.out.println("size = " + myList.size());
		myList.set(0, 100);
		for(Integer x : myList) {
			System.out.println(x);
			}
			System.out.println("size = " + myList.size());
			
	}

}
