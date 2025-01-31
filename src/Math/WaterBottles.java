package Math;

// problem
// https://leetcode.com/problems/water-bottles/

public class WaterBottles {
    public static void main(String[] args) {
        int numBottles = 19;
        int numExchange = 7;
        System.out.println(numWaterBottles(numBottles, numExchange));
    }

    public static int numWaterBottles(int numBottles, int numExchange){
        int emptyBottle = numBottles;
        int drunkBottles = numBottles;
        while (emptyBottle >= numExchange){
            numBottles = emptyBottle / numExchange;
            drunkBottles += numBottles;
            emptyBottle %= numExchange;
            emptyBottle += numBottles;
        }
        return drunkBottles;
    }
}
