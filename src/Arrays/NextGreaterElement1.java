package Arrays;

// problem
// https://leetcode.com/problems/next-greater-element-i/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement1 {

    public static void main(String[] args) {
        int[] nums1 = {1,0,3,9,8,7};
        int[] nums2 = {1,7,5,3,1,5,11,6,9};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> indices = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            indices.put(nums1[i], i);
        }
        for (int i = nums2.length-1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() < nums2[i]){
                stack.pop();
            }
            Integer index = indices.get(nums2[i]);
            if (stack.isEmpty() && index != null){
                 ans[index] = -1;
            }
            else {
                if (index != null){
                    ans[index] = stack.peek();
                }
            }
            stack.push(nums2[i]);
        }
        return ans;
    }

}
