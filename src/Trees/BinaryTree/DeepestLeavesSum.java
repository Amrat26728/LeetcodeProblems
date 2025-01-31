package Trees.BinaryTree;

// problem
// https://leetcode.com/problems/deepest-leaves-sum/


public class DeepestLeavesSum {

//    public int deepestLeavesSum(Node root){
//        int maxDepth = depth(root);
//        return leavesSum(root, maxDepth, 0, 0);
//    }
//    private int depth(Node root){
//        if (root == null){
//            return -1;
//        }
//        if (root.left == null & root.right == null){
//            return 0;
//        }
//        return Math.max(depth(root.left), depth(root.right)) + 1;
//    }
//    private int leavesSum(Node root, int depth, int depthCounter, int sum){
//        if (depthCounter == depth && root != null){
//            sum += root.val;
//            return sum;
//        }
//        if (root == null){
//            return 0;
//        }
//        depthCounter += 1;
//        int left = leavesSum(root.left, depth, depthCounter, sum);
//        int right = leavesSum(root.right, depth, depthCounter, sum);
//        return left + right;
//    }

}
