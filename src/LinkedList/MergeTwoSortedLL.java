package LinkedList;

public class MergeTwoSortedLL {
    // problem
    // https://leetcode.com/problems/merge-two-sorted-lists/description/

    //////// solution ///////////
//    private static Node mergeTwoSortedLists(Node list1, Node list2){
//
//        if (list1 == null && list2 == null){
//            return list1;
//        }
//
//        if (list1 != null && list2 == null){
//            return list1;
//        }
//
//        if (list2 != null && list1 == null){
//            return list2;
//        }
//
//        Node head = null;
//        while(list1 != null && list2 != null){
//            if (list1.value < list2.value){
//                Node node = new Node(list1.value);
//                if (head == null){
//                    head = node;
//                }
//                else{
//                    Node temp = head;
//                    while (temp.next != null){
//                        temp = temp.next;
//                    }
//                    temp.next = node;
//                }
//                list1 = list1.next;
//            }else{
//                Node node = new Node(list2.value);
//                if (head == null){
//                    head = node;
//                }else{
//                    Node temp = head;
//                    while(temp.next != null){
//                        temp = temp.next;
//                    }
//                    temp.next = node;
//                }
//                list2 = list2.next;
//            }
//        }
//
//        Node temp = head;
//        while(temp.next != null){
//            temp = temp.next;
//        }
//
//        while (list1 != null){
//            temp.next = new Node(list1.value);
//            list1 = list1.next;
//            temp = temp.next;
//        }
//
//        while (list2 != null){
//            temp.next = new Node(list2.value);
//            list2 = list2.next;
//            temp = temp.next;
//        }
//
//        return head;
//    }
}
