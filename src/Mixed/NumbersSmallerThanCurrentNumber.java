package Mixed;

import java.util.Arrays;

public class NumbersSmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[] arr = {1,0,2};
        System.out.println(Arrays.toString(numbersSmallerThanCurrentNumber(arr)));
    }

    static int[] numbersSmallerThanCurrentNumber(int[] nums){
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int val2: nums) {
                if(val2 < nums[i]){
                    count++;
                }
            }
            arr[i] = count;
        }

        return arr;
    }
}
