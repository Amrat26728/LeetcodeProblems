package Mixed;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] chars = {'H', 'a', 'n', 'n'};
        reverseString(chars);
        System.out.println(Arrays.toString(chars));
    }

    static void reverseString(char[] chars){
        int leftPointer = 0;
        int rightPointer = chars.length - 1;
        while(leftPointer <= rightPointer){
            char temp = chars[leftPointer];
            chars[leftPointer] = chars[rightPointer];
            chars[rightPointer] = temp;
            leftPointer++;
            rightPointer--;
        }
    }
}
