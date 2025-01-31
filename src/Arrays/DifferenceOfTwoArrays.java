package Arrays;

import java.util.ArrayList;
import java.util.List;

// problem
// https://leetcode.com/problems/find-the-difference-of-two-arrays/

public class DifferenceOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {2,4,6};
        System.out.println(findDifference(arr1, arr2));
    }

    /////////// solution //////////////////
    private static List<List<Integer>> findDifference(int[] nums1, int[] nums2){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> uniqueNums1 = new ArrayList<>();
        List<Integer> uniqueNums2 = new ArrayList<>();
        for (int j : nums1) {
            if (uniqueNums1.contains(j)){
                continue;
            }
            boolean nums1InNums2 = true;
            for (int k : nums2) {
                if (j == k) {
                    nums1InNums2 = false;
                    break;
                }
            }
            if (nums1InNums2) {
                uniqueNums1.add(j);
            }
        }

        for (int j : nums2) {
            if (uniqueNums2.contains(j)){
                continue;
            }
            boolean nums2InNums1 = true;
            for (int k : nums1) {
                if (j == k) {
                    nums2InNums1 = false;
                    break;
                }
            }
            if (nums2InNums1) {
                uniqueNums2.add(j);
            }
        }
        ans.add(uniqueNums1);
        ans.add(uniqueNums2);
        return ans;
    }
}
