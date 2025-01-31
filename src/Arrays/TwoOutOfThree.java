package Arrays;

// problem
// https://leetcode.com/problems/two-out-of-three/

import java.util.ArrayList;
import java.util.List;

public class TwoOutOfThree {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2};
        int[] arr2 = {4,3,3};
        int[] arr3 = {5};
        System.out.println(twoOutOfThree(arr1, arr2, arr3));
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3){
        List<Integer> list1 = createList(nums1);
        List<Integer> list2 = createList(nums2);
        List<Integer> list3 = createList(nums3);
        List<Integer> ans = new ArrayList<>();
        addCommon(nums1, list2, list3, ans);
        addCommon(nums2, list1, list3, ans);
        addCommon(nums3, list1, list2, ans);
        return ans;
    }
    private static List<Integer> createList(int[] nums){
        List<Integer> list = new ArrayList<>();
        for(int num: nums){
            if (!list.contains(num)){
                list.add(num);
            }
        }
        return list;
    }
    private static void addCommon(int[] nums, List<Integer> list1, List<Integer> list2, List<Integer> ans){
        for (int num: nums){
            if (list1.contains(num) || list2.contains(num)){
                if (!ans.contains(num)){
                    ans.add(num);
                }
            }
        }
    }
}
