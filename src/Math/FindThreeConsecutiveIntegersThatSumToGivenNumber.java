package Math;

import java.util.Arrays;

// problem
// https://leetcode.com/problems/find-three-consecutive-integers-that-sum-to-a-given-number/

public class FindThreeConsecutiveIntegersThatSumToGivenNumber {
    public static void main(String[] args) {
        long n = 33;
        System.out.println(Arrays.toString(sumOfThree(n)));
    }

    public static long[] sumOfThree(long num){
        if (num % 3 == 0){
            long x = num / 3;
            return new long[] {x-1, x, x+1};
        }
        return new long[] {};
    }
}
