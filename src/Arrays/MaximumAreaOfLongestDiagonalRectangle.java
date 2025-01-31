package Arrays;

// problem
// https://leetcode.com/problems/maximum-area-of-longest-diagonal-rectangle/

public class MaximumAreaOfLongestDiagonalRectangle {
    public static void main(String[] args) {
        int[][] dimensions = {};
        System.out.println();
    }

    public static int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea = dimensions[0][0] * dimensions[0][1];
        double maxSqrt = Math.sqrt(dimensions[0][0] * dimensions[0][0] + dimensions[0][1] * dimensions[0][1]);
        for (int[] dim: dimensions){
            double sqrt = Math.sqrt(dim[0] * dim[0] + dim[1] * dim[1]);
            int area = dim[0] * dim[1];
            if (sqrt > maxSqrt){
                maxArea = area;
                maxSqrt = sqrt;
            }else if(sqrt == maxSqrt && area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }
}
