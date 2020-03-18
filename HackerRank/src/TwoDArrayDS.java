import java.io.*;
import java.util.*;

public class TwoDArrayDS {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int[] sum =new int[16];
        int k=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
            if (i<4&&j<4){
                sum[k]=arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1]
                 + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                 k++;
            }
            }
        }
         int maxValue = sum[0];
            for(int i=1;i < sum.length;i++){
               if(sum[i] > maxValue){
                  maxValue = sum[i];
                  }
            }
        return maxValue;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
     //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = { {1, 1, 1, 0, 0, 0},
        				{0, 1, 0, 0, 0, 0},
        				{1, 1, 1, 0, 0, 0},
        				{0, 0, 2, 4, 4, 0},
        				{0, 0, 0, 2, 0, 0},
        				{0, 0, 1, 2, 4, 0},
        };

        int result = hourglassSum(arr);
        System.out.println(result);
 //       bufferedWriter.write(String.valueOf(result));
  //      bufferedWriter.newLine();
//
  //.close();

        scanner.close();
    }
}
