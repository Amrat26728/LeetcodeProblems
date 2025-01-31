package Math;

import java.util.Arrays;

public class DistributeCandiesToPeople {
    public static void main(String[] args) {
        int candies = 7;
        int peoples = 4;
        System.out.println(Arrays.toString(distributeCandies(candies, peoples)));
    }

    public static int[] distributeCandies(int candies, int peoples){
        int[] ans = new int[peoples];
        int ind = 0;
        int length = ans.length;
        while(ind < length && candies > 0){
            int can = ind + 1;
            if (can < candies){
                ans[ind] = ind + 1;
                candies = candies - (ind + 1);
            }else{
                ans[ind] = candies;
                candies = 0;
            }
            ind++;
        }


        
        return ans;
    }
}
