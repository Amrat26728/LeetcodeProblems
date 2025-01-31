package Mixed;

import java.util.Arrays;

// solved
public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void moveZeroes(int[] nums){
        int j = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (j >= nums.length){
                return;
            }
            if (nums[i] == 0){
                while(nums[j] == 0 && j < nums.length - 1){
                    j++;
                }
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }else {
                j++;
            }
        }
    }
}
