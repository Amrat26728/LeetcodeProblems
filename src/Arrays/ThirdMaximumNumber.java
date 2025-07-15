package Arrays;

// problem
// https://leetcode.com/problems/third-maximum-number/

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(thirdMax(arr));
    }

    public static int thirdMax(int[] nums){
        Integer first = null;
        Integer second = null;
        Integer third = null;
        for (Integer e: nums){
            if (e.equals(first) || e.equals(second) || e.equals(third)){
                continue;
            }
            if (first == null || e > first){
                third = second;
                second = first;
                first = e;
            }
            else if (second == null || e > second){
                third = second;
                second = e;
            }
            else if (third ==  null || e > third){
                third = e;
            }
        }
        return third == null ? first : third;
    }
}
