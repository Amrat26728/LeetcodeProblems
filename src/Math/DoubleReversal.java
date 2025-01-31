package Math;

public class DoubleReversal {
    public static void main(String[] args) {
        int n = 1800;
        System.out.println(isSameAfterReversal(n));
    }

    static boolean isSameAfterReversal(int num){
        if(num % 10 == 0){
            return false;
        }
        int n = num;
        int reversed1 = 0;
        int reversed2 = 0;
        while(n > 0){
            int digit = n % 10;
            reversed1 *= 10;
            reversed1 += digit;
            n /= 10;
        }

        while(reversed1 > 0){
            int digit = reversed1 % 10;
            reversed2 *= 10;
            reversed2 += digit;
            reversed1 /= 10;
        }

        return reversed2 == num;
    }
}
