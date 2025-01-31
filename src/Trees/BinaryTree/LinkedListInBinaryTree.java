package Trees.BinaryTree;

// problem
// https://leetcode.com/problems/linked-list-in-binary-tree/

public class LinkedListInBinaryTree {

//    public boolean linkedListInBT(Node root, Node head){
//        boolean contains = contains(root, head);
//        boolean left = false;
//        boolean right = false;
//        if (root.left != null){
//            left = linkedListInBT(root.left, head);
//        }
//        if (!left && root.right != null){
//            right = linkedListInBT(root.right, head);
//        }
//        return contains || left || right;
//    }
//    private boolean contains(Node root, Node head){
//        if (head == null){
//            return true;
//        }
//        if (root == null){
//            return false;
//        }
//        if (root.val != head.val){
//            return false;
//        }
//        return contains(root.left, head.next) || contains(root.right, head.next);
//    }

}
