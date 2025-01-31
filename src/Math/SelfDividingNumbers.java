package Math;

// problem
// https://leetcode.com/problems/self-dividing-numbers/

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        int left = 47;
        int right = 85;
        System.out.println(selfDividingNumbers(left, right));
    }

    public static List<Integer> selfDividingNumbers(int left, int right){
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int num = i;
            while (num > 0){
                int digit = num % 10;
                if (digit == 0){
                    break;
                }
                if (i % digit != 0){
                    break;
                }
                num /= 10;
            }
            if (num == 0){
                ans.add(i);
            }
        }
        return ans;
    }
}
