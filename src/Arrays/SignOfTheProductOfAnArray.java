package Arrays;

// problem
// https://leetcode.com/problems/sign-of-the-product-of-an-array/

public class SignOfTheProductOfAnArray {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(arraySign(arr));
    }

    public static int arraySign(int[] nums){
        int prod = 1;
        for (int num : nums) {
            if (num == 0){
                return 0;
            }
            if (num < 0) {
                prod *= -1;
            }
        }
        if (prod < 0){
            return -1;
        }
        return 1;
    }
}
