package Mixed;

// problem
// https://leetcode.com/problems/arranging-coins/


/////////////// solution /////////////

public class ArrangeCoins {
    public static void main(String[] args) {
        int coins = 8;
        System.out.println(completeRow(coins));
    }

    static int completeRow(int coins){
        int i = 1;
        int completed = 0;
        while(coins > 0 && coins >= i){
            coins -= i;
            i++;
            completed++;
        }
        return completed;
    }
}
