package Trees.BST;

// problem
// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

public class LowestCommonAncestorOfBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
//        root.left.left = new TreeNode(0);
//        root.left.right = new TreeNode(4);
//        root.left.right.left = new TreeNode(3);
//        root.left.right.right = new TreeNode(5);
//        root.right.left = new TreeNode(7);
//        root.right.right = new TreeNode(9);

        System.out.println(lowestCommonAncestor(root, root.left, root).val);
    }

    public static class TreeNode{
        private int val;
        private TreeNode left;
        private TreeNode right;
        private TreeNode(int  val){
            this.val = val;
        }
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if (root == null) {
            return null;
        }
        if (root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        if (root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}
