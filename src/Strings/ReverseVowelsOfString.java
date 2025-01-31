package Strings;

// problem
// https://leetcode.com/problems/reverse-vowels-of-a-string/

public class ReverseVowelsOfString {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s){
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right){
            if ((chars[left] == 'a' || chars[left] == 'e' || chars[left] == 'i' || chars[left] == 'o' || chars[left] == 'u' || chars[left] == 'A' || chars[left] == 'E' || chars[left] == 'I' || chars[left] == 'O' || chars[left] == 'U') && (chars[right] == 'a' || chars[right] == 'e' || chars[right] == 'i' || chars[right] == 'o' || chars[right] == 'u' || chars[right] == 'A' || chars[right] == 'E' || chars[right] == 'I' || chars[right] == 'O' || chars[right] == 'U')){
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
            else if(chars[left] != 'a' && chars[left] != 'e' && chars[left] != 'i' && chars[left] != 'o' && chars[left] != 'u' && chars[left] != 'A' && chars[left] != 'E' && chars[left] != 'I' && chars[left] != 'O' && chars[left] != 'U'){
                left++;
            }
            else if(chars[right] != 'a' && chars[right] != 'e' && chars[right] != 'i' && chars[right] != 'o' && chars[right] != 'u' && chars[right] != 'A' && chars[right] != 'E' && chars[right] != 'I' && chars[right] != 'O' && chars[right] != 'U'){
                right--;
            }
        }
        return new String(chars);
    }
}
