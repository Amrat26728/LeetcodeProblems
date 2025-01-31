package LinkedList;

public class PartitionLinkedList {
    // problem
    // https://leetcode.com/problems/partition-list/

    ///////////// solution /////////////////
//    public ListNode partition(ListNode head, int x) {
//        if(head == null){
//            return head;
//        }
//
//        ListNode list1 = null;
//        ListNode list2 = null;
//        ListNode list1Head = null;
//        ListNode list2Head = null;
//
//        while(head != null){
//            ListNode node = new ListNode(head.val);
//            if(head.val < x){
//                if(list1 == null){
//                    list1 = node;
//                    list1Head = list1;
//                }else{
//                    list1.next = node;
//                    list1 = list1.next;
//                }
//            }else{
//                if(list2 == null){
//                    list2 = node;
//                    list2Head = list2;
//                }else{
//                    list2.next = node;
//                    list2 = list2.next;
//                }
//            }
//            head = head.next;
//        }
//        if (list1 != null){
//            list1.next = list2Head;
//            return list1Head;
//        }
//
//        return list2Head;
//    }
}
