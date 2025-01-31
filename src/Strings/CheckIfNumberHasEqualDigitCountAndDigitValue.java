package Strings;

// problem
// https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/

import java.util.HashMap;
import java.util.Map;

public class CheckIfNumberHasEqualDigitCountAndDigitValue {
    public static void main(String[] args) {
        String num = "030";
        System.out.println(digitCount(num));
    }

    public static boolean digitCount(String num){
        Map<String, Integer> counter = new HashMap<>();
        for (int i = 0; i < num.length(); i++) {
            String ch = num.substring(i, i+1);
            if (counter.containsKey(ch)){
                int count = counter.get(ch);
                counter.replace(ch, count+1);
            }else{
                counter.put(ch, 1);
            }
        }
        for (int i = 0; i < num.length(); i++) {
            String index = Integer.toString(i);
            Integer count = counter.get(index);
            if (count == null){
                count = 0;
            }
            if (Integer.parseInt(num.substring(i, i+1)) != count){
                return false;
            }
        }
        return true;
    }
}
