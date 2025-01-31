package Arrays;

// problem
// https://leetcode.com/problems/split-the-array/

import java.util.HashMap;
import java.util.Map;

public class SplitTheArray {
    public static void main(String[] args) {
        int[] nums = {6,1,3,1,1,8,9,2};
        System.out.println(isPossibleToSplit(nums));
    }

    public static boolean isPossibleToSplit(int[] nums){
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num: nums){
            Integer count = freq.get(num);
            if (count != null){
                count += 1;
                if (count > 2){
                    return false;
                }
                freq.replace(num, count);
            }else{
                freq.put(num, 1);
            }
        }
        return true;
    }
}
