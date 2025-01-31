package Mixed;

public class CountIntegersWithEvenSum {
    public static void main(String[] args) {
        int num = 30;
        System.out.println(countEven(num));
    }

    static int countEven(int num){
        int count =0 ;
        for (int i = 1; i <= num; i++){
            int n = i;
            int sum = 0;
            while(n > 0){
                sum += n % 10;
                n /= 10;
            }
            if(sum % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
