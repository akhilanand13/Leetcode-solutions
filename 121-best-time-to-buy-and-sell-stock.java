//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
//Time Complexity: O(n)
//Space Complexity: O(1)
//We iterate through the array once, keeping track of the lowest price seen so far, and at each step we calculate the profit if we sold today (current price minus lowest price) and update our maximum profit if this is better than what we've found before.
class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            profit = Math.max(profit, prices[i]-min);
        }
        return profit;
    }
}