package Matrix;

// problem
// https://leetcode.com/problems/reshape-the-matrix/
public class ReshapeTheMatrix {

    ////////////////// solution ////////////

    /////////// optimized /////////
//    public int[][] matrixReshape(int[][] nums, int r, int c) {
//        int n = nums.length, m = nums[0].length;
//        if (r*c != n*m) return nums;
//        int[][] res = new int[r][c];
//        for (int i=0;i<r*c;i++)
//            res[i/c][i%c] = nums[i/m][i%m];
//        return res;
//    }

    ////////////// brute force /////////////////
//    public int[][] matrixReshape(int[][] mat, int r, int c) {
//        if(mat.length * mat[0].length != r * c){
//            return mat;
//        }else{
//            int[] temp = new int[mat.length * mat[0].length];
//            int index = 0;
//            for(int i = 0; i < mat.length; i++){
//                for(int j = 0; j < mat[0].length; j++){
//                    temp[index] = mat[i][j];
//                    index++;
//                }
//            }
//
//            int[][] newMat = new int[r][c];
//            int ind = 0;
//            for(int row = 0 ; row < r; row++){
//                for(int col = 0; col < c; col++){
//                    newMat[row][col] = temp[ind];
//                    ind++;
//                }
//            }
//            return newMat;
//        }
//    }
}
