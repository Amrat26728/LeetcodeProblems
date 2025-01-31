package Arrays;

// problem
// https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-i/

public class MinimumOperationsToExceedThresholdValue1 {
    public static void main(String[] args) {
        int[] arr = {};
        int k = 1;
        System.out.println(minOperations(arr, k));
    }

    public static int minOperations(int[] nums, int k){
        int count = 0;
        for (int num: nums){
            if (num < k){
                count++;
            }
        }
        return count;
    }
}
