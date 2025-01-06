class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // To track the minimum price
        int maxProfit = 0; // To track the maximum profit
        
        for (int i = 0; i < prices.length; i++) {
            // Update the minimum price if the current price is smaller
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            // Calculate profit and update maxProfit if it's higher
            else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        
        return maxProfit;
    }
}
