package Strings;

// problem
// https://leetcode.com/problems/consecutive-characters/

public class ConsecutiveCharacters {
    public static void main(String[] args) {
        String s = "abbbaaaa";
        System.out.println(maxPower(s));
    }

    public static int maxPower(String s){
        if (s.length() == 1){
            return 1;
        }
        int ans = 0;
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i+1)){
                count++;
                if (count > ans){
                    ans = count;
                }
                count = 0;
            }else{
                count++;
            }
        }
        if (count == 0){
            return ans;
        }
        count++;
        return Math.max(count, ans);
    }
}
