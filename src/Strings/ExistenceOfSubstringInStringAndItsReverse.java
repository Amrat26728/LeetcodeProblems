package Strings;

// problem
// https://leetcode.com/problems/existence-of-a-substring-in-a-string-and-its-reverse/

public class ExistenceOfSubstringInStringAndItsReverse {
    public static void main(String[] args) {
        String s = "ausoee";
        System.out.println(isSubstringPresent(s));
    }

    public static boolean isSubstringPresent(String s){
        String reverse = new StringBuffer(s).reverse().toString();
        if (s.length() == 2 && reverse.contains(s)){
            return true;
        }
        for (int i = 0; i <= s.length()-2; i++) {
            String subString = s.substring(i, i+2);
            if (s.contains(subString) && reverse.contains(subString)){
                return true;
            }
        }
        return false;
    }
}
