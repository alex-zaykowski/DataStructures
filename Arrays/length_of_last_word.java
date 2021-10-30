class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        int length = 0;
        for(int i = words.length - 1; i >= 0; i--){
            if(words[i].length() > 1){
                length = words[i].length();
                break;
            }else{
                if(!words[i].equals(" ")){
                    length = 1;
                    break;
                }
            }
        }
        return length;
    }
}

/**
This is a basic solution I thought of in 2 minutes, it is faster and takes up lest 
space than 50% of LC submissions but can obciously be improved, I will come back
to this later if I am inclined.
 */