package Math;

public class DiffBwEleSumAndDigitsSumOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 11};

        System.out.println(diffOfSum(arr));
    }

    static int diffOfSum(int[] nums){
        int eleSum = 0;
        int digitSum = 0;

        for (int i = 0; i < nums.length; i++){
            int ele = nums[i];
            eleSum += ele;
            while(ele > 0){
                int digit = ele % 10;
                digitSum += digit;
                ele /= 10;
            }
        }
        int diff = eleSum - digitSum;
        if(diff < 0){
            diff *= -1;
        }
        return diff;
    }
}
