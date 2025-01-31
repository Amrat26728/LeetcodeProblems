package Strings;

// problem
// https://leetcode.com/problems/add-strings/

public class AddStrings {
    public static void main(String[] args) {
        String num1 = "99999999999999999999";
        String num2 = "99";
        System.out.println(addStrings(num1, num2));
    }

    public static String addStrings(String num1, String num2){
        int num1Index = num1.length()-1;
        int num2Index = num2.length()-1;
        String ans = "";
        int carry = 0;
        while (num1Index >= 0 && num2Index >= 0){
            int n1 = Integer.parseInt(num1.substring(num1Index, num1Index+1));
            int n2 = Integer.parseInt(num2.substring(num2Index, num2Index+1));
            int sum = n1 + n2 + carry;
            String ch = Integer.toString(sum%10);
            ans = ch.concat(ans);
            carry = sum / 10;
            num1Index--;
            num2Index--;
        }
        while (num1Index >= 0){
            int n1 = Integer.parseInt(num1.substring(num1Index, num1Index+1));
            int sum = n1 + carry;
            String ch = Integer.toString(sum%10);
            ans = ch.concat(ans);
            carry = sum / 10;
            num1Index--;
        }
        while (num2Index >= 0){
            int n2 = Integer.parseInt(num2.substring(num2Index, num2Index+1));
            int sum = n2 + carry;
            String ch = Integer.toString(sum%10);
            ans = ch.concat(ans);
            carry = sum / 10;
            num2Index--;
        }
        if (carry > 0){
            String ch = Integer.toString(carry%10);
            ans = ch.concat(ans);
        }
        return ans;
    }
}
