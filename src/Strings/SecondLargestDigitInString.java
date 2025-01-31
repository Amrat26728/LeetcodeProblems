package Strings;

// problem
// leetcode.com/problems/second-largest-digit-in-a-string/

public class SecondLargestDigitInString {
    public static void main(String[] args) {
        String s = "abc5444";
        System.out.println(secondHighest(s));
    }

    public static int secondHighest(String s){
        int first = -1;
        int second = -1;
        for (char ch: s.toCharArray()){
            if (ch >= 48 && ch <= 57){
                int n = ch - '0';
                if (n > first){
                    second = first;
                    first = n;
                }else if(n != first && n > second){
                    second = n;
                }
            }
        }
        return second;
    }
}
