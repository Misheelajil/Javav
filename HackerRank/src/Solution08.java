//Complete this code or write your own from scratch
import java.util.*;

class Solution08{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String,Boolean> myMap = new HashMap<String,Boolean>();
            myMap.put("Monday",true);
            myMap.put("Tuesday", false);
            myMap.put("Wednesday",Boolean.TRUE);
            myMap.put("Thursday", Boolean.FALSE);
            myMap.put("Friday", null);
           System.out.println(myMap.keySet());
           System.out.println(myMap.values());
           System.out.println(myMap.toString());
            myMap.remove("Friday");
            myMap.remove("Thursday", Boolean.FALSE);
            myMap.replace("Wednesday", Boolean.FALSE);
            System.out.println(myMap.toString());
        in.close();
    }
}

