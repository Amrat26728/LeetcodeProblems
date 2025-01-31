package Strings;

// problem
// https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/

public class NumberOfStringsThatAppearAsSubstring {
    public static void main(String[] args) {
        String[] str = {"a","b","c"};
        String word = "aaaaabbbbb";
        System.out.println(numOfStrings(str, word));
    }

    ///////// solution ///////////
    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(String s: patterns){
            if (word.contains(s)){
                count++;
            }
        }
        return count;
    }
}
