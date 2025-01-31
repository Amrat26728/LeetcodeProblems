package Strings;

// problem
// https://leetcode.com/problems/split-strings-by-separator/

import java.util.ArrayList;
import java.util.List;

public class SplitStringsBySeparator {
    public static void main(String[] args) {
         List<String> words = new ArrayList<>();
         words.add("@one@two@three@");
         words.add("@problem@");
         words.add("six");
         System.out.println(splitWordsBySeparator(words, '@'));
    }

    public static List<String> splitWordsBySeparator(List<String> words, char separator){
        List<String> ans = new ArrayList<>();
        String sep = Character.toString(separator);
        if (sep.equals(".") || sep.equals("|") || sep.equals("$")){
            addToList(words, ans, "\\".concat(sep));
        }else{
            addToList(words, ans, sep);
        }
        return ans;
    }

    private static void addToList(List<String> words, List<String> ans, String separator){
        for(String word: words){
            String[] separatedStrings = word.split(separator);
            for (String s: separatedStrings){
                if (!s.isEmpty()){
                    ans.add(s);
                }
            }
        }
    }
}
