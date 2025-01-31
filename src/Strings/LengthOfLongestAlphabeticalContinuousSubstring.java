package Strings;

// problem
// https://leetcode.com/problems/length-of-the-longest-alphabetical-continuous-substring/

public class LengthOfLongestAlphabeticalContinuousSubstring {
    public static void main(String[] args) {
        String s = "abddefghijklmnopqrstuvxxyz";
        System.out.println(longestContinuousSubstring(s));
    }

    public static int longestContinuousSubstring(String s){
        int count = 0;
        int ans = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i+1) - s.charAt(i) != 1){
                count++;
                if (count > ans){
                    ans = count;
                }
                count = 0;
            }else{
                count++;
            }
        }
        if (++count > ans){
            ans = count;
        }
        return ans;
    }
}
