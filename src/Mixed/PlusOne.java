package Mixed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {0,0,0};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    static int[] plusOne(int[] digits){
        List<Integer> list = new ArrayList<>();

        // increment in last digit and add in the list
        int num = digits[digits.length - 1] + 1;
        int digit = num % 10;
        int carry = num / 10;
        list.add(digit);

        // add remaining digits of number in list with carry
        for (int i = digits.length - 2; i >= 0; i--) {
            int n = digits[i] + carry;
            int dig = n % 10;
            carry = n / 10;
            list.add(dig);
        }

        // add carry in the last if it contains num greater then 0
        if(carry > 0){
            list.add(carry);
        }

        int[] arr = new int[list.size()];
        int index = 0;

        // add numbers from list to array
        for(int j = list.size() - 1; j >= 0; j--){
            arr[index] = list.get(j);
            index++;
        }

        return arr;
    }
}
