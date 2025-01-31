package Trees.BinaryTree;

// problem
// https://leetcode.com/problems/maximum-binary-tree/


public class MaximumBinaryTree {

//    public Node constructMaximumBinaryTree(int[] nums){
//        if (nums.length == 0){
//            return null;
//        }
//        int index = 0;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[index] < nums[i]){
//                index = i;
//            }
//        }
//        Node node = new Node(nums[index]);
//        node.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums, 0, index));
//        node.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums, index+1, nums.length));
//        return node;
//    }

}
