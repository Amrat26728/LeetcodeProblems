package Strings;

// problem
// https://leetcode.com/problems/merge-strings-alternately/

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        System.out.println(mergeAlternately(word1, word2));
    }

    ////////// solution ///////////
    public static String mergeAlternately(String word1, String word2) {
        int p1 = 0;
        int p2 = 0;
        int rem = 0;
        String s = "";
        while (p1 < word1.length() && p2 < word2.length()){
            if (rem % 2 == 0){
                s = s.concat(word1.substring(p1, p1 + 1));
                p1++;
            }else{
                s = s.concat(word2.substring(p2, p2 + 1));
                p2++;
            }
            rem++;
        }

        while (p1 < word1.length()){
            s = s.concat(word1.substring(p1, p1 + 1));
            p1++;
        }
        while (p2 < word2.length()){
            s = s.concat(word2.substring(p2, p2 + 1));
            p2++;
        }
        return s;
    }
}
