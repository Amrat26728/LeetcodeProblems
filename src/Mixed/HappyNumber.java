package Mixed;

import java.util.HashSet;


// solved
public class HappyNumber {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(isHappyNumber(num));
    }

    static boolean isHappyNumber(int num){
        HashSet<Integer> set = new HashSet<>();
        while(true){
            num = squareAndSum(num);
            if(num == 1){
                return true;
            }
            else if(set.contains(num)){
                break;
            }
            set.add(num);
        }
        return false;
    }

    static int squareAndSum(int n){
        int sum = 0;
        while(n >= 10){
            int digit = n%10;
            sum += digit * digit;
            n = n/10;
        }
        return sum+(n*n);
//        if(n < 10){
//            return n*n;
//        }
//        int remainder = n % 10;
//        return (remainder * remainder) + squareAndSum(n/10);
    }
}
