package Mixed;

public class SubtractSumFromProductOfDigits {
    public static void main(String[] args) {
        int n = 10;
        int sum = sumOfDigits(n);
        int product = productOfDigits(n);
        System.out.println(product - sum);
    }

    static int sumOfDigits(int n){
        int sum = 0;
        while(n >= 10){
            int digit = n%10;
            sum += digit;
            n = n/10;
        }
        return sum + n;
    }

    static int productOfDigits(int n){
        int product = 1;
        while(n >= 10){
            int digit = n%10;
            product *= digit;
            n = n/10;
        }
        return product * n;
    }
}
