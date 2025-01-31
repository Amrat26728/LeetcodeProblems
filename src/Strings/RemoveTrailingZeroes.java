package Strings;

// problem
// https://leetcode.com/problems/remove-trailing-zeros-from-a-string/

public class RemoveTrailingZeroes {
    public static void main(String[] args) {
        String s = "1345";
        System.out.println(removeTrailingZeroes(s));
    }

    ////////// solution /////////////
    private static String removeTrailingZeroes(String s){
        int index = s.length() - 1;
        while (s.charAt(index) == '0'){
            index--;
        }
        return s.substring(0, index + 1);
    }
}
