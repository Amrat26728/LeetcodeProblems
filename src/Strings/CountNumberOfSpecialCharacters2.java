package Strings;

// problem
// https://leetcode.com/problems/count-the-number-of-special-characters-ii/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountNumberOfSpecialCharacters2 {
    public static void main(String[] args) {
        String s = "";
        System.out.println(numberOfSpecialChars(s));
    }

    public static int numberOfSpecialChars(String word){
        Map<Character, Integer> lowerCase = new HashMap<>();
        Map<Character, Integer> upperCase = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= 97 && ch <= 122){
                Integer index = lowerCase.get(ch);
                if (index != null){
                    lowerCase.replace(ch, i);
                }else{
                    lowerCase.put(ch, i);
                }
            }else{
                if (!upperCase.containsKey(ch)){
                    upperCase.put(ch, i);
                }
            }
        }

        List<Character> upperCaseKeys = new ArrayList<>(upperCase.keySet());
        int count = 0;
        for (char key: upperCaseKeys){
            int upperCaseIndex = upperCase.get(key);
            Integer lowerCaseIndex = lowerCase.get(Character.toLowerCase(key));
            if (lowerCaseIndex != null && upperCaseIndex - lowerCaseIndex > 0){
                count++;
            }
        }
        return count;
    }
}
