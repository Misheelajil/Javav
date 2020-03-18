
import java.io.*;
import java.util.*;
import java.util.stream.*; 
public class StringAReview {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();
        for (int i = 0; i<N; i++){
            String myString = input.nextLine();
           /* StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();
            StringBuilder full = new StringBuilder();*/
           /* for (int j=0;j<myString.length();j++){
                if(j==0||j%2==0){
                    even.append(myString.charAt(j));
                }
                else{
                    odd.append(myString.charAt(j));
                }
                if (j==myString.length()-1){
                    even.append(" ");
                    System.out.println((full.append(even).append(odd)).toString());
                }
            }
            */
            char[] myCharArray = myString.toCharArray();
            int m=0;
              for(char j:myCharArray){
                  if (m==0||m%2==0){
                  System.out.print(j);
                  }
                  m++;
                  }
              System.out.print(" ");
              m = 0;
              for(char j:myCharArray){
                  if (m==1||m%2==1){
                  System.out.print(j);
                  }
                  m++;
              }  
              System.out.println();

/*
            for (char j:myString){
                if (j==0||j%2==0){
                    even.append(myString.charAt(j));
                }
                else{
                    odd.append(myString.charAt(j));
                }
                 if (j==myString.length()-1){
                    even.append(" ");
                    System.out.println((full.append(even).append(odd)).toString());
                }
            }*/
            /*System.out.println(even + " " + odd);*/
            

/*          
            if (myString.equals("Hacker")){
            StringBuilder sentenceStr = new StringBuilder(myString); 
             sentenceStr.setCharAt(0, 'H');
             sentenceStr.setCharAt(1, 'c');
             sentenceStr.setCharAt(2, 'e');
             sentenceStr.setCharAt(3, ' ');
             sentenceStr.setCharAt(4, 'a');
             sentenceStr.setCharAt(5, 'k');
             sentenceStr.append('r');
             System.out.println(sentenceStr);
             }
             else{
              StringBuilder sentenceStr = new StringBuilder(myString); 
             sentenceStr.setCharAt(0, 'R');
             sentenceStr.setCharAt(1, 'n');
             sentenceStr.setCharAt(2, ' ');
             sentenceStr.setCharAt(3, 'a');
             sentenceStr.append('k');
             System.out.println(sentenceStr);
             }
            */
        }   
    }
}
