package Arrays;

// problem
// https://leetcode.com/problems/rearrange-array-elements-by-sign/

import java.util.Arrays;

public class RearrangeArrayElementsBySign {

    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }

    //////////////////// solution ///////////////

    public static int[] rearrangeArray(int[] nums){
        int[] neg = new int[nums.length / 2];
        int[] pos = new int[nums.length / 2];
        int negIndex = 0;
        int posIndex = 0;
        for (int ele: nums){
            if (ele < 0){
                neg[negIndex] = ele;
                negIndex++;
            }else{
                pos[posIndex] = ele;
                posIndex++;
            }
        }
        negIndex = 0;
        posIndex = 0;
        boolean isPos = true;
        for (int i = 0; i < nums.length; i++) {
            if (isPos){
                nums[i] = pos[posIndex];
                posIndex++;
            }else{
                nums[i] = neg[negIndex];
                negIndex++;
            }
            isPos = !isPos;
        }
        return nums;
    }

}
