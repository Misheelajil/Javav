package bookExercises;

public class Book540 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		int tails = 0;
		int head = 0;
		for (int i=0;i<1000000;i++) {
		if(Math.random() < 0.5) {
		    tails++;
		}
		else {
			head++;
		}
		}
		System.out.println("Head: "  + head + " "  + "Tails:  " + tails);
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}

}
