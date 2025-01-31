package Strings;

// problem
// https://leetcode.com/problems/jewels-and-stones/

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "z";
        String stones = "ZZ";
        System.out.println(numJewelsInStones(jewels, stones));
    }

    ///////// solution /////////
    public static int numJewelsInStones(String jewels, String stones){
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.contains(stones.substring(i, i + 1))){
                count++;
            }
        }
        return count;
    }
}
