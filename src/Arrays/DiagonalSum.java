package Arrays;

// problem
// https://leetcode.com/problems/matrix-diagonal-sum/

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,1},
                {1,1,1},
                {1,1,1}
        };
        System.out.println(diagonalSum(arr));
    }

    ///////// solution /////////////
    private static int diagonalSum(int[][] mat){
        // sum of leading diagonal
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
        }

        // sum of general diagonal
        int rowIndex = 0;
        int colIndex = mat.length - 1;
        for (int j = 0; j < mat.length; j++) {
            if (rowIndex == colIndex){
                rowIndex++;
                colIndex--;
                continue;
            }
            sum += mat[rowIndex][colIndex];
            rowIndex++;
            colIndex--;
        }
        return sum;
    }
}
