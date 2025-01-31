package Trees.BinaryTree;

// problem
// https://leetcode.com/problems/binary-tree-right-side-view/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {

    ////////////// solution ///////////////
//    public List<Integer> rightSideView(Node root){
//        List<Integer> ans = new ArrayList<>();
//        if (root == null){
//            return ans;
//        }
//        Queue<Node> queue = new LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()){
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                Node node = queue.remove();
//                if (i == size - 1){
//                    ans.add(node.val);
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
