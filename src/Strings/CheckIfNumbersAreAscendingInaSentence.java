package Strings;

// problem
// https://leetcode.com/problems/check-if-numbers-are-ascending-in-a-sentence/

public class CheckIfNumbersAreAscendingInaSentence {
    public static void main(String[] args) {
        String s = "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s";
        System.out.println(areNumbersAscending(s));
    }

    public static boolean areNumbersAscending(String s){
        String[] stringArr = s.split(" ");
        String digits = "0123456789";
        int index = 0;
        int firstNum = 0;
        int secondNum = 0;
        for(String str: stringArr){
            if (digits.contains(str.substring(0, 1))){
                firstNum = Integer.parseInt(str);
                index++;
                break;
            }
            index++;
        }
        for (int i = index; i < stringArr.length; i++) {
            if (digits.contains(stringArr[i].substring(0, 1))){
                secondNum = Integer.parseInt(stringArr[i]);
                if (firstNum >= secondNum){
                    return false;
                }
                firstNum = secondNum;
            }
        }
        return true;
    }
}
