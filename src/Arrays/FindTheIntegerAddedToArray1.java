package Arrays;

// problem
// https://leetcode.com/problems/find-the-integer-added-to-array-i/

public class FindTheIntegerAddedToArray1 {
    public static void main(String[] args) {
        int[] nums1 = {0, 0 ,0};
        int[] nums2 = {0 , 0, 0};
        System.out.println(addedInteger(nums1, nums2));
    }

    public static int addedInteger(int[] nums1, int[] nums2){
        int sum1 = 0;
        int sum2 = 0;
        for(int num: nums1){
            sum1 += num;
        }
        for(int num: nums2){
            sum2 += num;
        }
        int diff = sum2 - sum1;
        return diff / nums1.length;
    }
}
