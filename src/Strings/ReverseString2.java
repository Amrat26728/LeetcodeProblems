package Strings;

// problem
// https://leetcode.com/problems/reverse-string-ii/

public class ReverseString2 {
    public static void main(String[] args) {
        String string = "abcdefghijklmno";
        System.out.println(reverseStr(string, 3));
    }

    public static String reverseStr(String s, int k){
        char[] chars = s.toCharArray();
        int length = chars.length;
        if (length < k){
            reverse(chars, 0, length-1);
            return new String(chars);
        }
        if (length <= 2*k){
            reverse(chars, 0, k-1);
            return new String(chars);
        }
        int index = 0;
        while (index + 2*k < length){
            reverse(chars, index, index+k-1);
            index = index + 2*k;
        }
        int remaining = length-index;
        if(remaining < k){
            reverse(chars, index, length-1);
        }else{
            reverse(chars, index, index+k-1);
        }
        return new String(chars);
    }

    private static void reverse(char[] chars, int left, int right){
        while (left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
}
