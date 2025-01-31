package Matrix;

import java.util.ArrayList;
import java.util.List;

// problem
// https://leetcode.com/problems/set-matrix-zeroes/

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        setZeroes(matrix);
    }

    /////////////////// solution ////////////
    public static void setZeroes(int[][] matrix){
        List<Integer> rows = new ArrayList<>();
        List<Integer> cols = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0){
                    if (!rows.contains(i)){
                        rows.add(i);
                    }
                    if (!cols.contains(j)){
                        cols.add(j);
                    }
                }
            }
        }
        for (int i = 0; i < rows.size(); i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[rows.get(i)][j] = 0;
            }
        }

        for (int i = 0; i < cols.size(); i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][cols.get(i)] = 0;
            }
        }
    }
}
