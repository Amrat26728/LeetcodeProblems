package Strings;

// problem
// https://leetcode.com/problems/excel-sheet-column-number/

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        String columnTitle = "AA";
        System.out.println(titleToNumber(columnTitle));
    }

    public static int titleToNumber(String columnTitle) {
        Map<Character, Integer> map = new HashMap<>();
        int value = 1;
        for (char i = 'A'; i <= 'Z' ; i++) {
            map.put(i, value);
            value++;
        }
        int colNumber = map.get(columnTitle.charAt(0));
        for (int i = 1; i < columnTitle.length(); i++) {
            colNumber *= 26;
            colNumber += map.get(columnTitle.charAt(i));
        }
        return colNumber;
    }
}
