package Arrays;

// problem
// https://leetcode.com/problems/check-if-grid-satisfies-conditions/

public class CheckIfGridSatisfiesConditions {
    public static void main(String[] args) {
        int[][] grid = {
                {1},
                {2},
                {3}
        };
        System.out.println(satisfiesConditions(grid));
    }

    public static boolean satisfiesConditions(int[][] grid){
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i < rows - 1 && grid[i+1][j] != grid[i][j]){
                    return false;
                }
                if (j < cols - 1 && grid[i][j+1] == grid[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
