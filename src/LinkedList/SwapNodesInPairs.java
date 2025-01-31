package LinkedList;

public class SwapNodesInPairs {
    // problem
    // https://leetcode.com/problems/swap-nodes-in-pairs/

    //////////////// solution /////////////////////
//    private Node swapNodeInPairs(){
//        if(head == null){
//            return head;
//        }
//
//        if (head.next == null){
//            return head;
//        }
//
//        Node temp = head.next;
//        Node temp2 = head.next.next;
//        head.next.next = head;
//        head.next = temp2;
//        head = temp;
//
//        Node temp3 = head.next;
//
//        while(temp3.next != null && temp3.next.next != null){
//            Node temp4 = temp3.next;
//            Node temp5 = temp3.next.next;
//            Node temp6 = temp3.next.next.next;
//
//            temp5.next = temp4;
//            temp3.next = temp5;
//            temp4.next = temp6;
//
//            temp3 = temp3.next.next;
//        }
//
//        return head;
//    }
}
