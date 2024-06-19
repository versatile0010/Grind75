/*
Time Complexity
: O(n), where n is a length of String `s`.
*/

class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        s = s.trim();
        for(int i = s.length() - 1 ; i >=0 ; i--){
            if(s.charAt(i) != ' '){
                length++;
            } else {
                return length;
            }
        }
        return length;
    }
}
