package Mixed;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(nthFibonacciNumber(n));
    }

    static int nthFibonacciNumber(int n){
        if(n == 0){
            return 0;
        }else if(n <= 2){
            return 1;
        }
        return nthFibonacciNumber(n -1) + nthFibonacciNumber(n - 2);
    }
}
