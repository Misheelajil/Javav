package bookExercises;
/*
 (Financial application: compute future tuition) Suppose that the tuition for a university
is $10,000 this year and increases 5% every year. In one year, the tuition
will be $10,500. Write a program that computes the tuition in ten years and the
total cost of four years’ worth of tuition after the tenth year.
 */
public class Book57 {

	public static void main(String[] args) {
		double tuition = 10000;
		double total=0;
		for (int i=0;i<10;i++) {
			tuition=tuition*1.05;
		}
		System.out.println(tuition);
		for (int i=0;i<4;i++) {
			tuition=tuition*1.05;
			total+=tuition;
		}
		System.out.println(tuition + " " + total);
	}

}
