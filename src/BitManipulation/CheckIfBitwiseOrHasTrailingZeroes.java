package BitManipulation;

public class CheckIfBitwiseOrHasTrailingZeroes {
    public static void main(String[] args) {

        int[] arr = {1,3,5,7,9};
//        System.out.println(check(arr));
        System.out.println(hasTrailingZeroes(arr));
    }

    static boolean hasTrailingZeroes(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            for (int j = i + 1; j < nums.length; j++) {
                if (((nums[i] | nums[j]) & 1) == 0){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean check(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                count++;
            }
            if(count >= 2){
                return true;
            }
        }
        return false;
    }
}
