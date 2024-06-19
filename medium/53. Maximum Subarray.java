/*
Time Complexity
: O(n), where n is the # of numbers.

Space Complexity
: O(n), where n is the # of numbers.

*/
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int [] dp = new int[n];
        for(int i = 0 ; i < n; i++) {
            dp[i] = nums[i];
        }
        int ans = dp[0];
        for(int i = 1 ; i < n ; i++){
            dp[i] = Math.max(dp[i], dp[i-1] + nums[i]);
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}
