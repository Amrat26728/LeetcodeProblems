package Arrays;

// problem
// https://leetcode.com/problems/remove-element/

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,3,2,2};
        int val = 2;
        System.out.println(removeElement(arr, val));
    }

    public static int removeElement(int[] nums, int val){
        if(nums.length == 0){
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            if (nums[left] == val && nums[right] != val){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
            else if(nums[left] != val){
                left++;
            }
            else if(nums[right] == val){
                right--;
            }
        }
        int count = 0;
        for(int num: nums){
            if (num != val){
                count++;
            }
        }
        return count;
    }
}
