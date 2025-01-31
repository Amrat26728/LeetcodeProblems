package Strings;

// problem
// https://leetcode.com/problems/calculate-digit-sum-of-a-string/

public class DigitSumOfString {
    public static void main(String[] args) {
        String s = "1234567896436458635";
        System.out.println(calculateSum(s, 2));
    }

    /////// solution /////////
    public static String calculateSum(String s, int k){
        while(s.length() > k){
            String temp = "";
            int index = 0;
            while (index < s.length()){
                int sum = 0;
                if (s.length() - index < k){
                    String ss = s.substring(index);
                    index = s.length();
                    for (int i = 0; i < ss.length(); i++) {
                        int digit = Integer.parseInt(ss.substring(i, i+1));
                        sum += digit;
                    }
                }else{
                    String ss = s.substring(index, index + k);
                    index = index + k;
                    for (int i = 0; i < ss.length(); i++) {
                        int digit = Integer.parseInt(ss.substring(i, i+1));
                        sum += digit;
                    }
                }
                temp = temp.concat(Integer.toString(sum));
            }
            s = temp;
        }
        return s;
    }
}
