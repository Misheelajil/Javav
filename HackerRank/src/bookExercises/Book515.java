package bookExercises;

public class Book515 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a= '!';
		char b = '~';
	for (int i = 31 ; i < 127;i++) {
		char c = (char)i;
		System.out.print(c + " ");
		if ((i-32)%10==0) {
			System.out.println();
		}
	}
	
	
	}

}
