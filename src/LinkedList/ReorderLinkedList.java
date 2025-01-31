package LinkedList;

public class ReorderLinkedList {
    // problem
    //https://leetcode.com/problems/reorder-list/

    ///////// solution ////////////////
//    public void reorderList(ListNode head) {
//        if(head == null || head.next == null || head.next.next == null){
//            return;
//        }
//
//        ListNode slow = head;
//        ListNode fast = head;
//
//        while(fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        ListNode reversed = reverseList(slow);
//
//        ListNode temp1 = head.next;
//        head.next = reversed;
//        reversed = reversed.next;
//        ListNode temp = head.next;
//        int i = 3;
//
//        while (temp1 != slow.next && reversed != null){
//            if (i % 2 == 0){
//                temp.next = reversed;
//                reversed = reversed.next;
//                temp = temp.next;
//            }else{
//                temp.next = temp1;
//                temp1 = temp1.next;
//                temp = temp.next;
//            }
//            i++;
//        }
//
//    }
//
//    private static ListNode reverseList(ListNode node) {
//        ListNode prev = null;
//        ListNode pres = node;
//        ListNode next = node.next;
//
//        while (pres != null) {
//            pres.next = prev;
//            prev = pres;
//            pres = next;
//            if (next != null) {
//                next = next.next;
//            }
//        }
//        return prev;
//    }
}
