package Trees.BinaryTree;

// problem
// https://leetcode.com/problems/find-largest-value-in-each-tree-row/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindLargestValueInEachTreeRow {

//    public List<Integer> largestValues(Node root){
//        List<Integer> ans = new ArrayList<>();
//        if (root == null){
//            return ans;
//        }
//        Queue<List<Node>> queue = new LinkedList<>();
//        List<Node> list = new ArrayList<>();
//        list.add(root);
//        queue.add(list);
//        while (!queue.isEmpty()){
//            List<Node> temp = queue.remove();
//            List<Node> nodes = new ArrayList<>();
//            int greatest = temp.getFirst().val;
//            for (Node node : temp) {
//                if (node.val > greatest) {
//                    greatest = node.val;
//                }
//                if (node.left != null) {
//                    nodes.add(node.left);
//                }
//                if (node.right != null) {
//                    nodes.add(node.right);
//                }
//            }
//            if (!nodes.isEmpty()){
//                queue.add(nodes);
//            }
//            ans.add(greatest);
//        }
//        return ans;
//    }

}
