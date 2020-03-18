package bookExercises;

public class Book526 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double e=1;
		double item=1;
		for (int i=1;i<5;i++) {
			e+=item/(double)i;
			item=item/(double)i;
		}
		System.out.println(e);
	}

}
