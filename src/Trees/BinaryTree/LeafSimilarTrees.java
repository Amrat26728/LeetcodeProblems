package Trees.BinaryTree;

// problem
// https://leetcode.com/problems/leaf-similar-trees/
public class LeafSimilarTrees {

    ////////////// solution //////////////////
//    public boolean leafSimilar(Node root1, Node root2){
//        List<Integer> leaves1 = new ArrayList<>();
//        List<Integer> leaves2 = new ArrayList<>();
//        addValues(root1, leaves1);
//        addValues(root2, leaves2);
//        if (leaves1.size() != leaves2.size()){
//            return false;
//        }
//        for (int i = 0; i < leaves1.size(); i++) {
//            if (!leaves1.get(i).equals(leaves2.get(i))){
//                return false;
//            }
//        }
//        return true;
//    }
//    private void addValues(Node root, List<Integer> leaves){
//        if (root == null){
//            return;
//        }
//        addValues(root.left, leaves);
//        if (root.left == null && root.right == null){
//            leaves.add(root.val);
//        }
//        addValues(root.right, leaves);
//    }

}
