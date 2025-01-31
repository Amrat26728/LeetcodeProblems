package Arrays;

import java.util.PriorityQueue;

// problem
// https://leetcode.com/problems/maximum-product-after-k-increments/

public class MaximumProductAfterKIncrements {
    public static void main(String[] args) {
        int[] arr = {24,5,64,53,26,38};
        int k = 54;
        System.out.println(maximumProduct(arr, k));
    }

    public static int maximumProduct(int[] nums, int k){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(int num: nums){
            priorityQueue.add(num);
        }
        for (int i = 0; i < k; i++) {
            priorityQueue.add(priorityQueue.remove()+1);
        }
        long prod = 1;
        int mod = 1000000007;
        while (!priorityQueue.isEmpty()){
            prod *= priorityQueue.remove();
            if (prod == 0){
                return 0;
            }
            prod %= mod;
        }
        return (int) prod;
    }
}
