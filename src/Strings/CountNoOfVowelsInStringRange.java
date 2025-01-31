package Strings;

// problem
// https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/

public class CountNoOfVowelsInStringRange {
    public static void main(String[] args) {
        String[] str = {"are","amy","u"};
        int left = 0;
        int right = 2;
        System.out.println(countVowelStrings(str, left, right));
    }

    /////////// solution //////////
    public static int countVowelStrings(String[] str, int left, int right){
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (
                    (str[i].startsWith("a") ||
                            str[i].startsWith("e") ||
                            str[i].startsWith("i") ||
                            str[i].startsWith("o") ||
                            str[i].startsWith("u"))
                    && (str[i].endsWith("a") ||
                            str[i].endsWith("e") ||
                            str[i].endsWith("i") ||
                            str[i].endsWith("o") ||
                            str[i].endsWith("u"))
            ){
                count++;
            }
        }
        return count;
    }
}
