package Mixed;

import java.util.Arrays;

public class NUniqueIntegersSumToZero {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(Arrays.toString(sumToZeroArray(n)));
    }

    static int[] sumToZeroArray(int n){

        int[] arr = new int[n];
        int half = n/2;

        for (int i = 0; i < half; i++) {
            arr[i] = i+1;
            arr[i + half] = -i-1;
        }
        if(n%2 != 0){
            arr[n-1] = 0;
        }

        return arr;
    }
}
