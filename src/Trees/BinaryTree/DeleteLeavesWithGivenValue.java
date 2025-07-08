package Trees.BinaryTree;


// problem
// https://leetcode.com/problems/delete-leaves-with-a-given-value/description/

public class DeleteLeavesWithGivenValue {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(3);
        root.right = new TreeNode(3);

//        root.left.left = new TreeNode(3);
//        root.left.left.left = new TreeNode(3);
//        root.left.right = new TreeNode(2);

        printTree(root);
        System.out.println();

        TreeNode node = removeLeafNodes(root, 3);

        printTree(node);
    }

    private static class TreeNode{
        private int val;
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }

    public static void printTree(TreeNode root) {
        if (root == null) {
            System.out.print("null,");
            return;
        }
        System.out.print(root.val + ",");
        printTree(root.left);
        printTree(root.right);
    }

    public static TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root.left == null && root.right == null && root.val == target) {
            return null;
        }
        if (root.left != null) {
            root.left = removeLeafNodes(root.left, target);
        }
        if (root.right != null) {
            root.right = removeLeafNodes(root.right, target);
        }
        if (root.left == null && root.right == null && root.val == target) {
            return null;
        }
        return root;
    }
}
