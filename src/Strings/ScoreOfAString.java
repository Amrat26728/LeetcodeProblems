package Strings;

// problem
// https://leetcode.com/problems/score-of-a-string/

public class ScoreOfAString {
    public static void main(String[] args) {
        String s = "zaz";
        System.out.println(scoreOfString(s));
    }

    public static int scoreOfString(String s){
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int diff = s.charAt(i) - s.charAt(i+1);
            if (diff < 0){
                diff *= -1;
            }
            sum += diff;
        }
        return sum;
    }
}
