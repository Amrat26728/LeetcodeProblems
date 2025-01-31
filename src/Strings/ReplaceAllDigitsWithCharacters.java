package Strings;

// problem
// https://leetcode.com/problems/replace-all-digits-with-characters/

public class ReplaceAllDigitsWithCharacters {
    public static void main(String[] args) {
        String s = "a1c1e1";
        System.out.println(replaceDigits(s));
    }

    /////////// solution /////////
    public static String replaceDigits(String s){
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 97 && s.charAt(i) <= 122){
                str = str.concat(s.substring(i, i + 1));
            }else{
                int ascii = s.charAt(i-1) + Integer.parseInt(s.substring(i, i+1));
                char ch = (char) ascii;
                str = str.concat(Character.toString(ch));
            }
        }
        return str;
    }
}
