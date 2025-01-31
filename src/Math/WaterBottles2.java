package Math;

// problem
// https://leetcode.com/problems/water-bottles-ii/

public class WaterBottles2 {
    public static void main(String[] args) {

    }

    public static int maxBottlesDrunk(int numBottles, int numExchange){
        int emptyBottle = numBottles;
        int drunkBottles = numBottles;
        numBottles = 0;
        while (emptyBottle >= numExchange){
            while (emptyBottle >= numExchange){
                numBottles += 1;
                emptyBottle -= numExchange;
                numExchange++;
            }
            drunkBottles += numBottles;
            emptyBottle += numBottles;
            numBottles = 0;
        }
        return drunkBottles;
    }
}
