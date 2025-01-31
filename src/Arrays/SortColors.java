package Arrays;

// problem
// https://leetcode.com/problems/sort-colors/

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] colors = {2,0,2,1,1,0};
        sortColors(colors);
        System.out.println(Arrays.toString(colors));
    }

    public static void sortColors(int[] nums){
        int red = 0;
        int white = 0;
        int blue = 0;
        for (int num: nums){
            if (num == 0){
                red++;
            }else if(num == 1){
                white++;
            }else{
                blue++;
            }
        }
        int ind = 0;
        for (int i = 0; i < red; i++) {
            nums[ind] = 0;
            ind++;
        }
        for (int i = 0; i < white; i++) {
            nums[ind] = 1;
            ind++;
        }
        for (int i = 0; i < blue; i++) {
            nums[ind] = 2;
            ind++;
        }
    }
}
