package Arrays;

// problem
// https://leetcode.com/problems/maximum-number-of-operations-with-the-same-score-i/

public class MaximumNoOfOperationsWithSameScore1 {
    public static void main(String[] args) {
        int[] arr = {3,2,6,1,4};
        System.out.println(maxOperations(arr));
    }

    public static int maxOperations(int[] nums){
        int score = nums[0] + nums[1];
        int count = 1;
        int index1 = 2;
        int index2 = 3;
        while (index2 < nums.length){
            if (score != nums[index1]+nums[index2]){
                break;
            }
            count++;
            index1 = index2 + 1;
            index2 = index2 + 2;
        }
        return count;
    }
}
