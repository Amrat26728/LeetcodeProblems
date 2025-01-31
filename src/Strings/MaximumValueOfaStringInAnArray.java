package Strings;

// problem
// https://leetcode.com/problems/maximum-value-of-a-string-in-an-array/

public class MaximumValueOfaStringInAnArray {
    public static void main(String[] args) {
        String[] strs = {"iw1","61939","7","7i","cye","bv7yg","t3ye6","990"};
        System.out.println(maximumValue(strs));
    }

    public static int maximumValue(String[] strs){
        int max = 0;
        String s = "0123456789";
        for (String val: strs){
            boolean isInteger = true;
            for (int i = 0; i < val.length(); i++) {
                if (!s.contains(val.substring(i, i+1))){
                    isInteger = false;
                    break;
                }
            }
            int num = 0;
            if (isInteger){
                num = Integer.parseInt(val);
            }
            else {
                num = val.length();
            }
            if (max < num) max = num;
        }
        return max;
    }
}
