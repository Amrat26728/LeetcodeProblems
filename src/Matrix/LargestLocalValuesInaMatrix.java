package Matrix;

// problem
// https://leetcode.com/problems/largest-local-values-in-a-matrix/

public class LargestLocalValuesInaMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,2,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1}
        };
        int[][] ans = largestLocal(mat);
        for (int[] an : ans) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(an[j] + ",");
            }
            System.out.println();
        }
    }

    public static int[][] largestLocal(int[][] grid){
        int rows = grid.length-2;
        int cols = grid[0].length-2;
        int[][] ans = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                generateMatrix(grid, ans, i, j);
            }
        }
        return ans;
    }
    private static void generateMatrix(int[][] grid, int[][] ans, int i, int j){
        int max = grid[i][j];
        for (int k = i; k < 3 + i; k++) {
            for (int l = j; l < 3 + j; l++) {
                if (max < grid[k][l]){
                    max = grid[k][l];
                }
            }
        }
        ans[i][j] = max;
    }
}
