package Arrays;

// problem
// https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/

import java.util.Arrays;

public class ConvertIntegerToSumOfTwoNoZeroIntegers {
    public static void main(String[] args) {
        int n = 109;
        System.out.println(Arrays.toString(getNoZeroIntegers(n)));
    }

    /////////////// solution /////////////////
    public static int[] getNoZeroIntegers(int n){
        int first = 1;
        while(true){
            int second = n - first;
            boolean firstNum = isNoZero(first);
            boolean secondNum = isNoZero(second);
            if (firstNum && secondNum){
                return new int[] {first, second};
            }
            first++;
        }
    }

    private static boolean isNoZero(int n){
        String s = Integer.toString(n);
        for(char ch: s.toCharArray()){
            if (ch == '0'){
                return false;
            }
        }
        return true;
    }
}
