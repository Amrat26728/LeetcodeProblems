package Matrix;

// problem
// https://leetcode.com/problems/prime-in-diagonal/

public class PrimeInDiagonal {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,1},
                {5,16,7},
                {9,10,12}
        };
        System.out.println(primeInDiagonal(arr));
    }

    /////// solution ////////////
    private static int primeInDiagonal(int[][] nums){
        int generalDiagonal = nums.length;
        int largestPrime = 0;
        // general diagonal
        for (int i = 0; i < generalDiagonal; i++) {
            int num = nums[i][i];
            if (isPrime(num)){
                if (largestPrime < num){
                    largestPrime = num;
                }
            }
        }

        // leading diagonal
        int rowIndex = 0;
        int colIndex = nums.length - 1;
        for (int i = 0; i < generalDiagonal; i++) {
            int num = nums[rowIndex][colIndex];
            if (isPrime(num)){
                if (largestPrime < num){
                    largestPrime = num;
                }
            }
            rowIndex++;
            colIndex--;
        }
        return largestPrime;
    }

    private static boolean isPrime(int n){
        int sqrt = (int) Math.sqrt(n);
        boolean isPrime = true;
        if (n == 1){
            return false;
        }
        if (n == 2 || n == 3){
            return true;
        }
        for (int i = 2; i  <= sqrt; i++) {
            if (n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
