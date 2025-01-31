package Mixed;

import java.util.Arrays;

// solved
public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] arr = {0};
        System.out.println(Arrays.toString(buildArrayFromPermutation(arr)));
    }

    static int[] buildArrayFromPermutation(int[] nums){
        int length = nums.length;
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}
