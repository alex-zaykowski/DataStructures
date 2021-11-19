/**
 * Nearly identical to climbing stairs, just another iterative approach to a 
 * recursive function (I guess it shouldn't be recursive but it just feels like it should)
 */
class Solution {
    public int fib(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        int[] fibTotal = new int[n + 1];
        fibTotal[0] = 0;
        fibTotal[1] = 1;
        for(int i = 2; i <= n; i++){
            fibTotal[i] = fibTotal[i - 1] + fibTotal[i - 2];
        }
        return fibTotal[n];
    }
}