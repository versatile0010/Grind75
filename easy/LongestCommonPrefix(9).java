/*
- Longest Common Prefix (LCP)
  - If strs is empty, return empty string
  - Variable `l` to keep track of the current LCP's length,
        initallay `strs[0].length`
  - Iterate through the indices from 1 to strs.length - 1, denoted as `i`
     - Update `l` to `strs[i].legnth()` if the current string's length is shorter.
     - Itereate through the characters from zero to l - 1, denoted as 'j`
        - Variable `x` is a character of `strs[0].charAt(j)`
          Variable `y` is a character of `strs[i].charAt(j)`
            - If x != y
                then update `l` to `j`
                     and break the inner loop
     - Return a substring of `strs[0]` from 0 to l-1, that's LCP.

Time Complexity
: O(n * k) + O(k) where n is the number of strings and k is the number of characters with each string.
    - O(n * k) for comparing the first string with every others.
    - O(k) for gernerating result substring
  Thus, O(n*k).

Space Complexity
: O(k) where k is the number of characters with each string.

*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }

        int l = strs[0].length();
        for(int i = 1; i < strs.length; i++){
            l = Math.min(l, strs[i].length());
            for(int j = 0; j < l ; j++){
                char x = strs[0].charAt(j);
                char y = strs[i].charAt(j);
                if(x!=y){
                    l = j;
                    break;
                }
            }
        }
        return strs[0].substring(0, l);
    }
}
