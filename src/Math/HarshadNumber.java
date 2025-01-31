package Math;

// problem
// https://leetcode.com/problems/harshad-number/

public class HarshadNumber {
    public static void main(String[] args) {
        int x = 1;
        System.out.println(sumOfTheDigitsOfHarshadNumber(x));
    }

    public static int sumOfTheDigitsOfHarshadNumber(int x){
        int sum = 0;
        int n = x;
        while (n > 0){
            sum += n % 10;
            n /= 10;
        }
        if (x % sum == 0){
            return sum;
        }
        return -1;
    }
}
