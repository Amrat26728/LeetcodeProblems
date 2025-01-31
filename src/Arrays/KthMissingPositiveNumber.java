package Arrays;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,9,10,11,12,13,15,17};
        int k = 5;
        System.out.println(findKthPositive(arr, k));
    }

    public static int findKthPositive(int[] nums, int k){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (nums[mid] - mid - 1 < k){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        int n = nums[start] - start - 1;
        return nums[start] + k - n;
    }
}
