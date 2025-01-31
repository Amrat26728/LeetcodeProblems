package Arrays;

// problem
// https://leetcode.com/problems/ant-on-the-boundary/

public class AntOnTheBoundary {
    public static void main(String[] args) {
        int[] nums = {3,2,-3,-4};
        System.out.println(returnToBoundaryCount(nums));
    }

    public static int returnToBoundaryCount(int[] nums){
        int sum = nums[0];
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            if (sum == 0){
                count++;
            }
        }
        return count;
    }
}
