package Strings;

import java.util.Stack;

// problem
// https://leetcode.com/problems/count-asterisks/

public class CountAsterisks {
    public static void main(String[] args) {
        String str = "yo|uar|e**|b|e***au|tifu|l";
        System.out.println(count(str));
    }

    //////// solution //////////

    public static int count(String s){
        int count = 0;
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*' && str.isEmpty()){
                count++;
            }
            else if (s.charAt(i) == '|' && !str.isEmpty()){
                str = "";
            }
            else if (s.charAt(i) == '|' && str.isEmpty()){
                str = str.concat("|");
            }
        }
        return count;
    }
}
