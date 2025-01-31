package Trees.BinaryTree;

// problem
// https://leetcode.com/problems/cousins-in-binary-tree/

public class CousinsInBinaryTree {

    /////////////// solution ////////////////
//    public boolean isCousins(Node root, int x, int y){
//        Node xNode = findNode(root, x);
//        Node yNode = findNode(root, y);
//
//        return level(root, xNode, 0) == level(root, yNode, 0) && !isSibling(root, xNode, yNode);
//    }
//
//    private int level(Node root, Node node, int lev){
//        if (root == null){
//            return 0;
//        }
//        if (root == node){
//            return lev;
//        }
//        int left = level(root.left, node, lev+1);
//        if (left != 0){
//            return left;
//        }
//        return level(root.right, node, lev+1);
//    }
//
//    private boolean isSibling(Node root, Node xNode, Node yNode){
//        if (root == null){
//            return false;
//        }
//        return (root.left == xNode && root.right == yNode)
//                || (root.left == yNode && root.right == xNode)
//                || isSibling(root.left, xNode, yNode)
//                || isSibling(root.right, xNode, yNode);
//    }
//
//    private Node findNode(Node root, int val){
//        if (root == null){
//            return null;
//        }
//        if (root.val == val){
//            return root;
//        }
//        Node left = findNode(root.left, val);
//        if (left != null){
//            return left;
//        }
//        return findNode(root.right, val);
//    }

}
