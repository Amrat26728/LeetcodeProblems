package Arrays;

import java.util.ArrayList;
import java.util.List;

// problem
// https://leetcode.com/problems/last-visited-integers/

public class LastVisitedIntegers {
    public static void main(String[] args) {
        int[] arr = {1,-1,2,-1,-1,-1};
        System.out.println(lastVisitedInteger(arr));
    }

    /////////// solution //////////////
    private static List<Integer> lastVisitedInteger(int[] nums){
        List<Integer> seen = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int k = 0;
        for(int ele: nums){
            if(ele > 0){
                seen.addFirst(ele);
                k = 0;
            }else if(ele == -1){
                k++;
                if(k <= seen.size()){
                    ans.add(seen.get(k-1));
                }else{
                    ans.add(-1);
                }
            }
        }
        return ans;
    }
}
