package Strings;

// problem
// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

public class FindIndexOfFirstOccurrence {
    public static void main(String[] args) {
        String haystack = "butsa";
        String needle = "sad";
        System.out.println(firsOccurrence(haystack, needle));
    }


    ///////// solution /////////////
    public static int firsOccurrence(String haystack, String needle){
        int length = haystack.length();
        for (int i = 0; i < length; i++) {
            if (haystack.substring(i, length).startsWith(needle)){
                return i;
            }
        }
        return -1;
    }
}
