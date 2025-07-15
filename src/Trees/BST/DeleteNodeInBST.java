package Trees.BST;

// problem
// https://leetcode.com/problems/delete-node-in-a-bst/description/

public class DeleteNodeInBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
//        root.left = new TreeNode(3);
//        root.right = new TreeNode(6);
//        root.left.left = new TreeNode(2);
//        root.left.right = new TreeNode(4);
//        root.right.right = new TreeNode(7);

        TreeNode node = deleteNode(root, 5);
    }

     public static class TreeNode{
        private int val;
        private TreeNode left;
        private TreeNode right;
        private TreeNode(int val){
            this.val = val;
        }
     }

    // with O(n) time complexity
    public static TreeNode deleteNode(TreeNode root, int key){
        if (root == null){
            return null;
        }
        if (root.val == key){
            TreeNode leftRightSubtree;
            if (root.left == null && root.right == null){
                return null;
            }
            if (root.left != null){
                leftRightSubtree = root.left.right;
                if (root.right != null){
                    TreeNode right = root.right;
                    while (right.left != null){
                        right = right.left;
                    }
                    right.left = leftRightSubtree;
                    root.left.right = root.right;
                }
                return root.left;
            }
            return root.right;
        }
        if (root.left != null){
            root.left = deleteNode(root.left, key);
        }
        if (root.right != null){
            root.right = deleteNode(root.right, key);
        }
        return root;
    }

    // (Optimized Solution) with O(log n) time complexity
    public static TreeNode deleteNodeHeightOfTree(TreeNode root, int key){
        if (root == null){
            return null;
        }
        if (root.val == key){
            TreeNode leftRightSubtree;
            if (root.left == null && root.right == null){
                return null;
            }
            if (root.left != null){
                leftRightSubtree = root.left.right;
                if (root.right != null){
                    TreeNode right = root.right;
                    while (right.left != null){
                        right = right.left;
                    }
                    right.left = leftRightSubtree;
                    root.left.right = root.right;
                }
                return root.left;
            }
            return root.right;
        }
        if (root.val > key && root.left != null){
            root.left = deleteNodeHeightOfTree(root.left, key);
            return root;
        }
        if (root.val < key && root.right != null){
            root.right = deleteNodeHeightOfTree(root.right, key);
            return root;
        }
        return root;
    }
}
