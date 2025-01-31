package Strings;

// problem
// https://leetcode.com/problems/number-of-senior-citizens/

public class NumberOfSeniorCitizens {
    public static void main(String[] args) {
        String[] details = {"1313579440F2036","2921522980M5644"};
        System.out.println(countSeniors(details));
    }

    public static int countSeniors(String[] details){
        int count = 0;
        for (String detail: details){
            String s = "";
            s = s + detail.charAt(11) + detail.charAt(12);
            int age = Integer.parseInt(s);
            if (age > 60){
                count++;
            }
        }
        return count;
    }
}
