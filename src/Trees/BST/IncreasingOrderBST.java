package Trees.BST;

// problem
// https://leetcode.com/problems/increasing-order-search-tree/

public class IncreasingOrderBST {

    ///////////////// solution /////////////
//    public Node increasingOrderBST(Node root){
//        while(root.left != null){
//            Node left = root.left;
//            root.left = null;
//            Node temp = left;
//            while (temp.right != null){
//                temp = temp.right;
//            }
//            temp.right = root;
//            root = left;
//        }
//
//        Node node = root;
//        while (node.right != null){
//            if (node.right.left != null){
//                Node l = node.right.left;
//                node.right.left = null;
//                LevelOrderTraversal.Node t = l;
//                while (t.right != null){
//                    t = t.right;
//                }
//                t.right = node.right;
//                node.right = l;
//            }else{
//                node = node.right;
//            }
//        }
//
//        return root;
//    }

}
