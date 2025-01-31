package Arrays;

// problem
// https://leetcode.com/problems/valid-perfect-square/

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int n = 808201;
        System.out.println(isPerfectSquare(n));
    }

    public static boolean isPerfectSquare(int num){
        if (num == 1){
            return true;
        }

        long start = 2;
        long end = num / 2;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long square = mid * mid;
            if (square == num) {
                return true;
            } else if (square < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
