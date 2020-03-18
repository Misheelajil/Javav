import java.util.*;
class JavaStack{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            System.out.println(balanced(input));
		}
		
	}
     public static boolean balanced(String s){
        Stack<Character> stack = new Stack<Character>();

        if (s==null||s.length()==0){
            return false;
        }
        else {
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }
            else if (!stack.isEmpty()&&s.charAt(i)==')'){
                if(stack.peek()=='('){
                    stack.pop();
                }
                else{
                return false;
                }
            }
            else if (s.charAt(i)==(']')){
                if(!stack.isEmpty()&&stack.peek()=='['){
                    stack.pop();
                }
                else{
                return false;
                }
            }
            else if (s.charAt(i)==('}')){
                if(!stack.isEmpty()&&stack.peek()=='{'){
                    stack.pop();
                }
                else{
                return false;
                }
            }
            else {
                return false;
            }
            }
             if (stack.isEmpty()){
                 return true;
                }
              else {
                  return false;
              }
        }
    }
}



