package Arrays;

// problem
// https://leetcode.com/problems/contains-duplicate-ii/

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(arr, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get(nums[i]);
            if (index != null && i != index){
                int diff = i - index;
                if (diff < 0) diff *= -1;
                if (diff <= k) return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
