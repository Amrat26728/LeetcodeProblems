package Strings;

// problem
// https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/

import java.util.*;

public class CheckIfAllCharactersHaveEqualNoOfOccurrences {
    public static void main(String[] args) {
        String s = "aaabb";
        System.out.println(areOccurrencesEqual(s));
    }

    public static boolean areOccurrencesEqual(String s){
        Map<Character, Integer> counter = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (counter.containsKey(ch)){
                counter.replace(ch, counter.get(ch) + 1);
            }else{
                counter.put(ch, 1);
            }
        }
        List<Integer> values = new ArrayList<>(counter.values());
        for (int i = 0; i < values.size() - 1; i++) {
            if (!values.get(i).equals(values.get(i + 1))){
                return false;
            }
        }
        return true;
    }
}
