package Trees.BinaryTree;

// problem
// https://leetcode.com/problems/average-of-levels-in-binary-tree/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBT {

    ///////////// solution ////////////
//    public List<Double> averageLevelOrder(Node root){
//        List<Double> ans = new ArrayList<>();
//        if (root == null){
//            return ans;
//        }
//        Queue<Node> queue = new LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()){
//            int currentSize = queue.size();
//            double sum = 0;
//            for (int i = 0; i < currentSize; i++) {
//                Node currentNode = queue.remove();
//                sum += currentNode.val;
//                if (currentNode.left != null){
//                    queue.add(currentNode.left);
//                }
//                if (currentNode.right != null){
//                    queue.add(currentNode.right);
//                }
//            }
//            ans.add(sum/currentSize);
//        }
//        return ans;
//    }

}
