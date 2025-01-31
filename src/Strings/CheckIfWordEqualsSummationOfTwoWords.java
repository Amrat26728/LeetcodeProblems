package Strings;

// problem
// https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/

public class CheckIfWordEqualsSummationOfTwoWords {
    public static void main(String[] args) {
        String firstWord = "aaa";
        String secondWord = "a";
        String targetWord  = "aab";
        System.out.println(isSumEqual(firstWord, secondWord, targetWord));
    }

    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord){
        return convert(firstWord) + convert(secondWord) == convert(targetWord);
    }
    private static int convert(String word){
        int n = 0;
        for (int i = 0; i < word.length(); i++) {
            n *= 10;
            n += word.charAt(i) - 97;
        }
        return n;
    }
}
