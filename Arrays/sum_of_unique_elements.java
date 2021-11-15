/**
 * This is actually a pretty solid solution being faster than 73% of java solutions
 * and suprisingly taking up less spave than 77.5% of java solutions. I forgot
 * a lot of the HashMap syntax so this was really helpful.
 */
import java.util.*;
class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        int result = 0;
        for(int i : nums){
            if(!map.containsKey(i)){
                map.put(i, 1);
            }else{
                map.replace(i, map.get(i) + 1);
            }
        }
        for(int u : map.keySet()){
            if(map.get(u) == 1){
                result += u;
            }
        }
        return result;
    }
}