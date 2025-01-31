package Strings;

// problem
// https://leetcode.com/problems/clear-digits/

public class ClearDigits {
    public static void main(String[] args) {
        String s = "aa5";
        System.out.println(clearDigits(s));
    }

    public static String clearDigits(String s){
        int index = 0;
        String digits = "0123456789";
        while (index <= s.length()-1){
            if (digits.indexOf(s.charAt(index)) != -1){
                s = s.substring(0, index-1).concat(s.substring(index+1));
                index -= 2;
            }
            index++;
        }
        return s;
    }
}
