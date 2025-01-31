package Matrix;

import java.util.Arrays;

// problem
// https://leetcode.com/problems/row-with-maximum-ones/

public class RowWithMaxOnes {
    public static void main(String[] args) {
        int[][] arr = {
                {1,0},
                {0,1},
                {0,1}
        };
        System.out.println(Arrays.toString(rowAndMaxOne(arr)));
    }

    //////// solution /////////////
    private static int[] rowAndMaxOne(int[][] mat){
        int count = 0;
        for (int ele: mat[0]){
            if (ele == 1){
                count++;
            }
        }
        int[] maxOne = {0, count};
        for (int i = 0; i < mat.length; i++) {
            int newCount = 0;
            for (int col : mat[i]) {
                if (col == 1) {
                    newCount++;
                }
            }
            if (newCount > count) {
                maxOne[0] = i;
                maxOne[1] = newCount;
                count = newCount;
            }
        }
        return maxOne;
    }
}
