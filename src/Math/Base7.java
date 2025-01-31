package Math;

// problem
// https://leetcode.com/problems/base-7/

public class Base7 {
    public static void main(String[] args) {
        int num = -1;
        System.out.println(convertToBase7(num));
    }

    public static String convertToBase7(int num){
        if (num == 0){
            return "0";
        }
        String ans = "";
        boolean isNeg = false;
        if (num < 0){
            isNeg = true;
            num *= -1;
        }
        while (num > 0){
            int rem = num % 7;
            ans = Integer.toString(rem).concat(ans);
            num /= 7;
        }
        if (isNeg){
            return "-".concat(ans);
        }
        return ans;
    }
}
