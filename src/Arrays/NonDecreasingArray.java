package Arrays;

// problem
// https://leetcode.com/problems/non-decreasing-array/

public class NonDecreasingArray {
    public static void main(String[] args) {
        int[] arr = {5,7,1,8};
        System.out.println(checkPossibility(arr));
    }

    public static boolean checkPossibility(int[] nums){
        int count = 0;
        //We can edit atmost 1 value, so break the loop if the count exceeds 1.
        for(int i = 1; i < nums.length && count<=1 ; i++){
            //Checking prev value with curr value
            if(nums[i-1] > nums[i]){
                count++;
                //checking the second prev value from curr value.
                if(i-2<0 || nums[i-2] <= nums[i])
                    nums[i-1] = nums[i];    //If prev value is > current val, change the prev value.
                else
                    nums[i] = nums[i-1];    //If last 2 values both are > current, change the current value.
            }
        }
        return count<=1;
    }
}
