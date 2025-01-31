package Trees.BinaryTree;

// problem
// https://leetcode.com/problems/path-sum/

public class PathSum {

//    public boolean hasPathSum(Node root, int targetSum){
//        if (root == null){
//            return false;
//        }
//        return pathSum(root, targetSum, 0);
//    }
//    private boolean pathSum(Node root, int targetSum, int valuesSum){
//        valuesSum += root.val;
//        if (root.left == null && root.right == null){
//            return targetSum == valuesSum;
//        }
//        boolean left = false;
//        boolean right = false;
//        if (root.left != null){
//            left = pathSum(root.left, targetSum, valuesSum);
//        }
//        if (root.right != null){
//            right = pathSum(root.right, targetSum, valuesSum);
//        }
//        return left || right;
//    }

}
