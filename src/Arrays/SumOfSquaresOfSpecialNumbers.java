package Arrays;

// problem
// https://leetcode.com/problems/sum-of-squares-of-special-elements/

public class SumOfSquaresOfSpecialNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(sumOFSquares(arr));
    }


    ////////// solution //////////////
    private static int sumOFSquares(int[] nums){
        int sum = 0;
        int n = nums.length;
        for (int i = 1; i <= nums.length; i++) {
            if (n % i == 0){
                int square = nums[i-1] * nums[i-1];
                sum += square;
            }
        }
        return sum;
    }
}
