/*
- We have to find insert position inside a sorted array
   - use binary search
     - if `nums[mid]` is equal to `target` 
           then return `mid`
       else if `nums[mid]` is less than `target`
           then update `left` to `mid+1`
       else
           then update `right` to `mid` inclusive
     - if `nums[left]` is smaller than target
           then answer is `left+1`;
       else `left`;

Time Complexity
: O(log(n)), where n is the # of number.

*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while(l < r){
            int mid = l + (r - l) / 2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] < target){
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return nums[l] < target ? l + 1 : l;
    }
}
