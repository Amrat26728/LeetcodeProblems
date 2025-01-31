package Arrays;


// Hard question with O(log (m+n))
// this solution is with O(m+n)

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {0,0,0,1};
        int[] nums2 = {1,2,3};
        System.out.println(findMedianSortedArrays(nums1, nums2));

    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if(nums1.length == 0 && nums2.length == 0){
            return 0;
        }

        int[] arr = new int[nums1.length + nums2.length];

        int index1 = 0;
        int index2 = 0;
        int index = 0;
        double median = 0;
        while(index1 < nums1.length && index2 < nums2.length){
            if(nums1[index1] < nums2[index2]){
                arr[index] = nums1[index1];
                index1++;
            }else{
                arr[index] = nums2[index2];
                index2++;
            }
            index++;
        }

        while(index1 < nums1.length){
            arr[index] = nums1[index1];
            index++;
            index1++;
        }

        while(index2 < nums2.length){
            arr[index] = nums2[index2];
            index++;
            index2++;
        }

        for (int j : arr) {
            System.out.print(j + ",");
        }
        System.out.println();

        if(arr.length % 2 == 0){
            int mid = (arr.length - 1) / 2;
            median = (double) (arr[mid] + arr[mid+1]) / 2;
        }else{
            int mid = (arr.length - 1) / 2;
            median = arr[mid];
        }
        return median;
    }
}
