package Arrays;

// problem
// https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three/

public class AverageValueOfEvenNumbersDivBy3 {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(average(arr));
    }

    ////////// solution /////////////////
    private static int average(int[] nums){
        int sum = 0;
        int counter = 0;
        for(int ele: nums){
            if(ele % 2 == 0 && ele % 3 == 0){
                sum += ele;
                counter++;
            }
        }
        if(counter == 0){
            return 0;
        }
        return sum / counter;
    }
}
