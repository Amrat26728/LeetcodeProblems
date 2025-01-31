package Arrays;

// problem
// https://leetcode.com/problems/number-of-arithmetic-triplets/

public class NumberOfArithmeticTriplets {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9};
        System.out.println(arithmeticTriplets(arr, 2));
    }

    //////// solution /////////////
    private static int arithmeticTriplets(int[] nums, int diff){
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if (i < j && j < k && nums[j] - nums[i] == diff && nums[k] - nums[j] == diff){
                        count++;
                        System.out.println("[" + i + "," + j + "," + k + "]");
                    }
                }
            }
        }
        return count;
    }
}
