package Mixed;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2,3,6,7,};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    static int[] findErrorNums(int[] arr){
        int i = 0;
        while (i <= arr.length - 1){
            if(arr[i] == arr[arr[i] - 1] || i == arr[i] - 1){
                i++;
            }else{
                int currentNum = arr[i];
                int temp = arr[i];
                arr[i] = arr[currentNum - 1];
                arr[currentNum - 1] = temp;
            }
        }

        int[] misMatchNums = new int[2];

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j + 1){
                misMatchNums[0] = arr[j];
                misMatchNums[1] = j + 1;
            }
        }
        return misMatchNums;
    }
}
