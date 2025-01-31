package Strings;

// problem
// https://leetcode.com/problems/make-the-string-great/

public class MakeStringGreat {
    public static void main(String[] args) {
        String s = "aA";
        System.out.println(makeGood(s));
    }

    public static String makeGood(String s){
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) + 32 == s.charAt(i+1) || s.charAt(i) - 32 == s.charAt(i+1)){
                s = s.substring(0, i).concat(s.substring(i+2));
                if (i != 0){
                    i -= 2;
                }else{
                    i -= 1;
                }
            }
        }
        return s;
    }
}
