package Strings;

// problem
// https://leetcode.com/problems/check-if-the-sentence-is-pangram/

public class CheckIfSentenceIsPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence){
        boolean[] arr = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            int index = sentence.charAt(i) - 97;
            if (!arr[index]){
                arr[index] = true;
            }
        }
        for(boolean isTrue: arr){
            if (!isTrue){
                return false;
            }
        }
        return true;
    }
}
