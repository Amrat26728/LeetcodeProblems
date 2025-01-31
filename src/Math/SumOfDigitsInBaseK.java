package Math;

// problem
// https://leetcode.com/problems/sum-of-digits-in-base-k/

public class SumOfDigitsInBaseK {
    public static void main(String[] args) {
        int n = 10;
        int k = 10;
        System.out.println(sumBase(n, k));
    }

    public static int sumBase(int n, int k){
        int sum = 0;
        while (n > 0){
            int digit = n % k;
            sum += digit;
            n /= k;
        }
        return sum;
    }
}
