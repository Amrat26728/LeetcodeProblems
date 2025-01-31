package Strings;

// problem
// https://leetcode.com/problems/rotate-string/

public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String t = "eabcd";
        System.out.println(rotateString(s, t));
    }

    public static boolean rotateString(String s, String t){
        if (s.equals(t)){
            return true;
        }
        int endIndex = 1;
        int length = s.length();
        while (endIndex < length){
            String first = s.substring(0, endIndex);
            String second = s.substring(endIndex);
            String newString = second.concat(first);
            if (newString.equals(t)){
                return true;
            }
            endIndex++;
        }
        return false;
    }
}
