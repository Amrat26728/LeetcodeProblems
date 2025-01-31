package Matrix;

// problem
// https://leetcode.com/problems/find-missing-and-repeated-values/
import java.util.*;

public class FindMissingAndRepeatedValues {
    public static void main(String[] args) {
        int[][] mat = {
                {5,9,7},
                {8,9,2},
                {3,4,6}
        };
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(mat)));
    }

    public static int[] findMissingAndRepeatedValues(int[][] grid){
        List<Integer> repeated = new ArrayList<>();
        int[] ans = new int[2];
        int duplicate = -1;
        int sum = 0;
        for (int[] row : grid) {
            for (int j = 0; j < grid[0].length; j++) {
                if (repeated.contains(row[j])){
                    duplicate = row[j];
                    sum -= duplicate;
                }else{
                    repeated.add(row[j]);
                }
                sum += row[j];
            }
        }
        int totalNos = grid.length * grid.length;
        int naturalNosSum = totalNos * (totalNos + 1) / 2;
        int missing = naturalNosSum - sum;
        return new int[] {duplicate, missing};
    }
}
