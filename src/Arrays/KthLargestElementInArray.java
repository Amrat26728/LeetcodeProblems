package Arrays;

// problem
// https://leetcode.com/problems/kth-largest-element-in-an-array/

import java.util.PriorityQueue;

public class KthLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(findKthLargest(arr, k));
    }

    public static int findKthLargest(int[] nums, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        for(int num: nums){
            if (pq.size() == k){
                if (pq.peek() < num){
                    pq.poll();
                    pq.add(num);
                }
            }else{
                pq.add(num);
            }
        }
        return pq.poll();
    }
}
