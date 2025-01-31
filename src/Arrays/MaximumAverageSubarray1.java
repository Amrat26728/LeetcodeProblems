package Arrays;

// problem
// https://leetcode.com/problems/maximum-average-subarray-i/

public class MaximumAverageSubarray1 {
    public static void main(String[] args) {
        int[] arr = {0,4,0,3,2};
        int k = 1;
        System.out.println(findMaxAverage(arr, k));
    }

    public static double findMaxAverage(int[] nums, int k){
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double max = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i];
            sum -= nums[i-k];
            if (sum > max){
                max = sum;
            }
        }
        return max/k;
    }
}
