package Arrays;

// problem
// https://leetcode.com/problems/sqrtx/

public class Sqrt {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(sqrt(num));
    }

    /////// solution //////
    private static int sqrt(int n){
        if (n == 0 || n == 1){
            return n;
        }
        int start = 1;
        int end = n;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid * mid == n){
                return mid;
            }else if((long) mid * mid > (long) n){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return Math.round(end);
    }
}
