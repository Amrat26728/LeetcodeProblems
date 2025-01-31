package Trees.BinaryTree;

// problem
// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

//    public Node buildTree(int[] preorder, int[] inorder){
//        if (preorder.length == 0){
//            return null;
//        }
//        int val = preorder[0];
//        int bound = 0;
//        for (int i = 0; i < inorder.length; i++) {
//            if (inorder[i] == val){
//                bound = i;
//                break;
//            }
//        }
//        Node node = new Node(val);
//        node.left = buildTree(Arrays.copyOfRange(preorder, 1, bound + 1), Arrays.copyOfRange(inorder, 0, bound));
//        node.right = buildTree(Arrays.copyOfRange(preorder, bound + 1, preorder.length), Arrays.copyOfRange(inorder, bound + 1, inorder.length));
//        return node;
//    }

}
