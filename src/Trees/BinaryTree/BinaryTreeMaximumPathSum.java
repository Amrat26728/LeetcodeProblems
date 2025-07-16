package Trees.BinaryTree;

// problem
// https://leetcode.com/problems/binary-tree-maximum-path-sum/

public class BinaryTreeMaximumPathSum {

    public static void main(String[] args) {

    }

    public static class TreeNode{
        private int val;
        private TreeNode left;
        private TreeNode right;
        private TreeNode(int  val){
            this.val = val;
        }
    }

    public static int max = Integer.MIN_VALUE;

    public static int maxPathSum(TreeNode root){
        findMax(root);
        return max;
    }

    private static int findMax(TreeNode root){
        if (root == null){
            return 0;
        }
        int left = findMax(root.left);
        int right = findMax(root.right);
        left = Math.max(left, 0);
        right = Math.max(right, 0);
        int sum = root.val+left+right;
        max = Math.max(max, sum);
        return Math.max(left, right)+root.val;
    }
}
