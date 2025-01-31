package Arrays;

// problem
// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/

public class MaximumProductOfTwoElementsInArray {
    public static void main(String[] args) {
        int[] arr = {1,3};
        System.out.println(maxProduct(arr));
    }

    public static int maxProduct(int[] nums){
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num: nums){
            if (num >= firstMax){
                secondMax = firstMax;
                firstMax = num;
            }else if(num > secondMax){
                secondMax = num;
            }
        }
        return (firstMax - 1) * (secondMax - 1);
    }
}
