package BitManipulation;

// problem
// https://leetcode.com/problems/find-the-xor-of-numbers-which-appear-twice/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindXORofNumbersWhichAppearsTwice {
    public static void main(String[] args) {
        int[] arr = {5,5,3};
        System.out.println(duplicateNumbersXOR(arr));
    }

    public static int duplicateNumbersXOR(int[] nums){
        Map<Integer, Integer> freq = new HashMap<>();
        int ans = 0;
        for(int num: nums){
            if (freq.containsKey(num)){
                freq.replace(num, freq.get(num) + 1);
            }else{
                freq.put(num, 1);
            }
        }
        List<Integer> keys = new ArrayList<>(freq.keySet());
        for(int key: keys){
            int occurrence = freq.get(key);
            if (occurrence == 2){
                ans ^= key;
            }
        }
        return ans;
    }
}
