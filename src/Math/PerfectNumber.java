package Math;

// problem
// https://leetcode.com/problems/perfect-number/

public class PerfectNumber {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(checkPerfectSquare(n));
    }

    public static boolean checkPerfectSquare(int n){
        if(n <= 5){
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        int sum = 1;
        for (int i = 2; i <= sqrt; i++){
            if (n % i == 0){
                sum += i;
                if (i != n/i){
                    sum += n / i;
                }
            }
        }
        return sum == n;
    }
}
