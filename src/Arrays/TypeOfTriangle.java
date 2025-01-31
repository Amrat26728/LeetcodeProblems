package Arrays;

// problem
// https://leetcode.com/problems/type-of-triangle/

public class TypeOfTriangle {
    public static void main(String[] args) {
        int[] sides = {2,5,3};
        System.out.println(triangleType(sides));
    }

    public static String triangleType(int[] nums){
        if (nums[0] == nums[1] && nums[1] == nums[2]){
            return "equilateral";
        }
        int sum1 = nums[0] + nums[1];
        int sum2 = nums[0] + nums[2];
        int sum3 = nums[1] + nums[2];
        if (sum1 > nums[2] && sum2 > nums[1] && sum3 > nums[0]){
            if (nums[0] == nums[1] || nums[0] == nums[2] || nums[1] == nums[2]){
                return "isosceles";
            }
            return "scalene";
        }
        return "none";
    }
}
