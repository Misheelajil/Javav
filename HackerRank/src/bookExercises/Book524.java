package bookExercises;

public class Book524 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double RightToLeft = 0.0;
		for (int i = 99; i >=3;) {
			RightToLeft += (double)(i-2)/i;
			i-=2;
		}
		System.out.println(RightToLeft);

	}

}
