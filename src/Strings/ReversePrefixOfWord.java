package Strings;

// problem
// https://leetcode.com/problems/reverse-prefix-of-word/

public class ReversePrefixOfWord {
    public static void main(String[] args) {
        String s = "abcd";
        char ch = 'z';
        System.out.println(reversePrefix(s, ch));
    }

    public static String reversePrefix(String s, char c){
        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c){
                right = i;
                break;
            }
        }
        if (right == 0){
            return s;
        }
        char[] chars = s.toCharArray();
        while (left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
