package Trees.BinaryTree;

// problem
// https://leetcode.com/problems/find-bottom-left-tree-value/

import java.util.LinkedList;
import java.util.Queue;

public class BottomLeftTreeValue {


    ///////////////////// solution ///////////////////
//    public int findBottomLeftValue(Node root){
//        Queue<Node> queue = new LinkedList<>();
//        int ans = root.val;
//        if (root.right != null){
//            queue.add(root.right);
//        }
//        if (root.left != null){
//            queue.add(root.left);
//        }
//        while (!queue.isEmpty()){
//            Node node = queue.remove();
//            ans = node.val;
//            if (node.right != null){
//                queue.add(node.right);
//            }
//            if (node.left != null){
//                queue.add(node.left);
//            }
//        }
//        return ans;
//    }

}
