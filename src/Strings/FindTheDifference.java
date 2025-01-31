package Strings;

// problem
// https://leetcode.com/problems/find-the-difference/

public class FindTheDifference {
    public static void main(String[] args) {
        String s = "";
        String t = "e";
        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t){
        String concatinatedString = s.concat(t);
        int ans = concatinatedString.charAt(0);
        for (int i = 1; i < concatinatedString.length(); i++) {
            ans = ans ^ concatinatedString.charAt(i);
        }
        return (char) ans;
    }
}
