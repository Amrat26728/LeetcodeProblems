package LinkedList;

public class ReverseEvenLengthGroups {
    // problem
    // https://leetcode.com/problems/reverse-nodes-in-even-length-groups/

    /////////// solution ///////////////
//    public ListNode reverseEvenLengthGroups(ListNode head) {
//        ListNode temp = head.next;
//        ListNode tail = head;
//        int group = 2;
//        ListNode t2 = temp;
//        while(t2 != null){
//            int length = 1;
//            t2 = temp;
//            for (int i = 0; i < group - 1; i++) {
//                if (t2.next != null){
//                    t2 = t2.next;
//                    length++;
//                }else{
//                    break;
//                }
//            }
//            System.out.println(length);
//            ListNode t3 = temp;
//            if (t2.next == null){
//                t2 = null;
//            }
//            if (t2 != null){
//                temp = t2.next;
//                t2.next = null;
//            }
//            if (length % 2 == 0){
//                ListNode[] headTail = reverse(t3);
//                tail.next = headTail[0];
//                tail = headTail[1];
//            }else{
//                tail.next = t3;
//                tail = t2;
//            }
//            group++;
//        }
//
//        return head;
//    }

//    private static ListNode[] reverse(ListNode node){
//        ListNode prev = null;
//        ListNode pres = node;
//        ListNode next = node.next;
//        while (pres != null){
//            pres.next = prev;
//            prev = pres;
//            pres = next;
//            if (next != null){
//                next = next.next;
//            }
//        }
//        return new ListNode[] {prev, node};
//    }

}
