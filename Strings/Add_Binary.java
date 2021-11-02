/**
This is a question where given two strings of binary numbers
add them together without using any built in funcionality like
Integer.parseInt(string, 2)
 */
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1; //start at the beginning of the number
        int j = b.length() - 1;
        while(i > -1 || j > -1){ //while at least one index is greater than 0
            int num1 = -1 < i ? a.charAt(i) - '0' : 0; //subtract char value to either get 0 or 1
            int num2 = -1 < j ? b.charAt(j) - '0' : 0;
            int sum = num1 + num2 + carry; //sum the two numbers including carry over
            switch(sum){ // we only have 4 possible cases so I'm using a switch
                case 0:
                    result.append("0"); //add to string bulider
                    carry = 0; //we already factored in the carry so it is safe to say it is 0 at this point
                    break;
                case 1:
                	result.append("1");
                    carry = 0; //again we already factored in the carry so we can set it to 0
                    break;
                case 2:
                	result.append("0");
                    carry = 1;
                    break;
                case 3:
                	result.append("1");
                    carry = 1;
                    break;
                default: 
                    break;
            }
            i--;
            j--;
        }
        if( carry == 1 ) { //edge case were we still have a carry
        	result.append("1");
        }
        result.reverse(); //we built our string in reverse order so we have to flip it
        return result.toString();//get string from string builder object
    }
}