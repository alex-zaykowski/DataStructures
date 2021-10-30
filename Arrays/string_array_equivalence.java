class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return ToString(word1).equals(ToString(word2));
    }
    private String ToString(String[] arr){
        String result = "";
        for(int i = 0; i < arr.length; i++){
            result += arr[i];
        }
        return result;
    }
}
/**
This is another solution I got to pretty quickly, wasn't concerned with efficency 
but it beat roughly 76% of java LC submissions in both time and memory usage 
(76.72%, 75.43%)
 */