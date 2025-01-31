package Mixed;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestCandies {
    public static void main(String[] args) {
        int[] arr = {4,2,1,1,2};
        int extraCandies = 1;
        System.out.println(kidsWithGreatestCandies(arr, extraCandies));
    }

    static List<Boolean> kidsWithGreatestCandies(int[] candies, int extraCandies){

        List<Boolean> list = new ArrayList<Boolean>();
        for(int val: candies){
            int newCandies = val + extraCandies;
            boolean hasGreatest = true;
            for (int vale2: candies){
                if(newCandies < vale2){
                    hasGreatest = false;
                    break;
                }
            }
            if (hasGreatest){
                list.add(true);
            }else{
                list.add(false);
            }
        }

        return list;
    }
}
