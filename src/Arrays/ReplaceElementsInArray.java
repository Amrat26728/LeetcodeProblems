package Arrays;

// problem
// https://leetcode.com/problems/replace-elements-in-an-array/

import java.util.Arrays;
import java.util.HashMap;

public class ReplaceElementsInArray {

    public static void main(String[] args) {
        int[] arr = {1,2};
        int[][] operations = {
                {1,3},
                {2,1},
                {3,2}
        };
        System.out.println(Arrays.toString(replace(arr, operations)));
    }

    /////////////////// solution ///////////////////
    public static int[] replace(int[] nums, int[][] operations){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int[] operation : operations) {
            nums[map.get(operation[0])] = operation[1];
            int index = map.get(operation[0]);
            map.remove(operation[0]);
            map.put(operation[1], index);
        }
        return nums;
    }

}
