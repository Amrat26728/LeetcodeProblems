package Trees.BinaryTree;

// problem
// https://leetcode.com/problems/kth-largest-sum-in-a-binary-tree/


import java.util.*;

public class KthLargestSumInBinaryTree {

//    public long kthLargestLevelSum(Node root, int k){
//        Queue<List<Node>> queue = new LinkedList<>();
//        List<Node> list = new ArrayList<>();
//        PriorityQueue<Long> pq = new PriorityQueue<>(k);
//        list.add(root);
//        queue.add(list);
//        while (!queue.isEmpty()){
//            List<Node> temp = queue.remove();
//            List<Node> nodes = new ArrayList<>();
//            long sum = 0;
//            for (Node node: temp){
//                sum += node.val;
//                if (node.left != null){
//                    nodes.add(node.left);
//                }
//                if (node.right != null){
//                    nodes.add(node.right);
//                }
//            }
//            if (!nodes.isEmpty()){
//                queue.add(nodes);
//            }
//            if (pq.size() == k){
//                if (pq.peek() < sum){
//                    pq.poll();
//                    pq.add(sum);
//                }
//            }else{
//                pq.add(sum);
//            }
//        }
//        if (k > pq.size()){
//            return -1;
//        }
//        return pq.poll();
//    }

}
