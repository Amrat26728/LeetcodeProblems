package Strings;

// problem
// https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-i/

public class MinimumNoOfPushesToTypeWord {
    public static void main(String[] args) {
        String word = "abcde";
        System.out.println(minimumPushes(word));
    }

    public static int minimumPushes(String word){
        int pushes = 1;
        int totalPushes = 0;
        int length = word.length();
        while (length >= 8){
            length = length - 8;
            totalPushes += 8 * pushes;
            pushes++;
        }
        if (length > 0){
            totalPushes += length * pushes;
        }
        return totalPushes;
    }
}
