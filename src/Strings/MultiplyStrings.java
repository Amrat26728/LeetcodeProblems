package Strings;

// problem
// https://leetcode.com/problems/multiply-strings/

public class MultiplyStrings {
    public static void main(String[] args) {
        String num1 = "0";
        String num2 = "999";
        System.out.println(multiply(num1, num2));
    }

    public static String multiply(String num1, String num2){
        int zeroes = 1;
        int multiplier = Integer.parseInt(num2.substring(num2.length() - 1));
        StringBuilder ans = new StringBuilder();
        if (num2.charAt(0) == '0'){
            ans = new StringBuilder("0");
        }else{
            ans = multiplyDigit(num1, multiplier);
        }

        for (int i = num2.length() - 2; i >= 0; i--) {
            if (num2.charAt(i) == '0'){
                zeroes++;
            }else{
                int multiplierDigit = Integer.parseInt(num2.substring(i, i+1));
                StringBuilder multipliedDigitAns = multiplyDigit(num1, multiplierDigit);
                if (!multipliedDigitAns.toString().equals("0")){
                    multipliedDigitAns.append("0".repeat(zeroes));
                }
                zeroes++;
                ans = sum(ans.toString(), multipliedDigitAns.toString());
            }
        }

        return ans.toString();
    }

    private static StringBuilder multiplyDigit(String num, int digit){
        int carry = 0;
        StringBuilder multi = new StringBuilder();
        for (int j = num.length() - 1; j >= 0; j--) {
            int dig = Integer.parseInt(num.substring(j, j+1));
            int sum = dig * digit + carry;
            carry = 0;
            if (sum >= 10){
                carry = sum / 10;
            }
            multi.insert(0, sum%10);
        }
        if (carry > 0){
            multi.insert(0, carry);
        }
        return multi;
    }

    private static StringBuilder sum(String num1, String num2){
        int num1Index = num1.length()-1;
        int num2Index = num2.length()-1;
        int carry = 0;
        StringBuilder sum = new StringBuilder();
        while (num1Index >= 0 && num2Index >= 0){
            int digit1 = Integer.parseInt(num1.substring(num1Index, num1Index+1));
            int digit2 = Integer.parseInt(num2.substring(num2Index, num2Index+1));
            int digitSum = digit1 + digit2 + carry;
            carry = 0;
            if (digitSum >= 10){
                carry = digitSum / 10;
            }
            sum.insert(0, digitSum%10);
            num1Index--;
            num2Index--;
        }
        while (num1Index >= 0){
            int digit1 = Integer.parseInt(num1.substring(num1Index, num1Index+1));
            int digitSum = digit1 + carry;
            carry = 0;
            if (digitSum >= 10){
                carry = digitSum / 10;
            }
            sum.insert(0, digitSum%10);
            num1Index--;
        }

        while (num2Index >= 0){
            int digit1 = Integer.parseInt(num2.substring(num2Index, num2Index+1));
            int digitSum = digit1 + carry;
            carry = 0;
            if (digitSum >= 10){
                carry = digitSum / 10;
            }
            sum.insert(0, digitSum%10);
            num2Index--;
        }

        if (carry > 0){
            sum.insert(0, carry);
        }
        return sum;
    }

}
