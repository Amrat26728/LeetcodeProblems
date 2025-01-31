package Arrays;

// problem
// https://leetcode.com/problems/summary-ranges/

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] arr = {0,1,2};
        System.out.println(summaryRanges(arr));
    }

    public static List<String> summaryRanges(int[] nums){
        if (nums.length == 0){
            return new ArrayList<>();
        }
        int start = nums[0];
        List<String> ans = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]-1 != nums[i-1]){
                if (start == nums[i-1]){
                    ans.add(Integer.toString(start));
                }else{
                    String range = Integer.toString(start).concat("->").concat(Integer.toString(nums[i-1]));
                    ans.add(range);
                }
                start = nums[i];
            }
        }
        if (start == nums[nums.length-1]){
            ans.add(Integer.toString(start));
            return ans;
        }
        ans.add(Integer.toString(start).concat("->").concat(Integer.toString(nums[nums.length-1])));
        return ans;
    }
}
