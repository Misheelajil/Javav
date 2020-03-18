import java.util.*;


public class LeftRotation {
	


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    	   int n = scanner.nextInt();
    	   scanner.nextLine();
    	   int d = scanner.nextInt();
    	   scanner.nextLine();
           int[] a = new int[n];
           int[] b = new int[n];
           for (int i = 0; i < n; i++) {
               a[i] = scanner.nextInt();
           }
          for (int i=0; i<n;i++) {
              int m = 0;
              m=i+n-d;
              if(m>n-1){
                  m=m-n;
              }
               b[m]=a[i];
           } 
           for (int i = 0; i < n; i++) {
               System.out.print(b[i] + " ");
           }
        scanner.close();
    }
}
