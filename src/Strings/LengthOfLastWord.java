package Strings;

// problem
// https://leetcode.com/problems/length-of-last-word/

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "l y ";
        System.out.println(lengthOfLastWord(s));
    }

    ///////////// solution ////////////
    public static int lengthOfLastWord(String s){
        boolean isWordComplete = false;
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' '){
                if (isWordComplete){
                    break;
                }
            }else {
                count++;
                isWordComplete = true;
            }
        }
        return count;
    }
}
