package Mixed;

public class GreatestCommonDivisorOfArray {
    public static void main(String[] args) {
        int[] nums = {10,10,5};

        System.out.println(findGCd(nums));
    }

    // problem
    // https://leetcode.com/problems/find-greatest-common-divisor-of-array/

    ///////////////// solution ///////////////
    static int findGCd(int[] nums){
        int min = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
            if(nums[i] > max){
                max = nums[i];
            }
        }

        int gcd = 1;
        for(int j = 1; j <= min; j++){
            if (min % j == 0 && max % j == 0){
                gcd = j;
            }
        }
        return gcd;
    }
}
