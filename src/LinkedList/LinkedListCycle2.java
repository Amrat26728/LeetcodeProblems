package LinkedList;

public class LinkedListCycle2 {
    // problem
    // https://leetcode.com/problems/linked-list-cycle-ii/

    //////////// solution ///////////////
    // method 1
//    public ListNode detectCycle(ListNode head) {
//        if(head == null){
//            return head;
//        }
//
//        HashSet<ListNode> nodes = new HashSet<>();
//
//        while(head != null){
//            if(nodes.contains(head)){
//                return head;
//            }
//            else{
//                nodes.add(head);
//            }
//            head = head.next;
//        }
//        return null;


        // method 2
//    ListNode fast = head;
//    ListNode slow = head;
//    int length = 0;
//        while (fast != null && fast.next != null) {
//        fast = fast.next.next;
//        slow = slow.next;
//        if (slow == fast) {
//            length = lengthOfCycle(slow);
//            break;
//        }
//    }
//        if(length == 0){
//        return null;
//    }
//
//    ListNode f = head;
//    ListNode s = head;
//
//        while(length > 0){
//        s = s.next;
//        length--;
//    }
//
//        while(f != s){
//        f = f.next;
//        s = s.next;
//    }
//
//        return s;
//    }

    // length of cycle
//    static int lengthOfCycle(ListNode node) {
//        int cycleLength = 0;
//        ListNode temp = node;
//        do {
//            cycleLength++;
//            temp = temp.next;
//        } while (temp != node);
//        return cycleLength;
//    }
}
