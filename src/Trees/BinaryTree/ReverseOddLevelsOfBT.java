package Trees.BinaryTree;

// problem
// https://leetcode.com/problems/reverse-odd-levels-of-binary-tree/

import java.util.ArrayList;
import java.util.List;

public class ReverseOddLevelsOfBT {

    ////////////// solution ////////////
//    public Node reverseOddLevels(Node root){
//        List<Node> list = new ArrayList<>();
//        list.add(root);
//        boolean isOddLevel = false;
//        while (!list.isEmpty()){
//            int size = list.size();
//            if (isOddLevel){
//                int start = 0;
//                int end = size - 1;
//                while (start < end){
//                    Node s = list.get(start);
//                    Node l = list.get(end);
//                    int sVal = s.val;
//                    s.val = l.val;
//                    l.val = sVal;
//                    start++;
//                    end--;
//                }
//            }
//            for (int i = 0; i < size; i++) {
//                Node node = list.removeFirst();
//                if (node.left != null){
//                    list.add(node.left);
//                }
//                if (node.right != null){
//                    list.add(node.right);
//                }
//            }
//            isOddLevel = !isOddLevel;
//        }
//        return root;
//    }

}
