package Arrays;

// problem
// https://leetcode.com/problems/keep-multiplying-found-values-by-two/

public class KeepMultiplyingFoundValueByTwo {
    public static void main(String[] args) {
        int[] arr = {8,19,4,2,15,3};
        System.out.println(findFinalValue(arr, 2));
    }

    //////// solution ///////////
    public static int findFinalValue(int[] nums, int original) {
        for (int i = 0; i < nums.length; i++) {
            for (int ele : nums) {
                if (ele == original) {
                    original *= 2;
                    break;
                }
            }
        }
        return original;
    }
}
