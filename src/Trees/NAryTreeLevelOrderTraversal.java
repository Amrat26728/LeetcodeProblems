package Trees;

// problem
// https://leetcode.com/problems/n-ary-tree-level-order-traversal/

public class NAryTreeLevelOrderTraversal {

    //////////////////// solution //////////////////
//    public List<List<Integer>> levelOrder(Node root) {
//        List<List<Integer>> ans = new ArrayList<>();
//        if(root == null){
//            return ans;
//        }
//        Queue<List<Node>> queue = new LinkedList<>();
//        List<Integer> rootVal = new ArrayList<>();
//        rootVal.add(root.val);
//        ans.add(rootVal);
//        if(!root.children.isEmpty()){
//            queue.add(root.children);
//        }
//        while (!queue.isEmpty()){
//            int size = queue.size();
//            List<Integer> nodeValues = new ArrayList<>();
//            for (int i = 0; i < size; i++) {
//                List<Node> nodes = queue.remove();
//                for (Node node : nodes) {
//                    nodeValues.add(node.val);
//                    if (!node.children.isEmpty()) {
//                        queue.add(node.children);
//                    }
//                }
//            }
//            ans.add(nodeValues);
//        }
//        return ans;
//    }

}
