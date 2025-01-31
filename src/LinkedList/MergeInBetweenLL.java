package LinkedList;

public class MergeInBetweenLL {
    // problem
    // https://leetcode.com/problems/merge-in-between-linked-lists/

    /////// solution /////////
//    private static Node mergeInBetween(Node list1, Node list2, int a, int b){
//        Node temp = list1;
//
//        // iterate to get b+1 node
//        for(int i = 0; i < b; i++) {
//            temp = temp.next;
//        }
//
//        // save b+1 node
//        Node futureHead = temp.next;
//
//        // iterate list1 to a-1 node;
//        Node temp2 = list1;
//        for (int j = 0; j < a - 1; j++){
//            temp2 = temp2.next;
//        }
//
//        // add list2 elements from a-1 node to the end of list2
//        Node head2 = list2;
//        while(head2 != null){
//            temp2.next = head2;
//            head2 = head2.next;
//            temp2 = temp2.next;
//        }
}
