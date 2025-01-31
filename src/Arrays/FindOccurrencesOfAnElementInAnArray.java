package Arrays;

// problem
// https://leetcode.com/problems/find-occurrences-of-an-element-in-an-array/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindOccurrencesOfAnElementInAnArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int[] queries = {10};
        int x = 5;
        System.out.println(Arrays.toString(occurrencesOfElement(nums, queries, x)));
    }
    public static int[] occurrencesOfElement(int[] nums, int[] queries, int x){
        int[] ans = new int[queries.length];
        List<Integer> occurrences = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == x){
                occurrences.add(i);
            }
        }
        for (int i = 0; i < queries.length; i++) {
            if (occurrences.size() < queries[i]){
                ans[i] = -1;
            }else{
                ans[i] = occurrences.get(queries[i]-1);
            }
        }
        return ans;
    }
}
