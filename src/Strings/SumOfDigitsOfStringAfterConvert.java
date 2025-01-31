package Strings;

// problem
// https://leetcode.com/problems/sum-of-digits-of-string-after-convert/

public class SumOfDigitsOfStringAfterConvert {
    public static void main(String[] args) {
        String s = "z";
        int k = 1;
        System.out.println(getLucky(s, k));
    }

    public static int getLucky(String s, int k){
        String digits = "";
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i) - 96;
            digits = digits.concat(Integer.toString(val));
        }
        int ans = 0;
        for (int i = 0; i < k; i++) {
            int sum = 0;
            for (int j = 0; j < digits.length(); j++) {
                int val = Integer.parseInt(digits.substring(j, j+1));
                sum += val;
            }
            ans = sum;
            digits = Integer.toString(sum);
        }
        return ans;
    }
}
