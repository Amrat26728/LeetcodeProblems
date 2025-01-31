package Trees.BST;

// problem
// https://leetcode.com/problems/two-sum-iv-input-is-a-bst/

import java.util.ArrayList;
import java.util.List;

public class TwoSum4 {

//    public boolean twoSum4(Node root, int k){
//        List<Integer> list = twoSum4(root);
//        int start = 0;
//        int end = list.size() - 1;
//        while (start < end){
//            if (list.get(start) + list.get(end) == k){
//                return true;
//            }
//            if (list.get(start) + list.get(end) > k){
//                end--;
//            }
//            else{
//                start++;
//            }
//        }
//        return false;
//    }
//    private List<Integer> twoSum4(Node root){
//        List<Integer> list = new ArrayList<>();
//        if (root == null){
//            return list;
//        }
//        if (root.left == null && root.right == null){
//            list.add(root.val);
//            return list;
//        }
//        List<Integer> left = twoSum4(root.left);
//        left.add(root.val);
//        List<Integer> right = twoSum4(root.right);
//        left.addAll(right);
//        return left;
//    }

}
