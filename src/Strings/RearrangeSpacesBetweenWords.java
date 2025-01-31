package Strings;

// problem
// https://leetcode.com/problems/rearrange-spaces-between-words/

import java.util.ArrayList;
import java.util.List;

public class RearrangeSpacesBetweenWords {
    public static void main(String[] args) {
        String s = "a a a a";
        System.out.println(reorderSpaces(s));
    }

    public static String reorderSpaces(String text) {
        String word = "";
        List<String> wordsList = new ArrayList<>();
        int words = 0;
        int spaces = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' '){
                spaces++;
                if (!word.isEmpty()){
                    words++;
                    wordsList.add(word);
                    word = "";
                }
            }else{
                word = word.concat(text.substring(i, i+1));
            }
        }
        if (!word.isEmpty()){
            wordsList.add(word);
            words++;
        }
        return rearrangeString(wordsList, words, spaces);
    }
    private static String rearrangeString(List<String> wordsList, int words, int spaces){
        if (words == 1){
            String s = wordsList.getFirst();
            for (int i = 0; i < spaces; i++) {
                s = s.concat(" ");
            }
            return s;
        }
        int spacePerWord = spaces / (words - 1);
        int remainingSpaces = spaces % (words - 1);
        String ans = "";
        for (int i = 0; i < wordsList.size(); i++) {
            ans = ans.concat(wordsList.get(i));
            if (i != wordsList.size() - 1){
                for (int j = 0; j < spacePerWord; j++) {
                    ans = ans.concat(" ");
                }
            }
        }
        for (int i = 0; i < remainingSpaces; i++) {
            ans = ans.concat(" ");
        }
        return ans;
    }
}
