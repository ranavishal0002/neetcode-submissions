class Solution {
    public int maxProfit(int[] prices) {
        int left      = 0;        // left  = buy  day (cheapest so far)
        int right     = 1;        // right = sell day (always ahead of left)
        int maxProfit = 0;        // best profit seen so far

        while (right < prices.length) {

            if (prices[right] > prices[left]) {
                // selling today makes profit — check if it's the best
                int profit = prices[right] - prices[left];
                maxProfit  = Math.max(maxProfit, profit);

            } else {
                // prices[right] <= prices[left]
                // right is cheaper than left → better buy day found!
                // move left to right (no point keeping expensive buy)
                left = right;
            }

            right++;   // always advance right
        }

        return maxProfit;
    }
}