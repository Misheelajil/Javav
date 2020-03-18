import java.util.*; 
public class Solution06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();
        for (int i = 0; i<N; i++){
            char[] myString = input.next().toCharArray();
            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();
            
                 for (int j = 0; j<myString.length; j++){
                  if(j%2==0){
                    even.append(myString[j]);
                    }
                   else{ 
                    odd.append(myString[j]);
                    }
                 }
            System.out.println(even + " " + odd);
        }
        input.close();
    }
}