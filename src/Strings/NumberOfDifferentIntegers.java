package Strings;

// problem
// https://leetcode.com/problems/number-of-different-integers-in-a-string/

import java.util.ArrayList;
import java.util.List;

public class NumberOfDifferentIntegers {
    public static void main(String[] args) {
        String word = "001";
        System.out.println(numDifferentIntegers(word));
    }

    public static int numDifferentIntegers(String word){
        StringBuilder num = new StringBuilder();
        List<String> unique = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 47 && word.charAt(i) <= 57){
                num.append(word.charAt(i));
            }
            else{
                String n = num.toString();
                count = count(n, unique, count);
                num.delete(0, num.length());
            }
        }
        count = count(num.toString(), unique, count);
        return count;
    }

    private static int count(String n, List<String> unique, int count){
        if (!n.isEmpty() && n.charAt(0) == '0'){
            String leadingZeroesRemoved = removeLeadingZeroes(n);
            if (!leadingZeroesRemoved.isEmpty() && !unique.contains(leadingZeroesRemoved)){
                unique.add(leadingZeroesRemoved);
                count++;
            }
        }else if(!n.isEmpty() && !unique.contains(n)){
            unique.add(n);
            count++;
        }
        return count;
    }

    private static String removeLeadingZeroes(String num){
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) != '0'){
                return num.substring(i);
            }
        }
        return "0";
    }
}
