package Matrix;

// problem
// https://leetcode.com/problems/modify-the-matrix/

public class ModifyMatrix {
    public static void main(String[] args) {

    }

    /////// solution ////////////
//    public int[][] modifiedMatrix(int[][] matrix) {
//        Queue<Integer> queue = new LinkedList<>();
//        for(int col = 0; col < matrix[0].length; col++){
//            int max = matrix[0][col];
//            for(int row = 1; row < matrix.length; row++){
//                if(matrix[row][col] > max){
//                    max = matrix[row][col];
//                }
//            }
//            queue.add(max);
//        }
//
//        for(int col = 0; col < matrix[0].length; col++){
//            int max = queue.remove();
//            for(int row = 0; row < matrix.length; row++){
//                if(matrix[row][col] == -1){
//                    matrix[row][col] = max;
//                }
//            }
//        }
//        return matrix;
//    }
}
