/**
    - https://leetcode.com/problems/two-sum/
    - O(n)
 */

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            int x = target - nums[i];
            if(hm.containsKey(x)) {
                return new int[]{hm.get(x), i};
            }
            hm.put(nums[i], i);
        }
        return new int[2]; // empty
    }
}
