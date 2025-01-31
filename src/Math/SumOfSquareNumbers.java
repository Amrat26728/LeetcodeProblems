package Math;

// problem
// https://leetcode.com/problems/sum-of-square-numbers/

public class SumOfSquareNumbers {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(sumOfSquareNumber(n));
    }

    public static boolean sumOfSquareNumber(int n){
        int start = 0;
        int end = (int) Math.sqrt(n);
        while (start <= end){
            long sqr1 = (long) start * start;
            long sqr2 = (long) end * end;
            long sum = sqr1 + sqr2;
            if (sum == n){
                return true;
            }else if(sum > n){
                end--;
            }else{
                start++;
            }
        }
        return false;
    }
}
