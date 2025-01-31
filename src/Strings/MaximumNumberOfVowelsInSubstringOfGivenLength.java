package Strings;

// problem
// https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/

public class MaximumNumberOfVowelsInSubstringOfGivenLength {
    public static void main(String[] args) {
        String s = "aoieuooebdfhjnnhkaeignghngnghjuoiei";
        int k = 7;
        System.out.println(maxVowels(s, k));
    }

    public static int maxVowels(String s, int k){
        String substring = s.substring(0, k);
        String vowels = "aeiou";
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (vowels.indexOf(substring.charAt(i)) != -1){
                count++;
            }
        }
        int maxVowels = count;
        for (int i = 1; i <= s.length() - k; i++) {
            if (vowels.indexOf(s.charAt(i-1)) != -1){
                count--;
            }
            if (vowels.indexOf(s.charAt(i+k-1)) != -1){
                count++;
            }
            if (count > maxVowels){
                maxVowels = count;
            }
        }
        return maxVowels;
    }
}
