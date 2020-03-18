package bookExercises;


public class Book625 {
	public static String convertMillis(long millis) {
	long hours=0; long minutes=0; long seconds=0;
	 hours=millis/3600000;
	 minutes = (millis-hours*3600000)/60000;
	 seconds = (millis-hours * 3600000 - minutes * 60000)/1000;
	 return hours + ":" + minutes + ":" + seconds;
	}
	public static void main(String[] args) {
		// STODO Auto-generated method stub
		long millis =555550000;
		System.out.println(convertMillis(millis));
	}
}
