package Mixed;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(findAllDuplicates(arr));
    }
    static List<Integer> findAllDuplicates(int[] nums){
        int i = 0;
        while(i <= nums.length - 1){
            if(nums[i] == nums[nums[i] - 1] || nums[i] - 1 == i){
                i++;
            }else {
                int currentNum = nums[i];
                int temp = nums[i];
                nums[i] = nums[currentNum - 1];
                nums[currentNum - 1] = temp;
            }
        }

        List<Integer> duplicateNums = new ArrayList<>();

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] - 1 != j){
                duplicateNums.add(nums[j]);
            }
        }

        return duplicateNums;
    }
}
