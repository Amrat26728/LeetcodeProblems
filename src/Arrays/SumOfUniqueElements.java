package Arrays;

// problem
// https://leetcode.com/problems/sum-of-unique-elements/

public class SumOfUniqueElements {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        System.out.println(uniqueSum(arr));
    }

    ////////////// solution //////////////
    private static int uniqueSum(int[] nums){
        int sum = 0;
        for (int num : nums) {
            int count = 0;
            for (int i : nums) {
                if (num == i) {
                    count++;
                }
            }
            if (count == 1){
                sum += num;
            }
        }
        return sum;
    }
}
