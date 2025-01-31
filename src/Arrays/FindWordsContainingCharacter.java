package Arrays;

import java.util.ArrayList;
import java.util.List;

// problem
// https://leetcode.com/problems/find-words-containing-character/

public class FindWordsContainingCharacter {
    public static void main(String[] args) {
        String[] str = {"abc","bcd","aaaa","cbc"};
        System.out.println(findWordsContaining(str, 'z'));
    }


    /////////// solution /////////////////
    private static List<Integer> findWordsContaining(String[] words, char x){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == x){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}
