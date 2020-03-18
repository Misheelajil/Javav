package bookExercises;
import java.util.*;
/*
 * (Find the highest score) Write a program that prompts the user to enter the number
of students and each student’s name and score, and finally displays the name
of the student with the highest score.
 */
/*public class Book58 {
	public static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter students number");
		int N = in.nextInt();
		in.nextLine();
		int index = 0;
		String [] name = new String[N];
		Integer [] scores = new Integer[N];
		for (int i=0;i<N; i++) {
			name[i]=in.next();
			scores[i]=in.nextInt();
			in.nextLine();
		}
		for (int i =0; i<N;i++) {
			System.out.println(name[i] + "-" + scores[i]);
		}
		int max = scores[0];
		for (int i = 0; i < N; i++) 
		{
			
			if (max < scores[i]) 
			{
				max = scores[i];
				index = i;
			}
		}
		System.out.println(name[index] + " " + scores[index]);
		*/
		
		class Checker implements Comparator<Player>
		{
		     public int compare(Player a, Player b){
		          if (b.score == a.score) {
		            return a.name.compareTo(b.name);
		        } else {
		            return a.score > b.score ? -1 : 1;    
		        }
		     }
		}
		class Player{
		    String name;
		    int score;
		    
		    Player(String name, int score){
		        this.name = name;
		        this.score = score;
		    }
		}

		class Book58 {

		    public static void main(String[] args) {
		        Scanner scan = new Scanner(System.in);
		        int n = scan.nextInt();

		        Player[] player = new Player[n];
		        Checker checker = new Checker();
		        
		        for(int i = 0; i < n; i++){
		            player[i] = new Player(scan.next(), scan.nextInt());
		            scan.nextLine();
		        }
		        scan.close();

		        Arrays.sort(player, checker);
		        for(int i = 0; i < player.length; i++){
		            System.out.printf("%s %s\n", player[i].name, player[i].score);
		        }
		    }
		


}
