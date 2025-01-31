package Matrix;

// problem
// https://leetcode.com/problems/convert-1d-array-into-2d-array/

public class Convert1DArrayTo2DArray {
    public static void main(String[] args) {
        int[] arr = {1};
        int row = 1;
        int col = 1;
        int[][] mat = construct2DArray(arr, row, col);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + ",");
            }
            System.out.println();
        }
    }

    /////////// solution /////////////

    public static int[][] construct2DArray(int[] original, int rows, int cols){
        int grid = rows * cols;
        int index = 0;
        if (original.length == grid){
            int[][] mat = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    mat[i][j] = original[index];
                    index++;
                }
            }
            return mat;
        }else{
            return new int[][]{};
        }
    }
}
