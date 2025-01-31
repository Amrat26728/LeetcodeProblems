package Strings;

// problem
// https://leetcode.com/problems/number-of-changing-keys/

public class NumberOfChangingKeys {
    public static void main(String[] args) {
        String s = "AaAaAaaA";
        System.out.println(countKeyChanges(s));
    }
    public static int countKeyChanges(String s){
        s = s.toLowerCase();
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i+1)){
                count++;
            }
        }
        return count;
    }
}
