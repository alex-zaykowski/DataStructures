/**
 * This is a really slow solution so it will need to be revised but it works with regular expressions
 * and StringBuilder which I think is cool 
 * 
 * Results: faster than 20% less storage than 52%
 */
import java.util.*;
public class Valid_Palindrome {
    public static void main (String[] args){
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^A-Za-z0-9]", "");
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.toString());
        if(s.equals(sb.reverse().toString())){
            return true;
        }else{
            return false;
        }
    }
}
