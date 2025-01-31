package LinkedList;

public class DeleteMiddleNode {
    // problem
    // https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/

    ///////////////// solution //////////////
//    private Node deleteMiddle(){
//        Node p1 = head;
//        Node p2 = head;
//
//        if (head.next == null){
//            head = head.next;
//            return head;
//        }else if(head.next.next == null){
//            head.next = head.next.next;
//            return head;
//        }
//        while(p2.next != null && p2.next.next != null){
//            p1 = p1.next;
//            p2 = p2.next.next;
//        }
//        if(p2.next == null){
//            p1.value = p1.next.value;
//            p1.next = p1.next.next;
//        }else{
//            p1.next.value = p1.next.next.value;
//            p1.next = p1.next.next;
//        }
//        return head;
//    }
}
