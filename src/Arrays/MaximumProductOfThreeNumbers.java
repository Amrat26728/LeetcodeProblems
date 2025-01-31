package Arrays;

// problem
// https://leetcode.com/problems/maximum-product-of-three-numbers/

public class MaximumProductOfThreeNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(maximumProduct(arr));
    }

    public static int maximumProduct(int[] nums){
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int num: nums){
            // finding three max elements
            if (num > firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            }else if(num > secondMax){
                thirdMax = secondMax;
                secondMax = num;
            }else if(num > thirdMax){
                thirdMax = num;
            }

            // finding two min elements
            if (num < firstMin){
                secondMin = firstMin;
                firstMin = num;
            }else if(num < secondMin){
                secondMin = num;
            }
        }

        return Math.max(firstMax * secondMax * thirdMax, firstMax * firstMin * secondMin);
    }
}
