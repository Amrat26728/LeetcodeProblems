package Math;

public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(factTrailingZeroes(n));
    }

    static int factTrailingZeroes(int n){
        if(n == 0){
            return n;
        }
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }

        return count;
    }


}
