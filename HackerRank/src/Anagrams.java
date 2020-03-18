import java.util.Scanner;
public class Anagrams {

    static boolean isAnagram(String a, String b) {
    	char[] ch = new char[a.length()]; 
    	for (int i = 0; i < a.length(); i++) { 
            ch[i] = a.charAt(i); 
            if(Character.isLetter(ch[i]) && Character.isLowerCase(ch[i])){
                ch[i] = Character.toUpperCase(ch[i]);
            }
        } 
    	char[] ch1 = new char[b.length()]; 
    	for (int i = 0; i < b.length(); i++) { 
            ch1[i] = b.charAt(i); 
            if(Character.isLetter(ch1[i]) && Character.isLowerCase(ch1[i])){
                ch1[i] = Character.toUpperCase(ch1[i]);
            }
        } 
    	for (int i =0; i < a.length(); i++) {
    		for (int j =0;j<b.length();j++) {
    			if(ch[i]==ch1[j]) {
    				ch[i]=0;
    				ch1[j]=0;
    			}    			
    		}
    		
    	}
    	
    	for (int i=0;i<a.length();i++) {
    		if(ch[i]!=0) {
    			return false;
    		}
    	}
    	for (int i=0;i<b.length();i++) {
    		if(ch1[i]!=0) {
    			return false;
    		}
    	}
    	return true;
    	
    	/*
    	 / test for invalid input   
if( a == null || b == null || a.equals("") || b.equals("") )
    throw new IllegalArgumentException();

// initial quick test for non-anagrams
if ( a.length() != b.length() )
    return false;

a = a.toLowerCase();
b = b.toLowerCase();

// populate a map with letters and frequencies of String b
Map<Character, Integer> map = new HashMap<>();

for (int k = 0; k < b.length(); k++){
     char letter = b.charAt(k);    

    if( ! map.containsKey(letter)){
        map.put( letter, 1 );
    } else {
        Integer frequency = map.get( letter );
        map.put( letter, ++frequency );
    }
}

// test each letter in String a against data in the map
// return if letter is absent in the map or its  frequency is 0
// otherwise decrease the frequency by 1

for (int k = 0; k < a.length(); k++){
    char letter = a.charAt(k);

    if( ! map.containsKey( letter ) )
        return false;

    Integer frequency = map.get( letter );

     if( frequency == 0 )
        return false;
    else    
        map.put( letter, --frequency);
}
// if the code got that far it is an anagram
return true;
    	 */
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
