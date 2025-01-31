package Graph;

// problem
// https://leetcode.com/problems/find-center-of-star-graph/

public class FindCenterOfStarGraph {
    public static void main(String[] args) {
        int[][] edges = {
                {1,2},
                {2,3},
                {4,2}
        };
        System.out.println(findCenter(edges));
    }

    public static int findCenter(int[][] edges){
        // center is connected to every node so, a node that is common in any two edges is the center
        // so take any two nodes and compare with each other
        int[] edge1 = edges[0];
        int[] edge2 = edges[1];
        if (edge1[0] == edge2[0] || edge1[0] == edge2[1]){
            return edge1[0];
        }
        return edge1[1];
    }
}
