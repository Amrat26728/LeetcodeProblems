package Arrays;
// problem
// https://leetcode.com/problems/add-to-array-form-of-integer/

import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] arr = {9,9,9,9,9,9,9,9,9,9,9,9};
        int k = 999;
        System.out.println(addToArrayForm(arr, k));
    }

    public static List<Integer> addToArrayForm(int[] num, int k){
        List<Integer> ans = new ArrayList<>();
        int carry = 0;
        for (int i = num.length - 1; i >= 0; i--) {
            int kDigit = k % 10;
            int numDigit = num[i];
            int sum = kDigit + numDigit + carry;
            carry = sum / 10;
            k /= 10;
            ans.addFirst(sum%10);
        }
        while (k > 0){
            int digit = k % 10;
            k /= 10;
            int sum = carry + digit;
            carry = sum / 10;
            ans.addFirst(sum%10);
        }
        if (carry > 0){
            ans.addFirst(carry);
        }
        return ans;
    }
}
