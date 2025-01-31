package Mixed;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {4,0,0,0,0,0};
        int[] arr2 = {1,2,3,5,6};
        int m = 1;
        int n = 5;
        merge(arr1, m, arr2, n);
        System.out.println(Arrays.toString(arr1));
    }

    static void merge(int[] nums1, int m, int[] nums2, int n){
        int i = m - 1;
        int j = n - 1;
        int k = m + n -1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }

        while(j >= 0) {
            nums1[k] = nums2[j];
            k--;
            j--;
        }
    }
}
