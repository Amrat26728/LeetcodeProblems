package Arrays;

import java.util.Arrays;


// problem
// https://leetcode.com/problems/separate-the-digits-in-an-array/

public class SeparateDigitsInAnArray {
    public static void main(String[] args) {
        int[] arr = {7};
        System.out.println(Arrays.toString(separateDigits(arr)));
    }

    ///////// solution //////////////
    private static int[] separateDigits(int[] nums){
        String str = "";
        for(int ele: nums){
            str = str.concat(Integer.toString(ele));
        }
        System.out.println(str);
        int[] ans = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ans[i] = Integer.parseInt(str.substring(i,i+1));
        }
        return ans;
    }
}
