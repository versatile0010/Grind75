/**
        - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
        - O(n)
        - easy
 */

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int ans = 0;
        int min = (int)10e5;
        for(int i = 0 ; i < n; i++){
            min = Math.min(min, prices[i]);
            ans = Math.max(ans, prices[i] - min);
        }
        return ans;
    }
}
