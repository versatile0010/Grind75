class Solution {
    public int longestPalindrome(String s) {
        int [] arr = new int[128];
        for(char c : s.toCharArray()){
            arr[(int)c]++;
        }
        int letters = 0;
        boolean hasOdd = false;

        for(int f : arr){
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
