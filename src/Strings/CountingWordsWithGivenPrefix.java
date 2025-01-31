package Strings;

// problem
// https://leetcode.com/problems/counting-words-with-a-given-prefix/

public class CountingWordsWithGivenPrefix {
    public static void main(String[] args) {
        String[] arr = {"leetcode","win","loops","success"};
        String pref = "code";
        System.out.println(prefixCount(arr, pref));
    }

    public static int prefixCount(String[] words, String pref){
        int count = 0;
        for (String word: words){
            if (word.startsWith(pref)){
                count++;
            }
        }
        return count;
    }
}
