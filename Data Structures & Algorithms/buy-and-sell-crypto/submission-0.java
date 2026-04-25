class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; 
        int profit= 0;
        for(int currPrice: prices){
            minPrice = Math.min(minPrice, currPrice);
            profit = Math.max(profit, currPrice-minPrice);
        }
        return profit;
    }
}
