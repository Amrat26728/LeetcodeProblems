package Arrays;

import java.util.ArrayList;
import java.util.List;

// problem
// https://leetcode.com/problems/unique-number-of-occurrences/

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurrences(arr));
    }

    ////////// solution ///////////////
    private static boolean uniqueOccurrences(int[] arr){
        List<Integer> countList = new ArrayList<>();
        List<Integer> eleList = new ArrayList<>();
        for (int ele: arr){
            int count = 0;
            if (eleList.contains(ele)){
                continue;
            }else{
                eleList.add(ele);
            }
            for(int ele2: arr){
                if (ele == ele2){
                    count++;
                }
            }

            if (countList.contains(count)){
                return false;
            }else{
                countList.add(count);
            }
        }
        return true;
    }
}
