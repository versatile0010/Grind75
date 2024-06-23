import java.util.*;

class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }
        int letters = 0;
        boolean hasOdd = false;

        for(int f : hm.values()){
            if(f%2==0){
                letters += f;
            } else {
                hasOdd = true;
                letters += (f-1);
            }
        }
        return hasOdd ? letters + 1 : letters; 
    }
}
