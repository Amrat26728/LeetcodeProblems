package Trees.BinaryTree;

// problem
// https://leetcode.com/problems/minimum-depth-of-binary-tree/

import java.util.LinkedList;
import java.util.Queue;

public class MinmumDepthOfBT {

    //////////////// solution //////////////
//    public int minDepth(Node root){
//        Queue<Node> queue = new LinkedList<>();
//        if (root != null){
//            queue.add(root);
//        }
//        int depth = 1;
//        while (!queue.isEmpty()){
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                Node node = queue.remove();
//                if (node.left == null && node.right == null){
//                    return depth;
//                }
//                if (node.left != null){
//                    queue.add(node.left);
//                }
//                if (node.right != null){
//                    queue.add(node.right);
//                }
//            }
//            depth++;
//        }
//        return 0;
//    }

}
