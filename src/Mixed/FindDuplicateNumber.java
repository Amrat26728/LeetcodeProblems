package Mixed;


// not solved yet
public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {2,2};
        System.out.println(findDuplicateNumber(arr));
    }

    static int findDuplicateNumber(int[] nums){
        int i = 0;
        while(i <= nums.length - 1){
            if(nums[i] == nums[nums[i] - 1] && i != nums[i] - 1){
                return nums[i];
            } else if(nums[i] == i + 1){
                i++;
            } else{
                int currentNum = nums[i];
                int temp = nums[i];
                nums[i] = nums[currentNum - 1];
                nums[currentNum - 1] = temp;
            }
        }
        return -1;
    }
}
