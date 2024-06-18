/*

Time Complexity
: O(n), where n is the # of number

*/


import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int idx = 0;
        for(int num : nums){
            if(!set.contains(num)){
                nums[idx++] = num;
            }
            set.add(num);
        }
        return set.size();
    }
}
