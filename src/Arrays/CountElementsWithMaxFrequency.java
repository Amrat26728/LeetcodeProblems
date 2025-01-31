package Arrays;

import java.util.ArrayList;
import java.util.List;

// problem
// https://leetcode.com/problems/count-elements-with-maximum-frequency/

public class CountElementsWithMaxFrequency {
    public static void main(String[] args) {
        int[] arr = {2,2,4,4,5};
        System.out.println(maxFrequencyElements(arr));
    }

    /////////// solution ///////////
    public static int maxFrequencyElements(int[] nums){
        int max = 0;
        int total = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])){
                int count = 1;
                list.add(nums[i]);
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]){
                        count++;
                    }
                }
                if (max < count){
                    max = count;
                    total = count;
                }else if(count == max){
                    total += count;
                }
            }
        }
        return total;
    }
}
