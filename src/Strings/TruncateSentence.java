package Strings;

// problem
// https://leetcode.com/problems/truncate-sentence/

public class TruncateSentence {
    public static void main(String[] args) {
        String s = "chopper is not a tanuki";
        int k = 5;
        System.out.println(truncateSentence(s, k));
    }

    public static String truncateSentence(String s, int k){
        String[] str = s.split(" ");
        String ans = "";
        for (int i = 0; i < k; i++) {
            ans = ans.concat(str[i]);
            if (i != k-1){
                ans = ans.concat(" ");
            }
        }
        return ans;
    }
}
