package Arrays;

// problem
// https://leetcode.com/problems/minimum-sum-of-mountain-triplets-i/

public class MinimumSumOfMountainTriplets {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,4,5};
        System.out.println(minimumSum(arr));
    }

    public static int minimumSum(int[] nums){
        int minSum = Integer.MAX_VALUE;
        boolean mountainTripletShown = false;
        int length = nums.length;
        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (nums[j] > nums[i] && nums[j] > nums[k]){
                        int sum = nums[i] + nums[j] + nums[k];
                        mountainTripletShown = true;
                        if (sum < minSum){
                            minSum = sum;
                        }
                    }
                }
            }
        }
        if (mountainTripletShown) return minSum;
        return -1;
    }
}
