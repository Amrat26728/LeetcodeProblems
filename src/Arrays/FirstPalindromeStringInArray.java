package Arrays;

// problem
// https://leetcode.com/problems/find-first-palindromic-string-in-the-array/

public class FirstPalindromeStringInArray {
    public static void main(String[] args) {
        String[] arr = {"def","ghi"};

        System.out.println(firstPalindrome(arr));
    }

    ////////// solution ////////////
    private static String firstPalindrome(String[] words){
        for (String word : words) {
            String reversed = new StringBuffer(word).reverse().toString();
            if (reversed.equals(word)) {
                return word;
            }
        }
        return "";
    }
}
