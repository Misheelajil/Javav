import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListy {
	public static final Scanner CONSOLE = new Scanner(System.in);

	public static void main(String args[]) {
		int n = CONSOLE.nextInt();

		// Here aList is an ArrayList of ArrayLists
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>(n);

		// Create n lists one by one and append to the
		// master list (ArrayList of ArrayList)
		for (int i = 0; i < n; i++) {
			graph.add(new ArrayList<Integer>());

		}
		for (int i = 0; i < n; i++) {
			int m = CONSOLE.nextInt();
			for (int j = 0; j < m; j++) {
				int a = CONSOLE.nextInt();
				graph.get(i).add(a);
			}
		}
		int output = CONSOLE.nextInt();
		for (int k = 0; k < output; k++) {
			int x = CONSOLE.nextInt();
			int y = CONSOLE.nextInt();
			CONSOLE.nextLine();
		try {		
			System.out.println(graph.get(x - 1).get(y - 1) + " ");
		}
		 catch(Exception e)  
        {  
            System.out.println("ERROR!");  
        }  
		}
	}
}