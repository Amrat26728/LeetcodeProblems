package Trees.BinaryTree;

// problem
// https://leetcode.com/problems/binary-tree-postorder-traversal/

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {

    ////////////// solution /////////////
//    public List<Integer> iterativePostorderTraversal(Node root){
//        List<Integer> ans = new ArrayList<>();
//        if (root == null){
//            return ans;
//        }
//        Stack<Node> stack = new Stack<>();
//        stack.push(root);
//        while (!stack.isEmpty()){
//            Node node = stack.pop();
//            if (node.left == null && node.right == null){
//                ans.add(node.val);
//                continue;
//            }
//            Node l = node.left;
//            Node r = node.right;
//            node.left = null;
//            node.right = null;
//            stack.push(node);
//            if (r != null){
//                stack.push(r);
//            }
//            if (l != null){
//                stack.push(l);
//            }
//        }
//        return ans;
//    }

}
