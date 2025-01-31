package Strings;

// problem
// https://leetcode.com/problems/count-common-words-with-one-occurrence/

import java.util.HashMap;
import java.util.Map;

public class CountCommonWordsWithOneOccurrence {
    public static void main(String[] args) {
        String[] words1 = {"leetcode","is","amazing","as","is"};
        String[] words2 = {"amazing","leetcode","is"};
        System.out.println(countWords(words1, words2));
    }

    public static int countWords(String[] words1, String[] words2){
        Map<String, Integer> counter1 = new HashMap<>();
        Map<String, Integer> counter2 = new HashMap<>();
        for (String word: words1){
            if (counter1.containsKey(word)){
                counter1.replace(word, counter1.get(word) + 1);
            }else{
                counter1.put(word, 1);
            }
        }

        for (String word: words2){
            if (counter2.containsKey(word)){
                counter2.replace(word, counter2.get(word) + 1);
            }else{
                counter2.put(word, 1);
            }
        }
        if (words1.length < words2.length){
            return countOneOccurrence(words1, counter1, counter2);
        }
        return countOneOccurrence(words2, counter1, counter2);
    }

    private static int countOneOccurrence(String[] words, Map<String, Integer> counter1, Map<String, Integer> counter2){
        int ansCount = 0;
        for (String word: words){
            Integer count1 = counter1.get(word);
            Integer count2 = counter2.get(word);
            if (count1 != null && count2 != null && count1 == 1 && count2 == 1){
                ansCount++;
            }
        }
        return ansCount;
    }
}
