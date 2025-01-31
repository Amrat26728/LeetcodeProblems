package Strings;

// problem
// https://leetcode.com/problems/reverse-words-in-a-string-iii/

public class ReverseWordsInaString3 {
    public static void main(String[] args) {
        String string = "contest";
        System.out.println(reverseWords(string));
    }

    public static String reverseWords(String s){
        char[] chars = s.toCharArray();
        int p1 = 0;
        int p2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                swap(chars, p2, p1-1);
                p1 = p2 = i + 1;
            }else{
                p1++;
            }
        }
        swap(chars, p2, p1-1);
        return new String(chars);
    }
    private static void swap(char[] chars, int start, int end){
        while (start < end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}
