/**
 * Beats 100% of java solutions in speed
 */
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] arr : image){
            reverse(arr);
        }
        return image;
    }
    private int[] reverse(int[] arr){
        if(arr.length == 1){
            int val = arr[0] == 1 ? 0 : 1;
            arr[0] = val;
            return arr;
        }
        int j = arr.length - 1;
        int i = 0;
        while(i < j){
            int firstNum = arr[i] == 1 ? 0 : 1;
            int lastNum = arr[j] == 1 ? 0 : 1;
            arr[i] = lastNum;
            arr[j] = firstNum;
            i++;
            j--;
        }
        if(i == j){
            int val = arr[i] == 1 ? 0 : 1;
            arr[i] = val;
        }
        return arr;
    }
}