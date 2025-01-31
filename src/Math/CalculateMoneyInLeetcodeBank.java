package Math;

// problem
// https://leetcode.com/problems/calculate-money-in-leetcode-bank/

public class CalculateMoneyInLeetcodeBank {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(totalMoney(n));
    }

    public static int totalMoney(int n){
        int weeks = n / 7;
        int remainingDays = n % 7;
        int totalMoney = 0;
        int multi = 0;
        while (multi < weeks){
            totalMoney += 28 + (7 * multi);
            multi++;
        }
        if (remainingDays > 0){
            int remainingDaysNaturalSum = (remainingDays + weeks) * (remainingDays + weeks + 1) / 2;
            int naturalSum = (weeks + 1) * weeks / 2;
            totalMoney += remainingDaysNaturalSum - naturalSum;
        }
        return totalMoney;
    }
}
