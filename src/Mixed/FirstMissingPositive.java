package Mixed;

// solved
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {3};
        System.out.println(firstMissingPositive(arr));
    }

    static int firstMissingPositive(int[] nums){
        int i = 0;
        while (i <= nums.length - 1){
            if(nums[i] <= 0 || nums[i] > nums.length || nums[i] == i+1 || nums[i] == nums[nums[i] - 1]){
                i++;
            }else {
                int currentNum = nums[i];
                int temp = nums[i];
                nums[i] = nums[currentNum - 1];
                nums[currentNum - 1] = temp;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j + 1){
                return j + 1;
            }
        }
        return nums.length + 1;
    }
}
