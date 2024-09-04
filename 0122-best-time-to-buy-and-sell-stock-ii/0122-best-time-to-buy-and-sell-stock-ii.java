class Solution {
    public int maxProfit(int[] prices) {
        int maxprice =0;
        for(int i=1; i < prices.length; i++){
            if(prices[i] > prices[i-1]){
                maxprice += prices[i] - prices[i-1];
                
            }
        }
        return maxprice;
    }
}