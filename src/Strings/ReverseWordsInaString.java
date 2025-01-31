package Strings;

// problem
// https://leetcode.com/problems/reverse-words-in-a-string/

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInaString {
    public static void main(String[] args) {
        String s = "a ";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        StringBuilder word = new StringBuilder();
        List<String> words = new ArrayList<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && !word.isEmpty()){
                words.add(word.toString());
                word.delete(0, word.length());
            }
            if (s.charAt(i) != ' '){
                word.insert(0, s.charAt(i));
            }
        }
        if (!word.isEmpty()){
            words.add(word.toString());
        }
        return reverse(words);
    }

    private static String reverse(List<String> words){
        if (words.size() == 1){
            return words.getFirst();
        }
        String ans = "";
        for (int i = 0; i < words.size(); i++) {
            ans = ans.concat(words.get(i));
            if (i != words.size() - 1){
                ans = ans.concat(" ");
            }
        }
        return ans;
    }
}
