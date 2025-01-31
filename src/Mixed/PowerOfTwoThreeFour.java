package Mixed;

public class PowerOfTwoThreeFour {
    public static void main(String[] args) {
        int n = 243;
        System.out.println(isPowerOfTwo(n));
    }

    static boolean isPowerOfTwo(int n){
        if(n == 0){
            return false;
        }
        if (n == 1){
            return true;
        }
        return n%2 == 0 && isPowerOfTwo(n/2);
    }

    static boolean isPowerOfThree(int n){
        if(n == 0){
            return false;
        }
        if (n == 1){
            return true;
        }
        return n%3 == 0 && isPowerOfThree(n/3);
    }

    static boolean isPowerOfFour(int n){
        if(n == 0){
            return false;
        }
        if (n == 1){
            return true;
        }
        return n%4 == 0 && isPowerOfFour(n/4);
    }
}
