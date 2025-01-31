package Strings;

// problem
// https://leetcode.com/problems/minimum-number-of-chairs-in-a-waiting-room/

public class MinimumNoOfChairsInWaitingRoom {
    public static void main(String[] args) {
        String s = "ELELEEL";
        System.out.println(minimumChairs(s));
    }

    public static int minimumChairs(String s){
        int minCharis = 0;
        int freeChairs = 0;
        for (char ch: s.toCharArray()){
            if (ch == 'E' && freeChairs == 0){
                minCharis++;
            }
            else if(ch == 'E'){
                freeChairs--;
            }
            else if(ch == 'L'){
                freeChairs++;
            }
        }
        return minCharis;
    }
}
