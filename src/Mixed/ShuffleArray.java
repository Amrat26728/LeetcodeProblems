package Mixed;

import java.util.Arrays;

public class ShuffleArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1};
        int n = 4;
        System.out.println(Arrays.toString(shuffle(arr, n)));
    }


    static int[] shuffle(int[] nums, int n){
        int[] arr = new int[2*n];
        int pointer1 = 0;
        int pointer2 = n;
        int newArrayPointer = 0;
        while(pointer1 < n){
            arr[newArrayPointer] = nums[pointer1];
            arr[newArrayPointer + 1] = nums[pointer2];
            pointer1++;
            pointer2++;
            newArrayPointer += 2;
        }
        return arr;
    }
}
