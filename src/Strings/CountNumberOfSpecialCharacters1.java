package Strings;

// problem
// https://leetcode.com/problems/count-the-number-of-special-characters-i/

public class CountNumberOfSpecialCharacters1 {
    public static void main(String[] args) {
        String s = "abBCab";
        System.out.println(numberOfSpecialChars(s));
    }

    public static int numberOfSpecialChars(String word){
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int count = 0;
        for (int i = 0; i < alphabets.length(); i++) {
            if (word.indexOf(alphabets.charAt(i)) != -1 && word.indexOf(alphabets.charAt(i)+32) != -1){
                count++;
            }
        }
        return count;
    }
}
