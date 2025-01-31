package Trees.BST;

// problem
// https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/

public class ConstructBSTFromPreorderTraversalArray {

    ////////////////// solution ////////////////
//    public Node bstFromPreorder(int[] preorder){
//        LevelOrderTraversal.Node root = new Node(preorder[0]);
//        for (int i = 1; i < preorder.length; i++) {
//            insert(root, preorder[i]);
//        }
//        return root;
//    }
//
//    private void insert(Node node, int val){
//        if (node.left == null && node.val > val){
//            node.left = new Node(val);
//        }else if(node.right == null && node.val < val){
//            node.right = new Node(val);
//        }
//        else if(node.val < val){
//            insert(node.right, val);
//        }else{
//            insert(node.left, val);
//        }
//    }

}
