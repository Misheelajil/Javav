import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
          Arrays.sort(s, 0, n, new Comparator<String>() {
             public int compare(String a1, String a2){
                BigDecimal BD1 =new BigDecimal (a1);
                BigDecimal BD2 =new BigDecimal (a2);//BD1 c BD2 gevel bagaasaa osohruu
                return BD2.compareTo(BD1);//iheesee buurahaar
            }
        });

        //Output
        for(int i=0;i<n+2;i++)
        {
            System.out.println(s[i]);
        }
    }
}

//import java.math.BigDecimal;
//import java.util.*;
//class BigDecimal1{
//    public static void main(String []args){
//        //Input
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//        String []s=new String[n+2];
//        for(int i=0;i<n;i++){
//            s[i]=sc.next();
//        }
//        sc.close();
//        Arrays.sort(s,0,n, new Comparator<String>() {
//             public int compare(String a1, String a2){
//                BigDecimal BD1 =new BigDecimal (a1);
//                BigDecimal BD2 =new BigDecimal (a2);//BD1 c BD2 gevel bagaasaa osohruu
//                return BD2.compareTo(BD1);//iheesee buurahaar
//            }
//        });
//
//        //Output
//        for(int i=0;i<n;i++)
//        {
//            System.out.println(s[i]);
//        }
//    }
//}