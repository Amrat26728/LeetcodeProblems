package Mixed;


public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    static int findMaxConsecutiveOnes(int[] nums){
        int repeat = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                repeat++;
            }else{
                if(max < repeat){
                    max = repeat;
                }
                repeat = 0;
            }
        }
        if(max < repeat){
            max = repeat;
        }
        return max;
    }
}
