package Strings;

// problem
// https://leetcode.com/problems/shuffle-string/

public class ShuffleString {
    public static void main(String[] args) {
        String s = "abc";
        int[] indices = {0,1,2};
        System.out.println(restoreString(s, indices));
    }

    public static String restoreString(String s, int[] indices){
        char[] chars = s.toCharArray();
        for (int i = 0; i < indices.length; i++) {
            chars[indices[i]] = s.charAt(i);
        }
        return new String(chars);
    }
}
