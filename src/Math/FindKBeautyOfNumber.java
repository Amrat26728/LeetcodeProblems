package Math;

// problem
// https://leetcode.com/problems/find-the-k-beauty-of-a-number/

public class FindKBeautyOfNumber {
    public static void main(String[] args) {
        int num = 1000000000;
        int k = 3;
        System.out.println(divisorSubstrings(num, k));
    }

    public static int divisorSubstrings(int num, int k){
        String n = Integer.toString(num);
        int count = 0;
        for (int i = 0; i <= n.length()-k; i++) {
            String subStr = n.substring(i, i+k);
            int divisor = Integer.parseInt(subStr);
            if (divisor != 0 && num % divisor == 0){
                count++;
            }
        }
        return count;
    }
}
