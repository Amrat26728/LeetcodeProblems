package Arrays;

import java.util.ArrayList;
import java.util.List;

// problem
// https://leetcode.com/problems/lucky-numbers-in-a-matrix/

public class LuckyNumberInMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {7,8},
                {1,2}
        };

        System.out.println(luckyNumber(mat));
    }

    /////////////////// solution ///////////////
    private static List<Integer> luckyNumber(int[][] matrix){
        List<Integer> rowMin = new ArrayList<>();
        List<Integer> colMax = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            int min = matrix[row][0];
            for (int col = 1; col < matrix[row].length; col++) {
                if (matrix[row][col] < min){
                    min = matrix[row][col];
                }
            }
            rowMin.add(min);
        }

        for (int col = 0; col < matrix[0].length; col++) {
            int max = matrix[0][col];
            for (int row = 1; row < matrix.length; row++){
                if (matrix[row][col] > max){
                    max = matrix[row][col];
                }
            }
            colMax.add(max);
        }

        for (int ele : rowMin) {
            if (colMax.contains(ele)) {
                ans.add(ele);
            }
        }
        return ans;
    }
}
