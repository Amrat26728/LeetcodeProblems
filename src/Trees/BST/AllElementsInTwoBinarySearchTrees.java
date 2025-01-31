package Trees.BST;

// problem
// https://leetcode.com/problems/all-elements-in-two-binary-search-trees/

import java.util.ArrayList;
import java.util.List;

public class AllElementsInTwoBinarySearchTrees {

//    public List<Integer> getAllElements(Node root1, Node root2){
//        List<Integer> ans = new ArrayList<>();
//        List<Integer> list1 = makeList(root1);
//        List<Integer> list2 = makeList(root2);
//        if (root1 == null && root2 == null){
//            return ans;
//        }
//        if (root1 == null){
//            return list2;
//        }
//        if (root2 == null){
//            return list1;
//        }
//        int i = 0;
//        int j = 0;
//        int length1 = list1.size();
//        int length2 = list2.size();
//        while (i < length1 && j < length2){
//            int ele1 = list1.get(i);
//            int ele2 = list2.get(j);
//            if (ele1 < ele2){
//                ans.add(ele1);
//                i++;
//            }else{
//                ans.add(ele2);
//                j++;
//            }
//        }
//        while (i < length1){
//            ans.add(list1.get(i));
//            i++;
//        }
//
//        while(j < length2){
//            ans.add(list2.get(j));
//            j++;
//        }
//        return ans;
//    }
//    private List<Integer> makeList(Node root){
//        List<Integer> list = new ArrayList<>();
//        if (root == null){
//            return list;
//        }
//        List<Integer> left = makeList(root.left);
//        left.add(root.val);
//        List<Integer> right = makeList(root.right);
//        left.addAll(right);
//        return left;
//    }

}
