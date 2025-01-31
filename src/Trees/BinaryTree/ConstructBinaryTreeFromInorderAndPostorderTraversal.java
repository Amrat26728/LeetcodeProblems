package Trees.BinaryTree;

// problem
// https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {

//    public Node buildTree(int[] inorder, int[] postorder){
//        if (postorder.length == 0){
//            return null;
//        }
//        int val = postorder[postorder.length-1];
//        int bound = postorder.length - 1;
//        for (int i = 0; i < inorder.length; i++) {
//            if (inorder[i] == val){
//                bound = i;
//                break;
//            }
//        }
//        Node node = new Node(val);
//
//        node.left = buildTree(Arrays.copyOfRange(inorder, 0, bound), Arrays.copyOfRange(postorder, 0, bound));
//        node.right = buildTree(Arrays.copyOfRange(inorder, bound + 1, inorder.length), Arrays.copyOfRange(postorder, bound, postorder.length-1));
//        return node;
//    }

}
