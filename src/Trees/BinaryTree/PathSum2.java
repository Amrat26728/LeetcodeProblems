package Trees.BinaryTree;

// problem
// https://leetcode.com/problems/path-sum-ii/

public class PathSum2 {

//    public List<List<Integer>> pathSum2(Node root, int targetSum){
//        List<List<Integer>> ans = new ArrayList<>();
//        pathSum2(root, targetSum, 0, new ArrayList<>(), ans);
//        return ans;
//    }
//    private void pathSum2(Node root, int targetSum, int valSum, List<Integer> path, List<List<Integer>> ans){
//        if (root.left == null && root.right == null){
//            if (targetSum == valSum + root.val){
//                path.add(root.val);
//                ans.add(path);
//                return;
//            }
//        }
//        valSum += root.val;
//        path.add(root.val);
//        if (root.left != null){
//            pathSum2(root.left, targetSum, valSum, new ArrayList<>(path), ans);
//        }
//        if (root.right != null){
//            pathSum2(root.right, targetSum, valSum, new ArrayList<>(path), ans);
//        }
//    }

}
