package Mixed;

import java.util.ArrayList;
import java.util.List;

public class AllNumsDisappearedInArray {
    public static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println(findDisappearedNums(arr));
    }

    static List<Integer> findDisappearedNums(int[] nums){
        int i = 0;
        while(i <= nums.length - 1){
            if(nums[i] == nums[nums[i] - 1] || i == nums[i] - 1){
                i++;
            }else{
                int currentNum = nums[i];
                int temp = nums[i];
                nums[i] = nums[currentNum - 1];
                nums[currentNum - 1] = temp;
            }
        }

        List<Integer> disappearedNums = new ArrayList<>();
        for (int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1){
                disappearedNums.add(j + 1);
            }
        }
        return disappearedNums;
    }
}
