package Math;

// problem
// https://leetcode.com/problems/sum-of-number-and-its-reverse/

public class SumOfNumberAndItsReverse {
    public static void main(String[] args) {
        int num = 63;
        System.out.println(sumOfNumberAndReverse(num));
    }

    public static boolean sumOfNumberAndReverse(int num) {
        for (int i = 0; i <= num; i++) {
            String s = Integer.toString(i);
            StringBuffer ss = new StringBuffer(s).reverse();
            s = ss.toString();
            int n = Integer.parseInt(s);
            if (i + n == num){
                System.out.println(i + "," + n);
                return true;
            }
        }
        return false;
    }
}
