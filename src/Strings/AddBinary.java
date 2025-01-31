package Strings;

// problem
// https://leetcode.com/problems/maximum-product-of-three-numbers/

public class AddBinary {
    public static void main(String[] args) {
        String s1 = "100";
        String s2 = "100000";
        System.out.println(add(s1, s2));
    }

    ////// solution ///////////
    private static String add(String s1, String s2){
        int index1 = s1.length() - 1;
        int index2 = s2.length() - 1;
        int carry = 0;
        String sum = "";
        while (index2 >= 0 && index1 >= 0){
            int digit1 = Integer.parseInt(s1.substring(index1, index1+1));
            int digit2 = Integer.parseInt(s2.substring(index2, index2+1));
            int digitSum = digit1 + digit2 + carry;
            if (digitSum == 0){
                sum = Integer.toString(digitSum).concat(sum);
            }else if (digitSum == 2){
                sum = Integer.toString(0).concat(sum);
                carry = 1;
            }else if(digitSum == 1){
                sum = Integer.toString(1).concat(sum);
                carry = 0;
            }else if (digitSum == 3){
                sum = Integer.toString(1).concat(sum);
                carry = 1;
            }
            index1--;
            index2--;
        }
        while (index1 >= 0){
            int digit1 = Integer.parseInt(s1.substring(index1, index1+1));
            int digitSum = digit1 + carry;
            if (digitSum == 0){
                sum = Integer.toString(digitSum).concat(sum);
            }else if (digitSum == 2){
                sum = Integer.toString(0).concat(sum);
                carry = 1;
            }else if(digitSum == 1){
                sum = Integer.toString(1).concat(sum);
                carry = 0;
            }else if(digitSum == 3){
                sum = Integer.toString(1).concat(sum);
                carry = 1;
            }
            index1--;
        }

        while (index2 >= 0){
            int digit2 = Integer.parseInt(s2.substring(index2, index2+1));
            int digitSum = digit2 + carry;
            if (digitSum == 0){
                sum = Integer.toString(digitSum).concat(sum);
            }else if (digitSum == 2){
                sum = Integer.toString(0).concat(sum);
                carry = 1;
            }else if(digitSum == 1){
                sum = Integer.toString(1).concat(sum);
                carry = 0;
            }
            index2--;
        }
        if (carry > 0){
            sum = Integer.toString(carry).concat(sum);
        }
        return sum;
    }
}
