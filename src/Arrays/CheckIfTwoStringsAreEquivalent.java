package Arrays;

// problem
// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/

public class CheckIfTwoStringsAreEquivalent {
    public static void main(String[] args) {
        String[] str1 = {"abc", "d", "defg"};
        String[] str2 = {"abcddefg"};
        System.out.println(arrayStringsAreEqual(str1, str2));
    }

    ////////// solution ///////////////
    private static boolean arrayStringsAreEqual(String[] word1, String[] word2){
        String str1 = "";
        String str2 = "";

        for (String s : word1) {
            str1 = str1.concat(s);
        }
        for (String s : word2) {
            str2 = str2.concat(s);
        }
        return str1.equals(str2);
    }
}
