class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int left =0;
        int right = 1;
        int maxProfit =0;

        while(right < n)
        {
            if(prices[right] > prices[left])
            {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(profit, maxProfit);
            }
           
            else if(prices[left]>prices[right])
            {
                left = right;
            } 
            right++;
        }
        return maxProfit;
    }
}
