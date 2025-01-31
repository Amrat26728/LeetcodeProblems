package Strings;

// problem
// https://leetcode.com/problems/reverse-only-letters/

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String s = "Test1ng-Leet=code-Q!";
        System.out.println(reverseOnlyLetters(s));
    }

    public static String reverseOnlyLetters(String s){
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right){
            if (((chars[left] >= 65 && chars[left] <= 90) || (chars[left] >= 97 && chars[left] <= 122)) && ((chars[right] >= 65 && chars[right] <= 90) || (chars[right] >= 97 && chars[right] <= 122))){
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
            else if(chars[left] < 65 || (chars[left] > 90 && chars[left] < 97) || chars[left] > 122){
                left++;
            }
            else if(chars[right] < 65 || (chars[right] > 90 && chars[right] < 97) || chars[right] > 122){
                right--;
            }
        }
        return new String(chars);
    }
}
