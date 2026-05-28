class Solution {
    public int maxProfit(int[] prices) {

        // track the price
        int left =0;
        int right =1;
        int maxProfit =0;

        while(right< prices.length){
            if(prices[right]> prices[left]){
                int profit = prices[right]- prices[left];
                maxProfit = Math.max(maxProfit, profit);
            } 
            else if(prices[right]< prices[left]){
                left = right;
            }
            right++;
        }

        return maxProfit;

        }
}