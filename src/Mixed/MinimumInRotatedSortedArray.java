package Mixed;

public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(minimumINRotatedArray(arr));
    }

    static int minimumINRotatedArray(int[] nums){
        int pivot = findPivot(nums);
        if(pivot == -1){
            return nums[0];
        }
        return nums[pivot + 1];
    }

    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }else if(mid > start && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }else if(nums[mid] > nums[start]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
