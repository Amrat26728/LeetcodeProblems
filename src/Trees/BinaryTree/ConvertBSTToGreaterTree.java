package Trees.BinaryTree;

// problem
// https://leetcode.com/problems/convert-bst-to-greater-tree/


public class ConvertBSTToGreaterTree {

//    public Node convertBST(Node root){
//        greaterTree(root, 0);
//        return root;
//    }
//    private int greaterTree(Node root, int sum){
//        if (root == null){
//            return 0;
//        }
//        if (root.left == null && root.right == null){
//            root.val = root.val + sum;
//            return root.val;
//        }
//        int right = greaterTree(root.right, sum);
//        if (right == 0){
//            right += sum;
//        }
//        root.val = root.val + right;
//        int left = greaterTree(root.left, root.val);
//        if (left == 0){
//            return root.val;
//        }
//        return left;
//    }

}
