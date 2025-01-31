package LinkedList;

public class ReverseLinkedList {
    // problem
    // https://leetcode.com/problems/reverse-linked-list/

    /////////////// Solution /////////////////
    // method 1
//    public ListNode reverseList(ListNode head) {
//
//        if(head == null || head.next == null){
//            return head;
//        }
//
//        ListNode newHead = null;
//
//        while(head != null){
//            ListNode node = new ListNode(head.val);
//            if(newHead == null){
//                newHead = node;
//            }else{
//                node.next = newHead;
//                newHead = node;
//            }
//            head = head.next;
//        }
//        return newHead;
//    }

    // method 2
//    private static SingleLinkedList.Node reverse(SingleLinkedList.Node head){
//        SingleLinkedList.Node prev = null;
//        SingleLinkedList.Node pres = head;
//        SingleLinkedList.Node next = head.next;
//
//        while (pres != null){
//            pres.next = prev;
//            prev = pres;
//            pres = next;
//            if (next != null){
//                next = next.next;
//            }
//        }
//        return prev;
//    }
}
