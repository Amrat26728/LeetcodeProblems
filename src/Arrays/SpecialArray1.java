package Arrays;

// problem
// https://leetcode.com/problems/special-array-i/

public class SpecialArray1 {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(isSpecialArray(arr));
    }

    public static boolean isSpecialArray(int[] nums){
        if (nums.length == 1){
            return true;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] + nums[i+1]) % 2 == 0){
                return false;
            }
        }
        return true;
    }
}
