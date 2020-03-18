package bookExercises;

public class Book525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double RightToLeft = 0.0;
		for (int i = 10000; i >=1; i--) {
		RightToLeft+=Math.pow((-1), i+1)/(2*i-1);			
		}
		System.out.println(RightToLeft*4);
	}

}
