import java.io.*;
import java.util.*;


public class SparseArrays {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        int count=0;
        int[] a = new int [queries.length];
        for (int j = 0; j <queries.length;j++){
        	 for (int i = 0; i < strings.length; i++) {
               if(queries[j].equals(strings[i])){
            	   count++;	
               }
           }
           a[j]=count;
           count=0;
       }
       return a;

    }
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    	int stringsCount = scanner.nextInt();
   //   scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];
        scanner.nextLine();
        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
   //   scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.nextLine();
        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);
        for (int i=0;i<res.length;i++) {
        	System.out.println(res[i]);
        }
 /*       for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
*/
        scanner.close();
    }
}
