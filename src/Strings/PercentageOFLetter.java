package Strings;

// problem
// https://leetcode.com/problems/percentage-of-letter-in-string/

public class PercentageOFLetter {
    public static void main(String[] args) {
        String s = "foober";
        System.out.println(percentageLetter(s, 'o'));
    }

    ////////// solution /////////
    public static int percentageLetter(String s, char letter) {
        int count = 0;
        for(char ch: s.toCharArray()){
            if(ch == letter){
                count++;
            }
        }
        return (count * 100) / s.length();
    }
}
