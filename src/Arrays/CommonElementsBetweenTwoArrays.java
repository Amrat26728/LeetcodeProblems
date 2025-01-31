package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// problem
// https://leetcode.com/problems/find-common-elements-between-two-arrays/

public class CommonElementsBetweenTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {3,4,2,3};
        int[] arr2 = {1,5};

        System.out.println(Arrays.toString(commonElements(arr1, arr2)));
    }


    ////////// solution ////////////////////
    private static int[] commonElements(int[] nums1, int[] nums2){
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int nums1Counter = 0;
        int nums2Counter = 0;

        for (int ele : nums2) {
            list2.add(ele);
        }
        for (int ele : nums1) {
            list1.add(ele);
        }

        for (int ele: nums1){
            if (list2.contains(ele)){
                nums1Counter++;
            }
        }

        for (int ele: nums2){
            if (list1.contains(ele)){
                nums2Counter++;
            }
        }

        return new int[] {nums1Counter, nums2Counter};
    }
}
