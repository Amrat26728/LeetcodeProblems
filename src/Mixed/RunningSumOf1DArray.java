package Mixed;

import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1};
        System.out.println(Arrays.toString(runningSum(arr)));
    }

    static int[] runningSum(int[] nums){
        int sum = 0;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            arr[i] = sum;
        }
        return arr;
    }
}
