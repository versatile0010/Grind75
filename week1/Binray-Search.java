/**
        - https://leetcode.com/problems/binary-search/submissions/1242534840/
        - o(nlogn)
        - easy
 */

class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        while(l <= r){
            int mid = (l+r)/2;
            int val = nums[mid];
            if(val < target){
                l++;
            } else if(val > target){
                r--;
            } else { // val == target
                return mid;
            }
        }
        return -1;
    }
}
