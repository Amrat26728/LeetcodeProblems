package Mixed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIndicesAfterSortingArray {
    public static void main(String[] args) {
        int[] arr = {5};
        System.out.println(targetIndices(arr, 3));
    }

    static List<Integer> targetIndices(int[] nums, int target){
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        for (int k = 0; k < nums.length; k++){
            if(nums[k] == target){
                list.add(k);
            }
        }
        return list;
    }
}
