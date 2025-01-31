package Arrays;

// problem
// https://leetcode.com/problems/n-repeated-element-in-size-2n-array/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NRepeatedElementInSize2NArray {
    public static void main(String[] args) {
        int[] arr = {2,1,2,5,3,2};
        System.out.println(repeatedNTimes(arr));
    }

    public static int repeatedNTimes(int[] nums){
        Map<Integer, Integer> counter = new HashMap<>();
        for(int num: nums){
            if (counter.containsKey(num)){
                counter.replace(num, counter.get(num) + 1);
            }else{
                counter.put(num, 1);
            }
        }
        int n = nums.length / 2;
        List<Integer> keys = new ArrayList<>(counter.keySet());
        for (Integer key : keys) {
            int count = counter.get(key);
            if (count == n){
                return key;
            }
        }
        return -1;
    }
}
