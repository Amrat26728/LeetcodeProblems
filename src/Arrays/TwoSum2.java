package Arrays;

// problem
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr = {-1,0};
        System.out.println(Arrays.toString(twoSum(arr, -1)));
    }

    /////////////// solution /////////////
    public static int[] twoSum(int[] nums, int target){
        int firstIndex = 0;
        int secondIndex = nums.length - 1;
        while (firstIndex < secondIndex){
            if (nums[firstIndex] + nums[secondIndex] == target){
                return new int[] {firstIndex + 1, secondIndex + 1};
            }
            if (nums[firstIndex] + nums[secondIndex] < target){
                firstIndex++;
            }else{
                secondIndex--;
            }
        }
        return new int[] {-1, -1};
    }
}
