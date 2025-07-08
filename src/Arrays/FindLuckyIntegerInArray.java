package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


// problem
// https://leetcode.com/problems/find-lucky-integer-in-an-array/description/

public class FindLuckyIntegerInArray {
    public static void main(String[] args) {
        int[] arr = {2,2,3,3,3,4,5,5,5,5};
        System.out.println(findLucky(arr));
    }

    public static int findLucky(int[] arr){
        Map<Integer, Integer> freq = new HashMap<>();

        for (int j : arr) {
            Integer occ = freq.get(j);
            if (occ != null) {
                occ += 1;
                freq.put(j, occ);
            } else {
                freq.put(j, 1);
            }
        }
        int ans = -1;
        Set<Integer> keys = freq.keySet();
        for(Integer key: keys){
            int occ = freq.get(key);
            if (occ == key && key > ans){
                ans = key;
            }
        }
        return ans;
    }
}
