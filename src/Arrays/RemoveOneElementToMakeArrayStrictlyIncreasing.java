package Arrays;

// problem
// https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing/

public class RemoveOneElementToMakeArrayStrictlyIncreasing {
    public static void main(String[] args) {
        int[] arr = {3,2};
        System.out.println(canBeIncreasing(arr));
    }

    //////////// solution ////////////
    public static boolean canBeIncreasing(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            boolean isSorting = true;
            for (int j = 0; j < nums.length - 1; j++) {
                int k = j + 1;
                if (k == i){
                    if (k < nums.length - 1 && nums[k+1] <= nums[j]){
                        isSorting = false;
                        break;
                    }
                }else{
                    if (i != j && nums[j+1] <= nums[j]){
                        isSorting = false;
                        break;
                    }
                }
            }
            if (isSorting){
                return true;
            }
        }
        return false;
    }
}
