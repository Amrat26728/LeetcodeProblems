package Arrays;

import java.util.Arrays;
import java.util.Stack;

// problem
// https://leetcode.com/problems/rotate-array/

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
//        System.out.println(Arrays.toString(rotate(arr, 8)));
        rotate(arr, 8);
        System.out.println(Arrays.toString(arr));
    }

    ///////// solution //////////////
    private static int[] rotate(int[] nums, int k){

        Stack<Integer> stack = new Stack<>();
        k = k % nums.length;

        // store end elements in stack
        for (int i = nums.length - k; i < nums.length; i++) {
            stack.push(nums[i]);
        }

        // push num.length - k elements to the right
        int pos = nums.length - 1;
        for (int i = nums.length - k - 1; i >= 0; i--) {
            nums[pos] = nums[i];
            pos--;
        }

        // insert stack elements in the start
        for (int i = k - 1; i >= 0; i--) {
            nums[i] = stack.pop();
        }

        return nums;
    }
}
