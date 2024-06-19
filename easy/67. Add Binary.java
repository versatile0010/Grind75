/*
Time Complexity
: O(n), where n is a max(a.length(), b.length())

*/

class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(i >= 0 || j >= 0){
            int x = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int y = (j >= 0) ? b.charAt(j--) - '0' : 0;
            int sum = (x+y+carry);
            carry = (sum == 2 || sum == 3) ? 1 : 0;
            sb.append(
                (sum == 1 || sum == 3) ? "1" : "0"
            );
        }
        if(carry > 0) {
            sb.append("1");
        }
        return sb.reverse().toString();
    }
}
