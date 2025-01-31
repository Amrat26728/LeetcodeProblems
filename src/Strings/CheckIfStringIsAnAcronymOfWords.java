package Strings;

// problem
// https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/

import java.util.ArrayList;
import java.util.List;

public class CheckIfStringIsAnAcronymOfWords {
    public static void main(String[] args) {
        List<String> words = new  ArrayList<>();
        String acronym = "abc";
        System.out.println(isAcronym(words, acronym));
    }

    public static boolean isAcronym(List<String> words, String a){
        StringBuilder acronym = new StringBuilder();
        for (String word : words) {
            acronym.append(word.charAt(0));
        }
        return a.contentEquals(acronym);
    }
}
