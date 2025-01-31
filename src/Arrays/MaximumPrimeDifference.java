package Arrays;

// problem
// https://leetcode.com/problems/maximum-prime-difference/

public class MaximumPrimeDifference {
    public static void main(String[] args) {
        int[] nums = {1,3};
        System.out.println(maximumPrimeDifference(nums));
    }

    public static int maximumPrimeDifference(int[] nums){
        int firstPrime = 0;
        int lastPrime = 0;
        boolean isFirstFound = false;
        int index = 0;

        for (int i = index; i < nums.length; i++) {
            boolean isPrime = true;
            if (nums[i] == 1){
                continue;
            }
            else if(nums[i] == 2){
                if (!isFirstFound){
                    firstPrime = i;
                    isFirstFound = true;
                }
                lastPrime = i;
            }
            else{
                int sqrt = (int) Math.sqrt(nums[i]);
                for (int j = 2; j <= sqrt; j++) {
                    if (nums[i] % j == 0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime){
                if (!isFirstFound){
                    firstPrime = i;
                    isFirstFound = true;
                }
                lastPrime = i;
            }
        }
        int distance = lastPrime - firstPrime;
        if (distance < 0){
            distance *= -1;
        }
        return distance;
    }
}
