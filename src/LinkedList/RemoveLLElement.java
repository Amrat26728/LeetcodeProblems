package LinkedList;

public class RemoveLLElement {

    // problem
    // https://leetcode.com/problems/remove-linked-list-elements/description/

    ///////////////////////////// solution ///////////////////////
//    private Node removeElement(Node head, int val){
//        if (head == null){
//            return head;
//        }
//        while (head != null && head.value == val){
//            head = head.next;
//        }
//        if(head == null){
//            return head;
//        }
//        Node temp = head;
//        while(temp.next != null){
//            if (temp.next.value == val){
//                temp.next = temp.next.next;
//            }else{
//                temp = temp.next;
//            }
//        }
//        return head;
//    }
}
