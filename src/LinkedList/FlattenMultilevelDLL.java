package LinkedList;

// problem
// https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/description/

public class FlattenMultilevelDLL {
//    public Node flatten(Node head) {
//        if( head == null){
//            return head;
//        }
//        Node temp = head;
//        while( temp != null) {
//            if( temp.child == null ) {
//                temp = temp.next;
//                continue;
//            }
//            Node t = temp.child;
//            while( t.next != null ) {
//                t = t.next;
//            }
//            t.next = temp.next;
//            if( temp.next != null ){
//                temp.next.prev = t;
//            }
//            temp.next = temp.child;
//            temp.child.prev = temp;
//            temp.child = null;
//        }
//        return head;
//    }
}
