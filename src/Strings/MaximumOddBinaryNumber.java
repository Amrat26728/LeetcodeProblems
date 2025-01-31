package Strings;

// problem
// https://leetcode.com/problems/maximum-odd-binary-number/

public class MaximumOddBinaryNumber {
    public static void main(String[] args) {
        String s = "110000";
        System.out.println(maximumOddBinaryNumber(s));
    }

    public static String maximumOddBinaryNumber(String s){
        if (s.equals("0")){
            return s;
        }
        int ones = 0;
        for(char ch: s.toCharArray()){
            if (ch == '1'){
                ones++;
            }
        }
        if (ones == 0){
            return s;
        }
        int zeroes = s.length() - ones;
        return "1".repeat(Math.max(0, ones - 1)) +
                    "0".repeat(Math.max(0, zeroes)) +
                    "1";
    }
}
