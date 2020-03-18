package bookExercises;
import java.util.concurrent.ThreadLocalRandom;
public class Book416 {

	public static void main(String[] args) {
		for (int i=0; i<100; i++) {
		int randomNum = ThreadLocalRandom.current().nextInt(65, 90);
		char c = (char) randomNum;
		System.out.println(c);
		}
	}

}
