package Arrays;

// problem
// https://leetcode.com/problems/intersection-of-two-arrays-ii/

import java.util.*;

public class IntersectionOfTwoArrays2 {
    public static void main(String[] args) {
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(arr1, arr2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2){
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> common = new ArrayList<>();
        for (int num: nums1){
            if (map.containsKey(num)){
                map.replace(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }

        for (int num: nums2){
            Integer count = map.get(num);
            if (count != null && count != 0){
                common.add(num);
                map.replace(num, --count);
            }
        }

        int[] ans = new int[common.size()];
        for (int i = 0; i < common.size(); i++) {
            ans[i] = common.get(i);
        }
        return ans;
    }
}
