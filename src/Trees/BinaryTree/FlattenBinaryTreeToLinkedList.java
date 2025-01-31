package Trees.BinaryTree;

// problem
// https://leetcode.com/problems/flatten-binary-tree-to-linked-list/

public class FlattenBinaryTreeToLinkedList {

    ///////////////// solution with O(1) space complexity ///////////////
//    public Node flattenBT2(Node root){
//        if (root == null){
//            return root;
//        }
//        Node node = root;
//        while (node.left != null || node.right != null){
//            Node n = null;
//            if (node.right != null && node.left != null){
//                n = node.right;
//            }
//            if (node.left != null){
//                node.right = node.left;
//                node.left = null;
//            }else{
//                node = node.right;
//                continue;
//            }
//            node = node.right;
//            Node temp = node;
//            while (temp.right != null){
//                temp = temp.right;
//            }
//            temp.right = n;
//        }
//        return root;
//    }


    ////////////////// solution using stack //////////////////
//    public Node flattenBT(Node root){
//        if (root == null){
//            return root;
//        }
//        Stack<Node> stack = new Stack<>();
//        if (root.right != null){
//            stack.push(root.right);
//        }
//        root.right = root.left;
//        root.left = null;
//        Node node = root.right;
//        while (!stack.isEmpty()){
//            if (node.left == null && node.right == null){
//                node.right = stack.pop();
//                node = node.right;
//            }
//            if (node.right != null){
//                stack.push(node.right);
//                node.right = null;
//            }
//            if (node.left != null){
//                node.right = node.left;
//                node.left = null;
//                node = node.right;
//            }
//        }
//        return root;
//    }

}
