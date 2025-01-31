package Arrays;

// problem
// https://leetcode.com/problems/find-the-sum-of-encrypted-integers/

public class FindTheSumOfEncryptedIntegers {
    public static void main(String[] args) {
        int[] arr = {1, 21, 31};
        System.out.println(sumOfEncryptedInt(arr));
    }

    public static int sumOfEncryptedInt(int[] nums){
        int sum = 0;
        for (int num: nums){
            String str = Integer.toString(num);
            if (str.length() > 1){
                char digit = str.charAt(0);
                for (int i = 1; i < str.length(); i++) {
                    if (str.charAt(i) > digit){
                        digit = str.charAt(i);
                    }
                }
                int largestDigit = digit - 48;
                int maxNum = largestDigit;
                for (int i = 0; i < str.length() - 1; i++) {
                    maxNum *= 10;
                    maxNum += largestDigit;
                }
                sum += maxNum;
            }else{
                sum += num;
            }
        }
        return sum;
    }
}
