package Arrays;

// problem
// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

public class FindValueOfVariableAfterPerformingOperations {
    public static void main(String[] args) {
        String[] arr = {"++X","++X","X++"};
        System.out.println(finalValueAfterOperations(arr));
    }

    //////////// solution //////////////
    public static int finalValueAfterOperations(String[] operations){
        int x = 0;
        for (String operation : operations) {
            if (operation.equals("X--") || operation.equals("--X")) {
                x -= 1;
            } else {
                x += 1;
            }
        }
        return x;
    }
}
