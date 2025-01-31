package Mixed;

// problem
// https://leetcode.com/problems/reverse-integer/

public class ReverseInteger {
    public static void main(String[] args) {
        int n = 214748364;
        System.out.println(reverse(n));
    }

    public static int reverse(int n){
        boolean isNegative = false;
        long x = n;
        if (x < 0){
            x = x * -1;
            isNegative = true;
        }
        long reversed = 0;
        while (x > 0){
            reversed *= 10;
            reversed += x % 10;
            x /= 10;
        }
        if (isNegative) reversed *= -1;
        if (reversed < -2147483648) return 0;
        if (reversed > 2147483647) return 0;
        return (int) reversed;
    }

}
