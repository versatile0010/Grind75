import java.util.*;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> m1 = getLetterCountMap(ransomNote);
        Map<Character, Integer> m2 = getLetterCountMap(magazine);

        for(char c : m1.keySet()){
            if(m2.getOrDefault(c, 0) < m1.get(c)){
                return false;
            }
        }
        return true;

    }
    public Map<Character, Integer> getLetterCountMap(String str){
        Map<Character, Integer> hm = new HashMap<>();
        for(char c : str.toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        return hm;
    }
}
