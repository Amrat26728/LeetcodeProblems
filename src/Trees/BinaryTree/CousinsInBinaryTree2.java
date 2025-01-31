package Trees.BinaryTree;

// problem
// https://leetcode.com/problems/cousins-in-binary-tree-ii/

public class CousinsInBinaryTree2 {

//    public Node replaceValueInTree(Node root){
//        List<Integer> levelSum = levelSum(root, new ArrayList<>());
//        System.out.println(levelSum);
//        root.val = 0;
//        return replaceValues(root, levelSum, 0);
//    }
//    private Node replaceValues(Node root, List<Integer> levelSum, int level){
//        int sum = 0;
//        if (root.left != null){
//            sum += root.left.val;
//        }
//        if (root.right != null){
//            sum += root.right.val;
//        }
//        int rem = 0;
//        if (level < levelSum.size()){
//            rem = levelSum.get(level) - sum;
//        }
//        if (root.left != null){
//            root.left.val = rem;
//            replaceValues(root.left, levelSum, level+1);
//        }
//        if (root.right != null){
//            root.right.val = rem;
//            replaceValues(root.right, levelSum, level+1);
//        }
//        return root;
//    }
//    private List<Integer> levelSum(Node root, List<Integer> sum){
//        Queue<List<Node>> queue = new LinkedList<>();
//        List<Node> list = new ArrayList<>(2);
//        if (root.left != null){
//            list.add(root.left);
//        }
//        if (root.right != null){
//            list.add(root.right);
//        }
//        queue.add(list);
//        while (!queue.isEmpty()){
//            List<Node> temp = queue.poll();
//            List<Node> nodes = new ArrayList<>();
//            int levelSum = 0;
//            for (Node node: temp){
//                levelSum += node.val;
//                if(node.left != null){
//                    nodes.add(node.left);
//                }
//                if(node.right != null){
//                    nodes.add(node.right);
//                }
//            }
//            if (!nodes.isEmpty()){
//                queue.add(nodes);
//            }
//            sum.add(levelSum);
//        }
//        return sum;
//    }

}
