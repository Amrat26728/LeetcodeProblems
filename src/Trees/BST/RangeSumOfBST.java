package Trees.BST;

// problem
// https://leetcode.com/problems/range-sum-of-bst/

public class RangeSumOfBST {

    ////////////// solution ///////////
//    public int rangeSumBST(Node root, int low, int high){
//        int sum = 0;
//        if (root == null){
//            return 0;
//        }
//        if (root.val >= low && root.val <= high){
//            sum += root.val;
//            int leftSum = rangeSumBST(root.left, low, high);
//            int rightSum = rangeSumBST(root.right, low, high);
//            sum = sum + leftSum + rightSum;
//        }
//        if(root.val < low){
//            return rangeSumBST(root.right, low, high);
//        }
//        if(root.val > high){
//            return rangeSumBST(root.left, low, high);
//        }
//        return sum;
//    }

}
