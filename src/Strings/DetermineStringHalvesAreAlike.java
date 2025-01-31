package Strings;

// problem
// https://leetcode.com/problems/determine-if-string-halves-are-alike/

public class DetermineStringHalvesAreAlike {
    public static void main(String[] args) {
        String s = "auBEokhoeIouuPFRalobaAgtealGVeaIIoFMoUIoKwoLRI";
        System.out.println(halvesAreAlike(s));
    }

    public static boolean halvesAreAlike(String s){
        String vowels = "aeiouAEIOU";
        int firstHalfIndex = 0;
        int endIndex = (s.length() / 2) - 1;
        int secondHalfIndex = endIndex + 1;
        int firstHalfCounter = 0;
        int secondHalfCounter = 0;
        while (firstHalfIndex <= endIndex){
            if (vowels.indexOf(s.charAt(firstHalfIndex)) != -1){
                firstHalfCounter++;
            }
            if (vowels.indexOf(s.charAt(secondHalfIndex)) != -1){
                secondHalfCounter++;
            }
            firstHalfIndex++;
            secondHalfIndex++;
        }
        return firstHalfCounter == secondHalfCounter;
    }
}
