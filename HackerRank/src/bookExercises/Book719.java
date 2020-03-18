package bookExercises;
public class Book719 {
	private static final  java.util.Scanner in = new  java.util.Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter list: ");
		int elements = in.nextInt();
		int [] ar = new int[elements];
		boolean sorted = true;
		for (int i=0;i<elements;i++) {
			ar[i]=in.nextInt();
		}
		for (int i=0;i<elements;i++) {
			if (ar[i]>ar[i+1]) {
				System.out.println("The list is not sorted");
				sorted = false;
				break;
			}
		}
		if (sorted) {
			System.out.println("The list is already sorted");
			
		}
	}

}
