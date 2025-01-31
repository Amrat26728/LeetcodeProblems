package Trees.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// problem
// https://leetcode.com/problems/binary-tree-level-order-traversal/

public class LevelOrderTraversal {

    ////////////// solution ////////////
//    public List<List<Integer>> levelOrder(Node root){
//        List<List<Integer>> ans = new ArrayList<>();
//        if (root == null){
//            return ans;
//        }
//        Queue<Node> queue = new LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()){
//            List<Integer> list = new ArrayList<>();
//            int currentSize = queue.size();
//            for (int i = 0; i < currentSize; i++) {
//                Node currentNode = queue.remove();
//                list.add(currentNode.val);
//                if (currentNode.left != null){
//                    queue.add(currentNode.left);
//                }
//                if (currentNode.right != null){
//                    queue.add(currentNode.right);
//                }
//            }
//            ans.add(list);
//        }
//        return ans;
//    }
}
