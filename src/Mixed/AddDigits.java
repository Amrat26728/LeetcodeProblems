package Mixed;

public class AddDigits {
    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigits(num));
    }

    // problem
    // https://leetcode.com/problems/add-digits/

    ///////// solution /////////////
    public static int addDigits(int num) {
        if(num < 10){
            return num;
        }
        int sum = sum(num);
        while(sum >= 10){
            sum = sum(sum);
        }
        return sum;
    }

    static int sum(int num){
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }
}
