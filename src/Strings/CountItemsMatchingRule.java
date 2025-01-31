package Strings;

// problem
// https://leetcode.com/problems/count-items-matching-a-rule/

import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingRule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        String ruleKey = "";
        String ruleValue = "";
        System.out.println(countMatches(items, ruleKey, ruleValue));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        if (ruleKey.equals("type")){
            return count(items, 0, ruleValue);
        }
        if(ruleKey.equals("color")){
            return count(items, 1, ruleValue);
        }
        return count(items, 2, ruleValue);
    }
    private static int count(List<List<String>> items, int col, String ruleValue){
        int count = 0;
        for (List<String> item : items) {
            if (item.get(col).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
