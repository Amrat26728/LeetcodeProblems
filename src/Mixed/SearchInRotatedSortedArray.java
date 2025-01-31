package Mixed;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};
        int target = 9;
        System.out.println(searchInRotatedArray(arr, target));
    }

    static int searchInRotatedArray(int[] nums, int target){
        int pivot = findPivot(nums);
        if(pivot == -1){
            return  binarySearch(nums, target);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if(target > nums[0]){
            return leftAndRightSearch(nums, target, 0, pivot - 1);
        }
        return leftAndRightSearch(nums, target, pivot + 1, nums.length - 1);
    }

    // if array is not rotated then just do binary search
    static int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    // find pivot number
    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }if (mid > start && nums[mid] < nums[mid - 1]){
                return mid-1;
            }
            else if(nums[mid] < nums[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    // search on left and right side of pivot number
    static int leftAndRightSearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
