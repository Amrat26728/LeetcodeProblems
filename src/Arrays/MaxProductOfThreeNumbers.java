package Arrays;

public class MaxProductOfThreeNumbers {
    public static void main(String[] args) {
        int[] nums = {1,2,8,4,4,6,5};
        System.out.println(maxProduct(nums));
    }

    private static int maxProduct(int[] nums){
        int maxProd = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int prod = nums[i] * nums[j] * nums[k];
                    if (prod > maxProd){
                        maxProd = prod;
                    }
                }
            }
        }
        return maxProd;
    }
}
