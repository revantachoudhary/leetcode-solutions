class Solution {
    public int maxProfit(int[] prices) {
        int lowest = 10001;
        int highest = -1;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) { 
            if (prices[i] < lowest) {
                lowest = prices[i];
            } else if (prices[i] - lowest > profit) {
                profit = prices[i] - lowest;
            }
        }
        return profit;
    }
}
