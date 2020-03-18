package bookExercises;

public class Book69 {
	public static double footToMeter(double foot) {
		double meter=0.0;
		 meter=0.305 * foot;
		return meter;
	}
	/** Convert from meters to feet */
	public static double meterToFoot(double meter) {
		double foot=0.0;
		foot = 3.279 * meter;
		return foot;
	}
	public static void main(String[] args) {
		for (double i=1.0;i<11.0;i++) {
			System.out.print(i + "  " + footToMeter(i)  +  "   " + "|");
			System.out.print("    " + (20.0 + (i-1)*5) + "   " + meterToFoot(20.0 + (i-1)*5));
			System.out.println();
		}
	}

}
