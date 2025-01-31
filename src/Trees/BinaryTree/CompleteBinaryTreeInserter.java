package Trees.BinaryTree;

// problem
// https://leetcode.com/problems/complete-binary-tree-inserter/

import java.util.LinkedList;
import java.util.Queue;

public class CompleteBinaryTreeInserter {

    ////////////// solution /////////////////
//    public int insert(int val){
//        Queue<Node> queue = new LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()){
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                Node node = queue.remove();
//                if (node.left == null){
//                    node.left = new Node(val);
//                    return node.val;
//                }
//                if (node.right == null){
//                    node.right = new Node(val);
//                    return node.val;
//                }
//                queue.add(node.left);
//                queue.add(node.right);
//            }
//        }
//        return -1;
//    }
//
//    public Node getRoot(){
//        return root;
//    }

}
