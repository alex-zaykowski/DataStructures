/**
 * This is a relativly slow soltuion to the anagram problem but I can live with it for 
 * now, I should probably start reviewing easies and then move on to some mediums, not sure
 * yet though, I should probably get to 70 easies before I move on.
 */
import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(char x : s.toCharArray()){
            if(!map.containsKey(x)){
                map.put(x, 1);
            }else{
                map.replace(x, map.get(x) + 1);
            }
        }
        
        for(char x : t.toCharArray()){
            if(map.containsKey(x)){
                if(map.get(x) == 1){
                    map.remove(x);
                }else{
                    map.replace(x, map.get(x) - 1);
                }
            }else{
                return false;
            }
        }
        if(map.isEmpty()){
            return true;
        }
        return false;
    }
}