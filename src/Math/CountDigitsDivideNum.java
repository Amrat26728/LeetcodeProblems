package Math;

public class CountDigitsDivideNum {
    public static void main(String[] args) {
        int n = 121;
        System.out.println(countDigits(n));
    }

    static int countDigits(int num){
        int temp = num;
        int count = 0;

        while(temp > 0){
            int digit = temp % 10;
            if(num % digit == 0){
                count++;
            }
            temp /= 10;
        }
        return count;
    }
}
