package Trees.BinaryTree;

// problem
// https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/

import java.util.LinkedList;
import java.util.Queue;

public class FindTargetInClonedBT {

    ////////////////// solution ///////////////
//    public final Node getTargetCopy(Node cloned, Node target){
//        Queue<Node> queue = new LinkedList<>();
//        queue.add(cloned);
//        Node ans = null;
//        while (!queue.isEmpty()){
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                Node node = queue.remove();
//                if (node.val == target.val){
//                    ans = node;
//                    break;
//                }
//                if (node.left != null){
//                    queue.add(node.left);
//                }
//                if (node.right != null){
//                    queue.add(node.right);
//                }
//            }
//        }
//        return ans;
//    }
}
