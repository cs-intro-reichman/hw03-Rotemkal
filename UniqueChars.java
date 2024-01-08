/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }
    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String newS = "" ;
        for (int i = 0 ; i < s.length() ; i++) {
            boolean exist = false ;
            char c = s.charAt(i);
            if (c != 32) {
               for (int j = 0 ; j < newS.length() ; j++) {
                if ( newS.charAt(j) == c )
                   exist = true ;
                 }
            }
            if (exist == false ) 
            {
                newS = newS + c;
            }
    }
    return newS;
}}