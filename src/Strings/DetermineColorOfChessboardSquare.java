package Strings;

// problem
// https://leetcode.com/problems/determine-color-of-a-chessboard-square/

public class DetermineColorOfChessboardSquare {
    public static void main(String[] args) {
        String coordinates = "c5";
        System.out.println(squareISWhite(coordinates));
    }
    public static boolean squareISWhite(String coordinates){
        char first = coordinates.charAt(0);
        char second = coordinates.charAt(1);
        if (first % 2 == 0 && second % 2 == 0){
            return false;
        }else if(first % 2 == 0){
            return true;
        }else return second % 2 == 0;
    }
}
