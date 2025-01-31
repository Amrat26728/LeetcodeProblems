package Matrix;

// problem
// https://leetcode.com/problems/check-if-matrix-is-x-matrix/

public class CheckIfMatrixIsXMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {2,0,0,1},
                {0,3,1,0},
                {0,5,2,0},
                {4,0,0,2}
        };
        System.out.println(checkXMatrix(mat));
    }

    //////////////// solution ////////////////////
    public static boolean checkXMatrix(int[][] grid){
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == j || i == grid.length - 1 - j){
                    if (grid[i][j] == 0){
                        return false;
                    }
                }else{
                    if (grid[i][j] != 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
