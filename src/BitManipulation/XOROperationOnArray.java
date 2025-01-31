package BitManipulation;

import java.util.Arrays;

public class XOROperationOnArray {
    public static void main(String[] args) {
        int n = 5;
        int start = 0;
        System.out.println(xorOperation(n, start));
    }

    static int xorOperation(int n, int start){
        int[] nums = new int[n];
        int xor = 0;

        for(int i = 0; i < n; i++){
            nums[i] = start + 2 * i;
            xor ^= nums[i];
        }

        System.out.println(Arrays.toString(nums));
        return xor;
    }
}
