package Strings;

// problem
// https://leetcode.com/problems/largest-substring-between-two-equal-characters/

import java.util.HashMap;
import java.util.Map;

public class LargestSubstringBetweenTwoEqualCharacters {
    public static void main(String[] args) {
        String s = "a";
        System.out.println(maxLengthBetweenEqualCharacters(s));
    }

    public static int maxLengthBetweenEqualCharacters(String s){
        Map<Character, Integer> startPositions = new HashMap<>();
        int ans = -1;
        for (int i = 0; i < s.length(); i++) {
            if (!startPositions.containsKey(s.charAt(i))){
                startPositions.put(s.charAt(i), i);
            }else{
                int length = i - startPositions.get(s.charAt(i)) - 1;
                if (length > ans){
                    ans = length;
                }
            }
        }
        return ans;
    }
}
