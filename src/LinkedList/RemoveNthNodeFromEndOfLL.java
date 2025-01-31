package LinkedList;

public class RemoveNthNodeFromEndOfLL {
    // problem
    // https://leetcode.com/problems/remove-nth-node-from-end-of-list/

    ////////// solution ////////////////
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        int size = 0;
//
//        ListNode temp = head;
//        while(temp != null){
//            size++;
//            temp = temp.next;
//        }
//
//        if(size == n){
//            head = head.next;
//            return head;
//        }
//
//        ListNode temp2 = head;
//
//        for(int i = 0; i < size - n - 1; i++){
//            temp2 = temp2.next;
//        }
//
//        temp2.next = temp2.next.next;
//
//        return head;
//    }
}
