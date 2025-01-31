package Trees.BinaryTree;

// problem
// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

import java.util.ArrayList;
import java.util.List;

public class ZigzagLevelOrderTraversal {

    //////////// solution ////////////////
//    public List<List<Integer>> zigzagTraversal(Node root){
//        List<List<Integer>> ans = new ArrayList<>();
//        if (root == null){
//            return ans;
//        }
//        List<Node> list = new ArrayList<>();
//        list.add(root);
//        int level = 0;
//        while (!list.isEmpty()){
//            List<Integer> internallist = new ArrayList<>();
//            int size = list.size();
//            for (int i = 0; i < size; i++) {
//                if (level % 2 == 0){
//                    Node currentNode = list.removeFirst();
//                    internallist.add(currentNode.val);
//                    if (currentNode.left != null){
//                        list.addLast(currentNode.left);
//                    }
//                    if (currentNode.right != null){
//                        list.addLast(currentNode.right);
//                    }
//                }else{
//                    Node currentNode = list.removeLast();
//                    internallist.add(currentNode.val);
//                    if (currentNode.right != null){
//                        list.addFirst(currentNode.right);
//                    }
//                    if (currentNode.left != null){
//                        list.addFirst(currentNode.left);
//                    }
//                }
//            }
//            level++;
//            ans.add(internallist);
//        }
//        return ans;
//    }

}
