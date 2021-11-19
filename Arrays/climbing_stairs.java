/**
 * DP solution to the climbing chairs problem, I initially solved it
 * recurisvely but the time complexity what much too large, this is a perfect 
 * solution but also tells me I need to review DP because I could not convert 
 * my recursive solution to an iterative one without giving up (lol)
 * 
 * much work to do
 */
class Solution {    
    public int climbStairs(int n) {
        int[] runningTotal = new int[n + 1];
        runningTotal[0] = 1;
        runningTotal[1] = 1;
        for(int i = 2; i <= n; i++){
            runningTotal[i] = runningTotal[i-2] + runningTotal[i - 1];
        }
        return runningTotal[n];
    }
}