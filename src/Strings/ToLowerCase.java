package Strings;

// problem
// https://leetcode.com/problems/to-lower-case/

public class ToLowerCase {
    public static void main(String[] args) {
        String s = "al&phaB/ET";
        System.out.println(toLowerCase(s));
    }

    ///////// solution ////////////
    public static String toLowerCase(String s){
        String lowerCase = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch >= 65 && ch <= 90){
                int ascii = (int) ch + 32;
                char c = (char) ascii;
                lowerCase = lowerCase.concat(Character.toString(c));
            }else{
                lowerCase = lowerCase.concat(s.substring(i, i+1));
            }
        }
        return lowerCase;
    }
}
