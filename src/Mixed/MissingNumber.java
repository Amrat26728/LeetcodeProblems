package Mixed;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,1};
//        System.out.println(findMissingNumber(arr));
        System.out.println(sumMethod(arr));
    }

    static int sumMethod(int[] nums){
        int sum = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int temp = i - nums[i];
            sum += temp;
        }
        return sum;
    }

    static int findMissingNumber(int[] nums){
        int start = 0;
        int length = nums.length;
        int end = length - 1;
        // assume the n number is missing
        int ans = length;
        while(start <= end){

            // check current number = n then assign index to ans
            if(nums[start] == length){
                ans = start;
                start++;
            }

            // increment the pointer if the current number is at its position
            else if(nums[start] == start){
                start++;
            }

            // swap the current number with its correct position number
            else{
                int temp = nums[start];
                nums[start] = nums[temp];
                nums[temp] = temp;
            }
        }
        return ans;
    }
}
