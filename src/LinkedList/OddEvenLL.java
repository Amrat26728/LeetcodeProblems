package LinkedList;

public class OddEvenLL {
    // problem
    // https://leetcode.com/problems/odd-even-linked-list/

    ///////// solution /////////////////
//    public ListNode oddEvenList(ListNode head) {
//        if(head == null || head.next == null || head.next.next == null){
//            return head;
//        }
//        ListNode odd = head;
//        ListNode even = head.next;
//        ListNode oddHead = null;
//        ListNode evenHead = null;
//
//        while(odd.next != null && even.next != null){
//            odd.next = odd.next.next;
//            even.next = even.next.next;
//            if(oddHead == null){
//                oddHead = odd;
//            }
//            if(evenHead == null){
//                evenHead = even;
//            }
//            odd = odd.next;
//            even = even.next;
//        }
//        odd.next = evenHead;
//
//        return oddHead;
//    }
}
