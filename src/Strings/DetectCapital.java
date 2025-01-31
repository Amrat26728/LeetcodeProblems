package Strings;

// problem
// https://leetcode.com/problems/detect-capital/

public class DetectCapital {
    public static void main(String[] args) {
        String word = "U";
        System.out.println(detectCapitalUse(word));
    }

    public static boolean detectCapitalUse(String word){
        String upper = word.toUpperCase();
        String lower = word.toLowerCase();
        String capitalize = word.substring(0, 1).toUpperCase().concat(word.substring(1).toLowerCase());
        if (word.equals(upper)){
            return true;
        }
        if (word.equals(lower)){
            return true;
        }
        return word.equals(capitalize);
    }
}
