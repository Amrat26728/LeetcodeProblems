package Arrays;

// problem
// https://leetcode.com/problems/left-and-right-sum-differences/

import java.util.Arrays;

public class LeftAndRightSumDifferences {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(Arrays.toString(leftRightDifference(arr)));
    }
    public static int[] leftRightDifference(int[] nums){
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int leftSum = sum(nums, 0, i-1);
            int rightSum = sum(nums, i+1, nums.length-1);
            int diff = leftSum - rightSum;
            if (diff < 0) diff *= -1;
            ans[i] = diff;
        }
        return ans;
    }

    private static int sum(int[] nums, int start, int end){
        if ((start == 0 && end < 0) || (start >= nums.length && end >= nums.length - 1)){
            return 0;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
