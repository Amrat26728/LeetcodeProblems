package Math;

// problem
// https://leetcode.com/problems/k-items-with-the-maximum-sum/

public class KItemsWithMaximumSum {
    public static void main(String[] args) {
        int numOnes = 6;
        int numZeroes = 2;
        int numNegOnes = 4;
        int k = 1;
        System.out.println(kItemsWithMaximumSum(numOnes, numZeroes, numNegOnes, k));
    }

    public static int kItemsWithMaximumSum(int numOnes, int numZeroes, int numNegOnes, int k){
        if (k <= numOnes){
            return k;
        }
        if(k <= numOnes + numZeroes){
            return numOnes;
        }
        return numOnes - (k - numOnes - numZeroes);
    }
}
