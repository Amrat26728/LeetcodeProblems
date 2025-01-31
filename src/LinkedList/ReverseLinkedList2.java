package LinkedList;

public class ReverseLinkedList2 {
    // problem
    // https://leetcode.com/problems/reverse-linked-list-ii/

    ////////// solution /////////////
//    private static Node reverseBetween(Node head, int left, int right) {
//        if (left == right){
//            return head;
//        }
//
//        if(left == 1){
//            Node newHead = null;
//            Node temp = head;
//            for(int j = 0; j < right - left + 1; j++){
//                Node node = new Node(temp.value);
//                if (newHead != null) {
//                    node.next = newHead;
//                }
//                newHead = node;
//                temp = temp.next;
//            }
//
//            Node t = newHead;
//            while(t.next != null){
//                t = t.next;
//            }
//            while(temp != null){
//                t.next = new Node(temp.value);
//                t = t.next;
//                temp = temp.next;
//            }
//            return newHead;
//        }
//
//        Node temp = head;
//        Node newHead = null;
//
//        for(int i = 0; i < left - 1; i++){
//            temp = temp.next;
//        }
//
//        for(int k = 0; k < right - left + 1; k++){
//            Node node = new Node(temp.value);
//            if(newHead == null){
//                newHead = node;
//            }else{
//                node.next = newHead;
//                newHead = node;
//            }
//            temp = temp.next;
//        }
//
//        Node t = newHead;
//        while(t.next != null){
//            t = t.next;
//        }
//
//        while (temp != null){
//            t.next = new Node(temp.value);
//            t = t.next;
//            temp = temp.next;
//        }
//
//        Node te = head;
//        for(int i = 0; i < left - 2; i++){
//            te = te.next;
//        }
//        te.next = newHead;
//
//        return head;
//    }
}
