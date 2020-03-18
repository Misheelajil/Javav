public class Example {
       String name;
       Example (String input) {
               name = input;
       }
       Example () {
               this("John/Mary Doe");
       }
       public static void main(String args[]) {
               Example p1 = new Example ("digger");
               Example p2 = new 
Example ();
       }
}