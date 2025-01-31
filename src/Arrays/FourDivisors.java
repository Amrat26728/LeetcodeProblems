package Arrays;

// problem
// https://leetcode.com/problems/four-divisors/

import java.util.HashMap;
import java.util.Map;

public class FourDivisors {
    public static void main(String[] args) {
        int[] arr = {21, 21};
        System.out.println(sumFourDivisors(arr));
    }

    public static int sumFourDivisors(int[] nums){
        Map<Integer, Integer> check = new HashMap<>();
        int ansSum = 0;
        for (int num: nums){
            int divisors = 2;
            int divisorsSum = 1+num;
            int sqrt = (int) Math.sqrt(num);
            if (sqrt * sqrt == num){
                continue;
            }
            if (check.containsKey(num)){
                ansSum += check.get(num);
                continue;
            }
            for (int i = 2; i <= sqrt; i++) {
                if (num % i == 0){
                    divisors += 2;
                    divisorsSum = divisorsSum + i + (num / i);
                }
            }
            if (divisors == 4){
                ansSum += divisorsSum;
                if (!check.containsKey(num)){
                    check.put(num, divisorsSum);
                }
            }
        }
        return ansSum;
    }
}
