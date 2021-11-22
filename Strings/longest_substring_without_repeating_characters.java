
/**
 * This is my brute force solution to the longest substring 
 * without repeating characters problem, it's extraordinarily slow
 * (only faster than 5% of solutions) but I solved it within 5 minutes 
 * 
 * I'm going to post an updated version with a faster run time along with this
 */
import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        String totalString = "";
        String currString = "";
        int slow = 0;
        for (int i = 0; i < s.length(); i++) {
            if (currString.indexOf(String.valueOf(s.charAt(i))) == -1) {
                currString += String.valueOf(s.charAt(i));
                if (currString.length() > totalString.length()) {
                    totalString = currString;
                }
            } else {
                slow += 1;
                i = slow;
                currString = String.valueOf(s.charAt(i));
            }
        }
        return totalString.length();
    }

    /**
     * Second solution beating 24% of submissions in speed
     */
    public int lengthOfLongestSubstring2(String s) {
        int max = 0;
        HashSet<Character> chars = new HashSet<Character>();
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (chars.contains(s.charAt(i))) {
                chars.remove(s.charAt(j));
                i--;
                j++;
            } else {
                chars.add(s.charAt(i));
                max = Math.max(chars.size(), max);
            }
        }
        return max;
    }
}