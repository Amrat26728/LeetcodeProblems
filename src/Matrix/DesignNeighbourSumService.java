package Matrix;

// problem
// https://leetcode.com/problems/design-neighbor-sum-service/

public class DesignNeighbourSumService {

    private final int[][] mat;
    public DesignNeighbourSumService(int[][] grid){
        mat = grid;
    }

    public int adjacentSum(int value){
        int[] indices = findIndices(value);
        if (indices[0] < 0){
            return 0;
        }
        int sum = 0;
        if (indices[1]-1 >= 0){
            sum += mat[indices[0]][indices[1]-1];
        }
        if (indices[1]+1 < mat.length){
            sum += mat[indices[0]][indices[1]+1];
        }
        if (indices[0]-1 >= 0){
            sum += mat[indices[0]-1][indices[1]];
        }
        if (indices[0]+1 < mat.length){
            sum += mat[indices[0]+1][indices[1]];
        }
        return sum;
    }

    public int diagonalSum(int value){
        int[] indices = findIndices(value);
        if (indices[0] < 0){
            return 0;
        }
        int sum = 0;
        if (indices[0]-1 >= 0 && indices[1]-1 >= 0){
            sum += mat[indices[0]-1][indices[1]-1];
        }
        if (indices[0]-1 >= 0 && indices[1]+1 < mat.length){
            sum += mat[indices[0]-1][indices[1]+1];
        }
        if (indices[0]+1 < mat.length && indices[1]-1 >= 0){
            sum += mat[indices[0]+1][indices[1]-1];
        }
        if (indices[0]+1 < mat.length && indices[1]+1 < mat.length){
            sum += mat[indices[0]+1][indices[1]+1];
        }
        return sum;
    }

    private int[] findIndices(int value){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == value){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {

        int[][] grid = {
                {0,1,2,3},
                {4,5,6,7},
                {8,9,10,11},
                {12,13,14,15}
        };

        DesignNeighbourSumService obj = new DesignNeighbourSumService(grid);

        System.out.println(obj.adjacentSum(15));
        System.out.println(obj.diagonalSum(15));

    }
}
