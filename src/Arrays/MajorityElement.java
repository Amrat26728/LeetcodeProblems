package Arrays;

// problem
// https://leetcode.com/problems/majority-element/

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2};
        System.out.println(majorityElement(arr));
    }

    ////////// solution ////////////////
    private static int majorityElement(int[] nums){
        int length = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    count++;
                }
            }
            if (count > length){
                return nums[i];
            }
        }
        return -1;
    }
}
