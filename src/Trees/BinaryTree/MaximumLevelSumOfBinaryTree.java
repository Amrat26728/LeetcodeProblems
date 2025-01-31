package Trees.BinaryTree;

// problem
// https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumLevelSumOfBinaryTree {

//    public int maxLevelSum(Node root){
//        Queue<List<Node>> queue = new LinkedList<>();
//        List<Node> list = new ArrayList<>();
//        list.add(root);
//        queue.add(list);
//        int maxSum = Integer.MIN_VALUE;
//        int ans = 0;
//        int level = 0;
//        while (!queue.isEmpty()){
//            List<Node> temp = queue.remove();
//            List<Node> nodes = new ArrayList<>();
//            int sum = 0;
//            level++;
//            for(Node node: temp){
//                sum += node.val;
//                if (node.left != null){
//                    nodes.add(node.left);
//                }
//                if (node.right != null){
//                    nodes.add(node.right);
//                }
//            }
//            if (sum > maxSum){
//                maxSum = sum;
//                ans = level;
//            }
//            if (!nodes.isEmpty()){
//                queue.add(nodes);
//            }
//        }
//        return ans;
//    }

}
