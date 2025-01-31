package Trees.BinaryTree;

// problem
// https://leetcode.com/problems/symmetric-tree/

import java.util.ArrayList;
import java.util.List;

public class SymmetricTree {

    /////////////// solution ///////////////
//    public boolean isSymmetric(Node root) {
//        List<Node> list = new ArrayList<>();
//        list.add(root.left);
//        list.add(root.right);
//        while (!list.isEmpty()) {
//            Node node1 = list.removeFirst();
//            Node node2 = list.removeFirst();
//            if (node1 == null && node2 == null) {
//                continue;
//            }
//            if (node1 == null || node2 == null) {
//                return false;
//            }
//            if (node1.val != node2.val) {
//                return false;
//            }
//
//            list.add(node1.left);
//            list.add(node2.right);
//            list.add(node1.right);
//            list.add(node2.left);
//        }
//
//        return true;
//    }

}
