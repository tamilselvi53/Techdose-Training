class Solution {
    public int maxProfit(int[] prices) {
        //T(n): O(n) S(n): O(1)
        int min = Integer.MAX_VALUE, maxProfit = 0;
        // min stores minimum element in array
        // maxProfit calculates currVal - minValue
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - min);
        }
        // maximum profit is returned
        return maxProfit;
    }
}
