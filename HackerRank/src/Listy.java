import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Listy {
	public static final Scanner CONSOLE = new Scanner(System.in);
	public static void main(String args[]) {
		List<Integer> al=new ArrayList<Integer>();  
		int N = CONSOLE.nextInt();
		for (int i=0; i<N; i++) {
			
			al.add(CONSOLE.nextInt());
		}
		CONSOLE.nextLine();
		int M = CONSOLE.nextInt();
		for (int i=0;i<M;i++) {
			String query = CONSOLE.next();
			if (query.contentEquals("Insert")) {
				int b = CONSOLE.nextInt();
				Integer c = CONSOLE.nextInt();
				al.add(b, c);
			}
			else if (query.contentEquals("Delete")) {
				int d = CONSOLE.nextInt();
				al.remove(d);
			}
			else {
				System.out.println("Not right command");
			}
		}
		for (Integer s : al) {
			System.out.print(s + " ");
		}
	}
}