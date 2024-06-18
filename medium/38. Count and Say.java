/*
  We have to implement RLE with recursive approach.
    - base case
        - return "1" when n is equal to 1.
    - In each of the recursive call...
        - Find previous string for `n-1` as `prev`
            - And iterate `prev`, denoted as `i`
              - We use a variable `count` to keep track of the frequency of the current character.
                - if `i` is equal to `prev.length()-1` or `prev.charAt(i)` is not equal to `prev.charAt(i+1)`
                    then append `count` to `current result`
                         append the current character to `current result`
                         update `count` as `0`
            Return a `current result`.

Time Complexity
: O(n*k), where n is the input value and k is a average length of each sequnce.  

*/

class Solution {
    public String countAndSay(int n) {
        if(n == 1){  // base case
            return "1";
        }
        String prev = countAndSay(n-1);

        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 0 ; i < prev.length(); i++){
            count++;
            if(i == prev.length() -1 || prev.charAt(i) != prev.charAt(i+1)){
                sb.append(count);
                sb.append(prev.charAt(i));
                count = 0;
                continue;
            }
        }
        return sb.toString();
    }
}
