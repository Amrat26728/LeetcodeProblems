package Matrix;

import java.util.Arrays;

// problem
// https://leetcode.com/problems/find-the-width-of-columns-of-a-grid/

public class WidthOfColumnsInGrid {
    public static void main(String[] args) {
        int[][] grid = {
                {1},
                {22},
                {333}
        };

        System.out.println(Arrays.toString(findColWidth(grid)));
    }


    //////// solution ///////////
    private static int[] findColWidth(int[][] grid){
        int[] maxWidthArray = new int[grid[0].length];
        for (int col = 0; col < grid[0].length; col++) {
            int maxWidth = Integer.toString(grid[0][col]).length();
            for (int row = 1; row < grid.length; row++) {
                int newWidth = Integer.toString(grid[row][col]).length();
                if (newWidth > maxWidth){
                    maxWidth = newWidth;
                }
            }
            maxWidthArray[col] = maxWidth;
        }
        return maxWidthArray;
    }
}
