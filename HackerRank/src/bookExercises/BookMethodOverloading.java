package bookExercises;

public class BookMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The maximum of 3 and 4 is " + max(3,4));
		System.out.println("The maximum of 3.0 and 5.4 is " + max(3.0, 5.4));
		System.out.println("The maximum of 3.0, 5.4, and 10.14 is " + max(3.0, 5.4, 10.14));
	}
	public static int max(int a, int b) {
		if (a>b)
		return a;
		else
			return b;
	}
	public static double max(double a, double b) {
		if (a>b) {
			return a;
		}
		else
			return b;
	}
	public static double max(double a, double b, double c) {
		if (a>b) {
			if(a>c) {
				return a;
			}
			else
				return c;
		}
		else if (a<b) {
			if (b>c) {
				return b;
			}
			else 
				return c;
			
		}
		else return 0;
	}

}
