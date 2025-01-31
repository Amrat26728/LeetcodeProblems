package Strings;

// problem
// https://leetcode.com/problems/largest-3-same-digit-number-in-string/

public class Largest3SameDigitsNumberInString {
    public static void main(String[] args) {
        String num = "42352338";
        System.out.println(largestGoodInteger(num));
    }

    public static String largestGoodInteger(String num){
        String[] arr = {"999", "888", "777", "666", "555", "444", "333", "222", "111", "000"};
        for (String n: arr){
            if (num.contains(n)){
                return n;
            }
        }
        return "";
    }
}
