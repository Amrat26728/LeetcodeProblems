package Math;

// problem
// https://leetcode.com/problems/find-the-child-who-has-the-ball-after-k-seconds/

public class FindChildWhoHasBallAfterKSeconds {
    public static void main(String[] args) {
        int n = 2;
        int k = 1;
        System.out.println(numberOfChild(n, k));
    }

    public static int numberOfChild(int n, int k){
        int completeRounds = k / (n-1);
        if (completeRounds % 2 == 0){
            return k % (n-1);
        }
        return n-1-(k%(n-1));
    }
}
