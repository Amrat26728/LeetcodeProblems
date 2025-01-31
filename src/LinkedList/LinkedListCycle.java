package LinkedList;

public class LinkedListCycle {
    public static void main(String[] args) {

    }

    // problem
    // https://leetcode.com/problems/linked-list-cycle/

    ///////////// solution //////////////
//    public boolean hasCycle(ListNode head) {
        // method 1
//        if(head == null){
//            return false;
//        }
//
//        HashSet<ListNode> nodes = new HashSet<>();
//
//        while(head != null){
//            if(nodes.contains(head)){
//                return true;
//            }
//            else{
//                nodes.add(head);
//            }
//            head = head.next;
//        }
//        return false;

        // method 2
//        ListNode fast = head;
//        ListNode slow = head;
//        while(fast != null && fast.next != null){
//            fast = fast.next.next;
//            slow = slow.next;
//            if(fast == slow){
//                return true;
//            }
//        }
//
//        return false;

//    }


    // length of cycle
//    private ListNode lengthOfCycle(ListNode head){
//        ListNode fast = head;
//        ListNode slow = head;
//        int cycleLength = 0;
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//            if (slow == fast) {
//                ListNode temp = slow;
//                do{
//                    cycleLength++;
//                    temp = temp.next;
//                }while(temp != slow);
//            }
//        }
//        return cycleLength;
//    }

}
