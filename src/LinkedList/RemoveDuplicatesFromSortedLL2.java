package LinkedList;

public class RemoveDuplicatesFromSortedLL2 {
    // problem
    // https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/

    /////////// solution /////////////
//    public ListNode deleteDuplicates(ListNode head) {
//        if (head == null || head.next == null){
//            return head;
//        }
//
//        ListNode prev = null;
//        ListNode tail = null;
//        int prevVal = -101;
//        while(head.next != null){
//            if (head.val == head.next.val){
//                head = head.next;
//                prevVal = head.val;
//            }else if(head.val == prevVal){
//                head = head.next;
//            }else{
//                ListNode node = new ListNode(head.val);
//                if (prev == null){
//                    prev = node;
//                    tail = prev;
//                }else{
//                    tail.next = node;
//                    tail = node;
//                }
//                head = head.next;
//            }
//        }
//        if (head.val != prevVal){
//            if (prev == null){
//                prev = head;
//            }
//            else{
//                tail.next = head;
//            }
//        }
//        return prev;
//    }
}
