class Solution {
    public int maxProfit(int[] prices) {
        int total_profit = 0;
        int current_profit = Integer.MIN_VALUE;
        int buy = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] - prices[buy] > current_profit){
                current_profit = prices[i] - prices[buy];
                total_profit = Math.max(total_profit, current_profit);
            }else{
                if(prices[i] < prices[buy]){
                    buy = i;
                }
            }
        }
        return total_profit;
    }
}