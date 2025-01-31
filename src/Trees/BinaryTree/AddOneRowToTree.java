package Trees.BinaryTree;

// problem
// https://leetcode.com/problems/add-one-row-to-tree/

public class AddOneRowToTree {

//    public Node addOneRow(Node root, int val, int depth){
//        if (depth == 1){
//            Node node = new TreeQuestions.Node(val);
//            node.left = root;
//            return node;
//        }
//        return addOneRow(root, val, depth, 1);
//    }
//    private Node addOneRow(Node root, int val, int depth, int depthCount){
//        if (root == null){
//            return null;
//        }
//        if (depthCount == depth - 1){
//            Node node1 = new Node(val);
//            Node node2 = new Node(val);
//            node1.left = root.left;
//            node2.right = root.right;
//            root.left = node1;
//            root.right = node2;
//            return root;
//        }
//        root.left = addOneRow(root.left, val, depth, depthCount+1);
//        root.right = addOneRow(root.right, val, depth, depthCount+1);
//        return root;
//    }

}
