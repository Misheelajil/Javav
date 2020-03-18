package bookExercises;

public class Book53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kilograms=1;
		double Pounds = 0;
		System.out.println("Kilograms      Pounds");
		while (kilograms<200) {
			Pounds=kilograms*2.2;
			System.out.println(kilograms + "        " + Pounds);
			kilograms+=2;
		}
	}

}
