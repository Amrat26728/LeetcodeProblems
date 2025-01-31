package Arrays;

// problem
// https://leetcode.com/problems/count-pairs-that-form-a-complete-day-i/

public class CountPairsThatFormCompleteDay1 {
    public static void main(String[] args) {
        int[] hours = {};
        System.out.println(countCompleteDayPairs(hours));
    }

    public static int countCompleteDayPairs(int[] hours){
        int count = 0;
        for (int i = 0; i < hours.length - 1; i++) {
            for (int j = i + 1; j < hours.length; j++) {
                if ((hours[i] + hours[j]) % 24 == 0){
                    count++;
                }
            }
        }
        return count;
    }
}
