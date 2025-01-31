package Trees.BinaryTree;

// problem
// https://leetcode.com/problems/even-odd-tree/

import java.util.ArrayList;
import java.util.List;

public class EvenOddTree {

    //////////// solution /////////////
//    public boolean evenOddTree(Node root){
//        List<Node> list = new ArrayList<>();
//        list.add(root);
//        boolean isEvenLevel = true;
//        while (!list.isEmpty()){
//            int size = list.size();
//            int evenLevelVal = 0;
//            int oddLevelVal = Integer.MAX_VALUE;
//            for (int i = 0; i < size; i++) {
//                Node node = list.removeFirst();
//                if (isEvenLevel){
//                    if (node.val % 2 == 0 || node.val < evenLevelVal){
//                        return false;
//                    }else{
//                        evenLevelVal = node.val;
//                    }
//                }else{
//                    if (node.val % 2 != 0 || node.val > oddLevelVal){
//                        return false;
//                    }else{
//                        oddLevelVal = node.val;
//                    }
//                }
//                if (node.left != null){
//                    list.add(node.left);
//                }
//                if (node.right != null){
//                    list.add(node.right);
//                }
//            }
//            isEvenLevel = !isEvenLevel;
//        }
//        return true;
//    }

}
